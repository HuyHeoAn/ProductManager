package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_002dnhap_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <title>Title</title>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Layout/_header.jsp", out, false);
      out.write("    \n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Layout/_menu.jsp", out, false);
      out.write("    \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <article class=\"col-sm-9\">\n");
      out.write("                    <!--content -->\n");
      out.write("                    <div class=\"card\" style=\"margin-top: 5px;\">\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                            NHẬP LƯƠNG THÁNG 12\n");
      out.write("                        </div>\n");
      out.write("                        <form action=\"#\">\n");
      out.write("                            <div class=\"row\" style=\"margin: 5px;\">\n");
      out.write("                                <div class=\"form-group col-sm-6\">\n");
      out.write("                                    <label for=\"\">Ma nhan vien</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Ma nhan vien\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group col-sm-6\">\n");
      out.write("                                    <label for=\"\">Ten nhan vien</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Ten nhan vien\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\" style=\"margin: 5px;\">\n");
      out.write("                                <div class=\"form-group col-sm-6\">\n");
      out.write("                                    <label for=\"\">Cau lac bo</label>\n");
      out.write("                                    <select name=\"\" id=\"\" class=\"form-control\">\n");
      out.write("                                        <option value=\"\">Da Nang</option>\n");
      out.write("                                        <option value=\"\">HCM</option>\n");
      out.write("                                        <option value=\"\">Ha Noi</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group col-sm-6\">\n");
      out.write("                                    <label for=\"\">Thuong</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Thuong\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\" style=\"margin: 5px;\">\n");
      out.write("\n");
      out.write("                                <div class=\"form-group col-sm-12\">\n");
      out.write("                                    <label for=\"\">Phu cap</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Phu cap\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\" style=\"margin: 5px;\">\n");
      out.write("\n");
      out.write("                                <div class=\"form-group col-sm-12\">\n");
      out.write("                                    <label for=\"\">Ghi chu</label>\n");
      out.write("                                    <textarea class=\"form-control\" name=\"\" id=\"\"  rows=\"4\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\" style=\"margin: 5px;\">\n");
      out.write("                                <div class=\"form-group col-sm-12\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\" style=\"font-size: 16px;\">Luu</button>\n");
      out.write("                                    <button type=\"reset\" class=\"btn btn-secondary\"  style=\"font-size: 16px;\">Huy</button>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                        <div class=\"card-footer\">\n");
      out.write("                            Vui lòng nhập thông tin cầu thủ\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--end content-->\n");
      out.write("                    <!--               \n");
      out.write("                    <!--Phan Trang -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                </article>\n");
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Layout/_aside.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Layout/footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
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
