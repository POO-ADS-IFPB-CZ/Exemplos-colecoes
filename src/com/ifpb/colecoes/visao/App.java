package com.ifpb.colecoes.visao;

import com.ifpb.colecoes.enumeration.TipoFicha;
import com.ifpb.colecoes.modelo.Ficha;
import com.ifpb.colecoes.modelo.FilaBanco;

public class App {

    public static void main(String[] args) {

        FilaBanco filaBanco = new FilaBanco();

        filaBanco.adicionar(new Ficha(TipoFicha.CONVENCIONAL));
        filaBanco.adicionar(new Ficha(TipoFicha.PRIORITARIA));
        filaBanco.adicionar(new Ficha(TipoFicha.CONVENCIONAL));
        filaBanco.adicionar(new Ficha(TipoFicha.CONVENCIONAL));
        filaBanco.adicionar(new Ficha(TipoFicha.CONVENCIONAL));
        filaBanco.adicionar(new Ficha(TipoFicha.PRIORITARIA));

        Ficha ficha;
        do{
            ficha = filaBanco.getProximo();
            System.out.println(ficha);
        }while (ficha != null);

    }

}
