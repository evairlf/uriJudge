import java.io.IOException;
import java.util.Scanner;

public class Uri1006 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Double A,B,C;
        A = sc.nextDouble()*0.2;
        B = sc.nextDouble()*0.3;
        C = sc.nextDouble()*0.5;

        System.out.printf("MEDIA = %.1f\n",(A+B+C));

    }

}