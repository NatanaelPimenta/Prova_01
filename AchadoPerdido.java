import javax.swing.*;

// Classe AchadoPerdido
class AchadoPerdido {
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String localAchado;
    private String dataHora;
    private String status;

    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public void completaDados(String foto, String localAchado, String dataHora) {
        this.foto = foto;
        this.localAchado = localAchado;
        this.dataHora = dataHora;
    }

    public String buscarTitulo(String titulo) {
        if (this.titulo.equals(titulo)) {
            return "Título: " + titulo +
                    ", Descrição: " + descricao +
                    ", Local Achado: " + localAchado;
        } else {
            return "Título não encontrado.";
        }
    }

    public void visualizarDetalhes() {
        String mensagem = "Título: " + titulo +
                "\nFoto: " + foto +
                "\nLocal Achado: " + localAchado +
                "\nTipo: " + tipo +
                "\nStatus: " + status;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}