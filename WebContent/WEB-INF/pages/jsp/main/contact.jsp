<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="${bundle['main.contact']}" scope="request" />
<c:set var="pageHeading" value="${bundle['main.contact']}" scope="request" />

<c:import url="${config.viewDir}inc/header.inc.jsp" />

<p>${bundle['main.contact_us']} <a href="mailto:${config.contactEmail}">${config.contactEmail}</a></p>

<c:import url="${config.viewDir}inc/footer.inc.jsp" />