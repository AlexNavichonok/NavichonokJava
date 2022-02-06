import java.util.Scanner;

public class Task1 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        int chis = scanner.nextInt();

        if (chis > 7) {
            System.out.print("Привет");
        } else if (chis == 7){
            System.out.println("Уже рядом");
        } else if (chis < 7) {
            System.out.print("Нужно попробовать ещё");
        }
    }
}
