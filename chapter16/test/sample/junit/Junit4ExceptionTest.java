package sample.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import com.baobaotao.domain.User;
import com.baobaotao.exception.BusException;

//“Ï≥£≤‚ ‘ 
public class Junit4ExceptionTest {
	private User user;
    @Before 
    public void init() { 
    	user = null;
    } 
    @Test(expected=NullPointerException.class) 
    public void testUser(){ 
    	assertNotNull(user.getUserName()); 
    } 
}
