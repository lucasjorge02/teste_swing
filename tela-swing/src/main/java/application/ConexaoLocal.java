/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author LUCAS
 */
public class ConexaoLocal {

  private JdbcTemplate connection;

  public ConexaoLocal() {

    BasicDataSource dataSource = new BasicDataSource();
    
    // Procurar na internet o c driver da Azure
    dataSource​.setDriverClassName("com.mysql.cj.jdbc.Driver");

    //Colocar o caminho até o banco de dados Local
    dataSource​.setUrl("jdbc:mysql://localhost:3306/erroreagle?autoReconnect=true&useSSL=false");

    dataSource​.setUsername("ubuntu");

    dataSource​.setPassword("urubu100");

    this.connection = new JdbcTemplate(dataSource);
    
  }

  public JdbcTemplate getConnection() {

    return connection;

  }
  
  public Boolean testeConexao(){
     try {
            connection.execute("Select * from Admin");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
