package AASMain;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo {
	public static void main(String[] args)
	{
		SessionFactory sessionf=new Configuration().configure().buildSessionFactory();
		Session session = sessionf.openSession();
		session.beginTransaction();
		User user=new User();
		user.setCity("Ahmedabad");
		user.setName("Komal");
		user.setEmail("kmoza17@gmail.com");
		user.setPwd("8144");
		user.setID(1);
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}





