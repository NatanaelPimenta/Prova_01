// Classe Encontrar
public class Encontrar {
    public static void main(String[] args) {
        // Criando um objeto do tipo Usuario
        Usuario usuario = new Usuario("Alice", "alice@example.com", "senha123");

        // Criando um objeto do tipo AchadoPerdido
        AchadoPerdido achadoPerdido = new AchadoPerdido("Chaves", "Chave encontrada na sala", "Objeto", "Encontrado");
        achadoPerdido.completaDados("foto_chave.jpg", "Sala de estar", "2023-10-05 15:30:00");

        // Utilizando o método buscarTitulo
        String resultadoBusca = achadoPerdido.buscarTitulo("Chaves");
        System.out.println("Resultado da busca pelo título 'Chaves': " + resultadoBusca);

        // Visualizando detalhes do achado
        achadoPerdido.visualizarDetalhes();
    }
}