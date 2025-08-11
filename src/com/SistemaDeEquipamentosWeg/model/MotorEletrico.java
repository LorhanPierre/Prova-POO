package com.SistemaDeEquipamentosWeg.model;
import com.SistemaDeEquipamentosWeg.model.Equipamento;

public class MotorEletrico extends Equipamento{

    protected double potencia;

    public MotorEletrico(String codigo,String nome,int quantidade, double preco){

        super(codigo,nome,quantidade,preco);
        this.potencia = 0.0;
    }

    public MotorEletrico(String codigo,String nome,int quantidade, double preco,double potencia){

        super(codigo,nome,quantidade,preco);
        this.potencia = potencia;
    }

    public void setPotencia(double potencia){
        this.potencia = potencia;
    }

    public double getPotencia(){
        return potencia;
    }

    @Override
    public String toString(){
        return "┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n"+
                " - Codigo: " + codigo +
                "\n - Motor Elétrico: " + nome +
                "\n - Potência: " + potencia + "W" +
                "\n - Quantidade: " + quantidade +" unit."+
                "\n - Preço: " + preco + "R$" +
                "\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛";
    }
}
