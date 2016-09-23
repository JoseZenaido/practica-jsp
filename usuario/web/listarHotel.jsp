<%-- 
    Document   : listarHotel
    Created on : 22/09/2016, 03:04:32 PM
    Author     : TICLAB1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Hoteles</title>
    </head>
    <body>
        <table>
            <thead>
                 <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>descripcion</th>
                    <th>categoria</th>
                    <th>domicilio</th>
                    
                    
                </tr>
                            </thead>

            <tbody>
                <c:forEach var="hotel" items="${Hotel}">
                    <tr>
                        <td>${hotel.id}</td>
                        <td>${hotel.nombre}</td>
                        <td>${hotel.descripcion}</td>
                        <td>${hotel.categoria}</td>
                        <td>${hotel.domicilio}</td>
                        <td><a href="HotelController?action=cambiar&idHotel=${hotel.id}">Cambiar</a></td>
                        <td><a href="HotelController?action=borrar&idHotel=${hotel.id}">Borrar</a></td>
                        
                    </tr>
                </c:forEach>
                
            </tbody>
                
            
        </table>
        
        <p>
            <a href="HotelController?action=agregar">Nuevo Hotel</a>
            
        </p>
        
        
        
    </body>
</html>
