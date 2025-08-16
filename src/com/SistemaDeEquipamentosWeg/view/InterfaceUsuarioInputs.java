package com.SistemaDeEquipamentosWeg.view;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuarioInputs {

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
        System.out.println("┃              ------------               ┃");
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
                System.err.println("ERRO:Você digitou um valor errado, Tente Digitar um número!");
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
                System.err.println("ERRO:Você digitou um valor errado, Tente Digitar um número!");
                input.nextLine();
            }
        }while(error);
        return opcao;
    }

    public int OpcoesListagem(){

        input.nextLine();

        int opcao = 0, escolha;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃        - Escolha o que deseja:          ┃");
        System.out.println("┣----------━━━━━━━━━━━━━━━━━━━━━----------┫");
        System.out.println("┃ 1 - Motor Elétrico                      ┃");
        System.out.println("┃ 2 - Painel de Controle                  ┃");
        System.out.println("┃ 3 - Todos                               ┃");
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
                System.err.println("ERRO:Você digitou um valor errado, Tente Digitar um número!");
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
        input.nextLine();
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite o Código do Equipamento -      ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        String codigo = input.nextLine();

        return codigo;
    }

    public int Quantidade(){

        int quantidade = 0, quantia;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite a quantidade do Equipamento -  ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        do {
            try {
                quantia = input.nextInt();
                input.nextLine();
                quantidade = quantia;
                error = false;
            } catch (InputMismatchException erro) {
                System.err.println("ERRO:Você digitou um valor errado, Tente Digitar um número!");
                input.nextLine();
            }
        }while(error);
        return quantidade;
    }

    public double Preco(){
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
                System.err.println("ERRO:Você digitou um valor errado ou utilizou um ponto, Tente Digitar um número (numeros decimais use virgula)!");
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
                System.err.println("ERRO:Você digitou um valor errado, Tente Digitar um número!");
                input.nextLine();
            }
        }while(error);
        return potencia;
    }

    public String Tensao(){
        input.nextLine();
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite a Tensão do Equipamento -      ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        String tensao = input.nextLine();

        return tensao;
    }

    public int TipoDeBusca(){

        input.nextLine();

        int opcao = 0, escolha;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃        - Escolha o que deseja:          ┃");
        System.out.println("┣----------━━━━━━━━━━━━━━━━━━━━━----------┫");
        System.out.println("┃ 1 - Busca Por Código                    ┃");
        System.out.println("┃ 2 - Busca Por Nome                      ┃");
        System.out.println("┃ 3 - Busca Por Preço                     ┃");
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
                System.err.println("ERRO:Você digitou um valor errado, Tente Digitar um número!");
                input.nextLine();
            }
        }while(error);
        input.nextLine();
        return opcao;
    }

    public int TipoDeExclusao(){

        input.nextLine();

        int opcao = 0, escolha;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃        - Escolha o que deseja:          ┃");
        System.out.println("┣----------━━━━━━━━━━━━━━━━━━━━━----------┫");
        System.out.println("┃ 1 - Busca Por Código                    ┃");
        System.out.println("┃ 2 - Busca Por Nome                      ┃");
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
                System.err.println("ERRO:Você digitou um valor errado, Tente Digitar um número!");
                input.nextLine();
            }
        }while(error);
        input.nextLine();
        return opcao;
    }

    public int TipoMovimentacao(){

        input.nextLine();

        int opcao = 0, escolha;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃        - Escolha o que deseja:          ┃");
        System.out.println("┣----------━━━━━━━━━━━━━━━━━━━━━----------┫");
        System.out.println("┃ 1 - Adicionar Unidades ao Equipamento   ┃");
        System.out.println("┃ 2 - Remover Unidades do Equipamento     ┃");
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
                System.err.println("ERRO:Você digitou um valor errado, Tente Digitar um número!");
                input.nextLine();
            }
        }while(error);
        input.nextLine();
        return opcao;
    }

}
