package com.company;


import static com.company.Color.ANSI_RESET;

public class Utils {

    public static void print(String text) {
        System.out.println( text );
    }
    public static void print(String text,Color color) {
        System.out.println( color.getColor() + text + ANSI_RESET.getColor() );
    }

    public static void printRandom(String text) {
        System.out.println(Color.getRandomColor() + text + ANSI_RESET.getColor());
    }


    public static <T> T getObject (T obj) {
        Box<T> newObj = new Box<T>(obj);
        newObj.printValue();
        return newObj.getValue();
    }


    public static <T> T getRandomObj(T obj1, T obj2, T obj3) {
        int max = 3;
        int avg = (int)(Math.random() * max);
        T val ;
        if (avg == 0) { val = obj1; }
        else if (avg == 1) { val = obj2; }
        else  { val = obj3; }
        System.out.println(val);
        return val;
    }

}


