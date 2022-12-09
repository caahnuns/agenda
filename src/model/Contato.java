package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Contato {

    private String nome;
    private String sobrenome;
    private List<Telefone> telefones;
    private List<Endereco> enderecos;

    public Contato(){

    }

    public Contato(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;

        this.telefones = new ArrayList<>();
        this.enderecos = new ArrayList<>();
    }

    public Contato(String nome, String sobrenome, List<Telefone> telefones) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefones = telefones;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public String getNomeCompleto(){
        return Stream.of(nome, sobrenome)
                .filter(string -> string != null && !string.isEmpty())
                .map(String::trim)
                .collect(Collectors.joining(" "));
    }

}
