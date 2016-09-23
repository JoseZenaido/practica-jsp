/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.dao;

import java.util.List;
import utng.model.Hotel;


/**
 *
 * @author TICLAB1
 */
public interface HotelDAO {
    void  agregarHotel(Hotel hotel);
    void borrarHotel(int id);
    void cambiarHotel(Hotel hotel);
    List<Hotel>desplegarHotel();
    Hotel elegirHotel(int id);
    
    
   
}
