import java.util.Scanner;

public class Task2 {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");

        String name = scanner.next();

        if (name.equalsIgnoreCase("Вячеслав")) {
            System.out.print("Привет Вячеслав");
        } else {
            System.out.print("Нет такого имени");
        }
    }
}
