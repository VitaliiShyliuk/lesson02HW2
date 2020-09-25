package ua.univer.base.lesson02.lesson02HW2.tasks_if;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tasks_if {
    public static void main(String[] args) {
            System.out.println("If tasks.");
            System.out.println("1. Дано целое число. Если оно является положительным, то прибавить к не\n" +
                    "му 1; в противном случае не изменять его. Вывести полученное число.");
            System.out.println("2. Дано целое число. Если оно является положительным, то прибавить к не-\n" +
                    "му 1; в противном случае вычесть из него 2. Вывести полученное число.");
            System.out.println("7. Даны два числа. Вывести порядковый номер меньшего из них.");
            System.out.println("15. Даны три числа. Найти сумму двух наибольших из них.");
            System.out.println("28. Дан номер года (положительное целое число). Определить количество\n" +
                    "дней в этом году, учитывая, что обычный год насчитывает 365 дней, а ви-\n" +
                    "сокосный — 366 дней. Високосным считается год, делящийся на 4, за ис-\n" +
                    "ключением тех годов, которые делятся на 100 и не делятся на 400 (напри-\n" +
                    "мер, годы 300, 1300 и 1900 не являются високосными, а 1200 и 2000 — яв-\n" +
                    "ляются).");
            System.out.println("0.Exit");
            System.out.println("Введите номер задачи:");
            while (true) {
                try
                {
                    Scanner sc = new Scanner(System.in);
                    int input = sc.nextInt();
                        if (input <=0) System.out.println("Try input number of task we have...");
                    switch (input) {
                        case 0:
                            return;
                        case 1:
                            System.out.println("Введите число:");
                            System.out.println("Result " + lib_if.increasePositiveNumberBy1(sc.nextInt()));
                            break;
                        case 2:
                            System.out.println("Введите число:");
                            System.out.println("Result " + lib_if.increasePositiveNumberBy2OtherwiseMinus2(sc.nextInt()));
                            break;
                        case 7:
                            System.out.println("Введите числа:");
                            System.out.println("Minimal in position " + lib_if.positionOfMinimalNumber(sc.nextInt(), sc.nextInt()));
                            break;
                        case 15:
                            System.out.println("Введите числа:");
                            System.out.println("Sum of largest number is " + lib_if.sumOfLargestNumbers(sc.nextInt(), +
                                    sc.nextInt(), sc.nextInt()));
                            break;
                        case 28:
                            System.out.println("Введите число:");
                            System.out.println("Result " + lib_if.numberOfDaysInAYear(sc.nextInt()));
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

