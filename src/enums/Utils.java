package enums;

import com.generics.Box;

import static enums.Color.ANSI_RESET;

/**
 * Файл с утилитами.
 *
 * @version 1.2
 */

public final class Utils extends Box<Utils> { // Класс с методами Утилит

        private static final Integer MAX = 3;

        public Utils(final Utils value) {
                super(value);
        }

        public static void print(final String text) {
                System.out.println(text);
        }

        public static void print(final String text, final Color color) {
                System.out.println(color.getColor() + text + ANSI_RESET.getColor());
        }

        public static void printRandom(final String text) {
                System.out.println(Color.getRandomColor() + text + ANSI_RESET.getColor());
        }


        public static <T> void getObject(final T obj) {
                Box<T> newObj = new Box<>(obj);
                newObj.printValue();
                newObj.getValue();
        }

        public static <T> void getRandomObj(final T obj1, final T obj2, final T obj3) {

                double avg = (Math.random() * MAX);
                T val;
                if (avg == 0) {
                        val = obj1;
                } else if (avg == 1) {
                        val = obj2;
                } else {
                        val = obj3;
                }
                System.out.println(val);
        }

}


