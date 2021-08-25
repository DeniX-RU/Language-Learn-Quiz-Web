package com.languagelearnquiz.webquiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebQuizApplication {

    // Декларативное программирование, в отличие от императивного программирования,
    // где есть четкий алгоритм (делай шаг 1, делай шаг 2, делай шаг 3),
    // хорошо тем, что шаги, которые повторяются в каждом методе, не нужно
    // писать заново.

    // Вики: Декларативное программирование — парадигма программирования,
    // в которой задаётся спецификация решения задачи, то есть описывается,
    // что представляют собой проблема и ожидаемый результат.
    // Противоположностью декларативного является императивное программирование,
    // описывающее на том или ином уровне детализации, как решить задачу
    // и представить результат


    public static void main(String[] args) {
        SpringApplication.run(WebQuizApplication.class, args); //TODO set icon
    }

}
