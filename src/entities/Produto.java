package entities;

public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, String codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Nome do produto: " +
                getNome() + "\nCódigo: " +
                getCodigo() + "\nPreço: " +
                getPreco() +  "\n Quantidade: " +
                getQuantidade();
    }
}
