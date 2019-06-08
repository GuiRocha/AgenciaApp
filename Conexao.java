import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final Object conn = ;

    static {
          try {
              Class.forName("com.mysql.jdbc.Driver");
          }
          catch (ClassNotFoundException e ){
                throw new RuntimeException(e);
              }
          public Connection conectar() throws SQLException {
              String servidor = "localhost";
              String porta = "3306";
              String database = "ex3";
              String usuario = "root";
              String senha = "";
              return DriverManager
                      .getConnection("jdbc:mysql://"+servidor+":"+porta+
                              "/"+database+"?user="+usuario+"&password="+senha);
          }
          public static void desconectar(Connection conn) throw SQLException{
            conn.close();
          }
      }
}
