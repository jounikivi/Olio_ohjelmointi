package KT7;

public class Student {

    private String nimi;
    private int arvosana;

    public Student(String nimi, int arvosana) {
        this.nimi = nimi;
        this.arvosana = arvosana;
    }

    public String getNimi() {
        return nimi;
    }

    public int getArvosana() {
        return arvosana;
    }

    @Override
    public String toString() {
        return nimi + " (" + arvosana + ")";
    }
}
