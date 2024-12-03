package com.Supermecados.Entidade;

public class Produto {
    private String nome;
    private Categoria categoria;
    private double preco;
    private int quantidadeEmEstoque;
    private String dataValidade;

    public Produto(String nome, Categoria categoria, double preco, int quantidadeEmEstoque, String dataValidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return nome + " - Categoria: " + categoria + ", Preço: R$" + preco + ", Estoque: " + quantidadeEmEstoque;
    }
}
