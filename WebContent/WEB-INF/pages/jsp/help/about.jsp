<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="${bundle['help.about']}" scope="request" />
<c:set var="pageHeading" value="${bundle['help.about']}" scope="request" />

<c:import url="${config.viewDir}inc/header.inc.jsp" />

<section class="row">
  <p>Me, here</p>
</section>

<c:import url="${config.viewDir}inc/footer.inc.jsp" />