import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static  void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        List<Jogo> jogo = new ArrayList<>();
        int opcao = 0;
        jogo.add(new Fisico("The last of us", 300, "202030"));
        jogo.add(new Digital("The Legend of Zelda", 200, "0102030405"));
        jogo.add(new Fisico("Dragon Ball Z", 300, "102923"));
        jogo.add(new Digital("Monster Hunter", 200, "8823474232"));

        for (Jogo jogos : jogo){
            jogos.exibirJogo();
        }

        do{
            System.out.println("\nO que deseja ver?");
            System.out.println("1 - Jogos Fisicos");
            System.out.println("2 - Jogos Digitais");
            System.out.println("3 - Todos os Jogos");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opcão");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\nJogos Fisicos: ");
                    for (Jogo jogos : jogo){
                        if(jogo instanceof Fisico){
                            jogos.exibirJogo();
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nJogos Digitais: ");
                    for (Jogo jogos : jogo){
                        if(jogo instanceof Digital){
                            jogos.exibirJogo();
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nTodos os Jogos: ");
                    for (Jogo jogos : jogo){
                       jogos.exibirJogo();
                    }
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        }while(opcao!=0);

        leitor.close();
    }
}
