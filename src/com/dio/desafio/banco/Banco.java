package com.dio.desafio.banco;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return this.contas;
    }

}


