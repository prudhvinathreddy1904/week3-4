import java.util.Scanner;

class level1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int number = input.nextInt();

        System.out.println("Is number Even & greater or equal to 18? " + 
                           ((number % 2 == 0) && (number >= 18)));

        System.out.println("Is the number divisible by 3 or 4? " + 
                           (number % 3 == 0 || number % 4 == 0));

        System.out.println("Is the number not zero and divisible by 3? " + 
                           (!(number == 0) && number % 3 == 0));
    }
}
