package com.ifpb.colecoes.visao;

import com.ifpb.colecoes.modelo.Pessoa;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {

        Deque<Pessoa> pessoas = new LinkedList<>();

        pessoas.offer(new Pessoa("222.222.222-02","João",20));
        pessoas.offer(new Pessoa("111.111.111-01", "Maria", 21));
        pessoas.offerFirst(new Pessoa("333.333.333-03", "Pedro", 30));
        pessoas.offerLast(new Pessoa("444.444.444-04", "Ana", 25));

        System.out.println("Próximo: "+pessoas.peekFirst());
        System.out.println("Último: "+pessoas.peekLast());

        System.out.println(pessoas.poll());
        System.out.println(pessoas.pollLast());
        System.out.println(pessoas.pollFirst());

    }

}
