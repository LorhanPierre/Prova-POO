package com.SistemaDeEquipamentosWeg.model;
import java.util.*;

public class Equipamento {

    protected String codigo;
    protected String nome;
    protected int quantidade;
    protected double preco;

    public Equipamento (){

        this.codigo = "";
        this.nome = "";
        this.quantidade = 0;
        this.preco = 0.0;

    }

    public Equipamento(String codigo, String nome, int quantidade, double preco){

        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;

    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString (){
        return "┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n"+
                " - Codigo: " + codigo +
                "\n - Nome: " + nome +
                "\n - Quantidade: " + quantidade +" unit."+
                "\n - Preço: " + preco + "R$" +
                "\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛";
    }

}
