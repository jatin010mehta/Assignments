import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Assignment2 {
    public static void main(String[] args) {
        pascalTriangle();
        System.out.println("Value is "+increasingDecreasing());
        findAverage();
        multiplication();
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        while (true){


            int input = scanner.nextInt();
            if (input<0){
                System.out.println("Its Over");
                break;
            }
            else
                System.out.println("Keep Going");
        }
        for (int i = 0; i < 6; i++) {
            if (i==3)
                continue;
            else
                System.out.println(i);
        }
        System.out.println("Enter number");
        int input = scanner.nextInt();

        if (input%2==1)
            System.out.println("NEW");
        else if (input%2==0&(input>=2&input<=5))
            System.out.println("OLD");
        else if (input%2==0&(input>=6&input<=30))
            System.out.println("NEW");
        else
            System.out.println("OLD");

        System.out.println("Enter number");
        float input2 = scanner.nextFloat();
        if (input2==0)
            System.out.println("zero");
        else if (input2>0)
            System.out.println("Positive");
        else if (input2<0)
            System.out.println("Negative");
        String string = "random";
        Set<Character> set = new HashSet<>();
        for (char ch :string.toCharArray()) {
            set.add(ch);
        }

        System.out.println("Enter Character");
        char charInput = scanner.next().charAt(0);
        if (set.contains(Character.toLowerCase(charInput)))
            System.out.println("Found");
        else
            System.out.println("Not Found");
        System.out.println("Enter Number");
        int num = scanner.nextInt();
        if (num<1)
            System.out.println("Invalid input");
        int sum = 0;
        for (int i = 1; i <=num ; i++) {
            sum+=i;
        }
        System.out.println("Sum of all nuatural number is "+sum);
        System.out.println("Enter Long Number");
        long longValue = scanner.nextLong();
        String newString = Long.toString(longValue);
        System.out.println("Length is "+newString.length());
        int newSum = 0;
        for(char ch:newString.toCharArray()) {
            System.out.println("Digits are " + ch);
            newSum+=Integer.valueOf(Character.toString(ch));
        }
        System.out.println("Sum of each digit is "+newSum);


    }
    public static void printConsultAdd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int input = scanner.nextInt();
        if (input%3==0&input%5==0)
            System.out.println("ConsultAdd Java Training");
        else if (input%3==0)
            System.out.println("ConsultAdd");
        else if (input%5==0)
            System.out.println("Java Training");
    }

    public static void performOperation(){
        System.out.println("Enter from following option\n"+"○ Addition\n" +
                "\n" +
                "○ Subtraction\n" +
                "\n" +
                "○ Division\n" +
                "\n" +
                "○ Multiplication\n" +
                "\n" +
                "○  Average");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        if (input.equals("addition")){
            System.out.println("Enter two number");
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int result = first+second;
            if (result<0)
                System.out.println("Oops option Addition is returning negative result");
            else
                System.out.println("Result is "+result);
        }
        else if (input.equals("subtraction")){
            System.out.println("Enter two number");
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int result = first-second;
            if (result<0)
                System.out.println("Oops option Subtraction is returning negative result");
            else
                System.out.println("Result is "+result);
        }
        else if (input.equals("division")){
            System.out.println("Enter two number");
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int result = first/second;

                System.out.println("Result is "+result);
        }
        else if (input.equals("multiplication")){
            System.out.println("Enter two number");
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int result = first*second;
        }
        else if (input.equals("average")){
            System.out.println("Enter two number");
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int result = (first+second)/2;
            if (result<0)
                System.out.println("Oops option Average is returning negative result");
            else
                System.out.println("Result is "+result);
        }
        else {
            System.out.println("Wrong Input");
        }
    }

    public static void flowChart(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int avg = (first+second+third)/3;
        System.out.println("Average is "+avg);
        if (avg>first&avg>second&avg>third){
            System.out.println("Average is greater than first, second, third");
        }
        else if (avg>first&avg>second){
            System.out.println("Average is greater than first, second");
        }
        else if (avg>first&avg>third){
            System.out.println("Average is greater than first,third");
        }
        else if (avg>second&avg>third){
            System.out.println("Average is greater than second, third");
        }else if (avg>first){
            System.out.println("Avergae s just greater than first");
        }
        else if (avg>second){
            System.out.println("Avergae s just greater than second");
        }
        else if (avg>third){
            System.out.println("Avergae s just greater than third");
        }
    }

    public static void multiplication(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number ");
        int input = scanner.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(input+" x "+i+" = "+input*i);
        }
    }

    public static void findAverage(){
        float sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Number ");
            int input = scanner.nextInt();
            sum+=input;
        }

        System.out.println("Sum is "+sum);
        System.out.println("Average is "+sum/10);

    }

    public static void findDaysInMonth(){
        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }

    public static boolean increasingDecreasing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer value ");
        String input = Integer.toString(scanner.nextInt());
        if (input.length()<=1)
            System.out.println("Neither increasing or decreasing order");
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < input.length(); i++) {
            int value1 = Integer.valueOf(input.charAt(i-1));
            int value2 = Integer.valueOf(input.charAt(i));
            if (value2>value1)
                decreasing=false;
            else if (value1>value2)
                increasing=false;
        }
        return increasing||decreasing;

    }

    public static void formTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer value ");
        int input = scanner.nextInt();

        int i, j,num;
        for(i=0; i<input; i++) {
            num=1;
            for(j=0; j<=i; j++) {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void pascalTriangle() {

        ArrayList<Integer> row = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer value ");
        int rows = scanner.nextInt();
        for(int i=0;i<rows;i++)
        {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++)
                row.set(j, row.get(j)+row.get(j+1));
            for (Integer val :row) {
                System.out.print(val+" ");
            }
            System.out.println();

        }

    }
}
