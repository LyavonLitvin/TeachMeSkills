import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator implements Interface{
    public Calculator() {
    }

    public double calculation() {
        String controlLetter;
        menu();
        double a = scannerNumber();
        double b = scannerNumber();
        double result = 0;
        controlLetter = scannerSymbol();
        if (controlLetter.equals("+")) {
            Sum sum = new Sum();
            result = sum.operation(a,b);
        } else if (controlLetter.equals("-")) {
            Diff diff = new Diff();
            result = diff.operation(a,b);
        } else if (controlLetter.equals("*")) {
            Multiple multiple = new Multiple();
            result = multiple.operation(a,b);
        } else if (controlLetter.equals("/")) {
            Div div = new Div();
            result = div.operation(a,b);
        }
        return result;
    }

    @Override
    public void menu() {
        System.out.println("Вы выбрали операцию вычисления двух чисел");
        System.out.println("Введите два числа, затем введите символ математической операции ( + , - , * , / )");
    }

    private double scannerNumber() {
        double number = 0;
        boolean userInputCorrect = false;
        do {
            System.out.print("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextDouble();

            } catch (InputMismatchException exception) {
                System.out.println("Вы ввели не число, повторите ввод");
                continue;
            }
            userInputCorrect = true;
        } while (!userInputCorrect);
        return number;
    }

    private static String scannerSymbol() {
        boolean userInputCorrect = false;
        String controlLetter;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите символ математической операции ( + , - , * , / )");
            controlLetter = scanner.next();
            if (controlLetter.equals("/") || controlLetter.equals("*") || controlLetter.equals("-") || controlLetter.equals("+") ) {
                userInputCorrect = true;
            } else {
                System.out.println("Возможно вы не туда нажали. Попробуйте снова");
            }
        } while (!userInputCorrect);
        return controlLetter;
    }
}


