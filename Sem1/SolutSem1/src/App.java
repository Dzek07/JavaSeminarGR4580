import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //task1();
        task2();
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
}
