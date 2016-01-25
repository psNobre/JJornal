<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  class="no-js" lang="en" >


<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>${noticia.titulo}</title>
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
				<a href="<c:url value="/index"></c:url>">JJornal</a>
			</h1>
		</li>
	</ul>
	
	<section class="top-bar-section">
	<ul class="right">
		<li class="active"><a href="<c:url value="/home"></c:url>">${UserLogado.nome}</a></li>
		<li><a href=<c:url value="/login"></c:url>>Entrar</a></li>
		<li><a href=<c:url value="/register"></c:url>>Registrar-se</a></li>
		<li><a href=<c:url value="/listaClassificados"></c:url>>Classificados</a></li>

		<li class="has-dropdown"  value="">
			<a href="#">Notícias</a>
			<ul class="dropdown">
				<c:forEach items="${ secoes }" var="secao">
   					<li class="active"><a class="work" href=<c:url value="/secoes/${secao.id}"></c:url>>${secao.titulo}</a></li>

   				</c:forEach>
		</ul></li>
		
	</ul>
	</section> </nav>

	<div class="row">
		<h1>${noticia.titulo}</h1>
		<p>${noticia.subtitulo}</p>
	</div>

	<div class="row">
		<hr>
		<div class="large-8 columns">
			<h4>Data e Hora da Publicação: ${noticia.dataNoticia}</h4>
			<div style="width:600px">${noticia.texto}</div>
			<i class="fi-social-twitter"></i>
		</div>

		<div class="large-4 columns">
			<img src="http://placehold.it/800x500&text=[img]">
		</div>

	</div>
	

	
	<div class="row" >
		<hr>
			<c:forEach items="${ comentarios }" var="comentario">
<%-- 					<h5>${comentario.user.login}</h5> --%>
					<p>${comentario.texto}</p>
					<hr>
			</c:forEach>
				
		
	<form action="../cadastrarComentarios/${noticia.id}" method="post">
		<div class="row collapse">
			<div class="large-8 columns">
				<div class="small-12 columns">
					<label>Comentário
       					<textarea placeholder="Vale ressaltar..." name="texto" rows="5" required></textarea>
     				</label>
				</div>
			</div>
		</div>
		
			<div class="row collapse">
			<div class="large-6 columns">
				<div class="row collapse prefix-radius">
					<div class="small-9 columns">
						<input class="button success" type="submit" value="Comentar"></a>
					</div>
				</div>
			</div>
		</div>
	</form>
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