/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utng.dao.HotelDAO;
import utng.dao.HotelDAOimp;
import utng.model.Hotel;



/**
 *
 * @author TICLAB1
 */
public class HotelController extends HttpServlet{
    
 private static final String LISTA_HOTEL="/listarHotel.jsp";
   private static final String AGREGAR_O_HOTEL="/Hotel.jsp";
   private HotelDAO  dao;
   public HotelController(){
       dao=new HotelDAOimp();
   }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException {
     String forward="";
        String action =request.getParameter("action");
       if(action.equalsIgnoreCase("borrar")){
       forward=LISTA_HOTEL;
       int id=Integer.parseInt(request.getParameter("idUsuario"));
       dao.borrarHotel(id);
       request.setAttribute("hoteles", dao.desplegarHotel());
       
       }else if(action.equalsIgnoreCase("cambiar")){
           forward=AGREGAR_O_HOTEL;
           
       int id=Integer.parseInt(request.getParameter("idHoteles"));
       Hotel hotel=dao.elegirHotel(id);
       request.setAttribute("hotel", hotel);
       }else if(action.equalsIgnoreCase("agregar")){
           forward=AGREGAR_O_HOTEL;
       }else{
           forward=LISTA_HOTEL;
           request.setAttribute("hotel", dao.desplegarHotel());
       }
             RequestDispatcher  view=request.getRequestDispatcher(forward);
             view.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        Hotel hotel = new Hotel();
      String id=request.getParameter("id");
      hotel.setId(Integer.parseInt(request.getParameter("id")));
      hotel.setNombre(request.getParameter("nombre"));
      hotel.setDescribsion(request.getParameter("descripcion"));
      hotel.setCategoria(Integer.parseInt(request.getParameter("categoria")));
      if(id==null||id.isEmpty()){
          dao.agregarHotel(hotel);
      }else{
          hotel.setId(Integer.parseInt(id));
          dao.cambiarHotel(hotel);
      }
      RequestDispatcher view= request.getRequestDispatcher(LISTA_HOTEL);
      request.setAttribute("hotel", dao.desplegarHotel());
      view.forward(request, response);
    }
    
}
