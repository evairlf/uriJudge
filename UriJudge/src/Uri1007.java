import java.io.IOException;
import java.util.Scanner;

public class Uri1007 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Integer A,B,C,D;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        System.out.println("DIFERENCA = "+((A*B)-(C*D)));

    }

}