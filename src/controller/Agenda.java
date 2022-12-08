package controller;

import model.Contato;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public Agenda(List<Contato> contatos) {
        this.contatos = new ArrayList<>();
    }

    public void adicionar(Contato contato) {
        this.contatos.add(contato);
    }

    public void excluir(Contato contato) {
        contatos.remove(contato);
    }

    //Listar todos os contatos da agenda
    public List<Contato> listar() {
        return contatos;
    }

    //Buscar contato por nome completo (nome + sobrenome)
    public void buscar() {

    }

    //remover todos os contatos da Agenda
    public void removerTodos() {
        contatos.clear();
    }

}
