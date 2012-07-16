<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="${config.defLang}">
<head>
<meta charset="utf-8" />
<title><c:choose><c:when test="${not empty pageTitle}">${pageTitle}</c:when><c:otherwise>${config.pageTitle}</c:otherwise></c:choose> - ${config.siteName}</title>
<meta name="description" content="${config.metaDescription}" />
<meta name="keywords" content="${config.metaKeywords}" />
  <meta name="author" content="Pierre-Henry SORIA" />
  <link rel="shortcut icon" type="image/x-icon" href="<c:url value="/favicon.ico" />" />
  <link rel="stylesheet" href="<c:url value="/themes/${config.themeName}/css/bootstrap.css" />" />
  <link rel="stylesheet" href="<c:url value="/themes/${config.themeName}/css/bootstrap-responsive.css" />" />
  <link rel="stylesheet" href="<c:url value="/themes/${config.themeName}/css/general.css" />" />
  <link rel="stylesheet" href="<c:url value="/themes/${config.themeName}/css/form.css" />" />
  <link rel="stylesheet" href="<c:url value="/themes/${config.themeName}/css/ajph.css" />" />
  <link rel="stylesheet" href="<c:url value="/themes/${config.themeName}/css/tipsy.css" />" />
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
  <c:import url="${config.viewDir}inc/analytics.inc.jsp" />
</head>
<c:import url="${config.viewDir}inc/menu/top.inc.jsp" />

<div class="container">

 <section class="hero-unit">
   <c:if test="${not empty pageHeading}">
      <div id="heading"><h2>${pageHeading}</h2></div>
    </c:if>
    <div class="center"><c:import url="${config.viewDir}inc/ad/top.inc.jsp" /></div>
 </section>


    <div id="ajph">
      <div id="sub_ajph">
      
      <div class="middle left"><c:import url="${config.viewDir}inc/ad/left.inc.jsp" /></div>
      <div class="middle right"><c:import url="${config.viewDir}inc/ad/right.inc.jsp" /></div>
      
      <div class="center">
        <div class="middle"><c:import url="${config.viewDir}inc/ad/middle.inc.jsp" /></div>