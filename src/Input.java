import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("введите что-нибудь");
//        String string = scn.nextLine();
//        System.out.println("вы ввели " + string); //примеры с String
        int value = scn.nextInt();
        System.out.println("вы ввели " + value);
        //примеры с int
    }
}