import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double mb;
        double mbps;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o tamanho do arquivo para download (em MB): ");
        mb = teclado.nextDouble();
        System.out.print("Insira a velocidade da Internet (em Mbps): ");
        mbps = teclado.nextDouble();
        teclado.close();

        double tempo = ((mb*8)/(mbps*60));

        System.out.println(" ");
        System.out.printf("O tempo aproximado de download do arquivo é de %.2f minutos.", tempo);

    }
}