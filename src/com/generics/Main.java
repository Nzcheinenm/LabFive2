package com.generics;

import enums.Color;
import enums.Utils;

/**
 * Класс для проверки и запуска.
 *
 * @author Kononov D.
 * @version 1.2
 */

public final class Main { // Класс для проверки
        private static final Integer CHECK_NUM_BOX = 500;
        private static final Integer CHECK_NUM_UTILS = 12;

        private Main() {
        }

        public static void main(final String[] args) {
                Utils.print("Test is only text");
                Utils.print("Text is test First", Color.RED);
                Utils.print("Text to Second Test, blue", Color.BLUE);
                Utils.printRandom("To color random is text");
                System.out.println();

                final Box<String> box = new Box<>();
                box.printValue(); //null
                box.setValue("Книжка");
                box.getValue();
                box.printValue(); // "Книжка"
                box.nullValue();
                box.printValue(); //null
                System.out.println();

                Box<Integer> box2 = new Box<>();
                box2.setValue(CHECK_NUM_BOX);
                box2.printValue();
                System.out.println();

                Utils.getRandomObj("Книжка", "Ручка", "Тетрадь");
                System.out.println();

                Utils.getObject(CHECK_NUM_UTILS);
                System.out.println();

        }
}

