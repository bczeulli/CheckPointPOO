package CheckPoint;

public class Cliente {

    private String nome;
    private int idade;
    private Integer telefone;
    private boolean anamnesePreenchida;

    public Cliente() {

    }

    public void preencherAnamnese(){
        if (isAnamnesePreenchida()) {
            System.out.println(" Anamnese atualizada!");
        } else {
            System.out.println(" Anamnese preenchida!");
            setAnamnesePreenchida(true);
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public boolean isAnamnesePreenchida() {
        return anamnesePreenchida;
    }

    public void setAnamnesePreenchida(boolean anamnesePreenchida) {
        this.anamnesePreenchida = anamnesePreenchida;
    }
}
