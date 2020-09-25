package ua.univer.base.lesson02.lesson02HW2.tasksFor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tasksFor {
    public static void main(String[] args) {
        System.out.println("For tasks.");
        System.out.println("1. Даны целые числа K и N (N > 0). Вывести N раз число K. For10. Дано целое число N (> 0). Найти сумму 1 + 1/2 + 1/3 + … + 1/N");
        System.out.println("16. Дано вещественное число A и целое число N (> 0). Используя один цикл, вывести все целые степени числа A от 1 до N.");
        System.out.println("20. Дано целое число N (> 0). Используя один цикл, найти сумму 1! + 2! + 3! + … + N! " +
                "(выражение N! — N–факториал — обозначает произведение всех целых \n" +
                "чисел от 1 до N: N! = 1·2·…·N). Чтобы избежать целочисленного переполнения, " +
                "проводить вычисления с помощью вещественных переменных и вывести результат как вещественное число.");
        System.out.println("36. Даны целые положительные числа N и K. Найти сумму 1K + 2K + … + NK. Чтобы избежать целочисленного переполнения, " +
                "вычислять слагаемые этой суммы с помощью вещественной переменной и выводить результат как вещественное число.");
        System.out.println("37. Дано целое число N (> 0). Найти сумму 1^1 + 2^2 + … + N^N. Чтобы избежать целочисленного переполнения, " +
                "вычислять слагаемые этой суммы с помощью вещественной переменной и выводить результат как вещественное число.");
        System.out.println("0.Exit");
        System.out.println("Введите номер задачи:");
        while (true) {
            try
            {
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Введите 2 числа:");
                    libFor.printFirstNumberQuantityTimes(sc.nextInt(), sc.nextInt());
                    break;
                case 16:
                    System.out.println("Введите 2 числа:");
                    libFor.FirstNumberToSecondDegree(sc.nextInt(), sc.nextInt());
                    break;
                case 20:
                    System.out.println("Введите 1 число:");
                    libFor.sumNumberFrom1UpToEnteredInclude(sc.nextInt());
                    break;
                case 36:
                    System.out.println("Введите 2 числа:");
                    libFor.sumMultiplitedNumberFrom1UpToEnteredInclude(sc.nextInt(),sc.nextInt());
                    break;
                case 37:
                    System.out.println("Введите 1 число:");
                    libFor.sumNumbersToThePower(sc.nextInt());
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
