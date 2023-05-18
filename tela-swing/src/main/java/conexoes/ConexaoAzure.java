/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexoes.banco;

import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author LUCAS
 */
public class ConexaoAzure {

  private JdbcTemplate connection;

  public ConexaoAzure() {

    BasicDataSource dataSource = new BasicDataSource();
    
    // Procurar na internet o c driver da Azure
    dataSource​.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

    //Colocar o caminho até o banco de dados da Azure
    dataSource​.setUrl("jdbc:sqlserver://svr-erroreagle.database.windows.net:1433;database=bd-errorEagle;user=admin-erroreagle@svr-erroreagle;password={#Gfgrupo3};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");

    dataSource​.setUsername("admin-erroreagle");

    dataSource​.setPassword("#Gfgrupo3");

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
