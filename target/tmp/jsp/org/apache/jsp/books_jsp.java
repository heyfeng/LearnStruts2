package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class books_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_combobox_value_name_maxlength_list_label_headerValue_headerKey_emptyOption_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_checkboxlist_name_list_labelposition_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_combobox_value_name_maxlength_listValue_listKey_list_labelposition_label_headerValue_headerKey_emptyOption_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_bean_name_id_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_combobox_value_name_maxlength_list_label_headerValue_headerKey_emptyOption_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_checkboxlist_name_list_labelposition_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_combobox_value_name_maxlength_listValue_listKey_list_labelposition_label_headerValue_headerKey_emptyOption_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_bean_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_combobox_value_name_maxlength_list_label_headerValue_headerKey_emptyOption_nobody.release();
    _jspx_tagPool_s_checkboxlist_name_list_labelposition_label_nobody.release();
    _jspx_tagPool_s_combobox_value_name_maxlength_listValue_listKey_list_labelposition_label_headerValue_headerKey_emptyOption_nobody.release();
    _jspx_tagPool_s_bean_name_id_nobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Books List</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center>\r\n");
      out.write("<h2>Struts2 Demo 复选框</h2>\r\n");
      out.write("<div>\r\n");
      out.write("    <h3>s:checkboxlist 复选框</h3>\r\n");
      out.write("    ");
      if (_jspx_meth_s_checkboxlist_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("    <h3>s:combobox </h3>\r\n");
      out.write("    ");
      if (_jspx_meth_s_combobox_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_s_bean_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_s_combobox_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_s_checkboxlist_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkboxlist
    org.apache.struts2.views.jsp.ui.CheckboxListTag _jspx_th_s_checkboxlist_0 = (org.apache.struts2.views.jsp.ui.CheckboxListTag) _jspx_tagPool_s_checkboxlist_name_list_labelposition_label_nobody.get(org.apache.struts2.views.jsp.ui.CheckboxListTag.class);
    _jspx_th_s_checkboxlist_0.setPageContext(_jspx_page_context);
    _jspx_th_s_checkboxlist_0.setParent(null);
    _jspx_th_s_checkboxlist_0.setName("bookname");
    _jspx_th_s_checkboxlist_0.setLabel("选择你喜欢的书");
    _jspx_th_s_checkboxlist_0.setLabelposition("top");
    _jspx_th_s_checkboxlist_0.setList("{'Java程序社','Jsp程序设计','J2EE程序设计'}");
    int _jspx_eval_s_checkboxlist_0 = _jspx_th_s_checkboxlist_0.doStartTag();
    if (_jspx_th_s_checkboxlist_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_checkboxlist_name_list_labelposition_label_nobody.reuse(_jspx_th_s_checkboxlist_0);
      return true;
    }
    _jspx_tagPool_s_checkboxlist_name_list_labelposition_label_nobody.reuse(_jspx_th_s_checkboxlist_0);
    return false;
  }

  private boolean _jspx_meth_s_combobox_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:combobox
    org.apache.struts2.views.jsp.ui.ComboBoxTag _jspx_th_s_combobox_0 = (org.apache.struts2.views.jsp.ui.ComboBoxTag) _jspx_tagPool_s_combobox_value_name_maxlength_list_label_headerValue_headerKey_emptyOption_nobody.get(org.apache.struts2.views.jsp.ui.ComboBoxTag.class);
    _jspx_th_s_combobox_0.setPageContext(_jspx_page_context);
    _jspx_th_s_combobox_0.setParent(null);
    _jspx_th_s_combobox_0.setName("bookName");
    _jspx_th_s_combobox_0.setLabel("请选择书");
    _jspx_th_s_combobox_0.setMaxlength("20");
    _jspx_th_s_combobox_0.setList("{'Java程序设计','JSP程序设计','J2EE企业级开发'}");
    _jspx_th_s_combobox_0.setHeaderKey("-1");
    _jspx_th_s_combobox_0.setHeaderValue("--请选择--");
    _jspx_th_s_combobox_0.setEmptyOption("true");
    _jspx_th_s_combobox_0.setValue("JSP程序设计");
    int _jspx_eval_s_combobox_0 = _jspx_th_s_combobox_0.doStartTag();
    if (_jspx_th_s_combobox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_combobox_value_name_maxlength_list_label_headerValue_headerKey_emptyOption_nobody.reuse(_jspx_th_s_combobox_0);
      return true;
    }
    _jspx_tagPool_s_combobox_value_name_maxlength_list_label_headerValue_headerKey_emptyOption_nobody.reuse(_jspx_th_s_combobox_0);
    return false;
  }

  private boolean _jspx_meth_s_bean_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:bean
    org.apache.struts2.views.jsp.BeanTag _jspx_th_s_bean_0 = (org.apache.struts2.views.jsp.BeanTag) _jspx_tagPool_s_bean_name_id_nobody.get(org.apache.struts2.views.jsp.BeanTag.class);
    _jspx_th_s_bean_0.setPageContext(_jspx_page_context);
    _jspx_th_s_bean_0.setParent(null);
    _jspx_th_s_bean_0.setName("me.caofeng.service.BookService");
    _jspx_th_s_bean_0.setId("books");
    int _jspx_eval_s_bean_0 = _jspx_th_s_bean_0.doStartTag();
    if (_jspx_th_s_bean_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_bean_name_id_nobody.reuse(_jspx_th_s_bean_0);
      return true;
    }
    _jspx_tagPool_s_bean_name_id_nobody.reuse(_jspx_th_s_bean_0);
    return false;
  }

  private boolean _jspx_meth_s_combobox_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:combobox
    org.apache.struts2.views.jsp.ui.ComboBoxTag _jspx_th_s_combobox_1 = (org.apache.struts2.views.jsp.ui.ComboBoxTag) _jspx_tagPool_s_combobox_value_name_maxlength_listValue_listKey_list_labelposition_label_headerValue_headerKey_emptyOption_nobody.get(org.apache.struts2.views.jsp.ui.ComboBoxTag.class);
    _jspx_th_s_combobox_1.setPageContext(_jspx_page_context);
    _jspx_th_s_combobox_1.setParent(null);
    _jspx_th_s_combobox_1.setName("bookAuthor");
    _jspx_th_s_combobox_1.setLabel("选择作者");
    _jspx_th_s_combobox_1.setLabelposition("top");
    _jspx_th_s_combobox_1.setMaxlength("20");
    _jspx_th_s_combobox_1.setList("#books.books");
    _jspx_th_s_combobox_1.setListKey("author");
    _jspx_th_s_combobox_1.setListValue("author");
    _jspx_th_s_combobox_1.setHeaderKey("-1");
    _jspx_th_s_combobox_1.setHeaderValue("--请选择--");
    _jspx_th_s_combobox_1.setEmptyOption("true");
    _jspx_th_s_combobox_1.setValue("JSP程序设计");
    int _jspx_eval_s_combobox_1 = _jspx_th_s_combobox_1.doStartTag();
    if (_jspx_th_s_combobox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_combobox_value_name_maxlength_listValue_listKey_list_labelposition_label_headerValue_headerKey_emptyOption_nobody.reuse(_jspx_th_s_combobox_1);
      return true;
    }
    _jspx_tagPool_s_combobox_value_name_maxlength_listValue_listKey_list_labelposition_label_headerValue_headerKey_emptyOption_nobody.reuse(_jspx_th_s_combobox_1);
    return false;
  }
}
