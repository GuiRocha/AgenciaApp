import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection conectar() throws SQLException {
        String servidor = "localhost";
        String porta = "3300";
        String database = "Trabalho";
        String usuario = "root";
        String senha = "";
        return DriverManager
                .getConnection("jdbc:mysql://" + servidor + ":" + porta +
                        "/" + database + "?user=" + usuario + "&password=" + senha);
    }

}
