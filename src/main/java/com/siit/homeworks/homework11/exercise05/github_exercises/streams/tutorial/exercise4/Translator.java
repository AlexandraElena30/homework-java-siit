package com.siit.homeworks.homework11.exercise05.github_exercises.streams.tutorial.exercise4;

public interface Translator {

    String translate(String input);

    enum Languages implements Translator {
        REVERSISH {
            @Override
            public String translate(String input) {
                return new StringBuilder(input).reverse().toString();
            }
        }

    }

}

