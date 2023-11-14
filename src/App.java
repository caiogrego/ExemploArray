import java.util.Queue;

import minhasClasses.CasaDeVerao;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

import minhasClasses.GerenciaLista;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        // Arrays ("Listas" estáticas de itens)
        Casa[] listaDeCasas;
        int[] valores = {2, 3 ,4 ,5 };
        System.out.println("Array com comprimento " + valores.length);
        System.out.println("Primeiro valor: " + valores[0]);
        System.out.println("Ultimo valor: " + valores[3]);
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor: " + valores[i]);
        }
        
        // Fila ("Lista" dinâmica de itens que são adicionados ao final e removidos no início)
        Queue<String> listaNomes = new LinkedList<>();
        listaNomes.add("Caio");
        listaNomes.add("Ana");
        System.out.println(listaNomes);
        listaNomes.add("Paulo");
        System.out.println(listaNomes);
        System.out.println("Tamanho da lista: " + listaNomes.size());
        String nomeRemovido = listaNomes.remove();
        System.out.println(listaNomes);
        System.out.println("O nome removido da lisata foi: " + nomeRemovido);
         
        // Lista (Lista dinâmica)
        List<String> novaLista = new LinkedList<>();
        novaLista.add("Caio");  // [0]
        novaLista.add("Ana");   // [1]
        novaLista.add("Paulo"); // [2]
        System.out.println(novaLista);
        System.out.println("Item selecionado: " + String.valueOf("Paulo"));
        novaLista.remove(String.valueOf("Paulo"));
        novaLista.remove(1);
        Iterator it = novaLista.iterator();
        while (it.hasNext()) {
            if ("Ana".equals(it.next())) {
                it.remove();
                break;
            }
        }
        System.out.println(novaLista);
        
        // Exemplo com Gerencimento da lista:
        for (int i = 0; i < 20; i++) {
            if(i<19) System.out.print(" ="); else System.out.println("\n");
        }
        */

        CasaDeVerao minhaCasa = new CasaDeVerao("Ville Roy, n 01");

        minhaCasa.exibeEndereco();
        GerenciaLista GL = new GerenciaLista();
        GL.start();
         
    }
}
