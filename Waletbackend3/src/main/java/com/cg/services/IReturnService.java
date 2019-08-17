package com.cg.services;

import java.util.List;

import com.cg.entities.Return;

public interface IReturnService {
	
	public List<Return> getAllReturnDetails();
	
	public Return addrecordtoreturn(int temp);
	
//	public Return checkstatus(int orderid);
	

	

	public List<Return> getreturngoods();

}
