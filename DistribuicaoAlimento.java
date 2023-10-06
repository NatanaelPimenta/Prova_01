import jdk.internal.icu.impl.NormalizerImpl;

// Classe DistribuicaoAlimento
class DistribuicaoAlimento {
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String descAlimento, float qtde) {
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    // Getters e Setters
    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public boolean validaProjeto(String nomeProjeto) {
        NormalizerImpl.ReorderingBuffer dataFim = null;
        return dataFim.isEmpty();
    }

    public String imprimeProjeto() {
        String nomeProjeto = null;
        String descricao = null;
        String dataInicio = null;
        String dataFim = null;
        return "Nome do Projeto: " + nomeProjeto +
                ", Descrição: " + descricao +
                ", Data de Início: " + dataInicio +
                ", Data de Fim: " + dataFim +
                ", Descrição do Alimento: " + descAlimento +
                ", Quantidade: " + qtde;
    }
}