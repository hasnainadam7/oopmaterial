/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06Inheritance;

/**
 *
 * @author Hasnain
 */
class AccountDetails {

    private int accNo;
    private String accHolderName;
    private String address;
    private int phoneNo;
    private int balance;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

public class Problem03MainQ {

    public static void main(String[] args) {
        AccountDetails objAccDetail = new AccountDetails();
        objAccDetail.setAccHolderName("Hasnain");
        objAccDetail.setAccNo(24);
        objAccDetail.setAddress("Lyari Agrataj");
        objAccDetail.setPhoneNo(03642);
        objAccDetail.setBalance(2155);
        
    }

}
