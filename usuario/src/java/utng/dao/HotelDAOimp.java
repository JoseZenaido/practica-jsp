/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utng.model.Hotel;
import utng.util.utilDB;

/**
 *
 * @author TICLAB1
 */
public class HotelDAOimp implements  HotelDAO{
    private Connection connection;
    public HotelDAOimp(){
        connection=utilDB.getConnection();
    }
    public void agregarHotel(Hotel hotel) {
        try{
            String query="INSERT INTO Hotel (id, nombre, descripcion, categoria, domicilio)"+"VALUES(?,?,?,?,?)";
            PreparedStatement ps=connection.prepareStatement(query);
            ps.setInt(1, hotel.getId());
            ps.setString(2, hotel.getNombre());
            ps.setString(3, hotel.getDescripcion());
            ps.setInt(4, hotel.getCategoria());
            ps.setString(5, hotel.getDomicilio());
            
            ps.executeUpdate();
            ps.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void borrarHotel(int id) {
       try{
           String query="DELETE FROM Hotel WHERE id= ?";
           PreparedStatement ps = connection.prepareCall(query);
           ps.setInt(1, id);
           ps.executeUpdate();
       }catch(SQLException e){
           e.printStackTrace();
       }
    }

    public void cambiarHotel(Hotel hotel) {
         try{
            String query= "UPDATE Hotel SET id= ?, nombre=?, descripcion = ?, categoria= ? domicilio= ?,WHERE id= ?";
            PreparedStatement ps=connection.prepareCall(query);
            ps.setInt(1, hotel.getId());
            ps.setString(2, hotel.getNombre());
            ps.setString(3, hotel.getDescripcion());
            ps.setInt(4, hotel.getCategoria());
            ps.setString(5, hotel.getDomicilio());
            ps.executeUpdate();
            ps.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    



    public List<Hotel> desplegarHotel() {
        List<Hotel> Hoteles =new ArrayList<Hotel>();
        try{
              Statement statement=connection.createStatement();
              ResultSet rs=  statement.executeQuery("SELECT * FROM usuarios");
              while(rs.next()){
                  Hotel hotel= new Hotel(rs.getInt("id"),rs.getString("nombre"),rs.getString("descripcion"),
                          rs.getInt("categoria"),rs.getString("domicilio"));
                  Hoteles.add(hotel);
              }
              rs.close();
              statement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
       return Hoteles;
    }


    public Hotel elejirHotel(int id) {
       Hotel hotel=null;
        try{
            String query="SELECT * FROM Hotel WHERE id= ?";
              PreparedStatement statement=connection.prepareStatement(query);
              statement.setInt(1, id);
              ResultSet rs=  statement.executeQuery();
             if(rs.next()){
                   hotel= new Hotel(rs.getInt("id"),rs.getString("nombre"),rs.getString("descripcion"),rs.getInt("categoria"),rs.getString("domicilio"));
                  
              }
              rs.close();
             statement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
       return hotel;
    }

    @Override
    public Hotel elegirHotel(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
