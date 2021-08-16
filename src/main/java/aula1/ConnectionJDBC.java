package aula1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) throws SQLException {
        String urlConnection = "jdbc:postgresql://localhost/inovationone";

//        Connection conn = null;
//
//        try{
//            conn = DriverManager.getConnection(urlConnection, "postgres","123456");
//            System.out.println("SUCESSO!");
//        } catch (Exception e ){
//            System.out.println("Falha!");
//            e.printStackTrace();
//        } finally {
//            conn.close();
//        }


        try(Connection conn = DriverManager.getConnection(urlConnection, "postgres", "123456")){
            System.out.println("SUCESSO!");
        } catch (Exception e){
            System.out.println("Falhou!");
        }
    }
}
