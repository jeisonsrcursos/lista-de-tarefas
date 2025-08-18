/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jsr.tarefas.service;

import br.com.jsr.tarefas.model.Tarefa;
import br.com.jsr.tarefas.repository.TarefaRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jeison
 */
public class TarefaService {
    
    private final TarefaRepository repository = new TarefaRepository();
    
    public void createTable() {
        repository.createTable();
    }
    
    public void salvar(Tarefa tarefa) {
        try {
            repository.salvar(tarefa);
        } catch (SQLException ex) {
            System.getLogger(TarefaService.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    public void alterar(Tarefa tarefa) {
        try {
            repository.alterar(tarefa);
        } catch (SQLException ex) {
            System.getLogger(TarefaService.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    public void excluir(long id) {
        try {
            repository.excluir(id);
        } catch (SQLException ex) {
            System.getLogger(TarefaService.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    public List<Tarefa> listarTarefas() {
        try {
            return repository.listarTarefas();
        } catch (SQLException ex) {
            System.getLogger(TarefaService.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return null;
    }
    
    public Tarefa buscarTarefa(long id) {
        try {
            return repository.buscarTarefa(id);
        } catch (SQLException ex) {
            System.getLogger(TarefaService.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return null;
    }
    
}
