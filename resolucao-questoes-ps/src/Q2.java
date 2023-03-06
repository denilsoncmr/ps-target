import java.util.Scanner;
   
public class Q2 {
    public static int fibonacci(int num) {
        if(num == 0){
            return 0;
        } else if(num == 1){
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean a = false;
        int b, number = input.nextInt();

        for(int i = 0; i <= number; i++){
            b = fibonacci(i);
            if (b == number){
                a = true;
            }
        }
        System.out.println("O "+ number +"º elemento da sequencia de fibonacci é: "+ fibonacci(number));
        System.out.println("O numero " + number + " faz parte da sequencia de fibonacci: "+ a);
        input.close();
    }
}
