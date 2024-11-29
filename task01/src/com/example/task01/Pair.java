package com.example.task01;

import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<T, U> {
     private final T first;
     private final U second;

     public Pair(T first, U second) {
         this.first = first;
         this.second = second;
     }

     public static <T, U> Pair<T, U> of(T first, U second) {
         return new Pair<T, U>(first, second);
     }

    public void ifPresent(BiConsumer<? super T, ? super U> consumer) {
        if (first != null && second != null) {
            consumer.accept(first, second);
        }
    }

    public T getFirst() {
         return first;
    }
    public U getSecond() {
         return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

}
