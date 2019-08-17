package com.cg.controllers;  

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.capstore.dao.IProductImage;
//import com.capstore.model.Address;
import com.cg.entities.Transaction;
import com.cg.entities.Product;
import com.cg.entities.Return;
//import com.cg.services.IOrderService;
//import com.capstore.service.IProductImageService;
//import com.capstore.service.IProductService;
import com.cg.services.IReturnService;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/orders")
public class ReturnGoodsController {

	
//	@Autowired
//	private IOrderService orderService;

	@Autowired
	private IReturnService returnService;
	
//	@Autowired
//	private IProductImageService productImageService;
	 
	/*@GetMapping("/myorders")
	public ResponseEntity<List<Transaction>> getAllOrders() {
		List<Transaction> orders= orderService.getAllOrders();
		
		
		
		if (orders==null) {
			new ResponseEntity("No account found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
	}*/
	
	
	@GetMapping("/myorders/{TransactionId}")
	public Return addrecordtoreturn(@PathVariable("TransactionId") int Transactionid ) {
		System.out.println(Transactionid+"printing temp");
		 Return myret=returnService.addrecordtoreturn(Transactionid);
		 return myret;		 
	}
	
	
/*	@GetMapping("/myorders/verify/{TransactionId}")
	public ResponseEntity<Return> checkstatus(@PathVariable("TransactionId") int Transactionid ) {
		System.out.println(Transactionid+"printing temp");
		 Return myret=returnService.checkstatus(Transactionid);
		
		 return new ResponseEntity<Return>(myret, HttpStatus.OK);
		 
	}
	
	/*@GetMapping("/myOrder/verify/{orderId}/refundMoney")
	public ResponseEntity<Boolean> refundMoney(@PathVariable("orderId") int orderId){
		
		boolean refundStatus = returnService.refundMoney(orderId);
		
		return new ResponseEntity<Boolean>(refundStatus, HttpStatus.OK);
	}*/
	
	
	 
		@GetMapping("/getreturngoods")
		public  List<Return> getreturngoods() {
			List<Return> orders= returnService.getreturngoods();
			
	
			return orders;
		}
		
	
		
		
		
} 
 
