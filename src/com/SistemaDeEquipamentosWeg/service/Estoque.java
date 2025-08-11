package com.SistemaDeEquipamentosWeg.service;
import com.SistemaDeEquipamentosWeg.model.Equipamento;
import com.SistemaDeEquipamentosWeg.model.MotorEletrico;
import com.SistemaDeEquipamentosWeg.model.PainelControle;
import com.SistemaDeEquipamentosWeg.view.InterfaceUsuario;
import java.util.ArrayList;

public class Estoque {
    ArrayList<Equipamento> almoxarifado = new ArrayList<>();
    InterfaceUsuario menu = new InterfaceUsuario();

    public int GerenciamentoEstoque(int finalizar){

        switch (menu.Menu()){

            case 0 -> {
                menu.MensagemDespedida();
                finalizar -= 1;
            }

            case 1 -> {
                menu.AreaCadatro();
                switch (menu.TipoEquipamento()){

                    case 0 -> {}
                    case 1 -> {
                        menu.CadastroMotorEletrico();
                        String code = menu.Codigo();
                        String nome = menu.Nome();
                        int quantia = menu.Quantidade();
                        double preco = menu.Preco();
                        double potencia = menu.Potencia();

                        Equipamento equipamento = new MotorEletrico(code,nome,quantia,preco,potencia);

                        almoxarifado.add(equipamento);
                    }
                    case 2 -> {
                        menu.CadastroPainelControle();
                        menu.CadastroMotorEletrico();
                        String code = menu.Codigo();
                        String nome = menu.Nome();
                        int quantia = menu.Quantidade();
                        double preco = menu.Preco();
                        String tensao = menu.Tensao();

                        Equipamento equipamento = new PainelControle(code,nome,quantia,preco,tensao);

                        almoxarifado.add(equipamento);
                    }
                }

            }

        }

        return finalizar;
    }

}
