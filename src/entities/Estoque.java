package entities;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    public Estoque(List<Produto> produtos) {
        this.produtos = produtos;
    }

    // Métodos para adicionar, consultar, atualizar e remover produtos

    public void reporProduto(String codigo, int quantidade) {
        for (Produto p: produtos) {
            if (p.getCodigo().equals(codigo)) {
                p.setQuantidade(p.getQuantidade() + quantidade);
                System.out.println("Sucesso!");
            }
        }
    }
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado.");
    }

//    public Produto consultarProduto(String codigo) {
//        // Retorna o produto com o código fornecido
//    }

    public void atualizarProduto(String codigo, double novoPreco, int novaQuantidade) {
        // Atualiza o preço e quantidade do produto com o código fornecido
    }

    public void removerProduto(String codigo, int quantidade) {
        for (Produto p: produtos) {
            if (p.getCodigo().equals(codigo)) {
                p.setQuantidade(p.getQuantidade() - quantidade);
                System.out.println("Sucesso!");
            }
        }
    }

    public void verEstoque() {
        for (Produto p: produtos) {
            System.out.println(p);
        }
    }
}

