<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>JJornal | Editor</title>
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
		<li><a href="formClassificados">Add Classificados</a></li>
		<li><a href="listaNoticias">Gerenciar Notícias</a></li>
		<li><a href="listaClassificados">Classificados</a></li>
		<li><a href="logoutUser">Sair</a></li>

		<li class="has-dropdown"  value=""><a href="#">Notícias</a>
			<ul class="dropdown">
				<li class="active"><a href="#">First link in dropdown</a></li>
				<li class="active"><a href="#">Active link in dropdown</a></li>
			</ul></li>
	</ul>
	</section> </nav>
	
	<div class="row">
		<h1>Editor</h1>
		<p>Bem-Vindo ao JJornal <strong>${UserLogado.nome}</strong></p>

	</div>
	
	<div class="row">
		<hr>
		<div class="large-8 columns">
			<h4>O que você pode fazer como modo Editor</h4>
			<p><i>...Cadastrar Jornalistas</i></p>
			<hr/>
			<p><i>...Cadastrar Seções do nosso periódico</i></p>
			<hr/>
			<p><i>...Cadastrar Classificados</i></p>
			<hr/>
			<p><i>...Gerenciar Notícias</i></p>
			<i class="fi-social-twitter"></i>
		</div>

	</div>
	

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