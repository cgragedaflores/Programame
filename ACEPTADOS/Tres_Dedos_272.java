package ACEPTADOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tres_Dedos_272 {
    //PROBLEMA 272
    public static String cambiarBase(int numero,int base){
        int modulo = 0;
        String resultado = "";
        // Inicio while
        do{
            // Saca el modulo del numero y despues divide
            // el numero por la base
            modulo = numero % base;
            if(modulo>9) modulo += 55;
            else modulo += 48;
            resultado = (char)modulo+resultado;
            numero = numero /base;
        }while(numero > 0 && base > 0);

        return resultado;
    }
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int numCasos = Integer.parseInt(bf.readLine());
            for (int i = 0; i < numCasos;i++){
                int numero = Integer.parseInt(bf.readLine());
                if (numero < 0 || numero > 1000000)return;
                System.out.println(cambiarBase(numero,6));
            }
        }catch (NumberFormatException f){return;}

    }
}
