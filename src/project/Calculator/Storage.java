import java.util.Arrays;
import java.util.Scanner;

public class Storage implements Interface{
    private double[] array = new double[]{0,0,0,0,0};

    public Storage() {
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }

    @Override
    public void menu() {
        System.out.println("------------------------------");
        System.out.println("Последние сохранненные данные:");
        System.out.println(Arrays.toString(array));
        System.out.println("для выхода нажмите 3");

    }

    public void scanner() {
        boolean userInputCorrect = false;
        do {
            System.out.print("Выберите пункт меню: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int numberMenu = scanner.nextInt();
                if (numberMenu == 3) {
                    userInputCorrect = true;
                } else {
                    System.out.println("Вы ввели не 3. Повторите ввод");}
            }
            else {
                System.out.println("Вы ввели не число, повторите ввод");
            }
        } while (!userInputCorrect);
    }
}
