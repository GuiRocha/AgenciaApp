import javax.swing.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Agencia {
    private static ArrayList<Projeto> projetos = new ArrayList<>();


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

    public boolean status(int codigo, String status){
        int posicao = buscarNum(codigo);
        if(posicao >= 0){
            Projeto projeto = projetos.get(posicao);
            projeto.setStatus(status);
            projetos.set(codigo,projeto);
            return true;
        } else {
            return false;
        }
    }

}