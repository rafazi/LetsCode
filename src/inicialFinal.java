import java.util.Scanner;

public class inicialFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor inicial: ");
        int a = scanner.nextInt();
        System.out.println("Informe o valor final: ");
        int b = scanner.nextInt();

        System.out.println("Resultado: ");
        for(int i = a; i <= b; i++){
            System.out.println(i);
        }

    }
}
