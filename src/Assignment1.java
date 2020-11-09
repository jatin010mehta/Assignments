import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Number between 1 to 10");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Enter String Value ");
        String userInput = scanner.next();
        System.out.println("User Input -> "+userInput);
        swapNumber(num1,num2);
        swapWithoutThirdVariable(num1,num2);
        int z = num1+num2;
        int result = z+30;
        System.out.println("Result is "+result);
    }
    public static void swapNumber(int num1,int num2){
        int result = num1;
        num1=num2;
        num2=result;
        System.out.println("Number 1 ="+num1+" Number 2 ="+num2);
    }

    public static void swapWithoutThirdVariable(int num1,int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Number 1 ="+num1+" Number 2 ="+num2);
    }
}
