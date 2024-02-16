import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        System.out.println("A = " +a +", B = " +b +", C = " +c);

        //A formula %10d printa cria espacos em brancos a frente do numero 
        // Como a varial ja possui um tamanho ele printa espacos em branco que junto com a variavel daria o tamanho desejado
        System.out.printf("A = %10d, ", a);
        System.out.printf("B = %10d, ", b);
        System.out.printf("C = %10d\n", c);

        System.out.printf("A = %010d, ", a);
        System.out.printf("B = %010d, ", b);
        System.out.printf("C = %010d\n", c);

        System.out.printf("A = %-10d, ", a);
        System.out.printf("B = %-10d, ", b);
        System.out.printf("C = %-10d\n", c);

    }
}
