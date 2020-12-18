package Bankdto;

import java.io.Serializable;

public class BankDtoRequest implements Serializable {
	private int baccountNo;
	private double accountBal;
	private String Bankname;
	private String Ifsccode;
	public int getBaccountNo() {
		return baccountNo;
	}
	public void setBaccountNo(int baccountNo) {
		this.baccountNo = baccountNo;
	}
	public double getAccountBal() {
		return accountBal;
	}
	public void setAccountBal(double accountBal) {
		this.accountBal = accountBal;
	}
	public String getBankname() {
		return Bankname;
	}
	public void setBankname(String bankname) {
		Bankname = bankname;
	}
	public String getIfsccode() {
		return Ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		Ifsccode = ifsccode;
	}
	public String getPanNumber() {
		return PanNumber;
	}
	public void setPanNumber(String panNumber) {
		PanNumber = panNumber;
	}
	private String PanNumber;
	@Override
	public String toString() {
		return "BankDtoRequest [baccountNo=" + baccountNo + ", accountBal=" + accountBal + ", Bankname=" + Bankname
				+ ", Ifsccode=" + Ifsccode + ", PanNumber=" + PanNumber + "]";
	}
	
}
