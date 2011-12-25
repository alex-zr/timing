package ua.com.al1.timing.dao;

import java.io.PrintWriter;
import java.util.List;

import org.hibernate.Session;

import ua.com.al1.timing.db.HibernateUtil;
import ua.com.al1.timing.domain.Student;

public class StudentDao {
	private Session session;
	
	public StudentDao() {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
	}
	
	public List<Student> getAll() {
		return null;
	}
	
	public void save(Student student) {
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
		
	}
}
