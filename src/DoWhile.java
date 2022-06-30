import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        System.out.println("enter 5");
//        int value = scn.nextInt(); //кладем в переменную, то что мы считаем с клавиатуры
//        while (value != 5) {
//            System.out.println("enter 5");
//            value = scn.nextInt();
//        }
//        System.out.println("you entered 5");
        int val;
        do {
            System.out.println("enter 5");
            val = scn.nextInt();
        } while (val != 5);
        System.out.println("you entered 5");
    }
}
