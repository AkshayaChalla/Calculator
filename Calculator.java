import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("welcome to calculator");
            System.out.println("choose an operatiion");
            System.out.println("1: addition");
            System.out.println("2: subtraction");
            System.out.println("3: multiplication");
            System.out.println("4: divisioin");
            System.out.println("exit");
            System.out.println("enter ur choice 1-5");
            int choice = sc.nextInt();
            if(choice == 5){
                System.out.println("exiting program");
                break;
            }
            System.out.println("enter 1st number");
            double num1 = sc.nextDouble();
            System.out.println("emter 2nd number");
            double num2 = sc.nextDouble();
            switch(choice){
                case 1:
                System.out.println("Result" + (num1 + num2));
                break;
                case 2:
                System.out.println("Result" + (num1 - num2));
                break;
                case 3:
                System.out.println("result" + (num1 * num2));
                break;
                case 4:
                System.out.println("result" + (num1 / num2));
                break;
                default:
                System.out.println("Invalid choice");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
