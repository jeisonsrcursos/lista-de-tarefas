/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jsr.tarefas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jeison
 */
public abstract class GenericDAO {
    
    private Connection con;

    public GenericDAO() {
        this.con = ConnectDB.getConnection();
    }
    
    protected Connection getConnection() {
        return con;
    }
    
    protected void save(String insert, Object... parametros) throws SQLException {
        // Código genérico do insert
        PreparedStatement pstmt = getConnection().prepareStatement(insert);
        for(int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i + 1, parametros[i]);
        }
        pstmt.execute();
        pstmt.close();
    }
    
    protected void update(String update, Object id, Object... parametros) throws SQLException {
        // Código genérico do update
        PreparedStatement pstmt = getConnection().prepareStatement(update);
        for(int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i + 1, parametros[i]);
        }
        pstmt.setObject(parametros.length + 1, id);
        pstmt.execute();
        pstmt.close();
    }
    
    protected void delete(String delete, Object... parametros) throws SQLException {
        // Código genérico do delete
        PreparedStatement pstmt = getConnection().prepareStatement(delete);
        for(int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i + 1, parametros[i]);
        }
        pstmt.execute();
        pstmt.close();
    }
    
}
