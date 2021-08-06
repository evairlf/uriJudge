import java.io.IOException;
import java.util.Scanner;

public class Uri1004 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Double A,B;
        A = sc.nextDouble()*3.5;
        B = sc.nextDouble()*7.5;

        System.out.printf("MEDIA = %.5f\n",(A+B)/11);

    }

}