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
			<a href="#">Not�cias</a>
			<ul class="dropdown">
				<c:forEach items="${ secoes }" var="secao">
   					<li class="active"><a class="work" href=<c:url value="/secoes/${secao.id}"></c:url>>${secao.titulo}</a></li>

   				</c:forEach>
		</ul></li>
		
	</ul>
	</section> </nav>
	<div class="row">
		<h1>${ secao.titulo }</h1>
		<p>${ secao.descricao }</p>

		<ul
			class="clearing-thumbs small-block-grid-1 medium-block-grid-2 large-block-grid-4"
			data-clearing>	
			
			<c:forEach items="${ noticias }" var="noticia">
   					<li><a href=<c:url value="/noticia/${noticia.id}"></c:url>><img data-caption="caption here..."
					src="http://placehold.it/800x500&text=[img]"><br><span
					style="font-size: small">${noticia.titulo}</span></a></li>

   			</c:forEach>
		
		</ul>

	</div>

		<footer class="row">
		<div class="large-12 columns">
			<hr />
			<div class="row">
				<div class="large-6 columns">
					<p>
						� Copyright 2015 <i>Pedro S�vio de Oliveira Nobre</i>.
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