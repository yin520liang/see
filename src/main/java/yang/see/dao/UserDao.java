/**
 * 
 */
package yang.see.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import yang.see.entity.User;

/**
 * @title
 * @description
 * @author lvzhaoyang
 * @date 2017年11月2日下午6:01:08
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {
	User getByUsername(String user);
}
