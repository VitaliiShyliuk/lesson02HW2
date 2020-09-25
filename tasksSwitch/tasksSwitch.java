package ua.univer.base.lesson02.lesson02HW2.tasksSwitch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tasksSwitch {
    public static void main(String[] args) {
        System.out.println("Switch tasks.");
        System.out.println("1. Дано целое число в диапазоне 1–7. Вывести строку — название дня недели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).");
        System.out.println("2. Дано целое число K. Вывести строку-описание оценки, соответствующей числу K (1 — «плохо», 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», \n" +
                "5 — «отлично»). Если K не лежит в диапазоне 1–5, то вывести строку «ошибка».");
        System.out.println("5. Арифметические действия над числами пронумерованы следующим образом: 1 — сложение, 2 — вычитание, \n" +
                "3 — умножение, 4 — деление. Дан номер действия N (целое число в диапазоне 1–4) \n" +
                "и вещественные числа A и B (В не равно 0). Выполнить над числами указанное действие и вывести результат.");
        System.out.println("7. Единицы массы пронумерованы следующим образом: 1 — килограмм, 2 — миллиграмм, 3 — грамм, 4 — тонна, 5 — центнер. Дан номер единицы \n" +
                "массы (целое число в диапазоне 1–5) и масса тела в этих единицах (вещественное число). Найти массу тела в килограммах.");
        System.out.println("16. Дано целое число в диапазоне 20–69, определяющее возраст (в годах). Вывести строку-описание указанного возраста, обеспечив правильное \n" +
                "согласование числа со словом «год», например: 20 — «двадцать лет», 32 - «тридцать два года», 41 — «сорок один год».");
        System.out.println("0.Exit");
        System.out.println("Введите номер задачи:");
        while (true) {
            try
            {
                Scanner sc = new Scanner(System.in);
                int input = sc.nextInt();
                if (input <0) System.out.println("Try input number of task we have...");
                switch (input) {
                    case 0:
                        return;
                    case 1:
                        System.out.println("Введите число 1-7:");
                        libSwitch.fromNumberToNameOfWeek(sc.nextInt());
                        break;
                    case 2:
                        System.out.println("Введите оценку 1-5:");
                        libSwitch.fromNumberToTextMark(sc.nextInt());
                        break;
                    case 5:
                        System.out.println("Введите арифметическое действие и два числа:");
                        double result = libSwitch.calculatorTwoValue(sc.nextInt(),sc.nextDouble(),sc.nextDouble());
                        System.out.println("Result is " + result);
                        break;
                    case 7:
                        System.out.println("Введите номер массы и массу тела:");
                        System.out.println("Result is " + libSwitch.calculatorWeightToKilo(sc.nextInt(),sc.nextDouble()));
                        break;
                    case 16:
                        System.out.println("Введите возвраст 20-69:");
                        libSwitch.ageFromNumberToString(sc.nextInt());
                        break;
                }
            }
            catch(InputMismatchException exception)
            {
                System.out.println("This is not an integer");
            }
        }
    }
}
