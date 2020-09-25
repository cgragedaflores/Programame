import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;

public class EpionajeNavidad {
    public static String cifraCadena(String input){
        char[] caracteres = input.toCharArray();
        String resultado = "";
        for(int i = 0; i < caracteres.length;i++){
            int numASCII = (int)caracteres[i]+1;
            if(numASCII == 33)numASCII-=1;
            if(caracteres[i] == 90){
                 numASCII =  65;
            }
            resultado += (char)numASCII;
        }

        return resultado;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String input = bf.readLine();
            if(input.length() > 100 || input.equals("FIN"))return;
            out.println(cifraCadena(input));
        }
    }
}
