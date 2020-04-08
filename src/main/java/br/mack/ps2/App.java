package br.mack.ps2;
import java.sql.*;

public class App
{
    public static void main( String[] args ){

        Connection conn = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            String db = "registro";
            String url = "jdbc:mysql://localhost:3306/" + db;
            String user = "root";
            String psw = "root";

            conn = DriverManager.getConnection(url,user,psw);
            Statement statement - conn.createStatement();

            Statement.executeUpdate("INSERT INTO presenca" + "VALUES (3, 31910701, 0730, 1100)");

            String sql = "SELECT * FROM presenca";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                int tia  = rs.getInt("tia");
                Time hr_entrada = rs.getTime("hr_entrada");
                Time hr_saida = rs.getTime("hr_saida");
                System.out.println("Tia: " + tia);
            }
            rs.close();
            conn.close();

        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            System.out.println("SQL EXCEPTION");
            e.printStackTrace();
        }
    }


}
}
