package app;

import entities.Produto;
import entities.Estoque;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Mapa para armazenar pares de login e senha (simulação)
        Map<String, String> usuarios = new HashMap<>();
        usuarios.put("usuario1", "senha123");
        usuarios.put("usuario2", "senha456");

        // Scanner para entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Autenticação
        boolean autenticado = false;
        String usuarioAutenticado = null;

        while (!autenticado) {
            System.out.print("Digite o nome de usuário: ");
            String usuario = sc.nextLine();

            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            // Verifica se o usuário e a senha correspondem aos armazenados
            if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(senha)) {
                autenticado = true;
                usuarioAutenticado = usuario;
                System.out.println("Login bem-sucedido!");
            } else {
                System.out.println("Usuário ou senha incorretos. Tente novamente.");
            }
        }
        List<Produto> produtos = new ArrayList<>();
        Estoque estoque = new Estoque(produtos);
        // Se chegou aqui, o usuário está autenticado
        System.out.println("Bem-vindo, " + usuarioAutenticado + "!");

        // Agora você pode continuar com as operações CRUD, considerando que o usuário está autenticado
        // Exemplo: Estoque estoque = new Estoque();
        int option = 0;
        do {
            System.out.println("O que gostaria de fazer? ");
            System.out.println("1- Repor unidades");
            System.out.println("2- Remover unidades");
            System.out.println("3- Ver produtos");
            System.out.println("4- Adicionar novos produtos");
            System.out.println("0 - Encerrar programa.");

            option = sc.nextInt();
            if (option == 1) {qq
                System.out.println("Informe o código do produto que deseja repor: ");
                String codigo = sc.next();
                System.out.println("Quantas unidades deseja repor? ");
                int quantidade = sc.nextInt();
                estoque.reporProduto(codigo, quantidade);

            }
            if (option == 2) {
                // Remove produto
                System.out.println("Informe o código do produto que deseja remover: ");
                String codigo = sc.next();
                System.out.println("Quantas unidades deseja remover? ");
                int quantidade = sc.nextInt();
                estoque.removerProduto(codigo, quantidade);

            }
            if (option == 3) {
                estoque.verEstoque();
            }

            if (option == 4) {
                // Adiciona novo produto.
                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Codigo: ");
                String codigo = sc.next();
                System.out.print("Preço: ");
                double preco = sc.nextDouble();
                System.out.println("Quantidade: ");
                int quantidade = sc.nextInt();
                Produto produto = new Produto(nome, codigo, preco, quantidade);
                estoque.adicionarProduto(produto);
            }
        } while (option != 0);
        System.out.println("Programa encerrado.");
    }
}
