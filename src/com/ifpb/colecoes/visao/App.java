package com.ifpb.colecoes.visao;

import com.ifpb.colecoes.modelo.Pessoa;

import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {

        Queue<Pessoa> pessoas = new LinkedList<>();

        pessoas.offer(new Pessoa("222.222.222-02","João",20));
        pessoas.offer(new Pessoa("111.111.111-01", "Maria", 21));
        pessoas.offer(new Pessoa("333.333.333-03", "Pedro", 30));

        System.out.println("Próximo: "+pessoas.peek());

        while (!pessoas.isEmpty()){
            System.out.println(pessoas.poll());
        }

    }

}
