package ACEPTADOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Palabra_Palindroma {
    //252 ACEPTADO
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String entrada = bf.readLine();
            if (entrada.equals("XXX") || entrada.length() > 100)return;
            if (Pattern.matches("[0-9]+",entrada))return;
            System.out.println(esPalindromo(entrada));
        }
    }
    public static String esPalindromo(String entrada) {
        entrada = entrada.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
                .replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");;
        String invertida = new StringBuilder(entrada).reverse().toString();
        if (invertida.equals(entrada))return "SI";
        return "NO";
    }
}
