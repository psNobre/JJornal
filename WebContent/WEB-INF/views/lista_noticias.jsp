<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>${UserTipo} | Gerenciar Not�cias</title>
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
		<li><a href="logoutUser">Sair</a></li>

	</ul>
	</section> </nav>

	<div class="row">
		<h1>Lista de Not�cias</h1>
	</div>

		<div class="row">

		<ul
			class="clearing-thumbs small-block-grid-1 medium-block-grid-2 large-block-grid-4"
			data-clearing>	
			
			<c:forEach items="${ noticias }" var="noticia">
   					<li><a href="noticia/${noticia.id}"><img data-caption="caption here..."
					src="http://placehold.it/800x500&text=[img]"><br><span
					style="font-size: small">${noticia.titulo}</span></a>
					<a href=noticiaRmv/${noticia.id}><span>Deletar</span></a>
					</li>
					
					
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