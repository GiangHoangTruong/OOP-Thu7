package Lab_1;

import java.util.Scanner;
public class Bai_2_Input_From_Keyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What your name: ");
        String name = keyboard.nextLine();

        System.out.print("How old are you? ");
        int age = keyboard.nextInt();

        System.out.print("How tall are you? (m)");
        int height = keyboard.nextInt();

        System.out.print("Mr/Ms." + name + " , " + age + " years old." + "Your height is " + height + ".");
    }
}
