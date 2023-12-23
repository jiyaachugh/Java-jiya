import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(25, 40);
        System.out.println(ans);
    }

    // pass the value of numbers when you're calling this method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }
    // return the value
    static int sum2() {
        int num1, num2,sum;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
    }
        static void sum() {
            int num1, num2,sum;
            Scanner in = new Scanner(System.in);

            System.out.println("Enter number 1: ");
            num1 = in.nextInt();
            System.out.println("Enter number 2: ");
            num2 = in.nextInt();
            sum = num1 + num2;
            System.out.println("The sum is:" + sum);
        }


    }

