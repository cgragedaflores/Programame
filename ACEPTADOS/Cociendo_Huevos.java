package ACEPTADOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Cociendo_Huevos {
    //problema 368
    //ACEPTADO
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String [] entrada = bf.readLine().split(" ");
            if (Integer.parseInt(entrada[0]) < 1 && Integer.parseInt(entrada[0]) < 10000)return;
            if (Integer.parseInt(entrada[1]) < 1 && Integer.parseInt(entrada[1]) < 1000)return;
            System.out.println(calcularTiempo(entrada));
        }
    }

    private static int calcularTiempo(String[] entrada) {
        int numHuevos = Integer.parseInt(entrada[0]);
        int capacidad = Integer.parseInt(entrada[1]);
        int tiempo = 10;
        while (numHuevos > capacidad){
            numHuevos -= capacidad;
            tiempo+=10;
        }
        return tiempo;
    }
}
