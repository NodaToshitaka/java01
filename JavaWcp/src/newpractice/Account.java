package newpractice;

public class Account {
	String accountNumber;
	int balance;
	
	public String toString() {
		return "\\" + this.balance + "(口座番号：" + this.accountNumber + ")";
	}
	
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if (o instanceof Account) {
			Account a = (Account)o;
			String ans1 = this.accountNumber.trim();
			String ans2 = a.accountNumber.trim();
			if(this.accountNumber.equals(a.accountNumber)) {
				return true;
			}
			if(ans1.equals(ans2)) {
				return true;
			}
		}
		return false;
	}

}
