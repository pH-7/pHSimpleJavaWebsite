<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="${bundle['blog.post']}" scope="request" />
<c:set var="pageHeading" value="${bundle['blog.post']}" scope="request" />

<c:import url="${config.viewDir}inc/header.inc.jsp" />

<section class="row">
  <article>
    <p>${bundle['main.under_construct']}</p>
  </article>
  
</section>

<c:import url="${config.viewDir}inc/footer.inc.jsp" />