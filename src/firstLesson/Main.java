package firstLesson;

public class Main {


    /* Создать пустой проект в IntelliJ IDEA и прописать метод main();*/
    public static void main(String[] args) {

        /* Создать переменные всех пройденных типов данных, и инициализировать их значения;*/
        byte a = -120;
        short b = 25000;
        int c = 24;
        long d = 15000000;
        float e = 1.4e-45f;
        double f = 10.5;
        char g = 'T';
        String h = "Hello world!";
        boolean x = true;

        float fA = 4;
        float fB = 6;
        float fC = 10;
        float fD = 13;

        float calculationResult = calculation(fA, fB, fC, fD);
        System.out.println("Результат вычислений: " + calculationResult);
        System.out.println(isBetwwen10And20(9, 10));
        System.out.println(isBetwwen10And20(11, 20));
        System.out.println(isBetwwen10And20(4, -3));
        checkTheNumber(4);
        System.out.println(isCheckThatNumberIsNegative(-8));
        checkTheName("Михаил");
        checkThatYearIsBissextile(1978);
        checkThatYearIsBissextile(2020);
    }

    /* Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;*/
    static float calculation(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    /* Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;*/
    static boolean isCheckLimits(int a, int b) {
        if ((a + b) > 10 & (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Или можно решить так!
    static boolean isBetwwen10And20(int a, int b) {
        int sum = a + b;
        boolean res = sum > 10 && sum <= 20;
        return res;
    }

    /* Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.*/
    static void checkTheNumber(float a) {
        if (a >= 0) {
            System.out.println("Передали положительное число " + a);
        } else {
            System.out.println("Передали отрицательное число " + a);
        }
    }


    /* Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;*/
    static boolean isCheckThatNumberIsNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    /* Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;*/
    static void checkTheName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /* Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    static void checkThatYearIsBissextile(int year) {
        if (year % 4 != 0 || year % 100 == 0 & year % 400 != 0) {
            System.out.println("Обычный год");
        } else {
            System.out.println("Високосный год");
        }
    }
}