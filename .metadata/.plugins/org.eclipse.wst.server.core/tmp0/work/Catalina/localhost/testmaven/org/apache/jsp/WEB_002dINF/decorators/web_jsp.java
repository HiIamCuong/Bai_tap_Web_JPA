/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.12
 * Generated at: 2024-09-25 03:14:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.decorators;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class web_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/WEB/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/testmaven/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/c.tld", Long.valueOf(1664428278000L));
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar", Long.valueOf(1725410878713L));
    _jspx_dependants.put("/common/header.jsp", Long.valueOf(1727234062460L));
    _jspx_dependants.put("/common/footer.jsp", Long.valueOf(1727227619363L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div>\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Metronic Shop UI</title>\r\n");
      out.write("\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\r\n");
      out.write("<meta content=\"Metronic Shop UI description\" name=\"description\">\r\n");
      out.write("<meta content=\"Metronic Shop UI keywords\" name=\"keywords\">\r\n");
      out.write("<meta content=\"keenthemes\" name=\"author\">\r\n");
      out.write("\r\n");
      out.write("<meta property=\"og:site_name\" content=\"-CUSTOMER VALUE-\">\r\n");
      out.write("<meta property=\"og:title\" content=\"-CUSTOMER VALUE-\">\r\n");
      out.write("<meta property=\"og:description\" content=\"-CUSTOMER VALUE-\">\r\n");
      out.write("<meta property=\"og:type\" content=\"website\">\r\n");
      out.write("<meta property=\"og:image\" content=\"-CUSTOMER VALUE-\">\r\n");
      out.write("<!-- link to image for socio -->\r\n");
      out.write("<meta property=\"og:url\" content=\"-CUSTOMER VALUE-\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("<!-- Fonts START -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all\"\r\n");
      out.write("	rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all\"\r\n");
      out.write("	rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<!--- fonts for slider on the index page -->\r\n");
      out.write("<!-- Fonts END -->\r\n");
      out.write("\r\n");
      out.write("<!-- Global styles START -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/global/plugins/font-awesome/css/font-awesome.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/global/plugins/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<!-- Global styles END -->\r\n");
      out.write("\r\n");
      out.write("<!-- Page level plugin styles START -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/global/plugins/fancybox/source/jquery.fancybox.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/global/plugins/carousel-owl-carousel/owl-carousel/owl.carousel.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/global/plugins/slider-layer-slider/css/layerslider.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<!-- Page level plugin styles END -->\r\n");
      out.write("\r\n");
      out.write("<!-- Theme styles START -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/global/css/components.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/frontend/layout/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/frontend/pages/css/style-shop.css\"\r\n");
      out.write("	rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/frontend/pages/css/style-layer-slider.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/frontend/layout/css/style-responsive.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/frontend/layout/css/themes/red.css\"\r\n");
      out.write("	rel=\"stylesheet\" id=\"style-color\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/frontend/layout/css/custom.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<!-- Theme styles END -->\r\n");
      out.write("</head>\r\n");
      out.write("<!-- Head END -->\r\n");
      out.write("\r\n");
      out.write("<!-- Body BEGIN -->\r\n");
      out.write("<body class=\"ecommerce\">\r\n");
      out.write("	<!-- BEGIN STYLE CUSTOMIZER -->\r\n");
      out.write("	<div class=\"color-panel hidden-sm\">\r\n");
      out.write("		<div class=\"color-mode-icons icon-color\"></div>\r\n");
      out.write("		<div class=\"color-mode-icons icon-color-close\"></div>\r\n");
      out.write("		<div class=\"color-mode\">\r\n");
      out.write("			<p>THEME COLOR</p>\r\n");
      out.write("			<ul class=\"inline\">\r\n");
      out.write("				<li class=\"color-red current color-default\" data-style=\"red\"></li>\r\n");
      out.write("				<li class=\"color-blue\" data-style=\"blue\"></li>\r\n");
      out.write("				<li class=\"color-green\" data-style=\"green\"></li>\r\n");
      out.write("				<li class=\"color-orange\" data-style=\"orange\"></li>\r\n");
      out.write("				<li class=\"color-gray\" data-style=\"gray\"></li>\r\n");
      out.write("				<li class=\"color-turquoise\" data-style=\"turquoise\"></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- END BEGIN STYLE CUSTOMIZER -->\r\n");
      out.write("\r\n");
      out.write("	<!-- BEGIN TOP BAR -->\r\n");
      out.write("	<div class=\"pre-header\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<!-- BEGIN TOP BAR LEFT PART -->\r\n");
      out.write("				<div class=\"col-md-6 col-sm-6 additional-shop-info\">\r\n");
      out.write("					<ul class=\"list-unstyled list-inline\">\r\n");
      out.write("						<li><i class=\"fa fa-phone\"></i><span>+1 456 6717</span></li>\r\n");
      out.write("						<!-- BEGIN CURRENCIES -->\r\n");
      out.write("						<li class=\"shop-currencies\"><a href=\"javascript:void(0);\">€</a>\r\n");
      out.write("							<a href=\"javascript:void(0);\">£</a> <a href=\"javascript:void(0);\"\r\n");
      out.write("							class=\"current\">$</a></li>\r\n");
      out.write("						<!-- END CURRENCIES -->\r\n");
      out.write("						<!-- BEGIN LANGS -->\r\n");
      out.write("						<li class=\"langs-block\"><a href=\"javascript:void(0);\"\r\n");
      out.write("							class=\"current\">English </a>\r\n");
      out.write("							<div class=\"langs-block-others-wrapper\">\r\n");
      out.write("								<div class=\"langs-block-others\">\r\n");
      out.write("									<a href=\"javascript:void(0);\">French</a> <a\r\n");
      out.write("										href=\"javascript:void(0);\">Germany</a> <a\r\n");
      out.write("										href=\"javascript:void(0);\">Turkish</a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div></li>\r\n");
      out.write("						<!-- END LANGS -->\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- END TOP BAR LEFT PART -->\r\n");
      out.write("				<!-- BEGIN TOP BAR MENU -->\r\n");
      out.write("				<div class=\"col-md-6 col-sm-6 additional-nav\">\r\n");
      out.write("					<ul class=\"list-unstyled list-inline pull-right\">\r\n");
      out.write("						");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- END TOP BAR MENU -->\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- END TOP BAR -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<div>\r\n");
      out.write("		<sitemesh:write property=\"body\"/>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div>\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- BEGIN PRE-FOOTER -->\r\n");
      out.write("<div class=\"pre-footer\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<!-- BEGIN BOTTOM ABOUT BLOCK -->\r\n");
      out.write("			<div class=\"col-md-3 col-sm-6 pre-footer-col\">\r\n");
      out.write("				<h2>About us</h2>\r\n");
      out.write("				<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed\r\n");
      out.write("					diam sit nonummy nibh euismod tincidunt ut laoreet dolore magna\r\n");
      out.write("					aliquarm erat sit volutpat. Nostrud exerci tation ullamcorper\r\n");
      out.write("					suscipit lobortis nisl aliquip commodo consequat.</p>\r\n");
      out.write("				<p>Duis autem vel eum iriure dolor vulputate velit esse molestie\r\n");
      out.write("					at dolore.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- END BOTTOM ABOUT BLOCK -->\r\n");
      out.write("			<!-- BEGIN BOTTOM INFO BLOCK -->\r\n");
      out.write("			<div class=\"col-md-3 col-sm-6 pre-footer-col\">\r\n");
      out.write("				<h2>Information</h2>\r\n");
      out.write("				<ul class=\"list-unstyled\">\r\n");
      out.write("					<li><i class=\"fa fa-angle-right\"></i> <a href=\"#\">Delivery\r\n");
      out.write("							Information</a></li>\r\n");
      out.write("					<li><i class=\"fa fa-angle-right\"></i> <a href=\"#\">Customer\r\n");
      out.write("							Service</a></li>\r\n");
      out.write("					<li><i class=\"fa fa-angle-right\"></i> <a href=\"#\">Order\r\n");
      out.write("							Tracking</a></li>\r\n");
      out.write("					<li><i class=\"fa fa-angle-right\"></i> <a href=\"#\">Shipping\r\n");
      out.write("							&amp; Returns</a></li>\r\n");
      out.write("					<li><i class=\"fa fa-angle-right\"></i> <a href=\"contacts.html\">Contact\r\n");
      out.write("							Us</a></li>\r\n");
      out.write("					<li><i class=\"fa fa-angle-right\"></i> <a href=\"#\">Careers</a></li>\r\n");
      out.write("					<li><i class=\"fa fa-angle-right\"></i> <a href=\"#\">Payment\r\n");
      out.write("							Methods</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- END INFO BLOCK -->\r\n");
      out.write("\r\n");
      out.write("			<!-- BEGIN TWITTER BLOCK -->\r\n");
      out.write("			<div class=\"col-md-3 col-sm-6 pre-footer-col\">\r\n");
      out.write("				<h2 class=\"margin-bottom-0\">Latest Tweets</h2>\r\n");
      out.write("				<a class=\"twitter-timeline\" href=\"https://twitter.com/twitterapi\"\r\n");
      out.write("					data-tweet-limit=\"2\" data-theme=\"dark\" data-link-color=\"#57C8EB\"\r\n");
      out.write("					data-widget-id=\"455411516829736961\"\r\n");
      out.write("					data-chrome=\"noheader nofooter noscrollbar noborders transparent\">Loading\r\n");
      out.write("					tweets by @keenthemes...</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- END TWITTER BLOCK -->\r\n");
      out.write("\r\n");
      out.write("			<!-- BEGIN BOTTOM CONTACTS -->\r\n");
      out.write("			<div class=\"col-md-3 col-sm-6 pre-footer-col\">\r\n");
      out.write("				<h2>Our Contacts</h2>\r\n");
      out.write("				<address class=\"margin-bottom-40\">\r\n");
      out.write("					35, Lorem Lis Street, Park Ave<br> California, US<br>\r\n");
      out.write("					Phone: 300 323 3456<br> Fax: 300 323 1456<br> Email: <a\r\n");
      out.write("						href=\"mailto:info@metronic.com\">info@metronic.com</a><br>\r\n");
      out.write("					Skype: <a href=\"skype:metronic\">metronic</a>\r\n");
      out.write("				</address>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- END BOTTOM CONTACTS -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<!-- BEGIN SOCIAL ICONS -->\r\n");
      out.write("			<div class=\"col-md-6 col-sm-6\">\r\n");
      out.write("				<ul class=\"social-icons\">\r\n");
      out.write("					<li><a class=\"rss\" data-original-title=\"rss\" href=\"#\"></a></li>\r\n");
      out.write("					<li><a class=\"facebook\" data-original-title=\"facebook\"\r\n");
      out.write("						href=\"#\"></a></li>\r\n");
      out.write("					<li><a class=\"twitter\" data-original-title=\"twitter\" href=\"#\"></a></li>\r\n");
      out.write("					<li><a class=\"googleplus\" data-original-title=\"googleplus\"\r\n");
      out.write("						href=\"#\"></a></li>\r\n");
      out.write("					<li><a class=\"linkedin\" data-original-title=\"linkedin\"\r\n");
      out.write("						href=\"#\"></a></li>\r\n");
      out.write("					<li><a class=\"youtube\" data-original-title=\"youtube\" href=\"#\"></a></li>\r\n");
      out.write("					<li><a class=\"vimeo\" data-original-title=\"vimeo\" href=\"#\"></a></li>\r\n");
      out.write("					<li><a class=\"skype\" data-original-title=\"skype\" href=\"#\"></a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- END SOCIAL ICONS -->\r\n");
      out.write("			<!-- BEGIN NEWLETTER -->\r\n");
      out.write("			<div class=\"col-md-6 col-sm-6\">\r\n");
      out.write("				<div class=\"pre-footer-subscribe-box pull-right\">\r\n");
      out.write("					<h2>Newsletter</h2>\r\n");
      out.write("					<form action=\"#\">\r\n");
      out.write("						<div class=\"input-group\">\r\n");
      out.write("							<input type=\"text\" placeholder=\"youremail@mail.com\"\r\n");
      out.write("								class=\"form-control\"> <span class=\"input-group-btn\">\r\n");
      out.write("								<button class=\"btn btn-primary\" type=\"submit\">Subscribe</button>\r\n");
      out.write("							</span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- END NEWLETTER -->\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- END PRE-FOOTER -->\r\n");
      out.write("<!-- BEGIN FOOTER -->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<!-- BEGIN COPYRIGHT -->\r\n");
      out.write("			<div class=\"col-md-6 col-sm-6 padding-top-10\">2014 © Metronic\r\n");
      out.write("				Shop UI. ALL Rights Reserved.</div>\r\n");
      out.write("			<!-- END COPYRIGHT -->\r\n");
      out.write("			<!-- BEGIN PAYMENTS -->\r\n");
      out.write("			<div class=\"col-md-6 col-sm-6\">\r\n");
      out.write("				<ul class=\"list-unstyled list-inline pull-right\">\r\n");
      out.write("					<li><img\r\n");
      out.write("						src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/frontend/layout/img/payments/western-union.jpg\"\r\n");
      out.write("						alt=\"We accept Western Union\" title=\"We accept Western Union\"></li>\r\n");
      out.write("					<li><img\r\n");
      out.write("						src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/frontend/layout/img/payments/american-express.jpg\"\r\n");
      out.write("						alt=\"We accept American Express\"\r\n");
      out.write("						title=\"We accept American Express\"></li>\r\n");
      out.write("					<li><img\r\n");
      out.write("						src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/frontend/layout/img/payments/MasterCard.jpg\"\r\n");
      out.write("						alt=\"We accept MasterCard\" title=\"We accept MasterCard\"></li>\r\n");
      out.write("					<li><img\r\n");
      out.write("						src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/frontend/layout/img/payments/PayPal.jpg\"\r\n");
      out.write("						alt=\"We accept PayPal\" title=\"We accept PayPal\"></li>\r\n");
      out.write("					<li><img\r\n");
      out.write("						src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${URL}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("assets/frontend/layout/img/payments/visa.jpg\"\r\n");
      out.write("						alt=\"We accept Visa\" title=\"We accept Visa\"></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- END PAYMENTS -->\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- END FOOTER -->\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("							");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("							");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("						");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /common/header.jsp(123,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.account == null}", boolean.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("								<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/login\">Login</a></li>\r\n");
          out.write("								<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/register\">Register</a></li>\r\n");
          out.write("							");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("								<li><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.account.avatar}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("									style=\"width: 100px; height: 70px;\"></li>\r\n");
          out.write("								<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/update\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.account.fullname}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("								<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/logout\">Đăng\r\n");
          out.write("									Xuất</a>\r\n");
          out.write("								</li>\r\n");
          out.write("							");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}