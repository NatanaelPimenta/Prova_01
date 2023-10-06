import java.util.Scanner;

// Classe ProjetoSocial
public class ProjetoSocial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto do tipo Projeto
        Projeto projeto = new Projeto("Projeto X", "Descrição do Projeto X", "Endereço X", "2023-10-05", "");

        // Criando um objeto do tipo DistribuicaoAlimento
        DistribuicaoAlimento distribuicaoAlimento = new DistribuicaoAlimento("Comida", 100.0f);

        // Utilizando o método validaProjeto
        boolean projetoValido = distribuicaoAlimento.validaProjeto("Projeto X");
        System.out.println("O projeto é válido? " + (projetoValido ? "Sim" : "Não"));

        // Visualizando detalhes da distribuicao de alimento
        System.out.println("Detalhes da Distribuição de Alimento:");
        System.out.println(distribuicaoAlimento.imprimeProjeto());

        // Criando um objeto do tipo TrabalhoVoluntario
        TrabalhoVoluntario trabalhoVoluntario = new TrabalhoVoluntario("Limpeza", 3);

        // Utilizando o método validaProjeto
        projetoValido = trabalhoVoluntario.validaProjeto("Projeto X");
        System.out.println("\nO projeto é válido? " + (projetoValido ? "Sim" : "Não"));

        // Visualizando detalhes do trabalho voluntário
        System.out.println("Detalhes do Trabalho Voluntário:");
        System.out.println(trabalhoVoluntario.imprimeProjeto());
    }
}