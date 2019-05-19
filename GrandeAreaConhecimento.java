public class GrandeAreaConhecimento {

    private int id;
    private String descricao;
    private AreaConhecimento conhecimento;

    public GrandeAreaConhecimento(int id, String descricao, AreaConhecimento conhecimento) {
        this.id = id;
        this.descricao = descricao;
        this.conhecimento = conhecimento;
    }

    public AreaConhecimento getConhecimento() {
        return conhecimento;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return "ID: " + id + " Desc: " + descricao;
    }
}