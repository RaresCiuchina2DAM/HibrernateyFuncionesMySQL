package PROGRAMAS;

import hibernate.Empleados;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import hibernate.Dptos;
import sesion.ObjetoSesion;


public class clase01hibernate {

	public static void main(String[] args) {

		SessionFactory sf = ObjetoSesion.getSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Dptos dep = new Dptos();

		dep.setIdD((byte) 45);
		dep.setNom("Dptos35");


		dep.setBloque('X');
		dep.setPto((float) 100.12);
		session.save(dep);
		tx.commit();
		tx.begin();
		dep = session.load(Dptos.class, (byte) 85);

		session.delete(dep);
		System.out.println(dep.getNom());
		tx.commit();
		tx.begin();
		dep = session.get(Dptos.class, (byte) 40);

		dep.setBloque('P');
		session.update(dep);
		tx.commit();

		dep = session.get(Dptos.class, (byte) 67);

		if (dep == null) System.out.println("No existe");
		else System.out.println("Existe");

		Empleados emp =session.get(Empleados.class,(short)2);

	}

}
