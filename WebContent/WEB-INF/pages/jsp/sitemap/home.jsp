<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="${bundle['sitemap.sitemap']}" scope="request" />
<c:set var="pageHeading" value="${bundle['sitemap.sitemap']}" scope="request" />

<c:import url="${config.viewDir}inc/header.inc.jsp" />

<p>NO LINKS</p>

<c:import url="${config.viewDir}inc/footer.inc.jsp" />