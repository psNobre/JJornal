<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  class="no-js" lang="en" >


<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>JJornal | Início</title>
<link rel="stylesheet" href="<c:url value="/css/foundation.css" />" />
<script src="<c:url value="/js/vendor/modernizr.js" />"></script>
<script src="<c:url value="/js/vendor/jquery.js" />"></script>
<script src="<c:url value="/js/dropdown.js" />"></script>

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
		<li><a href="login">Entrar</a></li>
		<li><a href="register">Registrar-se</a></li>
		<li><a href="listaClassificados">Classificados</a></li>

		<li class="has-dropdown"  value="">
			<a href="#">Notícias</a>
			<ul class="dropdown">
				<c:forEach items="${ secoes }" var="secao">
   					<li class="active"><a class="work" href="secoes/${secao.id}">${secao.titulo}</a></li>

   				</c:forEach>
		</ul></li>
		
	</ul>
	</section> </nav>

	<div class="row">
		<h1>Últimas Notícias</h1>
		<p>Fique por dentro das últimas novidades sobre Esporte, Política
			e Entretenimento.</p>

		<ul
			class="clearing-thumbs small-block-grid-1 medium-block-grid-2 large-block-grid-4"
			data-clearing>	
			
			<c:forEach begin="0" end="11" items="${ noticias }" var="noticia">
   					<li><a href="noticia/${noticia.id}"><img data-caption="caption here..."
					src="http://placehold.it/800x500&text=[img]"><br><span
					style="font-size: small">${noticia.titulo}</span></a></li>

   			</c:forEach>
		
		</ul>
		
	</div>

	<div class="row">
		<hr>
		<div class="large-8 columns">
			<h4>Sobre</h4>
			<p>Este é o Jornal Jornal, o jornal que é muito mais jornal do
				que o jornal que você compra na banca de jornal.</p>
			<i class="fi-social-twitter"></i>
		</div>

		<div class="large-4 columns">
			<img src="http://placehold.it/800x500&text=[img]">
		</div>

	</div>

	<div class="row">
		<hr>
		<div class="large-12 columns">
			<h4>Equipe</h4>
			<p>Nossos editores e jornalistas.</p>

			<ul
				class="clearing-thumbs small-block-grid-1 medium-block-grid-2 large-block-grid-4"
				data-clearing>
				<li><a href="#"><img data-caption="caption here..."
						src="img/Renato.jpg" width="200" height="200"></a></li>
				<li><a href="#"><img data-caption="caption 2 here..."
						src="img/Boca.jpg" width="280" height="280"></a></li>
				<li><a href="#"><img data-caption="caption 3 here..."
						src="img/Detonator.jpeg" width="280" height="280"></a></li>
				<li><a href="#"><img data-caption="caption 4 here..."
						src="img/Joselito.jpg" width="200" height="200"></a></li>
			</ul>
		</div>
	</div>
	
		<div class="row">
			<div class="large-12 columns">
				<hr>
				<h4>Contato</h4>
				<div class="large-4 columns">Email:
					pedro.savio.nobre@gmail.com</div>
				<div class="large-4 columns">Telefone: +55 (85)3225-6141</div>
				<div class="large-4 columns">Celular: +55 (85)99712-8174</div>
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