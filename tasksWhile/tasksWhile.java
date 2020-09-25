package ua.univer.base.lesson02.lesson02HW2.tasksWhile;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tasksWhile {
    public static void main(String[] args) {
        System.out.println("While tasks.");
        System.out.println("3. Даны целые положительные числа N и K. Используя только операции\n" +
                "сложения и вычитания, найти частное от деления нацело N на K, а также\n" +
                "остаток от этого деления");
        System.out.println("4°. Дано целое число N (> 0). Если оно является степенью числа 3, то вы-\n" +
                "вести True, если не является — вывести False.");
        System.out.println("11°. Дано целое число N (> 1). Вывести наименьшее из целых чисел K,\n" +
                "для которых сумма 1 + 2 + … + K будет больше или равна N, и саму эту\n" +
                "сумму.");
        System.out.println("16. Спортсмен-лыжник начал тренировки, пробежав в первый день 10 км.\n" +
                "Каждый следующий день он увеличивал длину пробега на P процентов от\n" +
                "пробега предыдущего дня (P — вещественное, 0 < P < 50). По данному P\n" +
                "определить, после какого дня суммарный пробег лыжника за все дни пре-\n" +
                "высит 200 км, и вывести найденное количество дней K (целое) и суммар-\n" +
                "ный пробег S (вещественное число).");
        System.out.println("18. Дано целое число N (> 0). Используя операции деления нацело и взя-\n" +
                "тия остатка от деления, найти количество и сумму его цифр.");
        System.out.println("0.Exit");
        System.out.println("Введите номер задачи:");
        while (true) try {
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input < 0) System.out.println("Try input number of task we have...");
            switch (input) {
                case 0:
                    return;
                case 3:
                    System.out.println("Введите положительные числа N и K:");
                    libWhile.taskWhile3(sc.nextInt(), sc.nextInt());
                    break;
                case 4:
                    System.out.println("Введите число N:");
                    System.out.println(libWhile.taskWhile4(sc.nextInt()));
                    break;
                case 11:
                    System.out.println("Введите число N:");
                    libWhile.taskWhile11(sc.nextInt());
                    break;
                case 16:
                    System.out.println("Введите P процентов:");
                    libWhile.taskWhile16(sc.nextDouble());
                    break;
                case 18:
                    System.out.println("Введите число N:");
                    libWhile.taskWhile18(sc.nextInt());
                    break;
            }
        } catch (InputMismatchException exception) {
            System.out.println("This is not an integer");
        }
    }
}
