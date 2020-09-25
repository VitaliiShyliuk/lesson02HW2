package ua.univer.base.lesson02.lesson02HW2.tasksWhile;

public class libWhile {
    public static void taskWhile3 (int N, int K) {
        int count=0;
        while (N>=K) {
            N = N - K;
            count++;
        }
        System.out.println("частное от деления нацело N на K = "+ count);
        System.out.println("остаток от этого деления " + N);
    }
    public static boolean taskWhile4 (double N) {
        while (N>=1) {
            if (N==1) return true;
            N=N/3;
        }
        return false;
    }
    public static void taskWhile11(int N) {
        int sum = 0;
        int count = 0;
        while (sum<N) {
            count++;
            sum=sum + count;
        }
        System.out.println("наименьшее из целых чисел K = " + count);
        System.out.println("сумма = " + sum);
    }
    public static void taskWhile16(double P) {
        double passWay = 10;
        int countDays = 1;
        while (passWay<200){
            countDays++;
            passWay = passWay + passWay * P / 100;
        }
        System.out.println("найденное количество дней = " + countDays);
        System.out.println("суммарный пробег = " + passWay);

    }
    public static void taskWhile18(int N) {
        int sum = 0;
        int count = 0;
        while (N>0) {
            sum = sum+N%10;
            N=N/10;
            count++;
        }
        System.out.println("сумма его цифр = "+ sum);
        System.out.println("количество его цифр = "+ count);
    }
}
