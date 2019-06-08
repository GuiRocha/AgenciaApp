import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
                "\nArea ID: " + this.conhecimento.getConhecimento().getId() + " Descrição: " + this.conhecimento.getConhecimento().getDescricao() +
                "\nGrande área: " + conhecimento.getId() + " Desc: ";
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
    public void incluir(Connection conn) {
        String sqlInsert =
                "INSERT INTO projeto(codigo, nome, duracao, areaPesquisa) VALUES (?, ?, ?,?,?)";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
            stm.setInt(1, getCodigo());
            stm.setString(2, getNome());
            stm.setInt(3, (int) getDuracao());
            stm.setString(4, getAreaPesquisa());
            stm.setString(5, getStatus());
            stm.setInt(6, conhecimento.getId());
            stm.setString(7, conhecimento.getDescricao());

            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                JOptionPane.showMessageDialog(null, e1.getStackTrace());
            }
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.getStackTrace());
                }
            }
        }
    }
            public void excluir(Connection conn) {
                //VICTOR String sqlDelete = "DELETE FROM LIVRO WHERE idLivro = ?";
                PreparedStatement stm = null;
                try {
                    stm = conn.prepareStatement(sqlDelete);
                    stm.setInt(1, getCodigo());

                    stm.execute();
                } catch (Exception e) {
                    e.printStackTrace();
                    try {
                        conn.rollback();
                    } catch (SQLException e1) {
                        System.out.print(e1.getStackTrace());
                    }
                } finally {
                    if (stm != null) {
                        try {
                            stm.close();
                        } catch (SQLException e1) {
                            System.out.print(e1.getStackTrace());
                        }
                    }
                }
            }
            public void listar(Connection conn){
                String sqlUpdate =
                     //VICTOR   "UPDATE PROJETOS SET nome = ?, Edicao = ? WHERE IdLivro = ?";
                PreparedStatement stm = null;
                try {
                    stm = conn.prepareStatement(sqlUpdate);
                    stm.setInt(1,(int) getCodigo());
                    stm.setString(2, getNome());
                    stm.setInt(3,(int) getDuracao());
                    stm.setString(4, getAreaPesquisa());
                    stm.setString(5, getStatus());
                    stm.execute();
                } catch (Exception e) {
                    e.printStackTrace();
                    try {
                        conn.rollback();
                    } catch (SQLException e1) {
                        System.out.print(e1.getStackTrace());
                    }
                } finally {
                    if (stm != null) {
                        try {
                            stm.close();
                        } catch (SQLException e1) {
                            System.out.print(e1.getStackTrace());
                        }
        }
    }
}