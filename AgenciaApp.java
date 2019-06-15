import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;

public class AgenciaApp {
    public static void main(String[] args) throws SQLException {
        Agencia agencia = new Agencia();
        Projeto projeto;
        Connection conn = null;
        int menu;
        Conexao bd = new Conexao();
        conn = bd.conectar();

            do {
                menu = Integer.parseInt(JOptionPane.showInputDialog("1 add projeto \n2 Listar Projetos\n3 listar por numero\n4 Excluir projetos\n5 Atualizar resultado do projeto \n6  sair"));

                if (menu == 2) {
                    String nome = JOptionPane.showInputDialog("Nome do projeto: ");
                    Double duracao = Double.parseDouble(JOptionPane.showInputDialog("Duração do projeto(EM HORAS): "));
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do projeto: "));
                    String areaPesquisa = JOptionPane.showInputDialog("Qual é a área de pesquisa do seu projeto: ");
                    //String idGrandeA = JOptionPane.showInputDialog("Grande área de conhecimento: ");
                    String idArea = JOptionPane.showInputDialog("ID área de conhecimento: ");
                    //String descGrandeA = JOptionPane.showInputDialog("Descricao(Grande área de conhecimento:): ");
                    String descArea = JOptionPane.showInputDialog("Descricao(área de conhecimento:): ");

                    AreaConhecimento conhecimento = new AreaConhecimento(Integer.valueOf(idArea), descArea);

                    //GrandeAreaConhecimento grandeConhecimento = new GrandeAreaConhecimento(Integer.valueOf(idGrandeA), descGrandeA, conhecimento);

                    projeto = new Projeto(nome, duracao, codigo, areaPesquisa);

                    projeto.incluir(conn);
                } else if (menu == 1) {

                    projeto.listar(conn);
                    JOptionPane.showMessageDialog(null, projeto);

                } else if (menu == 3) {
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código para listar: "));
                    if (agencia.listarCod(codigo)) {
                        JOptionPane.showInputDialog("Digite o código: ");
                    }
                } else if (menu == 4) {
                    String nomeX = JOptionPane.showInputDialog("Código para remover:");
                    if (agencia.removeProjetos(nomeX)) {
                        JOptionPane.showMessageDialog(null, "Removido");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nao encontrado");
                    }

                } else if (menu == 5) {
                    String status = JOptionPane.showInputDialog(
                            "Atualize o status(Aprovado - Reprovado): ");
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do projeto para atualizar:"));

                    if (agencia.status(codigo, status)) {
                        JOptionPane.showMessageDialog(null,
                                "Status atualizado!");

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Nao encontrado");
                    }
                }

            } while (menu != 6);
        }

    }
