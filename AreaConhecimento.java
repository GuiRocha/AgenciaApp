public class AreaConhecimento {
    private int id;
    private String descricao;
    private String nome;

    private GrandeAreaConhecimento conhecimento;

    public AreaConhecimento() {}

    public AreaConhecimento(GrandeAreaConhecimento conhecimento) {
        this.conhecimento = conhecimento;

    }
    public String getNome(){
        return nome;
    }
    public int getId (){
        return id;
    }
    public String getDescricao (){
        return descricao;
    }
    public void setId (int id){
        this.id = id;
    }
    public void setDescricao (String descricao){
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GrandeAreaConhecimento getConhecimento() {
        return conhecimento;
    }
}