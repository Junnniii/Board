<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html style="font-size: 16px;">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="utf-8">
<meta name="keywords" content="HJ BOARD SAMPLE">
<meta name="description" content="">
<meta name="page_type" content="np-template-header-footer-from-plugin">
<title>HJ BOARD</title>
<link rel="stylesheet" href="/resources/css/list.css">
<link rel="stylesheet" href="/resources/css/nicepage.css" media="screen">
<link rel="stylesheet" href="/resources/css/About.css" media="screen">
<script class="u-script" type="text/javascript"
	src="/resources/js/jquery.js" defer=""></script>
<script class="u-script" type="text/javascript"
	src="/resources/js/nicepage.js" defer=""></script>
<meta name="generator" content="Nicepage 3.12.1, nicepage.com">
<link id="u-theme-google-font" rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">


<script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "",
		"url": "index.html"
}</script>
<meta property="og:title" content="About">
<meta property="og:type" content="website">
<meta name="theme-color" content="#478ac9">
<link rel="canonical" href="index.html">
<meta property="og:url" content="index.html">
</head>
<body class="u-body">
	<!------------------------------------------- header --------------------------------------- -->
	<tiles:insertAttribute name="header" />
	<!-------------------------------------------- section ----------------------------------------->
	<section class="u-clearfix u-section-1" id="sec-2aa1">
		<div class="u-clearfix u-expanded-width u-layout-wrap u-layout-wrap-1">
			<div class="u-layout">
				<div class="u-layout-row">
					<!-- aside -->
					<tiles:insertAttribute name="aside" />
					<!-- main -->
					<tiles:insertAttribute name="main" />
				</div>
			</div>
		</div>
	</section>

	<!-------------------------------------------- footer ------------------------------------------->
	<tiles:insertAttribute name="footer" />
</body>
</html>