import javax.swing.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;

public class AgenciaApp {
    public static void main(String[] args) throws Exception {
        Agencia agencia = new Agencia();
        Projeto projeto = new Projeto();
        Connection conn = null;
        int menu;
        Conexao bd = new Conexao();
        conn = bd.conectar();

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("1 add projeto \n2 Listar Projetos\n3 listar por numero\n4 Excluir projetos\n5 Atualizar resultado do projeto \n6  sair"));

            if (menu == 1) {
                String nome = JOptionPane.showInputDialog("Nome do projeto: ");
                Double duracao = Double.parseDouble(JOptionPane.showInputDialog("Duração do projeto(EM HORAS): "));
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do projeto: "));
                String areaPesquisa = JOptionPane.showInputDialog("Qual é a área de pesquisa do seu projeto: ");
                String idArea = JOptionPane.showInputDialog("ID área de conhecimento: ");
                String descArea = JOptionPane.showInputDialog("Descricao(área de conhecimento:): ");

                AreaConhecimento conhecimento = new AreaConhecimento(Integer.valueOf(idArea), descArea);

                projeto = new Projeto(nome, duracao, codigo, areaPesquisa);

                projeto.incluir(conn);
            } else if (menu == 2) {
                ArrayList<Projeto> projotas = agencia.listarProjetos(conn);
                if (projotas == Collections.EMPTY_LIST) {
                    JOptionPane.showMessageDialog(null, "Não encontrado");
                } else {
                    JOptionPane.showMessageDialog(null, projotas);
                }

            } else if (menu == 3) {
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código para listar: "));
                Projeto p1 = agencia.listarProjetoPorCodigo(conn, codigo);
                if (p1 == null) {
                    JOptionPane.showMessageDialog(null, "Não encontrado");
                }

            } else if (menu == 4) {
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código para remover:"));
                boolean remover = projeto.deletarProjetoPorCodigo(conn, codigo);
                if (remover) {
                    JOptionPane.showMessageDialog(null, "Removido");
                }
            } else if (menu == 5) {
                String status = JOptionPane.showInputDialog("Atualize o status(Aprovado - Reprovado): ");
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do projeto para atualizar: "));
                Projeto projota = agencia.listarProjetoPorCodigo(conn, codigo);
                if(projota == null) {
                    JOptionPane.showMessageDialog(null, "Não encontrado");
                } else {
                    projeto.atualizar(conn, codigo, status);
                    JOptionPane.showMessageDialog(null, "Status atualizado!");
                }
            }
        }
        while (menu != 6);

    }
}