package com.ifpb.colecoes.controle;

import com.ifpb.colecoes.modelo.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class CadastroPessoa {

    Set<Pessoa> pessoas;

    public CadastroPessoa(){
        pessoas = new HashSet<>();
    }

    public boolean salvar(Pessoa p){
        return pessoas.add(p);
    }

    public boolean contains(Pessoa p){
        return pessoas.contains(p);
    }

    public Pessoa[] getPessoas(){
        Pessoa pessoasA[] = new Pessoa[pessoas.size()];
        return pessoas.toArray(pessoasA);
    }

}
