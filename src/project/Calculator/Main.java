import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int numberMenu;
        Storage storage =new Storage();
        int i = 0;
        double result;
        System.out.println(" Добро пожаловать в Калькулятор");
        do {
            menuStart();
            numberMenu = scanner();
            if (numberMenu == 1) {
                Calculator calculator = new Calculator();
                result = calculator.calculation();
                double[] array;
                array = storage.getArray();
                array[i] = result;
                storage.setArray(array);
                if (i <= 3) i++;
                 else i = 0;
            } else if (numberMenu == 2) {
                storage.getArray();
                storage.menu();
                storage.scanner();
            }
        } while (numberMenu != 3);
    }

    public static void menuStart() {

        System.out.println(" Для выполнения операции вычисления двух чисел нажмите 1");
        System.out.println(" Для вывода на экран истоии операций нажмите 2");
        System.out.println(" Для выхода из программы нажмите 3");
    }

    public static int scanner() {
        int numberMenu = 0;
        boolean userInputCorrect = false;
        do {
            System.out.print("Выберите пункт меню: ");
            Scanner scanner = new Scanner(System.in);
            try {
                numberMenu = scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Вы ввели не 1, 2 или 3. Повторите ввод");
                continue;
            }
            if (numberMenu == 1 || numberMenu == 2 || numberMenu == 3) {
                userInputCorrect = true;
            } else {
                System.out.println("Вы ввели не 1, 2 или 3. Повторите ввод");
            }
        } while (!userInputCorrect);
        return numberMenu;
    }
}
