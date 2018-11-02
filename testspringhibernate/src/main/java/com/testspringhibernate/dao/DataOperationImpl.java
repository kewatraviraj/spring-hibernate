/**
 * 
 */
package com.testspringhibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.testspringhibernate.model.Datadetails;

/**
 * @author Dell
 *
 */
@Repository
public class DataOperationImpl implements DataOperation {
	
	 @Autowired
	  private SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see com.testspringhibernate.dao.DataOperation#persistdata(com.testspringhibernate.model.Displaydata)
	 */
	public void persistdata(Datadetails data) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(data);
	}

	/* (non-Javadoc)
	 * @see com.testspringhibernate.dao.DataOperation#listdetails()
	 */
	@Override
	public List<Datadetails> listdetails() {
		// TODO Auto-generated method stub
	      return sessionFactory.getCurrentSession().createQuery("from shmdata").getResultList();
	}

}
