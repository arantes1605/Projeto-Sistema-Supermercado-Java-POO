package com.Supermecados.Main;

import com.Supermecados.Entidade.*;
import com.Supermecados.Vendas.Venda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        List<Categoria> categorias = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Sistema de Gerenciamento de Supermercados ===");
            System.out.println("1. Cadastrar Categoria");
            System.out.println("2. Cadastrar Produto");
            System.out.println("3. Cadastrar Cliente");
            System.out.println("4. Consultar Produtos");
            System.out.println("5. Realizar Venda");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome da categoria: ");
                    String nomeCategoria = scanner.nextLine();
                    categorias.add(new Categoria(nomeCategoria));
                    System.out.println("Categoria cadastrada com sucesso!");
                }
                case 2 -> {
                    if (categorias.isEmpty()) {
                        System.out.println("Nenhuma categoria cadastrada. Cadastre uma categoria primeiro.");
                        break;
                    }
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Escolha uma categoria: ");
                    for (int i = 0; i < categorias.size(); i++) {
                        System.out.println((i + 1) + ". " + categorias.get(i).getNome());
                    }
                    int escolhaCategoria = scanner.nextInt() - 1;
                    scanner.nextLine(); // Limpar buffer
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Digite a quantidade em estoque: ");
                    int estoque = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer
                    System.out.print("Digite a data de validade (DD/MM/AAAA): ");
                    String validade = scanner.nextLine();

                    produtos.add(new Produto(nomeProduto, categorias.get(escolhaCategoria), preco, estoque, validade));
                    System.out.println("Produto cadastrado com sucesso!");
                }
                case 3 -> {
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Digite o CPF do cliente: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite o endereço do cliente: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Digite o telefone do cliente: ");
                    String telefone = scanner.nextLine();

                    clientes.add(new Cliente(nomeCliente, cpf, endereco, telefone));
                    System.out.println("Cliente cadastrado com sucesso!");
                }
                case 4 -> {
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }
                    System.out.println("Lista de Produtos:");
                    for (Produto produto : produtos) {
                        System.out.println(produto);
                    }
                }
                case 5 -> {
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto disponível para venda.");
                        break;
                    }
                    Venda venda = new Venda();
                    while (true) {
                        System.out.println("Escolha um produto para vender:");
                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println((i + 1) + ". " + produtos.get(i).getNome());
                        }
                        System.out.println((produtos.size() + 1) + ". Finalizar Venda");
                        int escolhaProduto = scanner.nextInt();
                        if (escolhaProduto == produtos.size() + 1) break;

                        System.out.print("Digite a quantidade: ");
                        int quantidade = scanner.nextInt();
                        scanner.nextLine(); // Limpar buffer

                        venda.adicionarProduto(produtos.get(escolhaProduto - 1), quantidade);
                    }
                    venda.exibirDetalhesVenda();
                }
                case 6 -> {
                    System.out.println("Saindo do sistema. Até logo!");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}