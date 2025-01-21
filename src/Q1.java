import java.util.Scanner;

    public class Q1 {
        public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        float first = scanner.nextFloat();
        System.out.println("Enter the second number");
        float second = scanner.nextFloat();
        System.out.println("Enter the third number");
        float third = scanner.nextFloat();

        float max = Math.max(first, Math.max(second,third));
        float min = Math.min(first, Math.min(second, third));

        System.out.println("The max amount of number for 3 is: " + max);
        System.out.println("The min amount of number for 3 is: " + min);
            scanner.close();
        }

}

