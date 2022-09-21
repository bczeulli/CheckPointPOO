package CheckPoint;

import java.util.ArrayList;

public class Estudio implements ReabastecerEstoque{

    private String nome, endereco;
    private Integer telefone, estoque, capacidadeEstoque, quantidadeUtilizada;
    private Long cnpj;

    private ArrayList<Tatuador> listaTatuadores = new ArrayList<>();

    public Fornecedor f;




    public Estudio(String nome, String endereco, Integer telefone, Long cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.estoque = 14;
        this.capacidadeEstoque = 100;
        this.quantidadeUtilizada = 5;
    }

    public void addTatuador (Tatuador tatuador) {
        listaTatuadores.add(tatuador);
    }

    public void mostrarTatuadores() {
        for (Tatuador tatuador: listaTatuadores) {
            System.out.println("Nome: " + tatuador.getNome() + " e seu estilo preferido é " + tatuador.getEstilo());
        }
    }

    public void verificaEstoque(){
        f = new Fornecedor("Materiais Ink", 1155887766, 58865254000165L);
        if (this.getEstoque() >= (this.getCapacidadeEstoque() * 0.1)) {
            this.setEstoque((this.getEstoque() - this.getQuantidadeUtilizada()));
            f.verificaEstoqueMaterial();
            if (this.getEstoque() <= (this.getCapacidadeEstoque() * 0.1)) {
                f.verificaEstoqueMaterial();
                reabastecer();
            }
        } else if (this.getEstoque() <= (this.getCapacidadeEstoque() * 0.1)) {
            f.verificaEstoqueMaterial();
            reabastecer();
            this.setEstoque((this.getEstoque() - this.getQuantidadeUtilizada()));

        }
    }

    public void VerificaEstoqueFornecedor(){
        System.out.println(f.getEstoqueMaterial());
    }



    public void tatuar(String desenho) {

        verificaEstoque();

        System.out.println("Tatuagem " + desenho + " realizada com sucesso!");
    }






    @Override
    public void reabastecer() {
        this.setEstoque(100);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }



    public Integer getCapacidadeEstoque() {
        return capacidadeEstoque;
    }

    public void setCapacidadeEstoque(Integer capacidadeEstoque) {
        this.capacidadeEstoque = capacidadeEstoque;
    }

    public Integer getQuantidadeUtilizada() {
        return quantidadeUtilizada;
    }

    public void setQuantidadeUtilizada(Integer quantidadeUtilizada) {
        this.quantidadeUtilizada = quantidadeUtilizada;
    }
}
