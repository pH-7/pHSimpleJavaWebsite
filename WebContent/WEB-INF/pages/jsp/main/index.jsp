<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageHeading" value="${bundle['main.welcome']}" scope="request" />

<c:import url="${config.viewDir}inc/header.inc.jsp" />

<section class="row">
   
<h1>${bundle['main.welcome_text']}</h1>

</section>

<c:import url="${config.viewDir}inc/footer.inc.jsp" />