package sesion;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObjetoSesion {

	private static final SessionFactory sessionFactory = crearSessionFactory();
	
	private static SessionFactory crearSessionFactory() {
		
		try {
			return new Configuration().configure().buildSessionFactory();
		}catch (Throwable e) {
			System.out.println(e);
			throw new ExceptionInInitializerError(e);
		}
		
	}


	public static SessionFactory getSessionFactory() {

		return sessionFactory;
	}

}