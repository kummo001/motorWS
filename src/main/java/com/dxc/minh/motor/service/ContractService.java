package com.dxc.minh.motor.service;

import java.util.List;
import java.util.Random;

import com.dxc.minh.motor.model.Contract;
import com.dxc.minh.motor.model.ContractDetail;
import com.dxc.minh.motor.repository.ContractRepository;

public class ContractService {
	
	ContractRepository cp = new ContractRepository();
	public List<Contract> getAllContract(){
		return cp.getAllContracts();
	}
	
	public ContractDetail addContract(Contract c) {
		cp.addContract(c);
		ContractDetail cd = new ContractDetail();
		cd.setPolicyNo(createRandomPolicyNumber());
		cd.setCoverNote(c.getCoverNote());
		cd.setAnnualPremium((c.getSumInsured()*c.getRate())/100);
		cd.setPostedPremium(2456.3);
		cd.setStatus("S");
		cd.setError("");
		cd.setCurrency(c.getCurrency());
		cp.addContractDetail(cd);
		return cp.getlastContractDetail();
	}
	
	public String createRandomPolicyNumber() {
		int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z' , change to 57 if only want random number
        int targetStringLength = 8;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
          .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
          .limit(targetStringLength)
          .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
          .toString();

        return generatedString;
	}
}
