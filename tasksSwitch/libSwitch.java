package ua.univer.base.lesson02.lesson02HW2.tasksSwitch;

public class libSwitch {
    public static void fromNumberToNameOfWeek (int a) {
        switch (a) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
        }
    }
    public static void fromNumberToTextMark (int a) {
        if (a<1 | a>5) System.out.println("Error");
        switch (a) {
            case 1:
                System.out.println("плохо");
                break;
            case 2:
                System.out.println("неудовлетворительно");
                break;
            case 3:
                System.out.println("удовлетворительно");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("отлично");
                break;
        }
    }
    public static double calculatorTwoValue (int operation, double firstNumber, double secondNumber) {
        if (secondNumber == 0) return 0.0;
        if (operation < 1 | operation > 4) System.out.println("Choose operation");
        double result = 0;
        switch (operation) {
            case 1:
                result=firstNumber+secondNumber;
                break;
            case 2:
                result=firstNumber-secondNumber;
                break;
            case 3:
                result=firstNumber*secondNumber;
                break;
            case 4:
                result=firstNumber/secondNumber;
                break;
            default:
                break;
            }
        return result;
    }
    public static double calculatorWeightToKilo (int weightUnit, double weight) {
        if (weightUnit < 1 | weightUnit > 5) System.out.println("Choose unit weight");
        double resultKilo = 0;
        switch (weightUnit) {
            case 1:
                resultKilo = weight;
                break;
            case 2:
                resultKilo = weight/1_000_000.0;
                break;
            case 3:
                resultKilo = weight/1_000.0;
                break;
            case 4:
                resultKilo=weight*1_000.0;
                break;
            case 5:
                resultKilo=weight*100.0;
                break;
            default:
                break;
        }
        return resultKilo;
    }
    public static void ageFromNumberToString (int age) {
        int firstNumber = age/10;
        int secondNumber = age%10;
        String firstNumberText="";
        String secondNumberText="";
        switch (firstNumber) {
            case 2:
                firstNumberText = "двадцать";
                break;
            case 3:
                firstNumberText = "тридцать";
                break;
            case 4:
                firstNumberText = "сорок";
                break;
            case 5:
                firstNumberText = "пятьдесят";
                break;
            case 6:
                firstNumberText = "шестьдесят";
                break;
        }
        switch (secondNumber) {
            case 0:
                secondNumberText = "лет";
                break;
            case 1:
                secondNumberText = "один лет";
                break;
            case 2:
                secondNumberText = "два года";
                break;
            case 3:
                secondNumberText = "три года";
                break;
            case 4:
                secondNumberText = "четыре года";
                break;
            case 5:
                secondNumberText = "пять лет";
                break;
            case 6:
                secondNumberText = "шесть лет";
                break;
            case 7:
                secondNumberText = "семь лет";
                break;
            case 8:
                secondNumberText = "восемь лет";
                break;
            case 9:
                secondNumberText = "девять лет";
                break;
                }
        System.out.println(firstNumberText+" "+secondNumberText);
    }
}
