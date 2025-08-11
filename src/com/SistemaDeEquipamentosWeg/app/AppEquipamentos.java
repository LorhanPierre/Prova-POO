package com.SistemaDeEquipamentosWeg.app;
import com.SistemaDeEquipamentosWeg.service.Estoque;

public class AppEquipamentos {

    public static void main (String[]args){

        Estoque gerenciamento = new Estoque();

        while (gerenciamento.GerenciamentoEstoque(1) != 0);


    }
}
