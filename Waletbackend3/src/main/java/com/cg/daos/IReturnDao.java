package com.cg.daos;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entities.Return;
import com.cg.entities.Transaction;

@Repository
@Transactional
public interface IReturnDao extends JpaRepository<Return, Integer> {
	@Query("select r.transaction from Return r where r.transaction=?1")
	public Transaction checksExists(Transaction transaction);
}
