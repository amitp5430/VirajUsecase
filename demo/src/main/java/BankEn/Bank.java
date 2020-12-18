package BankEn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	@GeneratedValue
	private int baccountNo;
	private double accountBal;
	private String Bankname;
	private String Ifsccode;
	private String PanNumber;
	public Bank(int baccountNo, double accountBal, String bankname, String ifsccode, String panNumber) {
		super();
		this.baccountNo = baccountNo;
		this.accountBal = accountBal;
		Bankname = bankname;
		Ifsccode = ifsccode;
		PanNumber = panNumber;
	}
	
	
	
}
