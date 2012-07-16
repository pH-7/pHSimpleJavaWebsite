<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<a href="<c:url value="${config.rewriteUrl}sitemap/home" />" title="Site Map" data-load="ajax">${bundle['sitemap.sitemap']}</a>&nbsp; &bull; &nbsp;<a href="<c:url value="${config.rewriteUrl}legal/privacy" />" data-load="ajax">${bundle['legal.privacy_policy']}</a>