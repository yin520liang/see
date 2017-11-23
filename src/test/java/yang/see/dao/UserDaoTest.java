/**
 * 
 */
package yang.see.dao;

import javax.servlet.RequestDispatcher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;

import junit.framework.TestCase;
import yang.see.entity.User;

/**
 * @title
 * @description
 * @author lvzhaoyang
 * @date 2017年11月2日下午6:07:39
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:application-context.xml" })
public class UserDaoTest extends TestCase {
	@Autowired
	private UserDao userDao;

	/**
	 * Test method for
	 * {@link yang.see.dao.UserDao#getByUsername(java.lang.String)}.
	 */
	@Test
	public void testGetByUsername() {
		User u = userDao.getByUsername("test");
		System.out.println((u == null) ? "null" : u.toString());
	}
	
	
	public void aaa() {
		ContextLoaderListener cll;
		RequestDispatcher rd;
		
		DispatcherServlet ds;
		
	}

}
