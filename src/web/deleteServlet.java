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
@WebServlet("/delete.do")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public deleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		//1. 获取客户端提交的信息
		String id = request.getParameter("id");
		int id2 = new StudentDao().deleteById(id);
		if(id2>0) {
			request.getSession().setAttribute("list", new StudentDao().listAll());
			response.sendRedirect("success.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//提交的数据有可能有中文， 怎么处理。
				
				
				
				
	}

}
