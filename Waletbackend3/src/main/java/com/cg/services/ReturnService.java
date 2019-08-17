package com.cg.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.cg.daos.IReturnDao;
import com.cg.daos.TransactionDAO;
import com.cg.entities.Transaction;
import com.cg.entities.Return;

@Service("returnService")
public class ReturnService implements IReturnService {

	@Autowired
	public IReturnDao returnDao;
	@Autowired
	TransactionDAO transactdao;

	@Override
	public List<Return> getAllReturnDetails() {
		return returnDao.findAll();
	}

	@Override
	public Return addrecordtoreturn(int temp) {

		Optional<Transaction> box = transactdao.findById(temp);
		if (box.isPresent()) {
			List<Return> returnlist = returnDao.findAll();
			returnlist = returnlist.stream().filter(ele -> {
				if (ele.getTransaction().getTransactionId() == temp) {
					return true;
				} else {
					return false;
				}
			}).collect(Collectors.toList());

			if (returnlist.size() > 0) {
				return null;
			} else {
				Return myreturn = new Return();
				myreturn.setTransaction(box.get());
				myreturn.setPickupDate(new Date());
				myreturn.setReturnStatus("success");
				returnDao.save(myreturn);
				return myreturn;

			}
		} else {
			return null;
		}

	}

	/*
	 * @Override public Return checkstatus(int orderid) { // TODO Auto-generated
	 * method stub
	 * 
	 * 
	 * Transaction myorder=orderDao.findById(orderid).get(); List<Return> prodreturn
	 * = returnDao.findAll(); for(Return ret:prodreturn) {
	 * if(ret.getTransaction().getTransactionId()==orderid) { return ret; } }
	 * 
	 * return null; }
	 */

	@Override
	public List<Return> getreturngoods() {
		// TODO Auto-generated method stub
		return returnDao.findAll();
	}

}
