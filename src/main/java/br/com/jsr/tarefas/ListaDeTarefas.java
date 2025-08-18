/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.jsr.tarefas;

import br.com.jsr.tarefas.model.Tarefa;
import br.com.jsr.tarefas.service.TarefaService;
import br.com.jsr.tarefas.views.Tarefas;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.h2.tools.Server;

/**
 *
 * @author jeison
 */
public class ListaDeTarefas {

    public static void main(String[] args) {
        // Criação e inicialização do servidor H2 com o 
        // banco de dados em memória.
        Server server = null;
        try {
            server = Server.createTcpServer("-tcpAllowOthers").start();
        } catch (SQLException ex) {
            Logger.getLogger(ListaDeTarefas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        TarefaService service = new TarefaService();
        
        service.createTable();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tarefas().setVisible(true);
            }
        });
        
        // Criação e instânciação do 'objeto' tarefa
        //Tarefa tarefa = new Tarefa();
        // Cadastrando os dados nos respectivos atributos da tarefa
        //tarefa.setTitulo("Teste 1");
        //tarefa.setDescricao("Testando");
        //tarefa.setLocal("São Gonçalo/RJ");
        //tarefa.setDataInicio(LocalDate.parse("2025-08-14"));
        //tarefa.setDataFim(LocalDate.parse("2025-08-14"));
        // Salvando a tarefa no banco de dados
        //service.salvar(tarefa);
        
        // Lista todas as tarefas cadastradas no terminal        
        //for(Tarefa t : service.listarTarefas()) {
            //System.out.println(t.toString());
        //    JOptionPane.showMessageDialog(null, t.toString());
        //}

        //Criação e instânciação do 'objeto' tarefa
//        Tarefa tarefa = new Tarefa();
        // Alterando os dados de uma tarefa
//        tarefa.setId((long) 3);
//        tarefa.setTitulo("Teste 2");
//        tarefa.setDescricao("Testando 2");
//        tarefa.setLocal("Rio de Janeiro/RJ");
//        tarefa.setDataInicio(LocalDate.parse("2025-08-14"));
//        tarefa.setDataFim(LocalDate.parse("2025-08-14"));
        // Salvando a tarefa no banco de dados
//        service.alterar(tarefa);
        
        // Busca uma tarefa pelo 'ID'
//        Tarefa tarefa = service.buscarTarefa(2);
        
        // Exibe a tarefa no terminal
//        System.out.println(tarefa.toString());

    server.stop();

    }
}
