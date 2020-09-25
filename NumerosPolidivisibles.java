import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumerosPolidivisibles {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            long num = Long.parseLong(bf.readLine());
            if (num < 0 || num > Math.pow(10,18))return;

        }

    }
}