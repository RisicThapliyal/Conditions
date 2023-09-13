import java.util.Scanner;
public class Conditional {

    public static void main(Strings[] args){

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        System.out.println("Enter Your Age : ");

        if (age > 18) {
            System.out.println("Adult");
        }

        else {
            System.out.println("Not Adult");
        }
    }
}
