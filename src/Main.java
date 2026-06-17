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
            
        }
        ^}
}