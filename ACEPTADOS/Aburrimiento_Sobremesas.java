package ACEPTADOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Aburrimiento_Sobremesas {
    //Problema 371 ACEPTADO
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String entrada = bf.readLine();
            if (entrada.equals("0") || Integer.parseInt(entrada) > 20000)return;
            if (!Pattern.matches("[0-9]+",entrada))return;
            System.out.println(calcular(entrada));
        }
    }

    private static int calcular(String entrada) {
        int resultado = 0;
        for (int i = 0; i < Integer.parseInt(entrada);i++){
            int contador = i+1;
            resultado += (3*contador);
        }
        return resultado;
    }
}
