import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Claras_Oscuras {//413

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        byte numCasos = Byte.parseByte(bf.readLine());
        for (int i = 0; i < numCasos; i++) {
            String entrada[] = bf.readLine().split(" ");
            System.out.println(calcular(entrada));
        }
    }

    private static String calcular(String[] entrada) {
        int ancho = Integer.parseInt(entrada[0]);
        int alto = Integer.parseInt(entrada[1]);
        if (ancho == alto){
            return ""+calcularCuadrado(ancho,alto);
        }
        return ""+calcularRectangulo(ancho,alto);
    }
    private static int calcularCuadrado(int ancho, int alto){
        return (ancho*alto)/2;
    }
    private static int calcularRectangulo(int ancho, int alto){
        return 0;
    }
}
