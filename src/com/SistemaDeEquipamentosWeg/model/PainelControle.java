package com.SistemaDeEquipamentosWeg.model;
import com.SistemaDeEquipamentosWeg.model.Equipamento;

public class PainelControle extends Equipamento{

    protected String tensao;

    public PainelControle(String codigo,String nome,int quantidade, double preco) {
        super(codigo,nome,quantidade,preco);
        this.tensao = "";
    }

    public PainelControle(String codigo,String nome,int quantidade, double preco,String tensao) {

        super(codigo,nome,quantidade,preco);
        this.tensao = tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getTensao() {
        return tensao;
    }

    @Override
    public String toString(){
        return "┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n"+
                " - Codigo: " + codigo +
                "\n - Motor Elétrico: " + nome +
                "\n - Tensão: " + tensao + "V" +
                "\n - Quantidade: " + quantidade +" unit."+
                "\n - Preço: " + preco + "R$" +
                "\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛";
    }
}
