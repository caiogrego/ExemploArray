package minhasClasses;

public class Contato {
    String nome;
    String sobreNome;
    String endereco;

    public Contato () {
        nome = new String();
        sobreNome = new String();
        endereco = new String();
    }
    public Contato (Contato c) {
        nome = c.nome;
        sobreNome = c.sobreNome;
        endereco = c.endereco;
    }

    public Contato (String novoNome, String novoSobreNome, String novoEndereco) {
        nome = novoNome;
        sobreNome = novoSobreNome;
        endereco = novoEndereco;
    }

}
