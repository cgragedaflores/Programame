import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tu_Vecino {
    //PROBLEMA 474
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            byte numCasos = Byte.parseByte(bf.readLine());
            for (int i = 0; i < numCasos; i++) {
                String[] numMetros = bf.readLine().split(" ");
                System.out.println(calculaMetrosMinimos(numMetros));

            }
        }catch (NumberFormatException F){
            return;
        }

    }

    private static int calculaMetrosMinimos(String[] numMetros) {
        int resultado = 0;
        for (int i = 0; i < numMetros.length-1; i++) {
            if (Integer.parseInt(numMetros[i]) < 0 || Integer.parseInt(numMetros[i]) > 100000)System.exit(0);
            if (Integer.parseInt(numMetros[i]) > Integer.parseInt(numMetros[i+1])) {
                resultado += Integer.parseInt(numMetros[i]) - Integer.parseInt(numMetros[i + 1]);
            }else if (Integer.parseInt(numMetros[i]) < Integer.parseInt(numMetros[i+1])){
                resultado += Integer.parseInt(numMetros[i + 1]) - Integer.parseInt(numMetros[i]);
            }

        }
        return resultado;
    }
}
