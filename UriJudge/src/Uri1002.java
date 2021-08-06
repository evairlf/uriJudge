import java.io.IOException;
import java.util.Scanner;

public class Uri1002 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Double A;
        A = sc.nextDouble();
        Double PI = 3.14159;
        Double resultado = PI*(Math.pow(A,2));

        System.out.printf("A=%.4f\n",resultado);

    }

}