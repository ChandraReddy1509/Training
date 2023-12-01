package employeeMain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.employee.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session session= sf.openSession();
		Transaction transaction= session.beginTransaction();
		
		
		Employee e1=new Employee(1,"agneeeeee",2000.0);
		session.save(e1);
		session.beginTransaction().commit();
		session.close();
		sf.close();
		
		
		
	}

}
