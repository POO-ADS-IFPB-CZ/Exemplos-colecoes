package com.ifpb.colecoes.visao;

import java.util.Stack;

public class App {

    public static void main(String[] args) {

        String equacao = "()";

        System.out.println(estaBalanceada(equacao));

    }

    public static boolean estaBalanceada(String equacao){

        Stack<String> pilha = new Stack<>();

        for(int i=0; i<equacao.length();i++){
            char caracter = equacao.charAt(i);
            if(caracter == '(') pilha.push("A");
            else if(caracter == ')'){
                if(pilha.empty()) return false;
                else pilha.pop();
            }
        }

        return pilha.empty();

    }

}
