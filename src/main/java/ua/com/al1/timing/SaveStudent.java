package ua.com.al1.timing;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.com.al1.timing.dao.StudentDao;
import ua.com.al1.timing.domain.Student;

//@WebServlet("/saveStudent")
public class SaveStudent extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final String USER_NAME = "userName";
	private static final String USER_SURNAME = "userName";
	private static final String PATRONYMIC = "patronymic";
	private static final String PHONE = "phone";
	private static final String EMAIL = "email";
	private static final String SKYPE = "skype";
	private static final String KEYWORDS = "keywords";
	private static final String COURCES = "cources";
	
	private StudentDao userDao;
	
	public void init() throws ServletException {
		userDao = new StudentDao();
	}
	
	protected void doGet(HttpServletRequest req,
			HttpServletResponse response) throws ServletException, IOException {
		
		Student stud = createUserByParams(req);
		userDao.save(stud);
	}

	private Student createUserByParams(HttpServletRequest req) {
		Student student = new Student();
		student.setName(req.getParameter(USER_NAME));
		student.setSurname(req.getParameter(USER_SURNAME));
		student.setPatronymic(req.getParameter(PATRONYMIC));
		student.setPhone(req.getParameter(PHONE));
		student.setEmail(req.getParameter(EMAIL));
		student.setSkype(req.getParameter(SKYPE));
		student.setKeywords(req.getParameter(KEYWORDS));
		
		String[] cources = req.getParameterValues(COURCES);
		student.setCources(Arrays.toString(cources));
		
		return student;
	}
}