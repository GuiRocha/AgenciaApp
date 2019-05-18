import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class Agencia {
    private ArrayList<Projeto> projetos = new ArrayList<>();


    public void addProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    private int buscar(String nomeX) {
        for (int i = 0; i < projetos.size(); i++) {
            Projeto projeto = projetos.get(i);
            String nomeProjeto = projeto.getProjetos();
            if (nomeX.equals(nomeProjeto)) {
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


    public void addProjeto(String nome, double duracao, String titulo, int codigo, String areaPesquisa) {
        Projeto projeto = new Projeto();
        projeto.setProjetos(nome);
        projeto.setDuracao(duracao);
        projeto.setTitulo(titulo);
        projeto.setCodigo(codigo);
        projeto.setAreaPesquisa(areaPesquisa);
        addProjeto(projeto);
    }

    public void listarProjetos() {
        for (Projeto projeto : projetos) {
            JOptionPane.showMessageDialog(null, projeto);
        }
    }

    public int buscarNum(int codigo) {
        for (int i = 0; i < projetos.size(); i++) {
            Projeto projeto = projetos.get(i);
            int codProjeto = projeto.getCodigo();
            if (Objects.equals(codigo, codProjeto)) {
                return i;
            }
        }
        return -1;//nao achou
    }

    public void listarProjetosN(int nomex) {
        for (int i = 0; i < projetos.size(); i++) {
            int posicao = buscarNum(nomex);
            if (posicao > 0) {
                Projeto projeto = projetos.get(posicao);
                JOptionPane.showMessageDialog(null, posicao);
            }
        }



