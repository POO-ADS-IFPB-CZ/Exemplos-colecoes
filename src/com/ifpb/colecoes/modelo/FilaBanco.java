package com.ifpb.colecoes.modelo;

import java.util.LinkedList;
import java.util.Queue;

public class FilaBanco {

    Queue<Ficha> filaConvencional;
    Queue<Ficha> filaPrioritaria;

    public FilaBanco(){
        filaConvencional = new LinkedList<>();
        filaPrioritaria = new LinkedList<>();
    }

    public boolean adicionar(Ficha ficha){
        switch (ficha.getTipo()){
            case CONVENCIONAL:
                return filaConvencional.offer(ficha);
            case PRIORITARIA:
                return filaPrioritaria.offer(ficha);
        }
        return filaConvencional.offer(ficha);
    }

    public Ficha getProximo(){
        if(!filaPrioritaria.isEmpty()){
            return filaPrioritaria.poll();
        }else if(!filaConvencional.isEmpty()){
            return filaConvencional.poll();
        }else{
            return null;
        }
    }

}
