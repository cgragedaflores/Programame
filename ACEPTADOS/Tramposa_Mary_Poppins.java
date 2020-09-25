package ACEPTADOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
//TERMINADO
public class Tramposa_Mary_Poppins {
    public static String decifraTrampa(String entrada){
        StringBuilder sb = new StringBuilder();
        char[] caracteres = entrada.toCharArray();
        if (caracteres[0] >= 65 && caracteres[0] <= 90){
            caracteres[0] = (char) (caracteres[0] + 32);
            caracteres[caracteres.length-1] = (char) (caracteres[caracteres.length-1] - 32);
        }
        String resultado = new String(caracteres);
        return sb.append(resultado).reverse().toString();
    }
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numCasos = Integer.parseInt(bf.readLine());
        String entrada_Casos[] = new String[numCasos];
        for (int i = 0; i < entrada_Casos.length; i++) {
            entrada_Casos[i] = bf.readLine();
            if (entrada_Casos[i].length() < 0 || entrada_Casos[i].length() > 40)return;
            if (Pattern.matches("[0-9]+",entrada_Casos[i])) {
                return;
            }else{
                System.out.println(decifraTrampa(entrada_Casos[i]));
            }
        }
    }
}

