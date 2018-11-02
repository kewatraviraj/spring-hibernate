/**
 * 
 */
package com.testspringhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testspringhibernate.dao.DataOperation;
import com.testspringhibernate.model.Datadetails;

/**
 * @author Dell
 *
 */
@Service
public class DatadetailsOperationService {
	
	@Autowired
	DataOperation dataoperation;
	
	@Transactional
	public void savedata(Datadetails data) {
		dataoperation.persistdata(data);
	}
	
	@Transactional
    public List<Datadetails> listDeatails() {
      return dataoperation.listdetails();
    }
}
