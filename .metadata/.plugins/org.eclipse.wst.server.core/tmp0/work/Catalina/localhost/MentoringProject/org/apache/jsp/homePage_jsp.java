/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.65
 * Generated at: 2021-05-18 06:10:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>TakeYourTime</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("    <link rel=\"shortcut icon\" sizes=\"76x76\" type=\"image/x-icon\"\n");
      out.write("        href=\"https://a0.muscache.com/airbnb/static/logotype_favicon-21cc8e6c6a2cca43f061d2dcabdf6e58.ico\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <svg viewBox=\"0 0 1000 1000\" role=\"presentation\" aria-hidden=\"true\" focusable=\"false\"\n");
      out.write("                    style=\"height: 1em; width: 1em; display: inline-block; fill: currentcolor;\">\n");
      out.write("                    <path\n");
      out.write("                        d=\"m499.3 736.7c-51-64-81-120.1-91-168.1-10-39-6-70 11-93 18-27 45-40 80-40s62 13 80 40c17 23 21 54 11 93-11 49-41 105-91 168.1zm362.2 43c-7 47-39 86-83 105-85 37-169.1-22-241.1-102 119.1-149.1 141.1-265.1 90-340.2-30-43-73-64-128.1-64-111 0-172.1 94-148.1 203.1 14 59 51 126.1 110 201.1-37 41-72 70-103 88-24 13-47 21-69 23-101 15-180.1-83-144.1-184.1 5-13 15-37 32-74l1-2c55-120.1 122.1-256.1 199.1-407.2l2-5 22-42c17-31 24-45 51-62 13-8 29-12 47-12 36 0 64 21 76 38 6 9 13 21 22 36l21 41 3 6c77 151.1 144.1 287.1 199.1 407.2l1 1 20 46 12 29c9.2 23.1 11.2 46.1 8.2 70.1zm46-90.1c-7-22-19-48-34-79v-1c-71-151.1-137.1-287.1-200.1-409.2l-4-6c-45-92-77-147.1-170.1-147.1-92 0-131.1 64-171.1 147.1l-3 6c-63 122.1-129.1 258.1-200.1 409.2v2l-21 46c-8 19-12 29-13 32-51 140.1 54 263.1 181.1 263.1 1 0 5 0 10-1h14c66-8 134.1-50 203.1-125.1 69 75 137.1 117.1 203.1 125.1h14c5 1 9 1 10 1 127.1.1 232.1-123 181.1-263.1z\">\n");
      out.write("                    </path>\n");
      out.write("\t                <h2>Take Your Time</h2>\n");
      out.write("                </svg>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"userBeMentorPage.jsp\">멘토가 되어보세요</a></li>\n");
      out.write("                    <li><a href=\"#\">도움말</a></li>\n");
      out.write("                    <li><a href=\"userSignUpPage.jsp\">회원가입</a></li>\n");
      out.write("                    <li><a href=\"userLoginPage.jsp\">로그인</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <section>\n");
      out.write("            <div class=\"search__box\">\n");
      out.write("                <div class=\"search__title\">당신의 멘토를<br /> 검색해 보세요.</div>\n");
      out.write("               \t<form action=\"\" method=\"post\">\n");
      out.write("\t                <table>\n");
      out.write("\t                    <tr>\n");
      out.write("\t                        <td colspan=\"2\" class=\"search__sub__title\">위치로 검색하기</td>\n");
      out.write("\t                    </tr>\n");
      out.write("\t                    <tr>\n");
      out.write("\t                        <td colspan=\"2\"><input class=\"search__input\" type=\"text\" placeholder=\" 모든 위치\"></td>\n");
      out.write("\t                    </tr>\n");
      out.write("\t                    <tr>\n");
      out.write("\t                        <td class=\"search__sub__title\">분야별 검색하기</td>\n");
      out.write("\t                    </tr>\n");
      out.write("\t                    <tr>\n");
      out.write("\t                        <td colspan=\"2\">\n");
      out.write("\t                            <select class=\"search__input\" >\n");
      out.write("\t                                <option>프로그래밍</option>\n");
      out.write("\t                                <option>디자인</option>\n");
      out.write("\t                                <option>경영/경제</option>\n");
      out.write("\t                                <option>예술</option>\n");
      out.write("\t                            </select>\n");
      out.write("\t                        </td>\n");
      out.write("\t                        \n");
      out.write("\t                    </tr>\n");
      out.write("\t                    <tr>\n");
      out.write("\t                        <td colspan=\"2\" class=\"search__sub__title\">이름으로 검색하기</td>\n");
      out.write("\t                    </tr>\n");
      out.write("\t                    <tr>\n");
      out.write("\t                        <td><input class=\"search__input\"  type=\"text\" /></td>\n");
      out.write("\t                    </tr>\n");
      out.write("\t                </table>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"search__button\"><button>검색</button></div>\n");
      out.write("            </div>\n");
      out.write("\t    \t\n");
      out.write("        </section>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <main>\n");
      out.write("        <section>\n");
      out.write("            <div class=\"sec__title\">\n");
      out.write("                Take Your Time 분야별 둘러보기\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card__box\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card__img1 card__img\"></div>\n");
      out.write("                    <div class=\"card__content\">프로그래밍</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card__img2 card__img\"></div>\n");
      out.write("                    <div class=\"card__content\">디자인</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card__img3 card__img\"></div>\n");
      out.write("                    <div class=\"card__content\">예술</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card__img4 card__img\"></div>\n");
      out.write("                    <div class=\"card__content\">운동</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div class=\"ad1\"></div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div class=\"sec__title\">분야별 최고의 멘토</div>\n");
      out.write("            <div class=\"choo__box\">\n");
      out.write("                <div class=\"choo_img1\"></div>\n");
      out.write("                <div class=\"choo_img2\"></div>\n");
      out.write("                <div class=\"choo_img3\"></div>\n");
      out.write("                <div class=\"choo_img4\"></div>\n");
      out.write("                <div class=\"choo_img5\"></div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div class=\"sec__title2\">Take Your Time Premium 을 만나보세요!</div>\n");
      out.write("            <div class=\"sec__content\">퀄리티와 실력이 검증된 멘토 PICK!</div>\n");
      out.write("            <div class=\"ad2\"></div>\n");
      out.write("        </section>\n");
      out.write("      <section>\n");
      out.write("            <div class=\"sec__title\">멘토 프로필</div>\n");
      out.write("\n");
      out.write("            <div class=\"home__box\">\n");
      out.write("                <div class=\"home\">\n");
      out.write("                    <div class=\"home__img1\"></div>\n");
      out.write("                    <div class=\"home__info\">\n");
      out.write("                        <div class=\"info1\">오두막 · BALIAN BEACH, BALI</div>\n");
      out.write("                        <div class=\"info2\">BALIAN TREEHOUSE w beautiful pool</div>\n");
      out.write("                        <div class=\"info3\">\n");
      out.write("                            <span class=\"star\">★★★★★</span>\n");
      out.write("                            <span class=\"count\">185</span>\n");
      out.write("                            <span class=\"type\">슈퍼호스트</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"home\">\n");
      out.write("                    <div class=\"home__img2\"></div>\n");
      out.write("                    <div class=\"home__info\">\n");
      out.write("                        <div class=\"info1\">키클라데스 주택 · 이아(OIA)</div>\n");
      out.write("                        <div class=\"info2\">Unique Architecture Cave House</div>\n");
      out.write("                        <div class=\"info3\">\n");
      out.write("                            <span class=\"star\">★★★★★</span>\n");
      out.write("                            <span class=\"count\">188</span>\n");
      out.write("                            <span class=\"type\">슈퍼호스트</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"home\">\n");
      out.write("                    <div class=\"home__img3\"></div>\n");
      out.write("                    <div class=\"home__info\">\n");
      out.write("                        <div class=\"info1\">성 · 트웬티나인 팜스(TWENTYNINE PALMS)</div>\n");
      out.write("                        <div class=\"info2\">Tile House</div>\n");
      out.write("                        <div class=\"info3\">\n");
      out.write("                            <span class=\"star\">★★★★★</span>\n");
      out.write("                            <span class=\"count\">367</span>\n");
      out.write("                            <span class=\"type\">슈퍼호스트</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"home\">\n");
      out.write("                    <div class=\"home__img4\"></div>\n");
      out.write("                    <div class=\"home__info\">\n");
      out.write("                        <div class=\"info1\">검증됨 · 케이프타운</div>\n");
      out.write("                        <div class=\"info2\">Modern, Chic Penthouse with Mountain, City & Sea Views</div>\n");
      out.write("                        <div class=\"info3\">\n");
      out.write("                            <span class=\"star\">★★★★★</span>\n");
      out.write("                            <span class=\"count\">177</span>\n");
      out.write("                            <span class=\"type\">슈퍼호스트</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"home\">\n");
      out.write("                    <div class=\"home__img5\"></div>\n");
      out.write("                    <div class=\"home__info\">\n");
      out.write("                        <div class=\"info1\">아파트 전체 · 마드리드(MADRID)</div>\n");
      out.write("                        <div class=\"info2\">솔광장에 위치한 개인 스튜디오</div>\n");
      out.write("                        <div class=\"info3\">\n");
      out.write("                            <span class=\"star\">★★★★★</span>\n");
      out.write("                            <span class=\"count\">459</span>\n");
      out.write("                            <span class=\"type\">슈퍼호스트</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"home\">\n");
      out.write("                    <div class=\"home__img6\"></div>\n");
      out.write("                    <div class=\"home__info\">\n");
      out.write("                        <div class=\"info1\">집 전체 · HUMAC</div>\n");
      out.write("                        <div class=\"info2\">Vacation house in etno-eco village Humac</div>\n");
      out.write("                        <div class=\"info3\">\n");
      out.write("                            <span class=\"star\">★★★★★</span>\n");
      out.write("                            <span class=\"count\">119</span>\n");
      out.write("                            <span class=\"type\">슈퍼호스트</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"home\">\n");
      out.write("                    <div class=\"home__img7\"></div>\n");
      out.write("                    <div class=\"home__info\">\n");
      out.write("                        <div class=\"info1\">개인실 · 마라케시</div>\n");
      out.write("                        <div class=\"info2\">The Cozy Palace</div>\n");
      out.write("                        <div class=\"info3\">\n");
      out.write("                            <span class=\"star\">★★★★★</span>\n");
      out.write("                            <span class=\"count\">559</span>\n");
      out.write("                            <span class=\"type\">슈퍼호스트</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"home\">\n");
      out.write("                    <div class=\"home__img8\"></div>\n");
      out.write("                    <div class=\"home__info\">\n");
      out.write("                        <div class=\"info1\">게스트용 별채 전체 · 로스앤젤레스</div>\n");
      out.write("                        <div class=\"info2\">Private Pool House with Amazing Views!</div>\n");
      out.write("                        <div class=\"info3\">\n");
      out.write("                            <span class=\"star\">★★★★★</span>\n");
      out.write("                            <span class=\"count\">170</span>\n");
      out.write("                            <span class=\"type\">슈퍼호스트</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section> \n");
      out.write("    </main>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
}