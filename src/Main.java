import javax.sound.midi.SoundbankResource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.println("Qual o valor da Compra?");
            double valor = s.nextDouble();
            s.nextLine();
            System.out.println("Qual a forma de pagamento? [CREDITO,DEBITO,CHEQUE,BOLETO,PIX]");
            String formaPgt = s.nextLine();
            double desc = 0;
            switch(formaPgt){
                case "CREDITO" -> desc = 3;
                case "DEBITO" -> desc =3;
                case "CHEQUE" -> desc = 6;
                case "BOLETO" -> desc = 9;
                case "DINHEIRO" -> desc = 12;
                case "PIX" -> desc = 12;
            }
            System.out.printf("A sua compra possui %.2f%% de desconto.%n", desc);
            System.out.printf("Totalizando: R$ %.2f", (valor * (100-desc)/100));
        }
    }
