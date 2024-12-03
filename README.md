# 🛒 Sistema de Gerenciamento de Supermercados

O **Sistema de Gerenciamento de Supermercados** é um projeto desenvolvido em Java com o objetivo de facilitar a administração das operações de um supermercado, incluindo o cadastro de categorias de produtos, produtos, clientes, e a realização de vendas.

## 📂 Estrutura do Projeto

### Diretório Principal
- **Supermercados**: Diretório raiz do projeto que contém todos os arquivos e subdiretórios.

### Diretório `src/main/java`
Contém o código-fonte principal do projeto organizado em pacotes:

#### Pacote `com.Supermecados.Entidade`
- **Categoria**: Classe que representa a categoria de produtos. Contém atributos como nome.
- **Cliente**: Classe que representa os clientes do supermercado. Contém atributos como nome, CPF, endereço e telefone.
- **Entidade**: (Supondo que seja uma classe base ou uma classe utilitária).
- **Produto**: Classe que representa os produtos vendidos no supermercado. Contém atributos como nome, categoria, preço, quantidade em estoque e data de validade.

#### Pacote `com.Supermecados.Interfaces`
- **Cadastro**: (Supondo que seja uma interface ou classe base relacionada ao cadastro de entidades).

#### Pacote `com.Supermecados.Main`
- **Main**: Classe principal que executa o sistema. Contém o método `main` que gerencia a interação com o usuário através do console, permitindo cadastrar categorias, produtos, clientes, e realizar vendas.

#### Pacote `com.Supermecados.Vendas`
- **Venda**: Classe que gerencia o processo de venda, incluindo a adição de produtos à venda e a exibição dos detalhes da venda.

### Outros Diretórios e Arquivos
- **resources**: Diretório reservado para arquivos de recursos (como arquivos de configuração), porém está vazio neste projeto.
- **test**: Diretório reservado para testes, porém está vazio neste projeto.
- **target**: Diretório gerado automaticamente pelo Maven para armazenar os arquivos compilados e outros artefatos de build.
- **.gitignore**: Arquivo que especifica quais arquivos e diretórios devem ser ignorados pelo controle de versão Git.
- **pom.xml**: Arquivo de configuração do Maven que gerencia as dependências e configurações de build do projeto.

## ✨ Funcionalidades do Sistema
O sistema oferece as seguintes funcionalidades principais, acessíveis por meio de um menu interativo no console:

1. **Cadastrar Categoria**
   - Permite ao usuário cadastrar novas categorias de produtos, solicitando o nome da categoria.

2. **Cadastrar Produto**
   - Permite ao usuário cadastrar novos produtos, solicitando informações como nome, categoria, preço, quantidade em estoque e data de validade. O usuário deve escolher uma categoria já cadastrada para associar ao produto.

3. **Cadastrar Cliente**
   - Permite ao usuário cadastrar novos clientes, solicitando informações como nome, CPF, endereço e telefone.

4. **Consultar Produtos**
   - Exibe a lista de todos os produtos cadastrados no sistema, mostrando detalhes de cada produto.

5. **Realizar Venda**
   - Permite ao usuário realizar vendas, escolhendo produtos cadastrados e especificando a quantidade vendida. A venda pode incluir múltiplos produtos e, ao final, o sistema exibe os detalhes da venda, incluindo os produtos vendidos e as quantidades.

6. **Sair**
   - Encerra o sistema.

## 🖥️ Interação com o Usuário
A interação com o usuário é feita através do console, utilizando a classe `Scanner` para ler entradas do usuário e fornecer feedback apropriado com mensagens no console.

## ⚙️ Considerações Técnicas
- O sistema utiliza listas (`ArrayList`) para armazenar categorias, produtos e clientes.
- Os dados são armazenados apenas em tempo de execução, ou seja, não há persistência de dados em um banco de dados ou arquivos.
- A aplicação segue uma estrutura modular, facilitando a manutenção e a extensão do sistema com novas funcionalidades no futuro.

## 🛠️ Exemplo de Uso
Ao iniciar a aplicação, o usuário é apresentado com um menu de opções. O usuário pode escolher uma opção digitando o número correspondente e, em seguida, seguir as instruções fornecidas para cadastrar categorias, produtos, clientes ou realizar vendas. A cada ação, o sistema fornece feedback sobre o sucesso ou possíveis erros, como a tentativa de cadastrar um produto sem ter categorias previamente cadastradas.

Este sistema básico pode ser expandido para incluir funcionalidades adicionais, como persistência de dados, relatórios de vendas, gerenciamento de estoque avançado, e integração com sistemas de pagamento.

---

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/Supermercados.git
