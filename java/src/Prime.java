import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if (number < 2){
            System.out.println(number + " :is not a prime");
        }
        else {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0 ){
                   check = false;
                   break;
                }
            } if (check){
                System.out.println(number + " :is prime");
            }else {
                System.out.println(number + " :is not a prime");
            }
        }
    }
}
