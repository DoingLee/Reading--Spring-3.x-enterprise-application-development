package sample.unitils.hibernate;

import static org.junit.Assert.assertNotNull;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.Test;
import org.unitils.UnitilsJUnit4;
import org.unitils.orm.hibernate.annotation.HibernateSessionFactory;
import org.unitils.spring.annotation.SpringApplicationContext;

import com.baobaotao.domain.User;

@HibernateSessionFactory("hibernate.cfg.xml")
public class BaseDaoTest extends UnitilsJUnit4 {
	@HibernateSessionFactory
	public SessionFactory sessionFactory;
	
	@Test
	public void testSessionFactory(){
		assertNotNull(sessionFactory);
	}
}
