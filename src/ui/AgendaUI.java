package ui;

import controller.Agenda;
import controller.ContatoController;
import model.Contato;
import model.Telefone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaUI {

    static Agenda agenda = new Agenda();
    static final Scanner scanner = new Scanner(System.in);

    public void menu() {
        int opcao = 0;

        do {
            System.out.println(".:: Boas vindas à sua agenda! ::.");
            System.out.println("Digite uma das opções para começarmos: ");
            System.out.println("1- Adicionar contato");
            System.out.println("2- Listar todos os contatos");
            System.out.println("0- Sair do sistema");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 0 -> {
                    break;
                }
                case 1 -> {
                    this.adicionar();
                }
                case 2 -> {
                    this.listar();
                }
                default -> System.out.println("Ops, opção inválida!");
            }
        } while (opcao != 0);
    }

    public void adicionar() {
        System.out.println("Informe o nome do contato: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o sobrenome do contato: ");
        String sobrenome = scanner.nextLine();

        List<Telefone> telefones = menuTelefone();

        Contato contato = new Contato(nome, sobrenome, telefones);

        agenda.adicionar(contato);
    }
    public void listar() {
        /*
        System.out.println("-=".repeat(10) + "LISTA DE CONTATOS" + "-=".repeat(10));
        agenda.listar().forEach((contato) -> System.out.println(contato.getNomeCompleto()));
        */
        agenda.listar().forEach(contato -> {
            this.listarContato(contato);
        });
    }

    public void listarContato(Contato contato) {
        System.out.println("Nome: " + contato.getNomeCompleto());
        contato.getTelefones().forEach(telefone -> {
            System.out.println("DDD: " + telefone.getDdd());
            System.out.println("Número: " + telefone.getNumero());
        });
    }

    public List<Telefone> menuTelefone() {
        int opcao = 0;
        List<Telefone> telefones = new ArrayList<>();

        do {
            System.out.println("Deseja adicionar um telefone ao contato?");
            System.out.println("1- Sim");
            System.out.println("0- Não");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 0 -> {
                    break;
                }
                case 1 -> {
                    telefones.add(this.adicionarTelefone());
                }
                default -> System.out.println("Ops, opção inválida!");
            }
        } while (opcao != 0);

        return telefones;
    }

    public Telefone adicionarTelefone() {
        System.out.println("Informe o DDD: ");
        String ddd = scanner.nextLine();

        System.out.println("Informe o número de telefone: ");
        String numero = scanner.nextLine();

        return new Telefone(ddd, numero);
    }
}
