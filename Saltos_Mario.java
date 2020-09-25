import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;
//LIMITE DE MEMORIA EXCEDIDA
public class Saltos_Mario {
    public static StringBuilder calculaSaltosArriba(String[] str) {
        StringBuilder sb = new StringBuilder();
        byte saltoArriba = 0;
        byte saltoAbajo = 0;
        for (int i = 0; i < str.length-1; i++) {
            if (Integer.parseInt(str[i]) > Integer.parseInt(str[i+1]))saltoAbajo++;
            if (Integer.parseInt(str[i]) < Integer.parseInt(str[i+1]))saltoArriba++;
        }
        return sb.append(saltoArriba+" "+saltoAbajo);
    }
    public static void main(String[] args) throws  IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numCasos = Integer.parseInt(bf.readLine());
        if (numCasos < 0 || numCasos > Math.pow(10,9))return;
        for (int i = 0; i < numCasos; i++) {
            byte numSaltos = Byte.parseByte(bf.readLine());
            String[] str = bf.readLine().split(" ");
            if (str.length != numSaltos)return;
            try {
                out.println(calculaSaltosArriba(str));
            }catch (NumberFormatException f){
                return;
            }
        }

    }
}