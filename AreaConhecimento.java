public class AreaConhecimento {
    private int id;
    private String descricao;
    private String nome;
    private GrandeAreaConhecimento conhecimento;

    public AreaConhecimento(String idGrandeA, String descGrandeA) {

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
    public GrandeAreaConhecimento conhecimento(){
        return conhecimento;
    }
    public void setConhecimento(GrandeAreaConhecimento conhecimento){
        this.conhecimento = conhecimento;

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

    public String toString() {
        return "Id: "+ id + "Descrição: " + descricao;
    }
}