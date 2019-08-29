<%-- 
    Document   : agregarContacto
    Created on : 20-ago-2019, 15:32:25
    Author     : Desarrollo Web
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Contacto</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div class="col-4">
            <form name="form1" action="Controlador">
                <br>
                <input type="text" class="form-control" name="nombreContacto" placeholder="Nombre" required="required">
                <br>
                <input type="tel" class="form-control" name="telefonoContacto" placeholder="Telefono" required="required">
                <br>
                <input type="email" class="form-control" name="emailContacto" placeholder="Email" required="required">
                <br>                
                <input type="submit" class="btn btn-primary" name="accion" value="agregarContacto" />
                

            </form>
            <div class="col-6">
                <h3>El contacto <%= request.getParameter("mensaje") %> ha sido agregado</h3>
            </div>
        </div>
    </body>
</html>
