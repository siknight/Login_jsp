package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.StringUtils;

import dao.StudentDao;

/**
 * Servlet implementation class registerServlet
 */
@WebServlet("/register.do")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		//1. 获取客户端提交的信息
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");		
		System.out.println("正在注册,username="+userName+"password="+password+",sex="+sex);
		int i = new StudentDao().register(userName, password, sex);
		if(StringUtils.isNullOrEmpty(userName)||StringUtils.isNullOrEmpty(password)) {
			request.getSession().setAttribute("username_r", "<span style='color:red'>注册失败,用户名或密码为空</span>");
			//2. 重定向
			response.sendRedirect("index.jsp");
		}
		
		if(i>0) {
			System.out.println("注册成功");
			request.getSession().setAttribute("username_r", "恭喜<span style='color:red'>"+userName+"</span>注册成功");
			//2. 重定向
			response.sendRedirect("index.jsp");
		}else {
			request.getSession().setAttribute("username_r", "<span style='color:red'>注册失败</span>");
			//2. 重定向
			response.sendRedirect("index.jsp");
		}
	}

}
