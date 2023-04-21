package br.com.gdp;

import org.springframework.lang.NonNull;

public class HelloWorld {
    private String texto;
    private long ID;

    public HelloWorld(String texto, long identificador){
        this.texto = texto;
        this.ID = identificador;
    }

    public String getTexto(){
        return this.texto;
    }
}
