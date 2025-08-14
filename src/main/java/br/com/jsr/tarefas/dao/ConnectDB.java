/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jsr.tarefas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author jeison
 */
public class ConnectDB {
    
    private static final String url = "jdbc:h2:tcp://localhost/~/DataBases/H2/tarefas";
    private static final String user = "jason";
    private static final String password = "js1902r";
    
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro na conexão ao banco de dados, verifique se o servidor foi iniciado!!! "
            );
        }
        return null;
    }
    
}
