package KT7;

public class Employee {
	 private String name;
	    private int score;

	    public Employee(String name, int score) {
	        this.name = name;
	        this.score = score;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getScore() {
	        return score;
	    }

	    @Override
	    public String toString() {
	        return name + " (" + score + ")";
	    }
	}

