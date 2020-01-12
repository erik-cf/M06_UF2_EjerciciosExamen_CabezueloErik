package ejercicioVuelos;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateManager {
	private static Session session = HibernateUtil.getSessionFactory().openSession();
	
	public static <T> void saveInstance(Object o) {
		Transaction trx = session.beginTransaction();
		session.save(o);
		trx.commit();
	}
}
