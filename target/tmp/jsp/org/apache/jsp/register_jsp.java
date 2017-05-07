package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_optiontransferselect_selectAllLabel_rightUpLabel_rightTitle_rightDownLabel_name_multiple_list_leftUpLabel_leftTitle_leftDownLabel_label_headerValue_headerKey_emptyOption_doubleName_doubleMultiple_doubleList_doubleHeaderValue_doubleEmptyOption_addToRightLabel_addToLeftLabel_addAllToRightLabel_addAllToLeftLabel_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_combobox_value_name_maxlength_list_label_headerValue_headerKey_emptyOption_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_select_name_list_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_radio_name_list_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_file_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_doubleselect_name_list_label_doubleName_doubleList_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_token_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_updownselect_selectAllLabel_name_moveUpLabel_moveDownLabel_list_labelposition_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_reset_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_checkboxlist_name_list_labelposition_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_select_name_list_label;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textarea_value_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_checkbox_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_optgroup_listValue_listKey_list_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_password_name_label_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_submit_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_optiontransferselect_selectAllLabel_rightUpLabel_rightTitle_rightDownLabel_name_multiple_list_leftUpLabel_leftTitle_leftDownLabel_label_headerValue_headerKey_emptyOption_doubleName_doubleMultiple_doubleList_doubleHeaderValue_doubleEmptyOption_addToRightLabel_addToLeftLabel_addAllToRightLabel_addAllToLeftLabel_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_combobox_value_name_maxlength_list_label_headerValue_headerKey_emptyOption_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_select_name_list_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_radio_name_list_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_file_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_doubleselect_name_list_label_doubleName_doubleList_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_token_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_updownselect_selectAllLabel_name_moveUpLabel_moveDownLabel_list_labelposition_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_reset_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_checkboxlist_name_list_labelposition_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_select_name_list_label = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textarea_value_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_checkbox_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_optgroup_listValue_listKey_list_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_password_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_submit_value_nobody.release();
    _jspx_tagPool_s_optiontransferselect_selectAllLabel_rightUpLabel_rightTitle_rightDownLabel_name_multiple_list_leftUpLabel_leftTitle_leftDownLabel_label_headerValue_headerKey_emptyOption_doubleName_doubleMultiple_doubleList_doubleHeaderValue_doubleEmptyOption_addToRightLabel_addToLeftLabel_addAllToRightLabel_addAllToLeftLabel_nobody.release();
    _jspx_tagPool_s_combobox_value_name_maxlength_list_label_headerValue_headerKey_emptyOption_nobody.release();
    _jspx_tagPool_s_select_name_list_label_nobody.release();
    _jspx_tagPool_s_radio_name_list_label_nobody.release();
    _jspx_tagPool_s_textfield_name_label_nobody.release();
    _jspx_tagPool_s_file_name_nobody.release();
    _jspx_tagPool_s_doubleselect_name_list_label_doubleName_doubleList_nobody.release();
    _jspx_tagPool_s_token_nobody.release();
    _jspx_tagPool_s_updownselect_selectAllLabel_name_moveUpLabel_moveDownLabel_list_labelposition_label_nobody.release();
    _jspx_tagPool_s_reset_value_nobody.release();
    _jspx_tagPool_s_checkboxlist_name_list_labelposition_label_nobody.release();
    _jspx_tagPool_s_form_method_action.release();
    _jspx_tagPool_s_select_name_list_label.release();
    _jspx_tagPool_s_textarea_value_name_label_nobody.release();
    _jspx_tagPool_s_checkbox_name_label_nobody.release();
    _jspx_tagPool_s_optgroup_listValue_listKey_list_label_nobody.release();
    _jspx_tagPool_s_password_name_label_nobody.release();
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
      out.write("<title>Struts2 Demo Register</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("    <center>\r\n");
      out.write("    <h2>注册等级表</h2>\r\n");
      out.write("    ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </center>\r\n");
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

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_method_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("register");
    _jspx_th_s_form_0.setMethod("post");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_radio_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_textarea_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_checkbox_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_checkboxlist_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_combobox_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("         ");
        if (_jspx_meth_s_select_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("         ");
        if (_jspx_meth_s_doubleselect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_file_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_updownselect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_optiontransferselect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_token_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_s_reset_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_0.setName("name");
    _jspx_th_s_textfield_0.setLabel("name");
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_0);
    return false;
  }

  private boolean _jspx_meth_s_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_0 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_name_label_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_0.setPageContext(_jspx_page_context);
    _jspx_th_s_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_password_0.setName("password");
    _jspx_th_s_password_0.setLabel("password");
    int _jspx_eval_s_password_0 = _jspx_th_s_password_0.doStartTag();
    if (_jspx_th_s_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_name_label_nobody.reuse(_jspx_th_s_password_0);
      return true;
    }
    _jspx_tagPool_s_password_name_label_nobody.reuse(_jspx_th_s_password_0);
    return false;
  }

  private boolean _jspx_meth_s_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_0 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_name_list_label_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_0.setPageContext(_jspx_page_context);
    _jspx_th_s_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_select_0.setName("degree");
    _jspx_th_s_select_0.setLabel("Education");
    _jspx_th_s_select_0.setList("{'高中以下','专科','本科','研究生及以上'}");
    int _jspx_eval_s_select_0 = _jspx_th_s_select_0.doStartTag();
    if (_jspx_th_s_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_name_list_label_nobody.reuse(_jspx_th_s_select_0);
      return true;
    }
    _jspx_tagPool_s_select_name_list_label_nobody.reuse(_jspx_th_s_select_0);
    return false;
  }

  private boolean _jspx_meth_s_radio_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:radio
    org.apache.struts2.views.jsp.ui.RadioTag _jspx_th_s_radio_0 = (org.apache.struts2.views.jsp.ui.RadioTag) _jspx_tagPool_s_radio_name_list_label_nobody.get(org.apache.struts2.views.jsp.ui.RadioTag.class);
    _jspx_th_s_radio_0.setPageContext(_jspx_page_context);
    _jspx_th_s_radio_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_radio_0.setName("gender");
    _jspx_th_s_radio_0.setLabel("gender");
    _jspx_th_s_radio_0.setList("{'男','女'}");
    int _jspx_eval_s_radio_0 = _jspx_th_s_radio_0.doStartTag();
    if (_jspx_th_s_radio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_radio_name_list_label_nobody.reuse(_jspx_th_s_radio_0);
      return true;
    }
    _jspx_tagPool_s_radio_name_list_label_nobody.reuse(_jspx_th_s_radio_0);
    return false;
  }

  private boolean _jspx_meth_s_textarea_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_textarea_0 = (org.apache.struts2.views.jsp.ui.TextareaTag) _jspx_tagPool_s_textarea_value_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    _jspx_th_s_textarea_0.setPageContext(_jspx_page_context);
    _jspx_th_s_textarea_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textarea_0.setName("protocol");
    _jspx_th_s_textarea_0.setLabel("protocol");
    _jspx_th_s_textarea_0.setValue("no fuck protocol");
    int _jspx_eval_s_textarea_0 = _jspx_th_s_textarea_0.doStartTag();
    if (_jspx_th_s_textarea_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textarea_value_name_label_nobody.reuse(_jspx_th_s_textarea_0);
      return true;
    }
    _jspx_tagPool_s_textarea_value_name_label_nobody.reuse(_jspx_th_s_textarea_0);
    return false;
  }

  private boolean _jspx_meth_s_checkbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_checkbox_0 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _jspx_tagPool_s_checkbox_name_label_nobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_s_checkbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_checkbox_0.setName("agree");
    _jspx_th_s_checkbox_0.setLabel("agree with the protocol");
    int _jspx_eval_s_checkbox_0 = _jspx_th_s_checkbox_0.doStartTag();
    if (_jspx_th_s_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_checkbox_name_label_nobody.reuse(_jspx_th_s_checkbox_0);
      return true;
    }
    _jspx_tagPool_s_checkbox_name_label_nobody.reuse(_jspx_th_s_checkbox_0);
    return false;
  }

  private boolean _jspx_meth_s_checkboxlist_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkboxlist
    org.apache.struts2.views.jsp.ui.CheckboxListTag _jspx_th_s_checkboxlist_0 = (org.apache.struts2.views.jsp.ui.CheckboxListTag) _jspx_tagPool_s_checkboxlist_name_list_labelposition_label_nobody.get(org.apache.struts2.views.jsp.ui.CheckboxListTag.class);
    _jspx_th_s_checkboxlist_0.setPageContext(_jspx_page_context);
    _jspx_th_s_checkboxlist_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_checkboxlist_0.setName("activity");
    _jspx_th_s_checkboxlist_0.setLabel("你的喜欢什么运动？");
    _jspx_th_s_checkboxlist_0.setLabelposition("top");
    _jspx_th_s_checkboxlist_0.setList("{'篮球','足球','网球','羽毛球'}");
    int _jspx_eval_s_checkboxlist_0 = _jspx_th_s_checkboxlist_0.doStartTag();
    if (_jspx_th_s_checkboxlist_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_checkboxlist_name_list_labelposition_label_nobody.reuse(_jspx_th_s_checkboxlist_0);
      return true;
    }
    _jspx_tagPool_s_checkboxlist_name_list_labelposition_label_nobody.reuse(_jspx_th_s_checkboxlist_0);
    return false;
  }

  private boolean _jspx_meth_s_combobox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:combobox
    org.apache.struts2.views.jsp.ui.ComboBoxTag _jspx_th_s_combobox_0 = (org.apache.struts2.views.jsp.ui.ComboBoxTag) _jspx_tagPool_s_combobox_value_name_maxlength_list_label_headerValue_headerKey_emptyOption_nobody.get(org.apache.struts2.views.jsp.ui.ComboBoxTag.class);
    _jspx_th_s_combobox_0.setPageContext(_jspx_page_context);
    _jspx_th_s_combobox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_combobox_0.setName("music");
    _jspx_th_s_combobox_0.setLabel("你喜欢的音乐");
    _jspx_th_s_combobox_0.setMaxlength("20");
    _jspx_th_s_combobox_0.setList("{'摇滚','民谣','乡村','布鲁斯'}");
    _jspx_th_s_combobox_0.setHeaderKey("-1");
    _jspx_th_s_combobox_0.setHeaderValue("---请选择---");
    _jspx_th_s_combobox_0.setEmptyOption("false");
    _jspx_th_s_combobox_0.setValue("摇滚");
    int _jspx_eval_s_combobox_0 = _jspx_th_s_combobox_0.doStartTag();
    if (_jspx_th_s_combobox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_combobox_value_name_maxlength_list_label_headerValue_headerKey_emptyOption_nobody.reuse(_jspx_th_s_combobox_0);
      return true;
    }
    _jspx_tagPool_s_combobox_value_name_maxlength_list_label_headerValue_headerKey_emptyOption_nobody.reuse(_jspx_th_s_combobox_0);
    return false;
  }

  private boolean _jspx_meth_s_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_1 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_name_list_label.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_1.setPageContext(_jspx_page_context);
    _jspx_th_s_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_select_1.setLabel("你喜欢什么样的小说");
    _jspx_th_s_select_1.setName("book");
    _jspx_th_s_select_1.setList("{'百年孤独','血鹦鹉'}");
    int _jspx_eval_s_select_1 = _jspx_th_s_select_1.doStartTag();
    if (_jspx_eval_s_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_select_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_s_optgroup_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_select_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_s_optgroup_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_select_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("          ");
        int evalDoAfterBody = _jspx_th_s_select_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_name_list_label.reuse(_jspx_th_s_select_1);
      return true;
    }
    _jspx_tagPool_s_select_name_list_label.reuse(_jspx_th_s_select_1);
    return false;
  }

  private boolean _jspx_meth_s_optgroup_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:optgroup
    org.apache.struts2.views.jsp.ui.OptGroupTag _jspx_th_s_optgroup_0 = (org.apache.struts2.views.jsp.ui.OptGroupTag) _jspx_tagPool_s_optgroup_listValue_listKey_list_label_nobody.get(org.apache.struts2.views.jsp.ui.OptGroupTag.class);
    _jspx_th_s_optgroup_0.setPageContext(_jspx_page_context);
    _jspx_th_s_optgroup_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_select_1);
    _jspx_th_s_optgroup_0.setLabel("古龙");
    _jspx_th_s_optgroup_0.setList("#{'七种武器':'不错','陆小凤传奇':'还行'}");
    _jspx_th_s_optgroup_0.setListKey("key");
    _jspx_th_s_optgroup_0.setListValue("key");
    int _jspx_eval_s_optgroup_0 = _jspx_th_s_optgroup_0.doStartTag();
    if (_jspx_th_s_optgroup_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_optgroup_listValue_listKey_list_label_nobody.reuse(_jspx_th_s_optgroup_0);
      return true;
    }
    _jspx_tagPool_s_optgroup_listValue_listKey_list_label_nobody.reuse(_jspx_th_s_optgroup_0);
    return false;
  }

  private boolean _jspx_meth_s_optgroup_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:optgroup
    org.apache.struts2.views.jsp.ui.OptGroupTag _jspx_th_s_optgroup_1 = (org.apache.struts2.views.jsp.ui.OptGroupTag) _jspx_tagPool_s_optgroup_listValue_listKey_list_label_nobody.get(org.apache.struts2.views.jsp.ui.OptGroupTag.class);
    _jspx_th_s_optgroup_1.setPageContext(_jspx_page_context);
    _jspx_th_s_optgroup_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_select_1);
    _jspx_th_s_optgroup_1.setLabel("马尔克斯");
    _jspx_th_s_optgroup_1.setList("#{'霍乱时期的爱情':'没看懂','家长的没落':'没看过'}");
    _jspx_th_s_optgroup_1.setListKey("key");
    _jspx_th_s_optgroup_1.setListValue("key");
    int _jspx_eval_s_optgroup_1 = _jspx_th_s_optgroup_1.doStartTag();
    if (_jspx_th_s_optgroup_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_optgroup_listValue_listKey_list_label_nobody.reuse(_jspx_th_s_optgroup_1);
      return true;
    }
    _jspx_tagPool_s_optgroup_listValue_listKey_list_label_nobody.reuse(_jspx_th_s_optgroup_1);
    return false;
  }

  private boolean _jspx_meth_s_doubleselect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:doubleselect
    org.apache.struts2.views.jsp.ui.DoubleSelectTag _jspx_th_s_doubleselect_0 = (org.apache.struts2.views.jsp.ui.DoubleSelectTag) _jspx_tagPool_s_doubleselect_name_list_label_doubleName_doubleList_nobody.get(org.apache.struts2.views.jsp.ui.DoubleSelectTag.class);
    _jspx_th_s_doubleselect_0.setPageContext(_jspx_page_context);
    _jspx_th_s_doubleselect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_doubleselect_0.setLabel("选择城市");
    _jspx_th_s_doubleselect_0.setName("province");
    _jspx_th_s_doubleselect_0.setList("{'北京市','上海市'}");
    _jspx_th_s_doubleselect_0.setDoubleList("top='北京市'?{'东城区','西城区','海淀区','昭阳区'}:{'闸北区','静安区','普陀区','浦东新区'}");
    _jspx_th_s_doubleselect_0.setDoubleName("city");
    int _jspx_eval_s_doubleselect_0 = _jspx_th_s_doubleselect_0.doStartTag();
    if (_jspx_th_s_doubleselect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_doubleselect_name_list_label_doubleName_doubleList_nobody.reuse(_jspx_th_s_doubleselect_0);
      return true;
    }
    _jspx_tagPool_s_doubleselect_name_list_label_doubleName_doubleList_nobody.reuse(_jspx_th_s_doubleselect_0);
    return false;
  }

  private boolean _jspx_meth_s_file_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:file
    org.apache.struts2.views.jsp.ui.FileTag _jspx_th_s_file_0 = (org.apache.struts2.views.jsp.ui.FileTag) _jspx_tagPool_s_file_name_nobody.get(org.apache.struts2.views.jsp.ui.FileTag.class);
    _jspx_th_s_file_0.setPageContext(_jspx_page_context);
    _jspx_th_s_file_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_file_0.setName("card");
    int _jspx_eval_s_file_0 = _jspx_th_s_file_0.doStartTag();
    if (_jspx_th_s_file_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_file_name_nobody.reuse(_jspx_th_s_file_0);
      return true;
    }
    _jspx_tagPool_s_file_name_nobody.reuse(_jspx_th_s_file_0);
    return false;
  }

  private boolean _jspx_meth_s_updownselect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:updownselect
    org.apache.struts2.views.jsp.ui.UpDownSelectTag _jspx_th_s_updownselect_0 = (org.apache.struts2.views.jsp.ui.UpDownSelectTag) _jspx_tagPool_s_updownselect_selectAllLabel_name_moveUpLabel_moveDownLabel_list_labelposition_label_nobody.get(org.apache.struts2.views.jsp.ui.UpDownSelectTag.class);
    _jspx_th_s_updownselect_0.setPageContext(_jspx_page_context);
    _jspx_th_s_updownselect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_updownselect_0.setName("fruit");
    _jspx_th_s_updownselect_0.setLabel("你喜欢的水果");
    _jspx_th_s_updownselect_0.setLabelposition("left");
    _jspx_th_s_updownselect_0.setMoveUpLabel("上移");
    _jspx_th_s_updownselect_0.setMoveDownLabel("下移");
    _jspx_th_s_updownselect_0.setSelectAllLabel("全选");
    _jspx_th_s_updownselect_0.setList("{'西瓜','苹果','橘子'}");
    int _jspx_eval_s_updownselect_0 = _jspx_th_s_updownselect_0.doStartTag();
    if (_jspx_th_s_updownselect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_updownselect_selectAllLabel_name_moveUpLabel_moveDownLabel_list_labelposition_label_nobody.reuse(_jspx_th_s_updownselect_0);
      return true;
    }
    _jspx_tagPool_s_updownselect_selectAllLabel_name_moveUpLabel_moveDownLabel_list_labelposition_label_nobody.reuse(_jspx_th_s_updownselect_0);
    return false;
  }

  private boolean _jspx_meth_s_optiontransferselect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:optiontransferselect
    org.apache.struts2.views.jsp.ui.OptionTransferSelectTag _jspx_th_s_optiontransferselect_0 = (org.apache.struts2.views.jsp.ui.OptionTransferSelectTag) _jspx_tagPool_s_optiontransferselect_selectAllLabel_rightUpLabel_rightTitle_rightDownLabel_name_multiple_list_leftUpLabel_leftTitle_leftDownLabel_label_headerValue_headerKey_emptyOption_doubleName_doubleMultiple_doubleList_doubleHeaderValue_doubleEmptyOption_addToRightLabel_addToLeftLabel_addAllToRightLabel_addAllToLeftLabel_nobody.get(org.apache.struts2.views.jsp.ui.OptionTransferSelectTag.class);
    _jspx_th_s_optiontransferselect_0.setPageContext(_jspx_page_context);
    _jspx_th_s_optiontransferselect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_optiontransferselect_0.setLabel("你喜欢的歌手");
    _jspx_th_s_optiontransferselect_0.setName("manland");
    _jspx_th_s_optiontransferselect_0.setLeftTitle("大陆歌手");
    _jspx_th_s_optiontransferselect_0.setRightTitle("港台歌手");
    _jspx_th_s_optiontransferselect_0.setMultiple("true");
    _jspx_th_s_optiontransferselect_0.setList("{'许嵩','阿信','刀郎'}");
    _jspx_th_s_optiontransferselect_0.setLeftDownLabel("下移");
    _jspx_th_s_optiontransferselect_0.setLeftUpLabel("上移");
    _jspx_th_s_optiontransferselect_0.setAddToLeftLabel("左移");
    _jspx_th_s_optiontransferselect_0.setAddToRightLabel("右移");
    _jspx_th_s_optiontransferselect_0.setAddAllToLeftLabel("全部左移");
    _jspx_th_s_optiontransferselect_0.setAddAllToRightLabel("全部右移动");
    _jspx_th_s_optiontransferselect_0.setSelectAllLabel("全部选择");
    _jspx_th_s_optiontransferselect_0.setHeaderKey("mlKey");
    _jspx_th_s_optiontransferselect_0.setHeaderValue("---选择大陆明星---");
    _jspx_th_s_optiontransferselect_0.setEmptyOption("false");
    _jspx_th_s_optiontransferselect_0.setDoubleName("hk");
    _jspx_th_s_optiontransferselect_0.setDoubleList("{'周杰伦','林俊杰','陈奕迅'}");
    _jspx_th_s_optiontransferselect_0.setDoubleHeaderValue("---选择港台明星---");
    _jspx_th_s_optiontransferselect_0.setDoubleEmptyOption("false");
    _jspx_th_s_optiontransferselect_0.setDoubleMultiple("true");
    _jspx_th_s_optiontransferselect_0.setRightDownLabel("下移");
    _jspx_th_s_optiontransferselect_0.setRightUpLabel("上移");
    int _jspx_eval_s_optiontransferselect_0 = _jspx_th_s_optiontransferselect_0.doStartTag();
    if (_jspx_th_s_optiontransferselect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_optiontransferselect_selectAllLabel_rightUpLabel_rightTitle_rightDownLabel_name_multiple_list_leftUpLabel_leftTitle_leftDownLabel_label_headerValue_headerKey_emptyOption_doubleName_doubleMultiple_doubleList_doubleHeaderValue_doubleEmptyOption_addToRightLabel_addToLeftLabel_addAllToRightLabel_addAllToLeftLabel_nobody.reuse(_jspx_th_s_optiontransferselect_0);
      return true;
    }
    _jspx_tagPool_s_optiontransferselect_selectAllLabel_rightUpLabel_rightTitle_rightDownLabel_name_multiple_list_leftUpLabel_leftTitle_leftDownLabel_label_headerValue_headerKey_emptyOption_doubleName_doubleMultiple_doubleList_doubleHeaderValue_doubleEmptyOption_addToRightLabel_addToLeftLabel_addAllToRightLabel_addAllToLeftLabel_nobody.reuse(_jspx_th_s_optiontransferselect_0);
    return false;
  }

  private boolean _jspx_meth_s_token_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:token
    org.apache.struts2.views.jsp.ui.TokenTag _jspx_th_s_token_0 = (org.apache.struts2.views.jsp.ui.TokenTag) _jspx_tagPool_s_token_nobody.get(org.apache.struts2.views.jsp.ui.TokenTag.class);
    _jspx_th_s_token_0.setPageContext(_jspx_page_context);
    _jspx_th_s_token_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    int _jspx_eval_s_token_0 = _jspx_th_s_token_0.doStartTag();
    if (_jspx_th_s_token_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_token_nobody.reuse(_jspx_th_s_token_0);
      return true;
    }
    _jspx_tagPool_s_token_nobody.reuse(_jspx_th_s_token_0);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setValue("submit");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }

  private boolean _jspx_meth_s_reset_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:reset
    org.apache.struts2.views.jsp.ui.ResetTag _jspx_th_s_reset_0 = (org.apache.struts2.views.jsp.ui.ResetTag) _jspx_tagPool_s_reset_value_nobody.get(org.apache.struts2.views.jsp.ui.ResetTag.class);
    _jspx_th_s_reset_0.setPageContext(_jspx_page_context);
    _jspx_th_s_reset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_reset_0.setValue("reset");
    int _jspx_eval_s_reset_0 = _jspx_th_s_reset_0.doStartTag();
    if (_jspx_th_s_reset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_reset_value_nobody.reuse(_jspx_th_s_reset_0);
      return true;
    }
    _jspx_tagPool_s_reset_value_nobody.reuse(_jspx_th_s_reset_0);
    return false;
  }
}
