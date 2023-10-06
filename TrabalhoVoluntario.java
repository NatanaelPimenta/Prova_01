// Classe TrabalhoVoluntario
class TrabalhoVoluntario {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String tipoTrabalho, int duracaoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    // Getters e Setters
    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto(String nomeProjeto) {
        return duracaoTrabalho > 2;
    }

    public String imprimeProjeto() {
        String nomeProjeto = null;
        String dataInicio = null;
        String descricao = null;
        String dataFim = null;
        return "Nome do Projeto: " + nomeProjeto +
                ", Descrição: " + descricao +
                ", Data de Início: " + dataInicio +
                ", Data de Fim: " + dataFim +
                ", Tipo de Trabalho: " + tipoTrabalho +
                ", Duração do Trabalho: " + duracaoTrabalho + " horas";
    }
}