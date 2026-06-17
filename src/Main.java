import model.Selecao;
import model.Partida;
import service.Copa;
import util.CargaInicial;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Carrega os dados iniciais
        Copa copa = CargaInicial.carregarDados();
        
        int opcao;
        
        do {
            System.out.println("\n=== Copa GC - Menu Principal ===");
            System.out.println("1. Listar selecoes por grupo");
            System.out.println("2. Registrar resultado de partida");
            System.out.println("3. Exibir classificacao do grupo");
            System.out.println("4. Listar artilheiros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            
            try {
                opcao = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Entrada invalida! Digite um numero.");
                sc.nextLine();
                opcao = -1;
                continue;
            }
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o grupo (A ou B): ");
                    String grupoInput = sc.nextLine().toUpperCase();
                    while (!grupoInput.equals("A") && !grupoInput.equals("B")) {
                        System.out.print("Grupo invalido! Digite A ou B: ");
                        grupoInput = sc.nextLine().toUpperCase();
                    }
                    char grupo = grupoInput.charAt(0);
                    
                    List<Selecao> selecoesGrupo = copa.listarGrupo(grupo);
                    System.out.println("\n=== Selecoes do Grupo " + grupo + " ===");
                    if (selecoesGrupo.isEmpty()) {
                        System.out.println("  Nenhuma selecao encontrada neste grupo.");
                    } else {
                        for (Selecao s : selecoesGrupo) {
                            System.out.println("  " + s);
                        }
                    }
                    break;
                    
               
                    
                case 4:
                    System.out.println("\n=== Artilheiros do Copa GC ===");
                    List<String> artilheiros = copa.getArtilheiros();
                    if (artilheiros.isEmpty()) {
                        System.out.println("  Nenhum artilheiro registrado ainda.");
                    } else {
                        for (String artilheiro : artilheiros) {
                            System.out.println("  - " + artilheiro);
                        }
                    }
                    break;
                    
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                    
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
            
        } while (opcao != 0);
        
        sc.close();
        System.out.println("Sistema encerrado. Obrigado por usar o Copa GC!");
    }
}