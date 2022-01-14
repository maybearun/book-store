package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!--Header code start-->\n");
      out.write("        <header class=\"text-gray-600 body-font\">\n");
      out.write("            <div class=\"container mx-auto flex flex-wrap p-5 flex-col md:flex-row items-center\">\n");
      out.write("                <a class=\"flex title-font font-medium items-center text-gray-900 mb-4 md:mb-0\">\n");
      out.write("                    <span class=\"material-icons\" fill=\"currentColor\" stroke=\"currentColor\">\n");
      out.write("                        book\n");
      out.write("                    </span>\n");
      out.write("                    <span class=\"ml-3 text-xl\">BestBook</span>\n");
      out.write("                </a>\n");
      out.write("                <nav class=\"md:ml-auto md:mr-auto flex flex-wrap items-center text-base justify-center\">\n");
      out.write("                    <a href=\"Home.jsp\"class=\"mr-5 hover:text-gray-900\">Home</a>\n");
      out.write("                    <a href=\"AboutUs.jsp\"class=\"mr-5 hover:text-gray-900\">About us</a>\n");
      out.write("                    <a href=\"Contact.jsp\"lass=\"mr-5 hover:text-gray-900\">Contact us</a>\n");
      out.write("                </nav>\n");
      out.write("                <button class=\"inline-flex items-center bg-gray-100 border-0 py-1 px-3 focus:outline-none hover:bg-gray-200 rounded text-base mt-4 md:mt-0\"><a href=\"Login.jsp\">Login</a>\n");
      out.write("                    <svg fill=\"none\" stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" class=\"w-4 h-4 ml-1\" viewBox=\"0 0 24 24\">\n");
      out.write("                    <path d=\"M5 12h14M12 5l7 7-7 7\"></path>\n");
      out.write("                    </svg>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!--Header code end-->\n");
      out.write("\n");
      out.write("        <!-- main body code start -->\n");
      out.write("        <section class=\"text-gray-600 body-font\">\n");
      out.write("            <div class=\"container px-5 py-24 mx-auto flex flex-wrap items-center\">\n");
      out.write("                <div class=\"lg:w-3/5 md:w-1/2 md:pr-16 lg:pr-0 pr-0\">\n");
      out.write("                    <h1 class=\"title-font font-medium text-3xl text-gray-900\">Login Here</h1>\n");
      out.write("                    <p class=\"leading-relaxed mt-4\">Login here and Avail all the benefits.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"lg:w-2/6 md:w-1/2 bg-gray-100 rounded-lg p-8 flex flex-col md:ml-auto w-full mt-10 md:mt-0\">\n");
      out.write("                    <h2 class=\"text-gray-900 text-lg font-medium title-font mb-5\">Login</h2>\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"relative mb-4\">\n");
      out.write("                            <label for=\"email\" class=\"leading-7 text-sm text-gray-600\">Email id</label>\n");
      out.write("                            <input type=\"email\" id=\"email\" name=\"email\" class=\"w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"relative mb-4\">\n");
      out.write("                            <label for=\"Password\" class=\"leading-7 text-sm text-gray-600\">Password</label>\n");
      out.write("                            <input type=\"password\" id=\"password\" name=\"password\" class=\"w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out\">\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"text-white bg-green-500 border-0 py-2 px-8 focus:outline-none hover:bg-green-600 rounded text-lg\">Button</button>\n");
      out.write("                        <p class=\"text-xs text-gray-500 mt-3\"> New here ??<a href=\"Register.jsp\">Register</a> Now!!</p>\n");
      out.write("                        ");

                            String email = request.getParameter("email");
                            session.putValue("userid", email);
                            String password = request.getParameter("password");
                            Class.forName("com.mysql.jdbc.Driver");
                            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestbook", "root", "");
                            Statement st = con.createStatement();
                            ResultSet rs = st.executeQuery("select * from user where email='" + email + "' and password='" + password + "'");
                        
      out.write("\n");
      out.write("                        <p class=\"text-xs text-gray-500 mt-3\">");

                            try {
                                rs.next();
                                if (rs.getString("password").equals(password) && rs.getString("email").equals(email)) {
                                    out.println("Welcome " + email);
                                } else {
                                    out.println("Invalid password or username.");
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            
      out.write("</p>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- main body code end -->\n");
      out.write("\n");
      out.write("        <!--footer code start-->\n");
      out.write("        <footer class=\"text-gray-600 body-font\">\n");
      out.write("            <div class=\"container px-5 py-8 mx-auto flex items-center sm:flex-row flex-col\">\n");
      out.write("                <a class=\"flex title-font font-medium items-center md:justify-start justify-center text-gray-900\">\n");
      out.write("                    <span class=\"material-icons\" fill=\"currentColor\" stroke=\"currentColor\">\n");
      out.write("                        book\n");
      out.write("                    </span>\n");
      out.write("                    <span class=\"ml-3 text-xl\">BestBook</span>\n");
      out.write("                </a>\n");
      out.write("                <p class=\"text-sm text-gray-500 sm:ml-4 sm:pl-4 sm:border-l-2 sm:border-gray-200 sm:py-2 sm:mt-0 mt-4\">© 2021 BestBook\n");
      out.write("                </p>\n");
      out.write("                <span class=\"inline-flex sm:ml-auto sm:mt-0 mt-4 justify-center sm:justify-start\">\n");
      out.write("                    <a class=\"text-gray-500\">\n");
      out.write("                        <svg fill=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" class=\"w-5 h-5\" viewBox=\"0 0 24 24\">\n");
      out.write("                        <path d=\"M18 2h-3a5 5 0 00-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 011-1h3z\"></path>\n");
      out.write("                        </svg>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"ml-3 text-gray-500\">\n");
      out.write("                        <svg fill=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" class=\"w-5 h-5\" viewBox=\"0 0 24 24\">\n");
      out.write("                        <path d=\"M23 3a10.9 10.9 0 01-3.14 1.53 4.48 4.48 0 00-7.86 3v1A10.66 10.66 0 013 4s-4 9 5 13a11.64 11.64 0 01-7 2c9 5 20 0 20-11.5a4.5 4.5 0 00-.08-.83A7.72 7.72 0 0023 3z\"></path>\n");
      out.write("                        </svg>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"ml-3 text-gray-500\">\n");
      out.write("                        <svg fill=\"none\" stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" class=\"w-5 h-5\" viewBox=\"0 0 24 24\">\n");
      out.write("                        <rect width=\"20\" height=\"20\" x=\"2\" y=\"2\" rx=\"5\" ry=\"5\"></rect>\n");
      out.write("                        <path d=\"M16 11.37A4 4 0 1112.63 8 4 4 0 0116 11.37zm1.5-4.87h.01\"></path>\n");
      out.write("                        </svg>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"ml-3 text-gray-500\">\n");
      out.write("                        <svg fill=\"currentColor\" stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"0\" class=\"w-5 h-5\" viewBox=\"0 0 24 24\">\n");
      out.write("                        <path stroke=\"none\" d=\"M16 8a6 6 0 016 6v7h-4v-7a2 2 0 00-2-2 2 2 0 00-2 2v7h-4v-7a6 6 0 016-6zM2 9h4v12H2z\"></path>\n");
      out.write("                        <circle cx=\"4\" cy=\"4\" r=\"2\" stroke=\"none\"></circle>\n");
      out.write("                        </svg>\n");
      out.write("                    </a>\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!--footer code end-->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
