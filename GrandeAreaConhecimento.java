public class GrandeAreaConhecimento {
    private int id;
    private String descricao;
     public GrandeAreaConhecimento(int id, String descricao){
         this.id = id;
         this.descricao = descricao;
     }

    public GrandeAreaConhecimento(String idArea, String descArea, AreaConhecimento conhecimento) {

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
         return "Id: "+ id + "Descrição: " + descricao;
    }
}