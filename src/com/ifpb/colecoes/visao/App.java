package com.ifpb.colecoes.visao;

import com.ifpb.colecoes.controle.CadastroPessoa;
import com.ifpb.colecoes.modelo.Pessoa;

import java.util.*;

public class App {

    public static void main(String[] args) {


        Set<Pessoa> pessoas = new TreeSet<>(Comparator.comparing(Pessoa::getCpf));

        pessoas.add(new Pessoa("111.111.111-01", "João",20));
        pessoas.add(new Pessoa("111.111.111-01", "Maria",19));
        pessoas.add(new Pessoa("222.222.222-02", "Pedro",17));
        pessoas.add(new Pessoa("333.333.333-03", "Ana",20));

        for(Pessoa p : pessoas){
            System.out.println(p);
        }


    }

}
