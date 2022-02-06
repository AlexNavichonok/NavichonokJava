import java.util.Scanner;

public class Task3 {

    public static void main (String[] args) {

        System.out.print("Введите количество элементов массива: ");
        Scanner s = new Scanner(System.in);

        int myArray =  s.nextInt();

        for (int i = 1 ; i < myArray; i++) {
            if(i % 3 == 0) {
            System.out.print(i + "; ");
            }
        }
    }
}
