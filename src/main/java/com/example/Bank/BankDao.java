package com.example.Bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankDao {
	@Autowired
	BankRepository bankRepo;
	public String insertAll(BankEntity b) {
		bankRepo.save(b);
		return "Success";
	}
	
	
	public String getIfsc(String b) {
		return  bankRepo.getIfscByBranch(b);
	
	}

}
