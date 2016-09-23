<%-- 
    Document   : hoteles
    Created on : 22/09/2016, 03:04:52 PM
    Author     : TICLAB1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Hoteles</title>
    </head>
    <body>
         <form  action="HotelController" method="post">
        <fieldset>
            <div>
            <label>Id del hotel</label>
            <input type="text" name="id" value="${hotel.id}"      
                   readonly="readonly"
                   />
            </div>
            <div>
            <label>Nombre:</label>
            <input type="text" name="nombre" value="${hotel.nombre}"
                   placeholder="nombre"
                   />
            </div>
                   <div>
            <label>Descripcion:</label>
            <input type="text" name="descripcion" value="${hotel.descripcion}"
                   placeholder="descripcion"
                   />
                   </div>
                   <div>
            <label>Categoria:</label>
            <input type="number" name="categoria" value="${hotel.categoria}"
                   placeholder="categoria"
                   />
                   </div>
                   <div>
            <label>Domicilio:</label>
            <input type="text" name="domicilio" value="${hotel.domicilio}"
                   placeholder="domicilio"
                   />
                   </div>
                   <div>
            <input type="submit" valor="Guardar"/>
                   </div>
        </fieldset>
        </form>        
    </body>
</html>
