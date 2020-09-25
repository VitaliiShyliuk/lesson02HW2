package ua.univer.base.lesson02.lesson02HW2.tasks_if;

public class lib_if {
    public static int numberOfDaysInAYear(int a) {
        if (a%100==0 & a%400!=0) a=365;
        else if (a%4==0 ) a=366;
        else a=365;
        return a;
    }
    public static int sumOfLargestNumbers(int a, int b, int c) {
        int d = a;
        int count = 0;
        if (d < b) d = b;
        if (d < c) d = c;

        if(d==a) count++;
        if(d==b) count++;
        if(d==c) count++;
        return d*count;
    }
    public static int increasePositiveNumberBy1 (int a) {
        if (a>0) return a+1;
        else return a;
    }
    public static int increasePositiveNumberBy2OtherwiseMinus2 (int a) {
        if (a>0) return a+2;
        else if (a<1) return a-2;
        else {
            System.out.println("Error, input isn't a number.");
            return a;
        }
    }
    public static int positionOfMinimalNumber(int a, int b) {
        if (a<=b) return 1;
        else return 2;
    }


}
