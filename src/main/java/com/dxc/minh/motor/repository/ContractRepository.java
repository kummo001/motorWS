package com.dxc.minh.motor.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.dxc.minh.motor.model.Contract;
import com.dxc.minh.motor.model.ContractDetail;

public class ContractRepository{
    public List<Contract> getAllContracts() {
    	List<Contract> listContract = new ArrayList<Contract>();
        try {
            String sqlSelect = "SELECT * FROM WSContract";
            try (Connection conn = DBCPDataSource.getConnection();
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sqlSelect);) {
                Thread.sleep(1000);
                
                while(rs.next()) {
                	Contract c = new Contract();
                	c.setCoverNote(rs.getString("CoverNote"));
                	c.setInceptionDate(rs.getString("InceptionDate"));
                	c.setExpiryDate(rs.getString("ExpiryDate"));
                	c.setClientSecurityNum(rs.getString("ClientSecurityNum"));
                	c.setEngineNo(rs.getString("EngineNo"));
                	c.setChassisNo(rs.getString("ChassisNo"));
                	c.setVehicleRegisNo(rs.getString("VehicleRegisNo"));
                	c.setCurrency(rs.getString("Currency"));
                	c.setSumInsured(rs.getDouble("SumInsured"));
                	c.setRate(rs.getDouble("Rate"));
                	
                	listContract.add(c);
                }
                
            }
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        }
        return listContract;
    }
    
    public ContractDetail addContract(Contract c) {
    	ContractDetail cd = new ContractDetail();
    	try {
    		String sqlSelect = "insert into  dbo.WSContract(CoverNote,InceptionDate,ExpiryDate,ClientSecurityNum,EngineNo,ChassisNo,VehicleRegisNo,Currency,SumInsured,Rate) "
    				+"values(?,?,?,?,?,?,?,?,?,?)";
            Connection conn = DBCPDataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sqlSelect);
            stmt.setString(1, c.getCoverNote());
            stmt.setString(2, c.getInceptionDate().toString());
            stmt.setString(3, c.getExpiryDate().toString());
            stmt.setString(4, c.getClientSecurityNum());
            stmt.setString(5, c.getEngineNo());
            stmt.setString(6, c.getChassisNo());
            stmt.setString(7, c.getVehicleRegisNo());
            stmt.setString(8, c.getCurrency());
            stmt.setDouble(9, c.getSumInsured());
            stmt.setDouble(10, c.getRate());
//            cd.setPolicyOwner(c.getClientSecurityNum());	
//            cd.setCoverNote(c.getCoverNote());
//            cd.setPolicyNo("policy2");
//            cd.setAnnualPremium(20000000.0);
//            cd.setPostedPremium(30000000.0);
//            cd.setError("Wrong record test");
//            cd.setStatus("F");
//            cd.setCurrency("USD");
//            addContractDetail(cd);
            stmt.executeUpdate();  
            System.out.println("record inserted");  
            
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	return getlastContractDetail();
    }
    
    public void addContractDetail(ContractDetail cd) {
    	try {
    		String sqlSelect = "insert into  dbo.WSContractDetail(PolicyNo,CoverNote,AnnualPremium,PostedPremium,Status,Error,Currency,PolicyOwner) "
    				+"values(?,?,?,?,?,?,?,?)";
            Connection conn = DBCPDataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sqlSelect);
            stmt.setString(1, cd.getPolicyNo());
            stmt.setString(2, cd.getCoverNote());
            stmt.setDouble(3, cd.getAnnualPremium());
            stmt.setDouble(4, cd.getPostedPremium());
            stmt.setString(5, cd.getStatus());
            stmt.setString(6, cd.getError());
            stmt.setString(7, cd.getCurrency());
            stmt.setString(8, cd.getPolicyOwner());
        
            		
            stmt.executeUpdate();  
            System.out.println("Contract detail record inserted");  
            
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public ContractDetail getlastContractDetail() {
    	ContractDetail cd = new ContractDetail();
    	try {
    		Connection conn = DBCPDataSource.getConnection();
    		String sqlSelect = "SELECT * from WSContractDetail where PolicyNo =(select MAX(PolicyNo) FROM WSContractDetail)";
    		Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);  
            rs.next();
            cd.setCoverNote(rs.getString("CoverNote"));
            cd.setPolicyNo(rs.getString("PolicyNo"));
            cd.setAnnualPremium(rs.getDouble("AnnualPremium"));
            cd.setPostedPremium(rs.getDouble("PostedPremium"));
            cd.setStatus(rs.getString("Status"));
            cd.setError(rs.getString("Error"));
            cd.setCurrency(rs.getString("Currency"));
            cd.setPolicyOwner(rs.getString("PolicyOwner"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return cd;
    }
}













