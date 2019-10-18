package com.company;



public class Main {


    public static void main(String[] args) {
        // write your code here
        Utils.print("Test is only text");
        Utils.print("Text is test First",Color.RED);
        Utils.print("Text to Second Test, blue",Color.BLUE);

        Utils.printRandom("To color random is text");
        System.out.println();

        Box<String> box = new Box<>();
        box.printValue(); //null
        box.setValue("Книжка");
        box.getValue();
        box.printValue(); // "Книжка"
        box.nullValue();
        box.printValue(); //null
        System.out.println();

        Box<Integer> box2 = new Box<Integer>();
        box2.setValue(500);
        box2.printValue();
        System.out.println();

        Utils.getRandomObj("Книжка","Ручка","Тетрадь");
        System.out.println();

        Utils.getObject(12);
        System.out.println();

    }
}

