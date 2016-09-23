<%-- 
    Document   :usuarios
    Created on : 19/09/2016, 02:53:59 PM
    Author     : zenaido
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Usuarios</title>
    </head>
    <body>
        <form
        action="UsuarioController" method="post">
        <fieldset>
            <div>
            <label>Id de usuario:</label>
            <input type="text" name="idUsuario" value="${usuario.idUsuario}"      
                   readonly="readonly"
                   />
            </div>
            <div>
            <label>Login:</label>
            <input type="text" name="login" value="${usuario.login}"
                   placeholder="login"
                   />
            </div>
                   <div>
            <label>Password:</label>
            <input type="text" name="password" value="${usuario.password}"
                   placeholder="Password"
                   />
                   </div>
                   <div>
            <label>Nombre:</label>
            <input type="text" name="Nombre" value="${usuario.nombre}"
                   placeholder="Nombre del usuario"
                   />
                   </div>
                   <div>
            <label>Edad:</label>
            <input type="number" name="edad" value="${usuario.edad}"
                   placeholder="Edad del usuario"
                   />
                   </div>
                   <div>
            <input type="submit" valor="Guardar"/>
                   </div>
        </fieldset>
        </form>        
    </body>
</html>
