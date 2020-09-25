import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Saltos_Mario {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numCasos = Integer.parseInt(bf.readLine());
        for (int i = 0; i < numCasos; i++) {
            int numMuros = Integer.parseInt(bf.readLine());
            if (numMuros < 1 && numMuros > Math.pow(10,9))return;
            String entrada = bf.readLine();
            System.out.println(calcularSaltos(entrada));
        }
    }

    private static String calcularSaltos(String entrada) {
        char[] numSalto = entrada.replaceAll(" ","").toCharArray();
        byte saltosArriba = 0;
        byte saltosAbajo = 0;
        for (int i = 0; i < numSalto.length-1; i++) {
            if (numSalto[i] == numSalto[i+1])continue;
            if (numSalto[i] > numSalto[i+1])saltosAbajo++;
            if (numSalto[i] < numSalto[i+1])saltosArriba++;
        }
        return saltosArriba+" "+saltosAbajo;
    }
}