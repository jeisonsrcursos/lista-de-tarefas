/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jsr.tarefas.repository;

import br.com.jsr.tarefas.dao.ConnectDB;
import static br.com.jsr.tarefas.dao.ConnectDB.getConnection;
import br.com.jsr.tarefas.dao.GenericDAO;
import br.com.jsr.tarefas.model.Tarefa;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeison
 */
public class TarefaRepository extends GenericDAO {
    
    public void salvar(Tarefa tarefa) throws SQLException {
        String insertSQL = "INSERT INTO tarefas(titulo, descricao, local, dataCriacao, dataInicio, dataFim) VALUES(?, ?, ?, ?, ?, ?)";
        save(
                insertSQL, 
                tarefa.getTitulo(),
                tarefa.getDescricao(), 
                tarefa.getLocal(), 
                tarefa.getDataCriacao(),
                tarefa.getDataInicio().toString(),
                tarefa.getDataFim().toString()
        );
    }
    
    public void alterar(Tarefa tarefa) throws SQLException {
        String updateSQL = "UPDATE tarefas SET " 
                + "titulo = ?, "
                + "descricao = ?, "
                + "local = ? , "
                + "dataCriacao = ?, "
                + "dataInicio = ?, "
                + "dataFim = ? " 
                + "WHERE id = ?";
        update(
                updateSQL,
                tarefa.getId(),
                tarefa.getTitulo(), 
                tarefa.getDescricao(), 
                tarefa.getLocal(), 
                tarefa.getDataCriacao(),
                tarefa.getDataInicio().toString(),
                tarefa.getDataFim().toString()
        );
    }
    
    public void excluir(long id) throws SQLException {
        String deleteSQL = "DELETE FROM tarefas WHERE id = ?;";
        delete(deleteSQL, id);
    }
    
    public List<Tarefa> listarTarefas() throws SQLException {
        List<Tarefa> tarefas = new ArrayList<>();
        String select = "SELECT * FROM tarefas";
        PreparedStatement stmt = getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()) {
            
            Tarefa tarefa = new Tarefa();
            
            tarefa.setId(rs.getLong("id"));
            tarefa.setTitulo(rs.getString("titulo"));
            tarefa.setDescricao(rs.getString("descricao"));
            tarefa.setLocal(rs.getString("local"));
            tarefa.setDataInicio((LocalDate) Date.valueOf(rs.getString("dataInicio")).toLocalDate());
            tarefa.setDataFim((LocalDate) Date.valueOf(rs.getString("dataFim")).toLocalDate());
            tarefa.setDataCriacao((LocalDateTime) Date.valueOf(rs.getString("dataFim")).toLocalDate().atStartOfDay());
//            tarefa.setDataCriacao(LocalDateTime.parse(rs.getString("dataCriacao")));
            
            tarefas.add(tarefa);
        }
        
        rs.close();
        stmt.close();
        
        return tarefas;
    }
    
    public Tarefa buscarTarefa(long id) throws SQLException {
        Tarefa tarefa = null;
        String select = "SELECT * FROM tarefas WHERE id = ?";
        PreparedStatement stmt = getConnection().prepareStatement(select);
        stmt.setString(1, String.valueOf(id));
        ResultSet rs = stmt.executeQuery();
        
        if(rs.next()) {
            tarefa = new Tarefa();
            tarefa.setId(rs.getLong("id"));
            tarefa.setTitulo(rs.getString("titulo"));
            tarefa.setDescricao(rs.getString("descricao"));
            tarefa.setLocal(rs.getString("local"));
            tarefa.setDataInicio((LocalDate) Date.valueOf(rs.getString("dataInicio")).toLocalDate());
            tarefa.setDataFim((LocalDate) Date.valueOf(rs.getString("dataFim")).toLocalDate());
            tarefa.setDataCriacao((LocalDateTime) Date.valueOf(rs.getString("dataFim")).toLocalDate().atStartOfDay());
        }
    
        return tarefa;
    }
    
}
