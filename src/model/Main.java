package model;
import java.util.Scanner;

import model.ultil.CargaInicial;
import model.service.Copa;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Copa copa = CargaInicial.carregarDados();
        System.out.println("Grupo A: " + copa.listarGrupo('A'));
System.out.println("Grupo B: " + copa.listarGrupo('B'));

        int opcao;

        do {
System.out.println("\n=== Copa GC — Menu Principal ===");
System.out.println("1. Listar selecoes por grupo");
System.out.println("2. Registrar resultado de partida");
System.out.println("3. Exibir classificacao do grupo");
System.out.println("4. Listar artilheiros");
System.out.println("0. Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
    System.out.print("Digite o grupo (A ou B): ");
    char grupo = sc.next().toUpperCase().charAt(0);
    System.out.println(copa.listarGrupo(grupo));
    break;
case 2:

    System.out.print("Seleção mandante: ");
    String nomeMandante = sc.next();

    System.out.print("Seleção visitante: ");
    String nomeVisitante = sc.next();

    System.out.print("Gols do mandante: ");
    int golsA = sc.nextInt();

    System.out.print("Gols do visitante: ");
    int golsB = sc.nextInt();

    Selecao mandante = copa.buscarSelecao(nomeMandante);
    Selecao visitante = copa.buscarSelecao(nomeVisitante);

    if (mandante != null && visitante != null) {
        copa.registrarPartida(new Partida(mandante, visitante, golsA, golsB));
        System.out.println("Partida registrada!");
    } else {
        System.out.println("Seleção não encontrada.");
    }

    break;
case 3:
    System.out.print("Digite o grupo (A ou B): ");
    char grupoClass = sc.next().toUpperCase().charAt(0);
    System.out.println(copa.calcularClassificacao(grupoClass));
    break;


    case 4:
    System.out.println(copa.getArtilheiros());
    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        sc.close();
    }
}