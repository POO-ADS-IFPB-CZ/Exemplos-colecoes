package com.ifpb.colecoes.visao;

import com.ifpb.colecoes.modelo.Pessoa;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {

    public static void main(String[] args) {

        Queue<Pessoa> pessoas = new PriorityQueue<>();

        pessoas.offer(new Pessoa("111.111.111-01", "João", 20));
        pessoas.offer(new Pessoa("222.222.222-02", "Maria", 19));
        pessoas.offer(new Pessoa("333.333.333-03", "Pedro", 20));
        pessoas.offer(new Pessoa("444.444.444-04","Ana", 18));
        pessoas.offer(new Pessoa("555.555.555-05", "Joaquim", 20));

        //Não aceita elementos nulos
        //pessoas.offer(null);

        while(!pessoas.isEmpty()){
            System.out.println(pessoas.poll());
        }

    }

}
