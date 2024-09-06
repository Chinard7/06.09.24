import java.util.*;

public class Cardapio {
    public static int pedido;

    
    public static void main(String[] args) {
        Scanner scninput1 = new Scanner (System.in);
  
        System.out.println("Digite o numero do hamburger desejado, e tecle Enter");
        System.out.println("1 >> Hamburguer de geleia");
        System.out.println("2 >> Hamburguer de amendoim");
        System.out.println("3 >> Elder Hamburguer");
          
        pedido = scninput1.nextInt();

        int pedido = 1;

switch (pedido) {
    case 1:
        System.out.println("Uma escolha duvidosa, porem aceitavel.");
        break;

    case 2:
    System.out.println("Seu gosto é pessimo, voce escolheu o pior hamburguer de nosso cardapio.");
    break;

    case 3:
    System.out.println("Ótima escolha, você escolheu nosso melhor hamburguer.");
    break;
        default:
        System.out.println("...");
        break;
}

        scninput1.close();  
    }
}

