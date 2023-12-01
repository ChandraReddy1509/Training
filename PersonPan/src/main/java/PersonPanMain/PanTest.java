package PersonPanMain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.PersonPAn.Pan1;
import com.PersonPAn.PersonC;

public class PanTest {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session session= sf.openSession();
		//Transaction transaction= session.beginTransaction();
		
		Pan1 pp1=new Pan1("1111","2002","Aniket");
		PersonC p1=new PersonC(11,21,"aniket",pp1);
		
		session.save(p1);
		session.save(pp1);
		session.beginTransaction().commit();
		sf.close();
		
	}

}
