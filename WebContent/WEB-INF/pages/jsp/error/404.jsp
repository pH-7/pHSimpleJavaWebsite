<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="${bundle['error.not_found']}" scope="request" />
<c:set var="pageHeading" value="${bundle['error.not_found']}" scope="request" />

<c:import url="${config.viewDir}inc/header.inc.jsp" />

<section class="row">
   <p><strong><c:out value="${view.msg}" /></strong></p>
   <p><strong><em>Suggestions, Go on:</em></strong></p>
   <ul class="unstyled">
      <li><a href="<c:url value="/" />" data-load="ajax">${bundle['main.main_page']}</a></li>
      <li><a href="javascript:void(0);" onclick="history.go(-1);" data-load="ajax">${bundle['main.back_previous_page']}</a></li>
    </ul>
</section>

<c:import url="${config.viewDir}inc/footer.inc.jsp" />