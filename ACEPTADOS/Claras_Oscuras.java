package ACEPTADOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Claras_Oscuras {//413

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numCasos = Integer.parseInt(bf.readLine());
        for (int i = 0; i < numCasos; i++) {
            String entrada[] = bf.readLine().split(" ");
            System.out.println(calcular(entrada));
        }
    }

    private static String calcular(String[] entrada) {
        int ancho = Integer.parseInt(entrada[0]);
        int alto = Integer.parseInt(entrada[1]);
        int losetasBlancas = 0;
        int losetasNegras = 0;
        losetasBlancas = (ancho*alto)/2;
        losetasNegras = (ancho*alto)/2;
        if (ancho == 1 && alto == 1){
            losetasBlancas = 1;
            losetasNegras = 0;
        }else if ((ancho*alto)%2 != 0){
            losetasBlancas = ((ancho*alto)/2)+1;
        }
        return losetasBlancas+" "+losetasNegras;
    }

}
