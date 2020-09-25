
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class Ascensor {
    public static int contadorAscensor(StringBuilder sb){
        String num[] = sb.toString().split(" ");
        int resultado = 0;
        for (int i = 0; i < num.length-2;i++){
            int pisoActual = Integer.parseInt(num[i]);
            if (pisoActual > Integer.parseInt(num[i+1])){
                resultado += pisoActual - Integer.parseInt(num[i+1]);
            }
            if (pisoActual < Integer.parseInt(num[i+1])){
                resultado +=  Integer.parseInt(num[i+1])- pisoActual ;
            }
        }

        return resultado;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true){
                StringBuilder sb = new StringBuilder(bf.readLine());
                out.println(contadorAscensor(sb));
                if (sb.toString().equals("-1"))return;
                sb.delete(0,sb.length());
            }
        }catch (NumberFormatException f){
            return;
        }
    }
}
