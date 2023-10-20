import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Drink plenty of water every day the age doesn't matters");
        Scanner s = new Scanner(System.in);
        System.out.println("please Enter the age ");
        System.out.println("Note:" + " Enter age above 65 or equals ");
        int age = s.nextInt();
        Call cal = new Call();
        cal.Age(age);


    }
}