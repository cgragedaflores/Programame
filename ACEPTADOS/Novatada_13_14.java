package ACEPTADOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Novatada_13_14 {
    //ACEPTADO
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numCasos = Integer.parseInt(bf.readLine());
        for (int i = 0; i < numCasos; i++) {
            String numStr[] = bf.readLine().split("-");
            System.out.println(calcular(numStr));
        }
        bf.close();
    }

    private static String calcular(String[] numStr) {
        int maxCalibre = 0;
        int minCalibre = 0;
        if (maxCalibre < 0 || maxCalibre > 1000000)System.exit(0);
        if (minCalibre < 0 || minCalibre > 1000000)System.exit(0);
        if (Integer.parseInt(numStr[0]) > Integer.parseInt(numStr[1])){
            maxCalibre = Integer.parseInt(numStr[0]);
            minCalibre = Integer.parseInt(numStr[1]);
        }else{
            minCalibre = Integer.parseInt(numStr[0]);
            maxCalibre = Integer.parseInt(numStr[1]);
        }
        if (minCalibre % 2 == 0 && minCalibre+1 == maxCalibre)return "SI";
        return "NO";
    }
}
