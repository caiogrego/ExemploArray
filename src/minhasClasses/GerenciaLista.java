package minhasClasses;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import minhasClasses.Contato;

public class GerenciaLista {
    
    List<Contato> lista;

    public GerenciaLista () { // Método construtor
        lista = new LinkedList<>();
    }

    private String lerTexto(String mensagem) {
        System.out.print(mensagem);
        Scanner scString = new Scanner(System.in);
        String str = scString.nextLine();
        scString.close();
        return str;
    }

    public void start () {
        Scanner scOp = new Scanner(System.in);
        int valorOp = 0;
        while (true) {
            exibeOpcoes();
            valorOp = scOp.nextInt();
            switch (valorOp) {
                case 1:
                    Contato c = new Contato();
                    c.nome = lerTexto("Digite o nome: ");
                    c.sobreNome = lerTexto("Digite o Sobrenome: ");
                    c.endereco = lerTexto("Digite o endereço: ");
                    lista.add(c);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                default:
                    break;
            }
            if (valorOp == 4) {
                scOp.close();
                System.out.println("Fim do programa.");
                break;
            }
        }
    }

    void exibeOpcoes() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Adiciona contato");
        System.out.println("2 - Remove contato");
        System.out.println("3 - Lista contatos");
        System.out.println("4 - Sair");
        System.out.print(" > ");
    }

}
