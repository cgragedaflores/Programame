import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        num1 = sc.nextInt();
        num2 = num1;
        num1 = sc.nextInt();
        System.out.println(num1+"\t"+num2);
    }
}
