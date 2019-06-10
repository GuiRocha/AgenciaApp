public class AreaConhecimento {
    private int id;
    private String descricao;
    private GrandeAreaConhecimento conhecimento;


    public AreaConhecimento(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
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
    public GrandeAreaConhecimento getConhecimento(){
        return this.conhecimento;
    }
}