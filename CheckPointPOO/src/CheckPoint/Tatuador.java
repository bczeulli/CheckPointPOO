package CheckPoint;

public class Tatuador {

    private String nome, estilo;
    private int idade;

    public Tatuador(String nome, String estilo, int idade) {
        this.nome = nome;
        this.estilo = estilo;
        this.idade = idade;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
