import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        task1();
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
}
