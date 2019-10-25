package com.generics;

/**
 * Файл с Generics.
 * @param <T> = Generics
 */

public class Box<T> { // Класс с дженериками

    private T value;

    public Box() { }

    public Box(final T value1) {
        this.value = value1;
    }

    public final T getValue() {
        if (value == null) {
            System.out.println("Коробка пуста");
            return value;
        } else {
            return value;
        }
    }

    public final void printValue() {
        System.out.println(value);
    }

    final void setValue(final T value1) {
        this.value = value1;
    }

    final void nullValue() {
        if (value == null) {
            System.out.println("Коробка итак пуста");
        } else {
            this.value = null;
        }
    }
}
