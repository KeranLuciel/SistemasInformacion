package clasificacionbazaranita;

import AccesoDatos.ConnectionSql;
import Views.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClasificacionBazarAnita {
    
    public static void main(String[] args) {
        Connection con = ConnectionSql.getInstancia();
        IniciarSesión iniciarSesion = new IniciarSesión();
        iniciarSesion.setLocationRelativeTo(null);
        iniciarSesion.setVisible(true);
    }
}
