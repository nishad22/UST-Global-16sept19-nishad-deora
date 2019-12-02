import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;

import com.ust.retailer.dao.ProductBean;

public class SetProductInfo {
public static void main(String[] args) {
	ProductBean p = new ProductBean();
	p.setPid(201);
	p.setPname("Samsung");
	p.setPquantity(1);
	p.setPrice(17000);
	
	ProductBean p2 = new ProductBean();
	p2.setPid(201);
	p.setPname("kurkure");
	
	private EntityManagerFactory fact = Persistence.createEntityManagerFactory(persistenceUnitName);
	EntityManager mang = fact.createEntityManager();
	EntityTransaction trans = mang.getTransaction();
	try {
		mang.persist(p);
		mang.persist(p2);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
}
