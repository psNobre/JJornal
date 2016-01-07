<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Editor | Add Classificados</title>
<link rel="stylesheet" href="<c:url value="/css/foundation.css" />" />
<script src="<c:url value="/js/vendor/modernizr.js" />"></script>
</head>

<body>
	<nav class="top-bar" data-topbar role="navigation">
	<ul class="title-area">
		<li class="name">
			<h1>
				<a href="index">JJornal</a>
			</h1>
		</li>
	</ul>
	<section class="top-bar-section">
	<ul class="right">
		<li class="active"><a href="home">${UserLogado.nome}</a></li>
		<li><a href="formJornalista">Add Jornalista</a></li>
		<li><a href="formSecao">Add Seção</a></li>
		<li><a href="listaNoticias">Gerenciar Notícias</a></li>
		<li><a href="listaClassificados">Classificados</a></li>
		<li><a href="logoutUser">Sair</a></li>

	</ul>
	</section> </nav>

	<div class="row">
		<h1>Cadastrar Classificados</h1>
	</div>

	<form action="cadastrarClassificados" method="post">

		<div class="row collapse">
			<div class="large-6 columns">
				<div class="row collapse prefix-radius">
					<div class="small-3 columns">
						<span class="prefix">Título</span>
					</div>
					<div class="small-9 columns">
						<input type="text" placeholder="Título" name="titulo" required
							x-moz-errormessage="Preencha o Título.">
					</div>
				</div>
			</div>
		</div>
		<div class="row collapse">
			<div class="large-6 columns">
				<div class="small-12 columns">
					<label>Sobre o Classificado
       					<textarea placeholder="Este produto possui..." name="texto" rows="10" required></textarea>
     				</label>
				</div>
			</div>
		</div>
		
		<div class="row collapse">
			<div class="large-6 columns">
				<div class="row collapse prefix-radius">
					<div class="small-3 columns">
						<span class="prefix">Preço</span>
					</div>
					<div class="small-9 columns">
						<input type="text" placeholder="Preço" name="preco" required
							x-moz-errormessage="Preencha o preço do classificado.">
					</div>
				</div>
			</div>
		</div>
		
		<div class="row collapse">
			<div class="large-6 columns">
				<div class="row collapse prefix-radius">
					<div class="small-3 columns">
						<span class="prefix">Telefone</span>
					</div>
					<div class="small-9 columns">
						<input type="text" placeholder="Ex.: (85) 91111-1111" name="telefone" required
							x-moz-errormessage="Preencha o telefone necessário para contato.">
					</div>
				</div>
			</div>
		</div>

		<div class="row collapse">
			<div class="large-6 columns">
				<div class="row collapse prefix-radius">
					<div class="small-9 columns">
						<input class="button success" type="submit" value="Cadastrar"></a>
					</div>
				</div>
			</div>
		</div>
	</form>

	<footer class="row">
	<div class="large-12 columns">
		<hr />
		<div class="row">
			<div class="large-6 columns">
				<p>
					© Copyright 2015 <i>Pedro Sávio de Oliveira Nobre</i>.
				</p>
			</div>
			<div class="large-6 columns">
				<ul class="inline-list right">
					<li><a href="https://www.facebook.com/pedro.savio.3"> <img
							src="img/facebook.png" width="40" height="40"></a></li>
					<li><a
						href="https://plus.google.com/u/0/117166788613143326786/posts"><img
							src="img/googleplus.png" width="40" height="40"></a></li>
					<li><a href="https://www.linkedin.com/in/psnobre"><img
							src="img/linkedin.png" width="40" height="40"></a></li>
					<li><a href="https://github.com/psNobre/JJornal"><img
							src="img/github.png" width="40" height="40"></a></li>
				</ul>
			</div>
		</div>
	</div>
	</footer>

</body>
</html>