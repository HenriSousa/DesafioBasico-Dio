import java.io.IOException;
import java.util.Scanner;

public class OFilme {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        //Escreva aqui a sua lógica
        double ingresso = ((B - A) / A * 100);

        System.out.printf("%.2f%%\n", ingresso);

    }

}