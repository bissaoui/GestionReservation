package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MessageAttende_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
 
    
    if(session.getAttribute("idUser")!=null){
        
        
               response.sendRedirect("newFile.jsp");
        
    }


      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("<html><head>\n");
      out.write("  <!-- Required meta tags -->\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <title>Star Admin2 </title>\n");
      out.write("  <!-- plugins:css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/vendors/feather/feather.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/vendors/mdi/css/materialdesignicons.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/vendors/ti-icons/css/themify-icons.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/vendors/typicons/typicons.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/vendors/simple-line-icons/css/simple-line-icons.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/vendors/css/vendor.bundle.base.css\">\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- Plugin css for this page -->\n");
      out.write("  <!-- End plugin css for this page -->\n");
      out.write("  <!-- inject:css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/css/vertical-layout-light/style.css\">\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <link rel=\"shortcut icon\" href=\"resources/images/favicon.png\">\n");
      out.write("<style type=\"text/css\">/* Chart.js */\n");
      out.write("@keyframes chartjs-render-animation{from{opacity:.99}to{opacity:1}}.chartjs-render-monitor{animation:chartjs-render-animation 1ms}.chartjs-size-monitor,.chartjs-size-monitor-expand,.chartjs-size-monitor-shrink{position:absolute;direction:ltr;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1}.chartjs-size-monitor-expand>div{position:absolute;width:1000000px;height:1000000px;left:0;top:0}.chartjs-size-monitor-shrink>div{position:absolute;width:200%;height:200%;left:0;top:0}</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"container-fluid w-100\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"main-panel w-100\">\n");
      out.write("        <div class=\"content-wrapper\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("\t\n");
      out.write("    <h2>Attender la comfirmation de votre compte svp </h2>\n");
      out.write("    <a href=\"login.jsp\">Login</a>                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
