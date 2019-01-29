package com.ifpb.colecoes.controle;

import com.ifpb.colecoes.modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {

    List<Pessoa> pessoas;

    public CadastroPessoa(){
        pessoas = new ArrayList<>();
    }

    public boolean salvar(Pessoa p){
        return pessoas.add(p);
    }

    public Pessoa[] getPessoas(){
        return (Pessoa[]) pessoas.toArray();
    }

}
