package test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


class BankAccount{
	private String ownerName;
	private int accountNumber;
	private float balance;
	String getOwnerName() {
		return ownerName;
	}
	void setOwonerName(String OwnerName) {
		this.ownerName = OwnerName;
	}
	int getAccountNumber() {
		return accountNumber;
	}
	void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	float getBalance() {
		return balance;
	}
	void setBalance(float balance) {
		this.balance = balance;
	}
	void deposit(float depo) {
		this.balance += depo;
	}
	
	BankAccount(){
		this.ownerName = "nobody";
		this.accountNumber = 0;
		this.balance = 0;
	}
	
	BankAccount(String ownername, int accountnumber){
		this.ownerName = ownername;
		this.accountNumber = accountnumber;
	}
	
	BankAccount(String ownername, int accountnumber, float balance){
		this.ownerName = ownername;
		this.accountNumber = accountnumber;
		this.balance = balance;
	}
}
public class PrintWriteTest {
	public static void main(String[] args) {
		try {
			PrintWriter out = new PrintWriter(new FileWriter("myAccount2.txt"));
			BankAccount aBankAccount = new BankAccount("LiuWei", 2017);
			out.println(aBankAccount.getOwnerName());
			out.println(aBankAccount.getAccountNumber());
			out.println(aBankAccount.getBalance());
			out.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("Error");
		}catch(IOException e) {
			System.out.println("Error2");
		}
	}

}
