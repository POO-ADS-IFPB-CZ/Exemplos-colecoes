package com.ifpb.colecoes.modelo;

import com.ifpb.colecoes.enumeration.TipoFicha;

import java.time.LocalDateTime;

public class Ficha {

    private final int numero;
    private static int contFicha;
    private final LocalDateTime dataEHora;
    private final TipoFicha tipo;

    public Ficha(TipoFicha tipo){
        numero = ++contFicha;
        dataEHora = LocalDateTime.now();
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDateTime getDataEHora() {
        return dataEHora;
    }

    public TipoFicha getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "numero=" + numero +
                ", dataEHora=" + dataEHora +
                ", tipo=" + tipo +
                '}';
    }
}
