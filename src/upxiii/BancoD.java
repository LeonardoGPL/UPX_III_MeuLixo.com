/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upxiii;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author leogo
 */
public class BancoD {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/";

    public static Connection getConnection(String nomeBanco, String usuario, String senha)
            throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL + nomeBanco, usuario, senha);
    }

    public static boolean insert(Connection conn, String sql)
            throws SQLException {
        Statement cmd = conn.createStatement();
        cmd.executeUpdate(sql);
        return true;
    }

    public static ArrayList<String> list(Connection conn, String sql) throws SQLException {;
        ArrayList<String> linhas = new ArrayList<String>();
        Statement cmd = conn.createStatement();
        ResultSet dados = cmd.executeQuery(sql);
        while (dados.next()) {
            linhas.add("Nome:                     " + dados.getString(1));
            linhas.add("\nEmail:                  " + dados.getString(2));
            linhas.add("\nTelefone:               " + dados.getString(3));
            linhas.add("\nLogradouro:             " + dados.getString(4));
            linhas.add("\nNumero:                 " + dados.getInt(5));
            linhas.add("\nBairro:                 " + dados.getString(6));
            linhas.add("\nComplemento:            " + dados.getString(7));
            linhas.add("\nCEP:                    " + dados.getString(8));
            linhas.add("\nCidade:                 " + dados.getString(9));
            linhas.add("\n------------------------------------------------\n");
        }
        return linhas;
    }

    public static ArrayList<String> listNova(Connection conn, String sql2) throws SQLException {;
        ArrayList<String> line = new ArrayList<String>();
        Statement cmd = conn.createStatement();
        ResultSet dados = cmd.executeQuery(sql2);
        while (dados.next()) {
            
            line.add("Numero de Identificação:                         " + dados.getString(1));
            line.add("\nNome:                                          " + dados.getString(2));
            line.add("\nEmail:                                          " + dados.getString(3));            
            line.add("\n--------------------------------------------------------------------\n");
        }
        return line;
    }

}
