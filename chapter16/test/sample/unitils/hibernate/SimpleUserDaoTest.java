package sample.unitils.hibernate;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.unitils.orm.hibernate.HibernateUnitils;
import com.baobaotao.dao.hibernate.WithoutSpringUserDaoImpl;

public class SimpleUserDaoTest extends BaseDaoTest {
	private WithoutSpringUserDaoImpl userDao;
	@Before
	public void init(){
	    userDao = new WithoutSpringUserDaoImpl();
		userDao.setSessionFactory(sessionFactory);
	}
	//Hibernate”≥…‰≤‚ ‘
	@Test
    public void testMappingToDatabase() {
        HibernateUnitils.assertMappingWithDatabaseConsistent();
    }
	//
	@Test
	public void testUserDao(){
		assertNotNull(userDao);
		assertNotNull(userDao.findUserByUserName("john123"));
		assertEquals("john123", userDao.findUserByUserName("john123").getUserName());
	}
	
	
}
