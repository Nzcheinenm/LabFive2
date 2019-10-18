package com.company;

public class Box<T> {

    public T value;

    Box() {

    }

    Box(T value) {
        this.value = value;
    }

    public T getValue() {
        if (value == null) {
            System.out.println("Коробка пуста");
            return value;
        } else {
            return value;
        }
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void nullValue() {
        if (value == null) {
            System.out.println("Коробка итак пуста");
        } else {
            this.value = null;
        }
    }

    public void printValue() {
        System.out.println(value);
    }
}
