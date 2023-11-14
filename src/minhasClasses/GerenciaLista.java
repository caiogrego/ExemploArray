package minhasClasses;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import minhasClasses.Contato;

public class GerenciaLista {
    
    List<Contato> lista;
    Scanner sc;

    public GerenciaLista () { // Método construtor
        lista = new LinkedList<>();
        sc = new Scanner(System.in);
        insereExemplos ();
    }

    private void insereExemplos () {
        Contato c = new Contato("Caio", "Jesus", "Rua");
        lista.add(c);
        c = new Contato("Ana", "Paula", "Rua 2");
        lista.add(c);
    }

    /**
     * Método utilizado para..
     * @param mensagem (String) Parametro ..
     * @return retorna ....
     */
    private String lerTexto(String mensagem) {
        System.out.print(mensagem);
        String str = sc.nextLine();
        return str;
    }

    private int lerInteiro() {
        int valor = 0;
        try {
            valor = sc.nextInt();
        } catch (Exception e) {
            valor = 0;
        }
        sc.nextLine();
        return valor;
    }

    public void start () {
        Contato c;
        Iterator<Contato> it;
        int valorOp = 0;
        boolean continuar = true;
        while (continuar) {
            exibeOpcoes();
            valorOp = lerInteiro();
            switch (valorOp) {
                case 1: // Adiciona contato
                    c = new Contato();
                    c.nome = lerTexto("Digite o nome: ");
                    c.sobreNome = lerTexto("Digite o Sobrenome: ");
                    c.endereco = lerTexto("Digite o endereço: ");
                    lista.add(c);
                    break;
                case 2: // Remove contato
                    String nome = lerTexto("Qual nome deseja remover?");
                    it = lista.iterator();
                    while (it.hasNext()) {
                        if (nome.equals(it.next().nome)) {
                            it.remove();
                            System.out.println("Contato removido!");
                            break;
                        }
                        if (!it.hasNext()) {
                            System.out.println("Contato não localizado!");
                        }
                    }
                    break;
                case 3: // Lista contatos
                    it = lista.iterator();
                    while (it.hasNext()) {
                        Contato temp = new Contato(it.next());
                        System.out.println("Contato:");
                        System.out.println("\tNome: " + temp.nome);
                        System.out.println("\tSobrenome: " + temp.sobreNome);
                        System.out.println("\tEndereço: " + temp.endereco);
                    }
                    break;
                case 4: // Sair do programa
                    continuar = false;
                    sc.close();
                    System.out.println("Fim do programa.");
                    break;
                default:
                    if (valorOp == 0) {
                        System.out.println("Opção inválida, infome outro valor!");
                    }
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
