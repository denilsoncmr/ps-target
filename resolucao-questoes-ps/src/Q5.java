import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringReverse, word = input.nextLine();
        char[] data = new char[word.length()];
        int aux = 0;

        for(int i = word.length() - 1; i >= 0 ; i--){
            data[aux] = word.charAt(i); 
            aux++;
        }
        stringReverse = new String(data);
        System.out.println(stringReverse);
        input.close();
    }
}
