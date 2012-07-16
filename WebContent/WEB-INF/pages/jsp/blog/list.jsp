<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="${bundle['blog.blog']}" scope="request" />
<c:set var="pageHeading" value="${bundle['blog.blog']}" scope="request" />

<c:import url="${config.viewDir}inc/header.inc.jsp" />

<h3>${bundle['blog.last_post']}</h3>

<section class="row">
  <ul class="unstyled">
    
      <li><a href="<c:url value="${config.rewriteUrl}blog/post" />" title="Pos" data-load="ajax">${bundle['blog.my_post']}</a></li>
    
  </ul>
</section>

<c:import url="${config.viewDir}inc/footer.inc.jsp" />