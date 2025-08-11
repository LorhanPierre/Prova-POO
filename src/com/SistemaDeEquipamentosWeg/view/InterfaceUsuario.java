package com.SistemaDeEquipamentosWeg.view;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {

    Scanner input = new Scanner(System.in);

    public int Menu(){

        int opcao = 0, escolha;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃            BEM VINDO AO SCEW            ┃");
        System.out.println("┣----------━━━━━━━━━━━━━━━━━━━━━----------┫");
        System.out.println("┃(sistema de controle de equipamentos weg)┃");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.println("┃                 OPÇÕES                  ┃");
        System.out.println("┃ 1 - Cadastrar Equipamento               ┃");
        System.out.println("┃ 2 - Listar Equipamentos                 ┃");
        System.out.println("┃ 3 - Buscar Equipamentos                 ┃");
        System.out.println("┃ 4 - Remover Equipamento                 ┃");
        System.out.println("┃ 5 - Movimentar Estoque                  ┃");
        System.out.println("┃ 6 - Relatórios                          ┃");
        System.out.println("┃                                         ┃");
        System.out.println("┃ 0 - SAIR                                ┃");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.println("┃ - Digite a opção desejada -             ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        do {
            try {
                escolha = input.nextInt();
                opcao = escolha;
                error = false;
            } catch (InputMismatchException erro) {
                System.err.println("Você digitou um valor errado, Tente Digitar um número!");
                input.nextLine();
            }
        }while(error);
        return opcao;
    }

    public int TipoEquipamento(){

        input.nextLine();

        int opcao = 0, escolha;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃        - Escolha o que deseja:          ┃");
        System.out.println("┣----------━━━━━━━━━━━━━━━━━━━━━----------┫");
        System.out.println("┃ 1 - Motor Elétrico                      ┃");
        System.out.println("┃ 2 - Painel de Controle                  ┃");
        System.out.println("┃                                         ┃");
        System.out.println("┃ 0 - Voltar                              ┃");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.println("┃ - Digite a opção desejada -             ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        do {
            try {
                escolha = input.nextInt();
                opcao = escolha;
                error = false;
            } catch (InputMismatchException erro) {
                System.err.println("Você digitou um valor errado, Tente Digitar um número!");
                input.nextLine();
            }
        }while(error);
        return opcao;
    }

    public String Nome(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite o Nome do Equipamento -        ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        String nome = input.nextLine();

        return nome;
    }

    public String Codigo(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite o Código do Equipamento -      ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        String codigo = input.nextLine();

        return codigo;
    }

    public int Quantidade(){

        input.nextLine();
        int quantidade = 0, quantia;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite a quantidade do Equipamento -  ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        do {
            try {
                quantia = input.nextInt();
                quantidade = quantia;
                error = false;
            } catch (InputMismatchException erro) {
                System.err.println("Você digitou um valor errado, Tente Digitar um número!");
                input.nextLine();
            }
        }while(error);
        return quantidade;
    }

    public double Preco(){

        input.nextLine();
        double preco = 0, valor;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite o Preço do Equipamento -       ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        do {
            try {
                valor = input.nextDouble();
                preco = valor;
                error = false;
            } catch (InputMismatchException erro) {
                System.err.println("Você digitou um valor errado, Tente Digitar um número!");
                input.nextLine();
            }
        }while(error);
        return preco;
    }

    public double Potencia(){

        input.nextLine();
        double potencia = 0, pot;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite a Potencia do Equipamento -    ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        do {
            try {
                pot = input.nextDouble();
                potencia = pot;
                error = false;
            } catch (InputMismatchException erro) {
                System.err.println("Você digitou um valor errado, Tente Digitar um número!");
                input.nextLine();
            }
        }while(error);
        return potencia;
    }

    public String Tensao(){

        input.nextLine();

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite o Preço do Equipamento -       ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        String tensao = input.nextLine();

        return tensao;
    }

//MENSAGENS====MENSAGENS====MENSAGENS=====MENSAGENS=====MENSAGENS======MENSAGENS=====MENSAGENS====MENSAGENS======MENSAGENS=====

    public void MensagemDespedida(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃          Tchau até a proxima ;)         ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

    }

    public void AreaCadatro(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃          Área de Cadastros              ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

    }

    public void CadastroMotorEletrico(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃      Cadastrando Motor Elétrico...      ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

    }

    public void CadastroPainelControle(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃    Cadastrando Painel de Controle...    ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

    }

}
