package Cinema;

public class Mapa {

    private char[][] assentos = new char[12][14];

    public void exibirAssento(int i, int j){
        if(this.assentos[i][j] == '\u0000') {
            System.out.print("  |");
        } else {
            System.out.print("XX|");
        }
    }

    public int quantAssentosLivres(){
        int cont = 0;
        for(int i = 0; i < assentos.length; i++){
            for(int j = 0; j < assentos[i].length; j++){
                if(assentos[i][j] == '\u0000'){
                    cont++;
                }
            }
        }
        return cont;
    }

    public int quantAssentosOcupados(){
        int cont = 0;
        for(int i = 0; i < assentos.length; i++){
            for(int j = 0; j < assentos[i].length; j++){
                if(assentos[i][j] != '\u0000'){
                    cont++;
                }
            }
        }
        return cont;
    }

    public void cancelarAssento(int linha, int coluna){
        if(assentos[linha][coluna] != '\u0000'){
            assentos[linha][coluna] = '\u0000';
            System.out.println("O assento foi cancelado com sucesso!");
        } else {
            System.out.println("O assento nao estava ocupado!");
        }
    }

    public void reservarAssento(int linha, int coluna){
        if(assentos[linha][coluna] == '\u0000'){
            assentos[linha][coluna] = 'X';
            System.out.println("O assento foi reservado com sucesso!");
        } else {
            System.out.println("O assento ja estava ocupado!");
        }
    }

}
