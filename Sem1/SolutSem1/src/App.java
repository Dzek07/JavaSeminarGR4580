import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //task1();
        //task2();
        task3();
    }

    private static void task1() {
    Scanner iscanner = new Scanner(System.in);

        System.out.print("Enter the number of n numbers: ");
        Integer n = iscanner.nextInt();
        Integer summ = 0;
        for (int i = 1; i <= n; i++) {
           summ = summ + i;
        }
        
        System.out.println("Sum of n numbers = " + summ);
        
    }
        
    private static void task2() {
        Integer n = 1000;
        
        

        for (int i = 1; i < n+1; i++) {
            Integer count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0) {
                    count = count + 1;
                }
            }
            if (count == 2){
                System.out.print(i + ", ");
            }
        }
    }
    
    private static void task3() {
        Scanner iscanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        Integer firstNumber = iscanner.nextInt();
        System.out.print("Введите действие + - * / ");
        String action = iscanner.next();
        System.out.print("Введите второе число: ");
        Integer secondNumber = iscanner.nextInt();

        Integer result = 0;
        Integer sum = 0;
        Integer minus = 0;
        Integer multiply = 0;
        Integer division = 0;

        sum = action.compareTo("+");
        minus = action.compareTo("-");
        multiply = action.compareTo("*");
        division = action.compareTo("/");
        if (sum == 0){
            result = firstNumber + secondNumber;
            System.out.println(result);
            System.exit(0);
        }
        if (minus == 0){
            result = firstNumber - secondNumber;
            System.out.println(result);
            System.exit(0);
        }
        if (multiply == 0){
            result = firstNumber * secondNumber;
            System.out.println(result);
            System.exit(0);
        }
        if (division == 0){
            if (secondNumber == 0){
                System.out.println("Делить на 0 нельзя");
                System.exit(0);
            }
            result = firstNumber / secondNumber;
            System.out.println(result);
            System.exit(0);
        }
    }
    
    
    
    
    
}