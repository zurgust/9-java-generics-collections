package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {

        // TODO С корректно реализованным классом Pair должен компилироваться и успешно работать следующий код:


        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        pair.ifPresent((first, second) -> {
            System.out.println(first);
            System.out.println(second);
        });

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);



        Pair<String, String> pair3 = Pair.of("Hello", "World");
        System.out.println(pair3);

        // Использование ifPresent для выполнения действия, если значения не null
        pair3.ifPresent((first, second) -> System.out.println(first + " " + second));

        // с числом и строкой
        Pair<Integer, String> mixedPair = Pair.of(42, "Answer");
        System.out.println(mixedPair);

        // null
        Pair<String, Integer> nullPair = Pair.of(null, 10);
        nullPair.ifPresent((first, second) -> System.out.println(first + " " + second));  // Ничего не произойдёт, так как first == null

    }

}
