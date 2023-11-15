package KT7;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

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

        // Etsitään läpäisseet opiskelijat
        List<String> läpäisseet = opiskelijat.stream()
            .filter(opiskelija -> opiskelija.getArvosana() > 45)
            .map(opiskelija -> opiskelija.getNimi())
            .collect(Collectors.toList());

        // Tulostetaan läpäisseet opiskelijat
        läpäisseet.forEach(opiskelija -> System.out.println(opiskelija));
    }
}

