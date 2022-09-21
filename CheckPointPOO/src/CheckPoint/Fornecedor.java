package CheckPoint;

public class Fornecedor implements ReabastecerEstoque{
    private String nome;
    private Integer telefone, estoqueMaterial, capacidadeEstoque, quantidadeUtilizada;
    private Long cnpj;

    public Fornecedor() {
        this.estoqueMaterial = 0;
        this.capacidadeEstoque = 300;
    }

    public Fornecedor(String nome, Integer telefone, Long cnpj) {
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.estoqueMaterial = 222;
        this.capacidadeEstoque = 300;
        this.quantidadeUtilizada = 5;
    }

    public void verificarMaterial() {
        System.out.println("A quantidade de materiais que temos para fornecer é de " + getEstoqueMaterial());
    }

    public void verificaEstoqueMaterial(){

        if (this.getEstoqueMaterial() >= (this.getCapacidadeEstoque() * 0.1)) {
            this.setEstoqueMaterial(this.getEstoqueMaterial() - 50);
            if (this.getEstoqueMaterial() <= (this.getCapacidadeEstoque() * 0.1)) {
                reabastecer();
            }
        } else if (this.getEstoqueMaterial() <= (this.getCapacidadeEstoque() * 0.1)) {
            reabastecer();
            this.setEstoqueMaterial(this.getEstoqueMaterial() - 50);

        }
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Integer getEstoqueMaterial() {
        return estoqueMaterial;
    }

    public void setEstoqueMaterial(Integer material) {
        this.estoqueMaterial = material;
    }

    public Integer getCapacidadeEstoque() {
        return capacidadeEstoque;
    }

    public void setCapacidadeEstoque(Integer capacidadeEstoque) {
        this.capacidadeEstoque = capacidadeEstoque;
    }

    @Override
    public void reabastecer() {
        this.setEstoqueMaterial(300);
    }

}
