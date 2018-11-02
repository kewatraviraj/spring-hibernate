/**
 * 
 */
package com.testspringhibernate.dao;

import java.util.List;

import com.testspringhibernate.model.Datadetails;

/**
 * @author Dell
 *
 */
public interface DataOperation {
	void persistdata(Datadetails data);
	List<Datadetails> listdetails();
}
