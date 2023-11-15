package KT7;

import java.util.*;
import java.util.stream.Collectors;

public class FunktionaalinenOhjelmointi {

    public static void main(String[] args) {
        // Luodaan lista opiskelijoista
        List<Student> opiskelijat = Arrays.asList(
            new Student("Kaisa", 95),
            new Student("Ellinoora", 90),
            new Student("Leila", 92),
            new Student("Juhani", 90),
            new Student("Paavo", 100),
            new Student("Marianne", 70),
            new Student("Erkki", 42),
            new Student("Jouko", 39),
            new Student("Kaarlo", 31)
        );

        // Lasketaan keskiarvo
        double keskiarvo = opiskelijat.stream()
            .mapToInt(opiskelija -> opiskelija.getArvosana())
            .average()
            .getAsDouble();

        // Tulostetaan keskiarvo
        System.out.println(keskiarvo);
    }
}

