package com.company;

public class Endereço {
    private String logradouro;
    private String Cidade;
    private String estado;

    public String consultaLogradouro(String logradouro)
    {
        this.logradouro = logradouro;
        return logradouro;
    }

}
