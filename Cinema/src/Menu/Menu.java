package Menu;

import Cinema.Opcoes;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Opcoes opcoes = new Opcoes();
        int escolha = 0;
        do{
            System.out.println("Escolha uma opcao: \n1-Reservar \n2-Cancelar reserva \n3-Exibir mapa \n4-Quantidade de assentos \n5-Sair");
            escolha = in.nextInt();
            if(escolha == 1) {
                opcoes.reservar();
            } else if(escolha == 2) {
                opcoes.cancelar();
            } else if(escolha == 3) {
                opcoes.exibirMapa();
            } else if(escolha == 4) {
                opcoes.quantAssentos();
            } else if (escolha <= 0 || escolha > 5){
                System.out.println("Opcao invalida!!!!");
            } else {
                System.out.println("Bye-bye!");
            }
        } while (escolha != 5);
    }
}
