import javax.swing.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Agencia {

    private static ArrayList<Projeto> projetos = new ArrayList<Projeto>();

    public void addProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    private int buscar(String nomeX) {
        for (int i = 0; i < projetos.size(); i++) {
            Projeto projeto = projetos.get(i);
            String nomeProjeto = projeto.getNome();
            if (nomeX.equals(nomeProjeto)) {
                return i;
            }
        }
        return -1;//nao achou
    }

    private int buscarNum(int codigo) {
        for (int i = 0; i < projetos.size(); i++) {
            Projeto projeto = projetos.get(i);
            int codProjeto = projeto.getCodigo();
            if (codigo == codProjeto) {
                return i;
            }
        }
        return -1;//nao achou
    }

    public boolean removeProjetos(String nomeX) {
        int posicao = buscar(nomeX);
        if (posicao >= 0) {
            projetos.remove(posicao);
            return true;
        } else {
            return false;
        }
    }

    public boolean listarCod(int codigo) {
        int posicao = buscarNum(codigo);
        if (posicao >= 0) {
            JOptionPane.showMessageDialog(null, projetos.get(toString(projetos)));
            return true;
        } else {
            return false;
        }
    }

    public void listarProjetos() {
        for (Projeto projeto : projetos) {
            JOptionPane.showMessageDialog(null, projeto);
        }
    }

    private int toString(ArrayList<Projeto> projetos) {
        return 0;
    }

    public boolean status(int codigo, String status) {
        int posicao = buscarNum(codigo);
        if (posicao >= 0) {
            Projeto projeto = projetos.get(posicao);
            projeto.setStatus(status);
            projetos.set(codigo, projeto);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Projeto> listarProjetos(Connection conn) {
        return buscarProjetos(conn);
    }

    public Projeto listarProjetoPorCodigo(Connection conn, int codigo) {
        return buscarProjetosPorCodigo(conn, codigo);
    }

    private Projeto buscarProjetosPorCodigo(Connection conn, int codigo) {
        String sqlSelect = "SELECT NOME, DURACAO, CODIGO_INTERNO, AREA_DE_PESQUISA, Resposta_RESULTADO FROM Projetos WHERE codigo_interno = " + codigo;
        ArrayList<Projeto> lista = new ArrayList<>();
        Projeto projeto = null;

        try (PreparedStatement stm = conn.prepareStatement(sqlSelect);
             ResultSet rs = stm.executeQuery();) {

            while (rs.next()) {
                projeto = new Projeto(
                        rs.getString("NOME"),
                        rs.getDouble("DURACAO"),
                        rs.getInt("CODIGO_INTERNO"),
                        rs.getString("AREA_DE_PESQUISA"),
                        rs.getString("Resposta_RESULTADO")
                );
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return projeto;
    }



    public ArrayList<Projeto> buscarProjetos(Connection conn) {
        String sqlSelect = "SELECT NOME, DURACAO, CODIGO_INTERNO, AREA_DE_PESQUISA, Resposta_RESULTADO FROM Projetos";
        ArrayList<Projeto> lista = new ArrayList<>();

        try (PreparedStatement stm = conn.prepareStatement(sqlSelect);
             ResultSet rs = stm.executeQuery();) {

            while (rs.next()) {
                Projeto projeto = new Projeto(
                        rs.getString("NOME"),
                        rs.getDouble("DURACAO"),
                        rs.getInt("CODIGO_INTERNO"),
                        rs.getString("AREA_DE_PESQUISA"),
                        rs.getString("Resposta_RESULTADO")
                );
                lista.add(projeto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    //return projeto;
}
