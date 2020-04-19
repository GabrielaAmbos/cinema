package Cinema;

import Cinema.Mapa;

import java.util.Scanner;

public class Opcoes {
    private Mapa mapa = new Mapa();

    public void reservar(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o assento que voce deseja reservar \nLinha e coluna separados por um espaco: ");
        String assento = in.nextLine();
        String [] assentoAux = assento.split(" ");
        int linha = converteCharToInt(assentoAux[0]);
        int coluna = Integer.parseInt(assentoAux[1]);
        mapa.reservarAssento((linha), (coluna-1));
    }
    public void cancelar(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o assento que voce deseja cancelar \nLinha e coluna separados por um espaco: ");
        String assento = in.nextLine();
        String [] assentoAux = assento.split(" ");
        int linha = converteCharToInt(assentoAux[0]);
        int coluna = Integer.parseInt(assentoAux[1]);
        mapa.cancelarAssento((linha), (coluna-1));
    }
    private int converteCharToInt(String letra){
        String [] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
        for(int i = 0; i < letras.length; i++){
            if(letra.equals(letras[i])){
                return i;
            }
        }
        return -1;
    }


    public void exibirMapa() {
        String [] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
        System.out.println("   1  2  3  4  5  6  7       8  9 10 11 12 13 14");
        for(int i = 0; i < 12; i++){
            System.out.print(letras[i] + "|");
            for(int j = 0; j < 14; j++){
                mapa.exibirAssento(i, j);
                if(j == 6){
                    System.out.print("    |");
                }
            }
            System.out.println(letras[i]);
        }
    }
    public void quantAssentos(){
        System.out.println("Livres: " + mapa.quantAssentosLivres() + "\n" +
                           "Ocupados: " + mapa.quantAssentosOcupados());
    }
}
