package ua.com.al1.timing.dao;

import java.io.PrintWriter;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import ua.com.al1.timing.db.HibernateUtil;
import ua.com.al1.timing.domain.Rate;
import ua.com.al1.timing.domain.Student;

public class StudentDao {
	private Session session;
	
	public StudentDao() {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
	}
	
	public void deleteById(Long id) {
		session.delete(getById(id));
	}
	
	public void save(Student student) {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
	}
	
	public void update(Student student) {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		session.update(student);
		
		session.getTransaction().commit();
	}
	
	public Student getById(Long id) {
		return (Student) session.get(Student.class, id);
	}
	
	public List<Student> getAll() {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Student.class);
		return criteria.list();
	}
	
}
