package com.generics;

/**
 * Файл с Generics.
 *
 * @param <T> = Generics
 */

public class Box<T> { // Класс с дженериками

        private T value;

        Box() {
        }

        public Box(final T value1) {
                this.value = value1;
        }

        public final void getValue() {
                if (value == null) {
                        System.out.println("Коробка пуста");
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
