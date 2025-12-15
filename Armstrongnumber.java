import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        int num, reverse = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = sc.nextInt();

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }

        System.out.println("Reversed Number: " + reverse);
    }
}
