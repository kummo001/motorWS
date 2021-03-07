package com.dxc.minh.motor.resources;

import java.util.List;

import com.dxc.minh.motor.model.Contract;
import com.dxc.minh.motor.model.ContractDetail;
import com.dxc.minh.motor.service.ContractService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/contracts")
public class MotorResources {
	
	ContractService contractService = new ContractService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contract> getContracts(){
		return contractService.getAllContract();
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ContractDetail addContract(Contract c) {	
		return contractService.addContract(c);
	}
}
