import java.util.Scanner;

public class fibonacciNumber {

    public static void fibonacci(int n){
        if(n<1){
            System.out.println("Enter Max Number !");  
        }
        int sum =0;
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        for(int i=2 ; i<n ; i++){
            sum = a + b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
            
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        System.out.print("The Fibonacci Series is : ");
        fibonacci(number);
    }
}