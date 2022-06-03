//Unit-3: Assignment-4
// program to create a class Customer and raise user defined Exception

import java.io.*;

class Customer {
	private String custNo;
	private String custName;
	private String category;
	
	public Customer(String cNo, String cName, String cat) {
		if(!(cNo.charAt(0) == 'C' || cNo.charAt(0) == 'c')
				|| cName.length() < 4 || (cat.equalsIgnoreCase("Platinum") || (cat.equalsIgnoreCase("Gold") || (cat.equalsIgnoreCase("Silver") ) 
		
		this.custNo = cNo;
		this.custName = cName;
		this.category = cat;
	}
	
	public String getCustNo() {
		return custNo;
	}
	public String getCustName() {
		return custName;
	}
	public String getCategory() {
		return category;
	}
	

}
public class TestCustomer {

}