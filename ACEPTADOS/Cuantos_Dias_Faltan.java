package ACEPTADOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Cuantos_Dias_Faltan{
    //ACEPTADO
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numCasos = Integer.parseInt(bf.readLine());
        for (int i = 0; i < numCasos; i++) {
            String[] str = bf.readLine().split(" ");
            System.out.println(calcularDias(str));
        }
    }

    private static int calcularDias(String[] str) {
        byte[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dia = Integer.parseInt(str[0]);
        int mes = Integer.parseInt(str[1]);
        int resultado = diasMes[mes-1] - dia;
        for (int i = mes; i < diasMes.length;i++)resultado += diasMes[i];
        return resultado;
    }
}
