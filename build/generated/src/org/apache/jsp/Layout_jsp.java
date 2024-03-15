package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Layout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>Title</title>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("    <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Layout/_header.jsp", out, false);
      out.write("    \n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\"><span class=\"glyphicon glyphicon-home\"></span> Trang chủ</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\"><span class=\"glyphicon glyphicon-th-list\"></span> Giới thiệu</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\"><span class=\"glyphicon glyphicon-earphone\"></span> Liên hệ</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\"><span class=\"glyphicon glyphicon-envelope\"></span> Góp ý</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\"><span class=\"glyphicon glyphicon-question-sign\"></span> Hỏi đáp</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\"\n");
      out.write("                            aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-user\"></span>Tài khoản\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Đăng Nhập</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Quên mật khẩu</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Đăng xuất</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Đổi mật khẩu</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Cập nhật hồ sơ</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"navbar-nav reverser\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link active\" href=\"#\">Tiếng anh</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Tiếng việt</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <article class=\"col-sm-9\">\n");
      out.write("                <div class=\"row\" style=\"margin-top: 15px;\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img class=\"img-thumbnail\" src=\"images/m3.jpg\" style=\"width: 240px; height: 200px;\" alt=\"\">\n");
      out.write("                        <p style=\"text-align: justify; padding: 10px;\">Using color to add meaning only provides a visual indication, which will not be conveyed to users of assistive\n");
      out.write("                        technologies. <button class=\"btn btn-primary\" type=\"button\">chi tiet</button></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img class=\"img-thumbnail\" src=\"images/m4.jpg\" style=\"width: 240px; height: 200px;\" alt=\"\">\n");
      out.write("                        <p style=\"text-align: justify; padding: 10px;\">Using color to add meaning only provides a visual indication, which\n");
      out.write("                            will not be conveyed to users of assistive\n");
      out.write("                            technologies. <button class=\"btn btn-primary\" type=\"button\">chi tiet</button></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img class=\"img-thumbnail\" src=\"images/m5.jpg\" style=\"width: 240px; height: 200px;\" alt=\"\">\n");
      out.write("                        <p style=\"text-align: justify; padding: 10px;\">Using color to add meaning only provides a visual indication, which\n");
      out.write("                            will not be conveyed to users of assistive\n");
      out.write("                            technologies. <button class=\"btn btn-primary\" type=\"button\">chi tiet</button></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\" style=\"margin-top: 15px;\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img class=\"img-thumbnail\" src=\"images/1014.jpg\" style=\"width: 240px; height: 200px;\" alt=\"\">\n");
      out.write("                        <p style=\"text-align: justify; padding: 10px;\">Using color to add meaning only provides a visual indication,\n");
      out.write("                            which will not be conveyed to users of assistive\n");
      out.write("                            technologies. <button class=\"btn btn-primary\" type=\"button\">chi tiet</button></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img class=\"img-thumbnail\" src=\"images/m6.jpg\" style=\"width: 240px; height: 200px;\" alt=\"\">\n");
      out.write("                        <p style=\"text-align: justify; padding: 10px;\">Using color to add meaning only provides a visual indication,\n");
      out.write("                            which\n");
      out.write("                            will not be conveyed to users of assistive\n");
      out.write("                            technologies. <button class=\"btn btn-primary\" type=\"button\">chi tiet</button></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img class=\"img-thumbnail\" src=\"images/m7.jpg\" style=\"width: 240px; height: 200px;\" alt=\"\">\n");
      out.write("                        <p style=\"text-align: justify; padding: 10px;\">Using color to add meaning only provides a visual indication,\n");
      out.write("                            which\n");
      out.write("                            will not be conveyed to users of assistive\n");
      out.write("                            technologies. <button class=\"btn btn-primary\" type=\"button\">chi tiet</button></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <nav aria-label=\"Page navigation example\">\n");
      out.write("                    <ul class=\"pagination justify-content-center\">\n");
      out.write("                        <li class=\"page-item disabled\">\n");
      out.write("                            <a class=\"page-link\" href=\"#\" tabindex=\"-1\">Previous</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\n");
      out.write("                        <li class=\"page-item\">\n");
      out.write("                            <a class=\"page-link\" href=\"#\">Next</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </article>\n");
      out.write("\n");
      out.write("            <aside class=\"col-sm-3\">\n");
      out.write("                <div class=\"card poly-cart\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-5\">\n");
      out.write("                                <img src=\"images/shoppingcart.gif\" alt=\"\" width=\"70\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>100 item</li>\n");
      out.write("                                    <li>$56.5</li>\n");
      out.write("                                    <li><a href=\"#\">VIEW CART</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card poly-cart\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <form action=\"\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"search\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card poly-cart\" data-toggle=\"collapse\" href=\"#collapseOne\">\n");
      out.write("                    <div class=\"card-header\" style=\"cursor: pointer;\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-th-list\"></span> Chủng loại\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"list-group list-group-flush card-collapse\" id=\"collapseOne\">\n");
      out.write("                        <li class=\"list-group-item\">Text <span class=\"badge badge-secondary\">50</span></li>\n");
      out.write("                        <li class=\"list-group-item\">Text</li>\n");
      out.write("                        <li class=\"list-group-item\">Text</li>\n");
      out.write("                        <li class=\"list-group-item\">Text</li>\n");
      out.write("                        <li class=\"list-group-item\">Text</li>\n");
      out.write("                        <li class=\"list-group-item\">Text</li>\n");
      out.write("                        <li class=\"list-group-item\">Text</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </aside>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"card text-center\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Fpoly Da Nang ShopMall</h5>\n");
      out.write("                    <p class=\"card-text\">Copy right by Namnv</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </div>\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
