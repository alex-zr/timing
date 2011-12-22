package ua.com.al1.timing;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import ua.com.al1.timing.db.HibernateUtil;
import ua.com.al1.timing.domain.Student;

/**
 * Servlet implementation class UserList
 */
@WebServlet(urlPatterns = {"/UserList"})
public class UserList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Student student = new Student();
        student.setStudId(1L);
        student.setName("Shot");
        session.save(student);

        session.getTransaction().commit();
		out.println("UserList servlet");
	}

}
