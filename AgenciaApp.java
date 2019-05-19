import javax.swing.*;

public class AgenciaApp {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();
        Projeto projeto;

        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("1 add projeto \n2 Listar Projetos\n3 listar por numero\n4 Excluir projetos\n5 Atualizar resultado do projeto \n6  sair"));
            if (menu == 1) {
                String nome = JOptionPane.showInputDialog("Nome do projeto: ");
                double duracao = Double.parseDouble(JOptionPane.showInputDialog("Dura��o do projeto(EM HORAS): "));
                //String titulo = JOptionPane.showInputDialog("titulo do projeto: ");
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("C�digo do projeto: "));
                String areaPesquisa = JOptionPane.showInputDialog("Qual � a �rea de pesquisa do seu projeto: ");
                String idGrandeA = JOptionPane.showInputDialog("Grande �rea de conhecimento: ");
                String idArea = JOptionPane.showInputDialog("�rea de conhecimento: ");
                String descGrandeA = JOptionPane.showInputDialog("Descricao(Grande �rea de conhecimento:): ");
                String descArea = JOptionPane.showInputDialog("Descricao(�rea de conhecimento:): ");



                AreaConhecimento conhecimento = new AreaConhecimento(idGrandeA, descGrandeA);


                GrandeAreaConhecimento grandeConhecimento = new GrandeAreaConhecimento(idArea, descArea, conhecimento);
                projeto = new Projeto(nome, duracao,codigo, areaPesquisa, grandeConhecimento);

                agencia.addProjeto(projeto);
            } else if (menu == 2) {
                agencia.listarProjetos();
            } else if (menu == 3) {
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("C�digo para listar: "));
                if (agencia.listarCod(codigo)){
                    JOptionPane.showInputDialog("Digite o c�digo: ");
                }
            } else if (menu == 4) {
                String nomeX = JOptionPane.showInputDialog("C�digo para remover:");
                if (agencia.removeProjetos(nomeX)) {
                    JOptionPane.showMessageDialog(null, "Removido");
                } else {
                    JOptionPane.showMessageDialog(null, "Nao encontrado");
                }

            } else if (menu == 5) {
                String status = JOptionPane.showInputDialog(
                        "Atualize o status(Aprovado - Reprovado): ");
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("C�digo do projeto para atualizar:"));

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