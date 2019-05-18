public class Projeto {
    private String projetos;
    private double duracao;
    private String titulo;
    private int codigo;
    private String areaPesquisa;
    private String status;

    private AreaConhecimento area;


    public String getProjetos() {
        return projetos;
    }

    public double getDuracao() {
        return duracao;
    }

    public String getTitulo() {
        return titulo;
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
    public void setProjetos(String projetos) {
        this.projetos = projetos;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }

    public void setArea(AreaConhecimento area) {
        this.area = area;
    }

    public String toString() {
        return "Projeto : " + projetos + "\nDuracao : " + duracao+ "hs  " + "\nTitulo : " + titulo +
                "\nCodigo : " + codigo + "\nArea de Pesquisa : " + areaPesquisa + "\nStatus: " + this.getStatus() +
                "\nGrande área: " + area.getConhecimento().getNome() + " Descrição: " + area.getConhecimento().getDescricao() +
                "\nArea: " + area.getNome() + " Descrição: " + area.getDescricao();
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