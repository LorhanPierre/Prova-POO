package com.SistemaDeEquipamentosWeg.service;
import com.SistemaDeEquipamentosWeg.model.Equipamento;
import com.SistemaDeEquipamentosWeg.model.MotorEletrico;
import com.SistemaDeEquipamentosWeg.model.PainelControle;
import com.SistemaDeEquipamentosWeg.view.InterfaceUsuarioInputs;
import com.SistemaDeEquipamentosWeg.view.InterfaceUsuarioOutputs;
import java.util.ArrayList;

public class Estoque {
    ArrayList<Equipamento> almoxarifado = new ArrayList<>();
    InterfaceUsuarioInputs menu = new InterfaceUsuarioInputs();
    InterfaceUsuarioOutputs mensagem = new InterfaceUsuarioOutputs();

    public int GerenciamentoEstoque(int finalizar){

        switch (menu.Menu()){

            case 0 -> {
                mensagem.MensagemDespedida();
                finalizar -= 1;
            }

            case 1 -> {
                mensagem.AreaCadatro();
                switch (menu.TipoEquipamento()){

                    case 0 -> {}
                    case 1 -> {
                        mensagem.CadastroMotorEletrico();
                        String code = menu.Codigo();
                        String nome = menu.Nome();
                        int quantia = menu.Quantidade();
                        double preco = menu.Preco();
                        double potencia = menu.Potencia();

                        Equipamento equipamento = new MotorEletrico(code,nome,quantia,preco,potencia);

                        almoxarifado.add(equipamento);
                        mensagem.CadastroSucesso();
                    }
                    case 2 -> {
                        mensagem.CadastroPainelControle();
                        String code = menu.Codigo();
                        String nome = menu.Nome();
                        int quantia = menu.Quantidade();
                        double preco = menu.Preco();
                        String tensao = menu.Tensao();

                        Equipamento equipamento = new PainelControle(code,nome,quantia,preco,tensao);

                        almoxarifado.add(equipamento);
                        mensagem.CadastroSucesso();
                    }
                }

            }
            case 2 ->{
                mensagem.AreaListagem();
                switch (menu.OpcoesListagem()){
                    case 1 ->{
                        for(Equipamento produtos: almoxarifado){
                            if(produtos instanceof MotorEletrico){
                                System.out.println(produtos);
                            }
                        }
                    }
                    case 2 ->{
                        for(Equipamento produtos: almoxarifado) {
                            if (produtos instanceof PainelControle) {
                                System.out.println(produtos);
                            }
                        }
                    }
                    case 3 ->{
                        for(Equipamento produtos: almoxarifado){
                                System.out.println(produtos);
                        }
                    }
                }
            }
            case 3 ->{
                mensagem.BuscaDeEquipamentos();
                switch (menu.TipoDeBusca()){
                    case 1 ->{
                        for(Equipamento produto: almoxarifado){
                            if(menu.Codigo().equalsIgnoreCase(produto.getCodigo())){
                                System.out.println(produto);
                                mensagem.Encontrado();
                            }else{
                                mensagem.NaoEncontrado();
                            }
                        }
                    }
                    case 2 ->{
                        for(Equipamento produto: almoxarifado){
                            if(menu.Nome().equalsIgnoreCase(produto.getNome())){
                                System.out.println(produto);
                                mensagem.Encontrado();
                            }else{
                                mensagem.NaoEncontrado();
                            }
                        }
                    }
                    case 3 ->{}
                }
            }
            case 4 ->{
                mensagem.AreaExclusao();
                switch (menu.TipoDeExclusao()){
                    case 1 ->{
                        boolean remocaoConcluida = false;
                        String exclusaoEquipamento = menu.Codigo();
                        for(Equipamento produto: almoxarifado){
                            for(int localProduto = 0; localProduto < almoxarifado.size(); localProduto++){
                                if(exclusaoEquipamento.equalsIgnoreCase(almoxarifado.get(localProduto).getNome())){
                                    almoxarifado.remove(localProduto);
                                    remocaoConcluida = true;
                                }
                            }
                            if(remocaoConcluida == true){
                                mensagem.ExclusaoConcluida();
                                break;
                            }else{
                                mensagem.ExclusaoFalhada();
                            }
                        }
                    }
                    case 2 ->{
                        boolean remocaoConcluida = false;
                        String exclusaoEquipamento = menu.Nome();
                        for(Equipamento produto: almoxarifado){
                            for(int localProduto = 0; localProduto < almoxarifado.size(); localProduto++){
                                if(exclusaoEquipamento.equalsIgnoreCase(almoxarifado.get(localProduto).getNome())){
                                    almoxarifado.remove(localProduto);
                                    remocaoConcluida = true;
                                }
                            }
                            if(remocaoConcluida == true){
                                mensagem.ExclusaoConcluida();
                                break;
                            }else{
                                mensagem.ExclusaoFalhada();
                            }
                        }
                    }
                }
            }
            case 5 ->{

            }
            case 6 ->{}

        }

        return finalizar;
    }

}
