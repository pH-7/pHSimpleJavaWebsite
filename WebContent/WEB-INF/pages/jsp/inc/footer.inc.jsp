<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       </div>
      </div>
    </div>

<footer>
  <div class="center"><c:import url="${config.viewDir}inc/ad/bottom.inc.jsp" /></div>
  <p><strong>${config.siteName}</strong> &copy; ${view.year} - ${bundle['main.by']} Pierre-Henry | ${bundle['main.copyright']} &nbsp; &bull; &nbsp; 
  <c:import url="${config.viewDir}inc/menu/bottom.inc.jsp" /></p>
  <div class="addthis_toolbox addthis_default_style"><a class="addthis_button_facebook_like"></a><a class="addthis_button_google_plusone" g:plusone:size="medium"></a><a class="addthis_button_tweet" tw:count="horizontal"></a></div>
  
</footer>

</div>
<script>var url = {stic : '${config.staticUrl}'}</script>
<script src="<c:url value="/static/js/loader.js" />"></script>
<script src="http://s7.addthis.com/js/250/addthis_widget.js"></script>
</body>
</html>