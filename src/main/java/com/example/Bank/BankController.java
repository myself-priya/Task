package com.example.Bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	@Autowired
	BankService bankSer;
	
	@PostMapping(value="/insertAll")
	public String insertAll( @RequestBody BankEntity b) {
		return bankSer.insertAll(b);
	}
	

	@GetMapping(value = "/getIfsc/{b}")
	public String getIfsc(@PathVariable String b) {
		return bankSer.getIfsc(b);
	}

}
