<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap.css" rel="stylesheet">

<
<title>Formulario</title>
</head>
<body>
	<div class="panel panel-primary painel-cadastro">
		<div class="panel panel-heading">Cadastro</div>
		<div class="panel panel-body">
			<form method="post" action"EditarCliente?acao=cadastrar">
				<div class="row">
					${mensagem }
					<fieldset>
						<div class="form-group">
							<label for="nome">Nome Completo: </label>
							<input type="text"class="form-control" id="nome" name="nome" autofocus required>
						</div>
						<div class="form-group">
							<label for="login">Usuario</label>
							<input type="text"class="form-control" id="login" name="login" autofocus required>
						</div>
						<div class="form-group">
							<label for="senha1">Senha:</label>
							<input type="password"class="form-control" id="senha1" name="senha1" autofocus required>
						</div>
						<div class="form-group">
							<label for="senha2">Repita Senha</label>
							<input type=password class="form-control" id="senha2" name="senha2" autofocus required>
						</div>
					</fieldset>

				</div>
				<input type="submit" class="btn btn-primary"  value="Confirmar">
			</form>
		</div>
	</div>

</body>
</html>