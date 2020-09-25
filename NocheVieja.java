import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NocheVieja {
    //PROBLEMA 148
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String entrada = bf.readLine();
            if (entrada.equals("00:00")) return;
            System.out.println(cuantosMinutosFaltan(entrada));
        }
    }

    private static int cuantosMinutosFaltan(String entrada) {
        String[] time = entrada.split(":");
        int horaActual = (Integer.parseInt(time[0]) * 60) + Integer.parseInt(time[1]);
        int minutosMidNight = 1440;
        return minutosMidNight - horaActual;
    }
}
