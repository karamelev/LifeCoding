package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_Regec {
    public static void main(String[] args) {
        List<String> emails = List.of("");
    }


    // Написать метод который принимает массив email и валидирует их по регулярному выражению
    public static List<String> emailValidation(String[] emailArray) {
        return Arrays.stream(emailArray)
                .filter(s->s.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))
                .collect(Collectors.toList());
    }
}
