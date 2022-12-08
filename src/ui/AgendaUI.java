package ui;

import controller.Agenda;
import controller.ContatoController;
import model.Contato;

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
            System.out.println("0- Sair do sistema");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    this.adicionar();
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

        Contato contato = new Contato(nome, sobrenome);
    }
}
