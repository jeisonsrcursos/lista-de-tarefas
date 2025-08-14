/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.jsr.tarefas;

import br.com.jsr.tarefas.dao.ConnectDB;
import br.com.jsr.tarefas.model.Tarefa;
import br.com.jsr.tarefas.repository.TarefaRepository;
import br.com.jsr.tarefas.service.TarefaService;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author jeison
 */
public class ListaDeTarefas {

    public static void main(String[] args) {
        
        TarefaService service = new TarefaService();
        
        // Criação e instânciação do 'objeto' tarefa
//        Tarefa tarefa = new Tarefa();
        // Cadastrando os dados nos respectivos atributos da tarefa
//        tarefa.setTitulo("Teste 1");
//        tarefa.setDescricao("Testando");
//        tarefa.setLocal("São Gonçalo/RJ");
//        tarefa.setDataInicio(LocalDate.parse("2025-08-14"));
//        tarefa.setDataFim(LocalDate.parse("2025-08-14"));
        // Salvando a tarefa no banco de dados
//        service.salvar(tarefa);
        
        // Lista todas as tarefas cadastradas no terminal        
        for(Tarefa t : service.listarTarefas()) {
            System.out.println(t.toString());
        }

// Criação e instânciação do 'objeto' tarefa
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

    }
}
