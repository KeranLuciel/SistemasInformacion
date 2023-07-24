package AccesoDatos;

import Modelo.Producto;
import java.util.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductoDAO {
    private Connection conector;
    private String sql;
    private PreparedStatement ps;
    private CallableStatement proc;
    private ResultSet rs;
    
    public ProductoDAO(Connection conector) {
        this.conector = conector;
    }
    
    public void agregarProducto(Producto producto){
        ps = null;
        
        sql = "INSERT INTO Producto (cod_producto, descripcion, stock, " + "precio, categoria) VALUES (?,?,?,?,?)";
        
        try{
            ps = conector.prepareStatement(sql);
            
            ps.setInt(1, producto.getCodigo());
            ps.setString(2, producto.getDescripcion());
            ps.setInt(3, producto.getStock());
            ps.setDouble(4, producto.getPrecio());
            ps.setString(5, producto.getCategoria());
            
            ejecutarActualizacion();
            
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        
    }
    
    public void eliminarProducto(int codigo){
        ps = null;
        
        sql = "DELETE FROM Producto WHERE cod_producto = ?";
        
        try{
            ps = conector.prepareStatement(sql);
            ps.setInt(1, codigo);
            
            ejecutarActualizacion();
            
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    private void ejecutarActualizacion() throws SQLException{
        try {
            ps.executeUpdate();
            conector.commit();  
            JOptionPane.showMessageDialog(null,"Transacción exitosa","Confirmación",JOptionPane.NO_OPTION);                          
            } 
        catch (SQLException ex) {
            conector.rollback();
            JOptionPane.showMessageDialog(null,"Transacción NO exitosa","Error...",JOptionPane.NO_OPTION);              
        } finally {
            if (ps != null){
                ps.close();
            }
        }
    }
    
    public List seleccionarProductos(int codigo){
        
        List<Producto> productos = new ArrayList<>();
        
        sql = "SELECT cod_producto, descripcion, stock, precio, categoria FROM Producto WHERE cod_producto = ?";
        
        try {
            ps = conector.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            
            while (rs.next()){
                Producto p = new Producto();
                p.setCodigo(rs.getInt(1));
                p.setDescripcion(rs.getString(2));
                p.setStock(rs.getInt(3));
                p.setPrecio(rs.getDouble(4));
                p.setCategoria(rs.getString(5));
                
                productos.add(p);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return productos;
    }
    
    public List listaProductos(){
    
        List<Producto> productos = new ArrayList<>();
        
        sql = "SELECT cod_producto, descripcion, stock, precio, categoria FROM Producto ORDER BY cod_producto";
        
        try {
            ps = conector.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                Producto p = new Producto();
                p.setCodigo(rs.getInt(1));
                p.setDescripcion(rs.getString(2));
                p.setStock(rs.getInt(3));
                p.setPrecio(rs.getDouble(4));
                p.setCategoria(rs.getString(5));
                
                productos.add(p);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        
        return productos;
    }
    
    public void actualizarStockProducto(String descripcion, int nuevoStock) {
        ps = null;

        sql = "UPDATE Producto SET stock = ? WHERE descripcion = ?";

        try {
            ps = conector.prepareStatement(sql);
            ps.setInt(1, nuevoStock);
            ps.setString(2, descripcion);

            ejecutarActualizacion();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
