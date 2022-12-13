package listin;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class Main {
	   public static void main(String[] args) {
		      EntityManagerFactory emf
		      = Persistence.createEntityManagerFactory(
		         "C:\\eclipse\\WorkSpace\\objectdb\\db\\address-book.odb");
		      EntityManager em = emf.createEntityManager();
		      em.getTransaction().begin();
		      Listin b1=new Listin("Mickey Mouse",
		         "Disney");
		      Listin b2=new Listin("Donald Duck",
		         "Disney");
		      Listin b3=new Listin("Hulk",
		         "Marvel");
		      Listin b4=new Listin("Spiderman",
		         "Marvel");
		      Listin b5=new Listin("Superman",
		         "DC");
		      em.persist(b1);
		      em.persist(b2);
		      em.persist(b3);
		      em.persist(b4);
		      em.persist(b5);
		      em.getTransaction().commit();
		      TypedQuery<Listin> query
		      = em.createQuery("SELECT b FROM Listin b",
		         Listin.class);
		      List<Listin> results = query.getResultList();
		      for (Listin bb : results) {
		         System.out.println(bb);
		      }
		      em.close();
		      emf.close();
		   }
}
