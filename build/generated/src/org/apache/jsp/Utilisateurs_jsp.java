package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import services.UserServices;
import entities.User;

public final class Utilisateurs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Components/Navbar.jsp");
    _jspx_dependants.add("/Components/side.html");
    _jspx_dependants.add("/Components/Footer.html");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
 
    
    if(session.getAttribute("idUser")==null){
        
        
               response.sendRedirect("login.jsp");
        
    }


      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container-scroller\"> \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
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
      out.write("<body>\n");
      out.write("<nav class=\"navbar default-layout col-lg-12 col-12 p-0 fixed-top d-flex align-items-top flex-row\">\n");
      out.write("      <div class=\"text-center navbar-brand-wrapper d-flex align-items-center justify-content-start\">\n");
      out.write("        <div class=\"me-3\">\n");
      out.write("          <button class=\"navbar-toggler navbar-toggler align-self-center\" type=\"button\" data-bs-toggle=\"minimize\">\n");
      out.write("            <span class=\"icon-menu\"></span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("          <a class=\"navbar-brand brand-logo\" href=\"../../index.html\">\n");
      out.write("            <img src=\"resources/images/logo.svg\" alt=\"logo\">\n");
      out.write("          </a>\n");
      out.write("          <a class=\"navbar-brand brand-logo-mini\" href=\"../../index.html\">\n");
      out.write("            <img src=\"resources/images/logo-mini.svg\" alt=\"logo\">\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"navbar-menu-wrapper d-flex align-items-top\"> \n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("          <li class=\"nav-item font-weight-semibold d-none d-lg-block ms-0\">\n");
      out.write("            <h1 class=\"welcome-text\">Good Morning, <span class=\"text-black fw-bold\">");
      out.print(  session.getAttribute("prenom") );
      out.write(' ');
      out.write(' ');
      out.print(  session.getAttribute("nom") );
      out.write("</span></h1>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"navbar-nav ms-auto\">\n");
      out.write("\n");
      out.write("          <li class=\"nav-item dropdown d-none d-lg-block user-dropdown\">\n");
      out.write("            <a class=\"nav-link\" id=\"UserDropdown\" href=\"#\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("              <img class=\"img-xs rounded-circle\" src=\"resources/images/faces/face8.jpg\" alt=\"Profile image\"> </a>\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown\" aria-labelledby=\"UserDropdown\">\n");
      out.write("              <div class=\"dropdown-header text-center\">\n");
      out.write("                <img class=\"img-md rounded-circle\" src=\"resources/images/faces/face8.jpg\" alt=\"Profile image\">\n");
      out.write("                <p class=\"mb-1 mt-3 font-weight-semibold\">");
      out.print(  session.getAttribute("prenom") );
      out.write(' ');
      out.write(' ');
      out.print(  session.getAttribute("nom") );
      out.write("</p>\n");
      out.write("                <p class=\"fw-light text-muted mb-0\">");
      out.print(  session.getAttribute("Email") );
      out.write("</p>\n");
      out.write("              </div>\n");
      out.write("              <a class=\"dropdown-item\"><i class=\"dropdown-item-icon mdi mdi-account-outline text-primary me-2\"></i> My Profile <span class=\"badge badge-pill badge-danger\">1</span></a>\n");
      out.write("              <a class=\"dropdown-item\"><i class=\"dropdown-item-icon mdi mdi-message-text-outline text-primary me-2\"></i> Messages</a>\n");
      out.write("              <a class=\"dropdown-item\"><i class=\"dropdown-item-icon mdi mdi-calendar-check-outline text-primary me-2\"></i> Activity</a>\n");
      out.write("              <a class=\"dropdown-item\"><i class=\"dropdown-item-icon mdi mdi-help-circle-outline text-primary me-2\"></i> FAQ</a>\n");
      out.write("              <div  class=\"dropdown-item\"><i class=\"dropdown-item-icon mdi mdi-power text-primary me-2\"></i> <form method=\"get\" action=\"LogoutServlet\">\n");
      out.write("                      <input  type=\"submit\" value=\"Sign Out\" />\n");
      out.write("                  </form>  </div>\n");
      out.write("                 \n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        <button class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\" data-bs-toggle=\"offcanvas\">\n");
      out.write("          <span class=\"mdi mdi-menu\"></span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid page-body-wrapper\">\n");
      out.write("\n");
      out.write("<div class=\"theme-setting-wrapper\">\r\n");
      out.write("        <div id=\"settings-trigger\"><i class=\"ti-settings\"></i></div>\r\n");
      out.write("        <div id=\"theme-settings\" class=\"settings-panel\">\r\n");
      out.write("          <i class=\"settings-close ti-close\"></i>\r\n");
      out.write("          <p class=\"settings-heading\">SIDEBAR SKINS</p>\r\n");
      out.write("          <div class=\"sidebar-bg-options selected\" id=\"sidebar-light-theme\"><div class=\"img-ss rounded-circle bg-light border me-3\"></div>Light</div>\r\n");
      out.write("          <div class=\"sidebar-bg-options\" id=\"sidebar-dark-theme\"><div class=\"img-ss rounded-circle bg-dark border me-3\"></div>Dark</div>\r\n");
      out.write("          <p class=\"settings-heading mt-2\">HEADER SKINS</p>\r\n");
      out.write("          <div class=\"color-tiles mx-0 px-4\">\r\n");
      out.write("            <div class=\"tiles success\"></div>\r\n");
      out.write("            <div class=\"tiles warning\"></div>\r\n");
      out.write("            <div class=\"tiles danger\"></div>\r\n");
      out.write("            <div class=\"tiles info\"></div>\r\n");
      out.write("            <div class=\"tiles dark\"></div>\r\n");
      out.write("            <div class=\"tiles default\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("<div id=\"right-sidebar\" class=\"settings-panel\">\r\n");
      out.write("        <i class=\"settings-close ti-close\"></i>\r\n");
      out.write("        <ul class=\"nav nav-tabs border-top\" id=\"setting-panel\" role=\"tablist\">\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link active\" id=\"todo-tab\" data-bs-toggle=\"tab\" href=\"#todo-section\" role=\"tab\" aria-controls=\"todo-section\" aria-expanded=\"true\">TO DO LIST</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" id=\"chats-tab\" data-bs-toggle=\"tab\" href=\"#chats-section\" role=\"tab\" aria-controls=\"chats-section\">CHATS</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"tab-content\" id=\"setting-content\">\r\n");
      out.write("          <div class=\"tab-pane fade show active scroll-wrapper ps\" id=\"todo-section\" role=\"tabpanel\" aria-labelledby=\"todo-section\">\r\n");
      out.write("            <div class=\"add-items d-flex px-3 mb-0\">\r\n");
      out.write("              <form class=\"form w-100\">\r\n");
      out.write("                <div class=\"form-group d-flex\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control todo-list-input\" placeholder=\"Add To-do\">\r\n");
      out.write("                  <button type=\"submit\" class=\"add btn btn-primary todo-list-add-btn\" id=\"add-task\">Add</button>\r\n");
      out.write("                </div>\r\n");
      out.write("              </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"list-wrapper px-3\">\r\n");
      out.write("              <ul class=\"d-flex flex-column-reverse todo-list\">\r\n");
      out.write("                <li>\r\n");
      out.write("                  <div class=\"form-check\">\r\n");
      out.write("                    <label class=\"form-check-label\">\r\n");
      out.write("                      <input class=\"checkbox\" type=\"checkbox\">\r\n");
      out.write("                      Team review meeting at 3.00 PM\r\n");
      out.write("                    <i class=\"input-helper\"></i></label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <i class=\"remove ti-close\"></i>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <div class=\"form-check\">\r\n");
      out.write("                    <label class=\"form-check-label\">\r\n");
      out.write("                      <input class=\"checkbox\" type=\"checkbox\">\r\n");
      out.write("                      Prepare for presentation\r\n");
      out.write("                    <i class=\"input-helper\"></i></label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <i class=\"remove ti-close\"></i>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <div class=\"form-check\">\r\n");
      out.write("                    <label class=\"form-check-label\">\r\n");
      out.write("                      <input class=\"checkbox\" type=\"checkbox\">\r\n");
      out.write("                      Resolve all the low priority tickets due today\r\n");
      out.write("                    <i class=\"input-helper\"></i></label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <i class=\"remove ti-close\"></i>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"completed\">\r\n");
      out.write("                  <div class=\"form-check\">\r\n");
      out.write("                    <label class=\"form-check-label\">\r\n");
      out.write("                      <input class=\"checkbox\" type=\"checkbox\" checked=\"\">\r\n");
      out.write("                      Schedule meeting for next week\r\n");
      out.write("                    <i class=\"input-helper\"></i></label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <i class=\"remove ti-close\"></i>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"completed\">\r\n");
      out.write("                  <div class=\"form-check\">\r\n");
      out.write("                    <label class=\"form-check-label\">\r\n");
      out.write("                      <input class=\"checkbox\" type=\"checkbox\" checked=\"\">\r\n");
      out.write("                      Project review\r\n");
      out.write("                    <i class=\"input-helper\"></i></label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <i class=\"remove ti-close\"></i>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <h4 class=\"px-3 text-muted mt-5 fw-light mb-0\">Events</h4>\r\n");
      out.write("            <div class=\"events pt-4 px-3\">\r\n");
      out.write("              <div class=\"wrapper d-flex mb-2\">\r\n");
      out.write("                <i class=\"ti-control-record text-primary me-2\"></i>\r\n");
      out.write("                <span>Feb 11 2018</span>\r\n");
      out.write("              </div>\r\n");
      out.write("              <p class=\"mb-0 font-weight-thin text-gray\">Creating component page build a js</p>\r\n");
      out.write("              <p class=\"text-gray mb-0\">The total number of sessions</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"events pt-4 px-3\">\r\n");
      out.write("              <div class=\"wrapper d-flex mb-2\">\r\n");
      out.write("                <i class=\"ti-control-record text-primary me-2\"></i>\r\n");
      out.write("                <span>Feb 7 2018</span>\r\n");
      out.write("              </div>\r\n");
      out.write("              <p class=\"mb-0 font-weight-thin text-gray\">Meeting with Alisa</p>\r\n");
      out.write("              <p class=\"text-gray mb-0 \">Call Sarah Graves</p>\r\n");
      out.write("            </div>\r\n");
      out.write("          <div class=\"ps__rail-x\" style=\"left: 0px; bottom: 0px;\"><div class=\"ps__thumb-x\" tabindex=\"0\" style=\"left: 0px; width: 0px;\"></div></div><div class=\"ps__rail-y\" style=\"top: 0px; right: 0px;\"><div class=\"ps__thumb-y\" tabindex=\"0\" style=\"top: 0px; height: 0px;\"></div></div></div>\r\n");
      out.write("          <!-- To do section tab ends -->\r\n");
      out.write("          <div class=\"tab-pane fade\" id=\"chats-section\" role=\"tabpanel\" aria-labelledby=\"chats-section\">\r\n");
      out.write("            <div class=\"d-flex align-items-center justify-content-between border-bottom\">\r\n");
      out.write("              <p class=\"settings-heading border-top-0 mb-3 pl-3 pt-0 border-bottom-0 pb-0\">Friends</p>\r\n");
      out.write("              <small class=\"settings-heading border-top-0 mb-3 pt-0 border-bottom-0 pb-0 pr-3 fw-normal\">See All</small>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"chat-list\">\r\n");
      out.write("              <li class=\"list active\">\r\n");
      out.write("                <div class=\"profile\"><img src=\"images/faces/face1.jpg\" alt=\"image\"><span class=\"online\"></span></div>\r\n");
      out.write("                <div class=\"info\">\r\n");
      out.write("                  <p>Thomas Douglas</p>\r\n");
      out.write("                  <p>Available</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <small class=\"text-muted my-auto\">19 min</small>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"list\">\r\n");
      out.write("                <div class=\"profile\"><img src=\"images/faces/face2.jpg\" alt=\"image\"><span class=\"offline\"></span></div>\r\n");
      out.write("                <div class=\"info\">\r\n");
      out.write("                  <div class=\"wrapper d-flex\">\r\n");
      out.write("                    <p>Catherine</p>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <p>Away</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"badge badge-success badge-pill my-auto mx-2\">4</div>\r\n");
      out.write("                <small class=\"text-muted my-auto\">23 min</small>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"list\">\r\n");
      out.write("                <div class=\"profile\"><img src=\"images/faces/face3.jpg\" alt=\"image\"><span class=\"online\"></span></div>\r\n");
      out.write("                <div class=\"info\">\r\n");
      out.write("                  <p>Daniel Russell</p>\r\n");
      out.write("                  <p>Available</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <small class=\"text-muted my-auto\">14 min</small>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"list\">\r\n");
      out.write("                <div class=\"profile\"><img src=\"images/faces/face4.jpg\" alt=\"image\"><span class=\"offline\"></span></div>\r\n");
      out.write("                <div class=\"info\">\r\n");
      out.write("                  <p>James Richardson</p>\r\n");
      out.write("                  <p>Away</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <small class=\"text-muted my-auto\">2 min</small>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"list\">\r\n");
      out.write("                <div class=\"profile\"><img src=\"images/faces/face5.jpg\" alt=\"image\"><span class=\"online\"></span></div>\r\n");
      out.write("                <div class=\"info\">\r\n");
      out.write("                  <p>Madeline Kennedy</p>\r\n");
      out.write("                  <p>Available</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <small class=\"text-muted my-auto\">5 min</small>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"list\">\r\n");
      out.write("                <div class=\"profile\"><img src=\"images/faces/face6.jpg\" alt=\"image\"><span class=\"online\"></span></div>\r\n");
      out.write("                <div class=\"info\">\r\n");
      out.write("                  <p>Sarah Graves</p>\r\n");
      out.write("                  <p>Available</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <small class=\"text-muted my-auto\">47 min</small>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- chat tab ends -->\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("<nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\r\n");
      out.write("        <ul class=\"nav\">\r\n");
      out.write("\r\n");
      out.write("           <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"\">\r\n");
      out.write("              <i class=\"menu-icon mdi mdi-floor-plan\"></i>\r\n");
      out.write("              <span class=\"menu-title\">Chambres</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          \r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"\">\r\n");
      out.write("              <i class=\"menu-icon mdi mdi-account-circle-outline\"></i>\r\n");
      out.write("              <span class=\"menu-title\">Utilisateurs</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          \r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"\">\r\n");
      out.write("              <i class=\"menu-icon mdi mdi-file-document\"></i>\r\n");
      out.write("              <span class=\"menu-title\">Reservations</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </nav>");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"main-panel\">\n");
      out.write("        <div class=\"content-wrapper\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 grid-margin stretch-card\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <h4 class=\"card-title\">Gestion Utilisateurs</h4>\n");
      out.write("               \n");
      out.write("                  <div class=\"table-responsive\">\n");
      out.write("                    <table class=\"table\">\n");
      out.write("                      <thead>\n");
      out.write("                        <tr>\n");
      out.write("                          <th>Nom</th>\n");
      out.write("                          <th>Prenom</th>\n");
      out.write("                          <th>Email</th>\n");
      out.write("                          <th>Status</th>\n");
      out.write("                          <th>Action</th>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                      </thead>\n");
      out.write("                      <tbody>\n");
      out.write("                          ");
   UserServices us = new UserServices();
                                for(User u : us.findAll() )
                                    
                                {
                                    
                                
                          
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                          <td>");
      out.print( u.getPrenom() );
      out.write("</td>\n");
      out.write("                          <td>");
      out.print( u.getNom());
      out.write("</td>\n");
      out.write("                          <td>");
      out.print( u.getEmail());
      out.write("</td>\n");
      out.write("                          \n");
      out.write("                          \n");
      out.write("                          <td>\n");
      out.write("                              ");

                              if ( u.getEtat()==0)
                              {
                              
      out.write("\n");
      out.write("                              \n");
      out.write("                              \n");
      out.write("                              <label class=\"badge badge-warning\">Pending</label></td>\n");
      out.write("                          ");

                              }
                              else if(u.getEtat()==1){
                                      
                                   
                          
      out.write("\n");
      out.write("                                                        <label class=\"badge badge-success\">Accepted.</label></td>\n");
      out.write("                      ");

                              }
                              else if(u.getEtat()==2){
                                      
                                   
                          
      out.write("\n");
      out.write("\n");
      out.write("                    <label class=\"badge badge-danger\">Refuser.</label></td>\n");
      out.write("    \n");
      out.write("      ");

                              }
                                      
                                   
                          
      out.write("\n");
      out.write("\n");
      out.write("                          <td>\n");
      out.write("                                ");

                              if ( u.getEtat()==0)
                              {
                              
      out.write("\n");
      out.write("                              \n");
      out.write("                              \n");
      out.write("                                 <form style=\" display: inline;\" action=\"UserServlet\" method=\"post\">\n");
      out.write("\n");
      out.write("                                  <input type=\"text\" value=\"acc\" hidden=\"\" name=\"op\" />\n");
      out.write("\n");
      out.write("                                  <input type=\"text\" value=\"");
      out.print( u.getId() );
      out.write("\" hidden=\"\" name=\"id\" />\n");
      out.write("                                  \n");
      out.write("\n");
      out.write("                                  <button class=\"btn btn-sm btn-success\" type=\"submit\">Accepter</button>\n");
      out.write("\n");
      out.write("                              </form>\n");
      out.write("\n");
      out.write("                              <form style=\" display: inline;\" action=\"UserServlet\" method=\"post\">\n");
      out.write("\n");
      out.write("                                  <input type=\"text\" value=\"ref\" hidden=\"\" name=\"op\" />\n");
      out.write("                                  <input type=\"text\" value=\"");
      out.print( u.getId() );
      out.write("\" hidden=\"\" name=\"id\" />\n");
      out.write("\n");
      out.write("                                  <button class=\"btn btn-sm btn-danger\" type=\"submit\">Refuser</button>\n");
      out.write("\n");
      out.write("                              </form>\n");
      out.write("\n");
      out.write("                          ");

                              
                              }
                                   
                          
      out.write("\n");
      out.write("                          <form style=\" display: inline;\" action=\"UserServlet\" method=\"post\">\n");
      out.write("                              <input type=\"text\" value=\"sup\" hidden=\"\" name=\"op\" />\n");
      out.write("                              <input type=\"text\" value=\"");
      out.print( u.getId() );
      out.write("\" hidden=\"\" name=\"id\" />\n");
      out.write("                              <button class=\"btn btn-sm btn-primary\" type=\"submit\">Supprimer</button>\n");
      out.write("                               \n");
      out.write("                          </form>\n");
      out.write("\n");
      out.write("                          </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                     ");
 
                                
                                }
                     
      out.write("\n");
      out.write("                      </tbody>\n");
      out.write("                    </table>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\t");
      out.write("      <!-- partial:partials/_footer.html -->\r\n");
      out.write("        <footer class=\"footer\">\r\n");
      out.write("          <div class=\"d-sm-flex justify-content-center justify-content-sm-between\">\r\n");
      out.write("            <span class=\"text-muted text-center text-sm-left d-block d-sm-inline-block\">Premium <a href=\"https://www.bootstrapdash.com/\" target=\"_blank\">Bootstrap admin template</a> from BootstrapDash.</span>\r\n");
      out.write("            <span class=\"float-none float-sm-right d-block mt-1 mt-sm-0 text-center\">Copyright © 2021. All rights reserved.</span>\r\n");
      out.write("          </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- partial -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- main-panel ends -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- page-body-wrapper ends -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- container-scroller -->\r\n");
      out.write("\r\n");
      out.write("  <!-- plugins:js -->\r\n");
      out.write("  <script src=\"resources/vendors/js/vendor.bundle.base.js\"></script>\r\n");
      out.write("  <!-- endinject -->\r\n");
      out.write("  <!-- Plugin js for this page -->\r\n");
      out.write("  <script src=\"resources/vendors/chart.js/Chart.min.js\"></script>\r\n");
      out.write("  <script src=\"resources/vendors/bootstrap-datepicker/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("  <script src=\"resources/vendors/progressbar.js/progressbar.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- End plugin js for this page -->\r\n");
      out.write("  <!-- inject:js -->\r\n");
      out.write("  <script src=\"resources/js/off-canvas.js\"></script>\r\n");
      out.write("  <script src=\"resources/js/hoverable-collapse.js\"></script>\r\n");
      out.write("  <script src=\"resources/js/template.js\"></script>\r\n");
      out.write("  <script src=\"resources/js/settings.js\"></script>\r\n");
      out.write("  <script src=\"resources/js/todolist.js\"></script>\r\n");
      out.write("  <!-- endinject -->\r\n");
      out.write("  <!-- Custom js for this page-->\r\n");
      out.write("  <script src=\"resources/js/dashboard.js\"></script>\r\n");
      out.write("  <script src=\"resources/js/Chart.roundedBarCharts.js\"></script>\r\n");
      out.write("  <!-- End custom js for this page-->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("    </div>");
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
