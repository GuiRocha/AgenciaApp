public class Projeto {

    private String nome;
    private double duracao;
    private int codigo;
    private String areaPesquisa;
    private String status;
    private GrandeAreaConhecimento conhecimento;

    public Projeto(String nome, double duracao, int codigo, String areaPesquisa, String status, GrandeAreaConhecimento conhecimento) {
        this.nome = nome;
        this.duracao = duracao;
        this.codigo = codigo;
        this.areaPesquisa = areaPesquisa;
        this.status = status;
        this.conhecimento = conhecimento;
    }

    public String getNome() {
        return nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;

    }

    public String getStatus() {
        if (status == null) {
            status = "Pendente";
        }
        return status;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }


    public String toString() {
        return "Projeto : " + nome + "\nDuracao : " + duracao+ "hs  " +
                "\nCodigo : " + codigo + "\nArea de Pesquisa : " + areaPesquisa + "\nStatus: " + this.getStatus() +
                "\nGrande área ID: " + this.conhecimento.getId() + " Descrição: " + this.conhecimento.getDescricao() +
                "\nArea ID: " + this.conhecimento.getConhecimento().getId() + " Descrição: " + this.conhecimento.getConhecimento().getDescricao();
    }

    public void setStatus(String status){
//tamanho da mensagem e no maximo 144
        if(status.length() <= 144){
            this.status = status;
        } else {
//trunca se for maior
            this.status = status.substring(0, 144);
        }
    }
}