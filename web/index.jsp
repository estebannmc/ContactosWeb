<%-- 
    Document   : index
    Created on : 20-ago-2019, 14:01:29
    Author     : Desarrollo Web
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    
    <body>
        <div class="login-form" style=" width: 340px; margin: 50px auto; ">
        <form action="Controlador" method="post">
		<div class="form-group">
		<input type="text" class="form-control" name="nombreUsuario" placeholder="Usuario" required="required">
		</div>
		
                <div class="form-group">
		<input type="text" class="form-control" name="password" placeholder="Password" required="required">
		</div>
                
                <div class="form-group">
		<input type="submit" class="btn btn-primary btn-block" name="accion" value="iniciarSesion">
		</div>
        </form>
        </div>
   <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>

</html>
