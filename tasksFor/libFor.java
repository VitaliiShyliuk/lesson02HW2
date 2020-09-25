package ua.univer.base.lesson02.lesson02HW2.tasksFor;

public class libFor {
    public static void printFirstNumberQuantityTimes (int number, int quantity) {
        int i;
        for (i=0; i<quantity; i++){
            System.out.print(number+" ");
        }
        System.out.println("");
    }
    public static void FirstNumberToSecondDegree (int number, int degree) {
        int i;
        for (i=1; i<=degree; i++) {
            number = number*i;
            System.out.print(number+" ");
        }
        System.out.println("");
    }
    public static void sumNumberFrom1UpToEnteredInclude (int include) {
        int i = 0;
        int result = 0;
        for (i=0;i<include;i++) {
            result = result+1+i;
        }
        System.out.println(result);
    }
    public static void sumMultiplitedNumberFrom1UpToEnteredInclude (int N, int K) {
        int result = 0;
        int i = 0;
        for (i=1; i<=N;i++) {
            result = result+(K*i);
        }
        System.out.println(result);
    }
    public static void sumNumbersToThePower(int number) {
        double result = 0;
        for (int i=1; i<=number; i++) {
            result = result + Math.pow(i,i);
        }
        System.out.println(result);
    }
}

