package com.example.Bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class BankService {
	@Autowired
	BankDao bankDao;

	public String insertAll(BankEntity b) {
		return bankDao.insertAll(b);
	}
	
public String getIfsc(String b) {
	return bankDao.getIfsc(b);
}
}
