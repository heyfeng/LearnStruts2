package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sample_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Struts2 Demo Use Ajax  </title>\r\n");
      out.write("<script src=\"http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <center>\r\n");
      out.write("        <h1>Struts2 Demo Ajax</h1>\r\n");
      out.write("        <div>\r\n");
      out.write("            <h2>注册</h2>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"name\">姓名\r\n");
      out.write("                    <input type=\"text\" name=\"name\"/>\r\n");
      out.write("                </label>\r\n");
      out.write("                <br>\r\n");
      out.write("                <label for=\"age\">年龄\r\n");
      out.write("                    <input type=\"text\" name=\"age\"/>\r\n");
      out.write("                </label>\r\n");
      out.write("                <br>\r\n");
      out.write("                <label for=\"position\">职位\r\n");
      out.write("                    <input type=\"text\" name=\"position\"/>\r\n");
      out.write("                </label>\r\n");
      out.write("                <br>\r\n");
      out.write("                <button onclick=\"submit()\" >提交</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("            <h2>提交结果</h2>\r\n");
      out.write("            <p>姓名<span id=\"name\">暂无数据</span></p>\r\n");
      out.write("            <p>年龄<span id=\"age\">暂无数据</span></p>\r\n");
      out.write("            <p>职位<span id=\"position\">暂无数据</span></p>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </center>\r\n");
      out.write("    <script>\r\n");
      out.write("        function submit(){\r\n");
      out.write("            var name = $(\"input[name=name]\").val();\r\n");
      out.write("            var age = $(\"input[name=age]\").val();\r\n");
      out.write("            var position = $(\"input[name=position]\").val();\r\n");
      out.write("            $.ajax(\r\n");
      out.write("                {\r\n");
      out.write("                    type:\"post\",\r\n");
      out.write("                    url:\"RegisterAction\",\r\n");
      out.write("                    data:{\r\n");
      out.write("                        name:name,\r\n");
      out.write("                        age:age,\r\n");
      out.write("                        position:position\r\n");
      out.write("                    },\r\n");
      out.write("                    dataType:\"json\",\r\n");
      out.write("                    success:function(data){\r\n");
      out.write("                        var name = $(\"#name\");\r\n");
      out.write("                        var age = $(\"#age\");\r\n");
      out.write("                        var position = $(\"#position\");\r\n");
      out.write("                        name.text(data);\r\n");
      out.write("                        age.text(data);\r\n");
      out.write("                        position.text(data);\r\n");
      out.write("                    },\r\n");
      out.write("                    error:function(){\r\n");
      out.write("                        update();\r\n");
      out.write("                        alert(\"系统异常，请稍后再试\");\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            )\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        function update(data){\r\n");
      out.write("            console.log(data);\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
