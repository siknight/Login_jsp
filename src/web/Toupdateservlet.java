package web;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.StringUtils;

import bean.Student;
import dao.StudentDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/toupdate.do")
public class Toupdateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Toupdateservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		//1. 获取客户端提交的信息
		String id = request.getParameter("id");
		
		Student student = new StudentDao().findById(id);
		
		request.getSession().setAttribute("stud", student);
			//2. 重定向
		response.sendRedirect("update.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//提交的数据有可能有中文， 怎么处理。
//				request.setCharacterEncoding("UTF-8");
//				response.setContentType("text/html;charset=utf-8");
//				
//				//1. 获取客户端提交的信息
//				String userName = request.getParameter("username");
//				String password = request.getParameter("password");
//				String sex = request.getParameter("sex");
//				String id = request.getParameter("id");
//				
//				if(StringUtils.isNullOrEmpty(userName)||StringUtils.isNullOrEmpty(password)) {
//					request.getSession().setAttribute("username_r", "<span style='color:red'>修改参数不能为空</span>");
//					//2. 重定向
//					response.sendRedirect("update.jsp");
//				}
//				int flag = new StudentDao().updateById(userName, password, sex, id);
//				if(flag>0) {
//					request.getSession().setAttribute("list", new StudentDao().listAll());
//					response.sendRedirect("success.jsp");
//				}
				
				
				
	}

}
