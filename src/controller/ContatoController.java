package controller;

import model.Contato;

import java.sql.ClientInfoStatus;
import java.util.List;

public class ContatoController {

    private Contato contato;

    public Contato adicionarContato(String nome, String sobrenome){

        contato = new Contato(nome, sobrenome);
        return contato;

    }

    public Boolean verificaContato(List<Contato> contatos, String nome, String sobrenome){

        Boolean existeContato = false;
        nome = nome.toUpperCase();
        sobrenome = sobrenome.toUpperCase();

        if(contatos.isEmpty()){

            return existeContato;
        }
        for(Contato c: contatos){

            if(nome.equals(c.getNome().toUpperCase()) && sobrenome.equals(c.getSobrenome().toUpperCase())){

                existeContato = true;
                return existeContato;
            }
        }

        return existeContato;

    }

}
