package secondLesson;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*1.Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

        System.out.println("Task 1.");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println(Arrays.toString(arr1));
        changeArray(arr1);
        System.out.println(Arrays.toString(arr1) + "\r\n");

        /*2.Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/

        System.out.println("Task 2.");
        int[] arr2 = new int[8];

        System.out.println(Arrays.toString(arr2));
        fillArrayWithProgression(arr2);
        System.out.println(Arrays.toString(arr2) + "\r\n");

        /*3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        и числа меньшие 6 умножить на 2;*/

        System.out.println("Task 3.");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println(Arrays.toString(arr3));
        multyIn(arr3);
        System.out.println(Arrays.toString(arr3) + "\r\n");

        /*4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/

        System.out.println("Task 4.");
        int[][] square = new int[4][4];

        printSquare(square);
        fillDiagonalsWithOnes(square);
        System.out.println();
        printSquare(square);


        /*5.** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);*/
        System.out.println("\r\n" + "Task 5.");
        int[] arr5 = {1, 5, 3, 78, 11, 4, 22, 2, 4, 8, 9, 60};

        System.out.println(Arrays.toString(arr5));
        valueMaxAndMin(arr5);

        /*6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
        если в массиве есть место, в котором сумма левой и правой части массива равны.
        Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        граница показана символами ||, эти символы в массив не входят.*/
        System.out.println("\r\n" + "Task 6.");
        int[] arr6 = {1, 5, 3, 1, 1, 5, 3, 1};

        System.out.println(Arrays.toString(arr6));
        boolean isArr6 = hasBalanse(arr6);
        System.out.println("Is balanced? : " + isArr6);


    }


    static void changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 1 ? 0 : 1);
        }
    }

    static void fillArrayWithProgression(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 3 * i;
        }
    }

    static void multyIn(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] < 6 ? array[i] * 2 : array[i]);
        }
    }

    static void printSquare(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));

        }
    }

    static void fillDiagonalsWithOnes(int[][] square) {
        for (int i = 0; i < square.length; i++) {
            square[i][i] = 1;
            square[i][square.length - i - 1] = 1;
        }
    }

    static void valueMaxAndMin(int[] array) {

        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Минимальное значение в одномерном массиве = " + min);
        System.out.println("Максимальное значение в одномерном массиве = " + max);
    }

    static boolean hasBalanse(int[] array) {

        int leftSum = 0;

        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];

            int rightSum = 0;

            for (int j = (i + 1); j < array.length; j++) {
                rightSum += array[j];
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }
}




