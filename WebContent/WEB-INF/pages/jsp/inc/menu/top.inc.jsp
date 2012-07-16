<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 <div class="navbar navbar-fixed-top">
  <div class="navbar-inner">
    <div class="container">
      <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      </a>
      <header class="brand">${config.siteName}</header>
          
   <nav class="nav-collapse">
  <ul class="nav">
    <li class="active"><a href="${config.siteUrl}" data-load="ajax">${bundle['main.home']}</a></li>
    <li><a href="<c:url value="${config.rewriteUrl}blog/list" />" data-load="ajax">${bundle['blog.blog']}</a></li>
    <li><a href="<c:url value="${config.rewriteUrl}help/about" />" data-load="ajax">${bundle['help.about']}</a></li>
    <li><a href="<c:url value="${config.rewriteUrl}main/contact" />" data-load="ajax">${bundle['main.contact']}</a></li>
    <li><a href="<c:url value="${config.rewriteUrl}help/me" />" data-load="ajax">${bundle['help.me']}</a></li>
  </ul>
  <ul class="nav right">
    <c:url var="langUrl" value="${view.langLink}" />
    <li><a href="<c:out value="${langUrl}l=en" />"><img src="${config.staticUrl}img/flag/en.gif" alt="English" title="English" /></a></li>
    <li><a href="<c:out value="${langUrl}l=fr" />"><img src="${config.staticUrl}img/flag/fr.gif" alt="Français" title="Français" /></a></li>
  </ul>
</nav>

    
    </div>
  </div>
</div>