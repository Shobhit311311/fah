package com.cg.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.entities.Transaction;
@Repository
public interface TransactionDAO extends JpaRepository<Transaction, Integer>{
@Query("select t from Transaction t where t.transactionId=?1")
public Transaction gettransaction(int id);
}
