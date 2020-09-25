package ACEPTADOS;//ACEPTADO
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumaDescendente {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String numero = bf.readLine();
            if (numero.equals("0"))return;
            if (Integer.parseInt(numero) < 1 || Integer.parseInt(numero) > Math.pow(Integer.parseInt(numero),9))return;
            System.out.println(sumaDesc(numero));
        }
    }

    private static int sumaDesc(String numero) {
        int resultado = 0;
        for (int i = 0; i <numero.length(); i++) {
            resultado += Integer.parseInt(numero.substring(i,numero.length()));
        }
    return resultado;
    }
}
