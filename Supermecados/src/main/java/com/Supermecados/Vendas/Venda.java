package com.Supermecados.Vendas;


import com.Supermecados.Entidade.Produto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    private Date dataVenda;
    private List<Produto> produtosVendidos;
    private double totalVenda;

    public Venda() {
        this.dataVenda = new Date();
        this.produtosVendidos = new ArrayList<>();
        this.totalVenda = 0.0;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto.getQuantidadeEmEstoque() >= quantidade) {
            produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidade);
            for (int i = 0; i < quantidade; i++) {
                produtosVendidos.add(produto);
            }
            totalVenda += produto.getPreco() * quantidade;
        } else {
            System.out.println("Estoque insuficiente para o produto: " + produto.getNome());
            System.out.println("Quantidade disponível: " + produto.getQuantidadeEmEstoque());
        }
    }

    public void exibirDetalhesVenda() {
        System.out.println("Data da Venda: " + dataVenda);
        System.out.println("Produtos Vendidos:");
        for (Produto produto : produtosVendidos) {
            System.out.println("- " + produto.getNome() + " | Preço: R$" + produto.getPreco());
        }
        System.out.println("Total da Venda: R$" + totalVenda);
    }
}