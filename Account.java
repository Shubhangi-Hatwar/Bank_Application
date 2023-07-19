package project;

public class Account {
	
	private String Number;
	private double Balance;
	private String Name;
	private String Email;
	private String Phno;
	
	Account(String Number,double Balance,String Name,String Email,String Phno){
		this. Number=Number;
		this.Balance=Balance;
		this.Name=Name;
		this.Email=Email;
		this.Phno=Phno;
		
	}
	
	public void DepositMoney(double DepositMoney) {
		
		this.Balance+=DepositMoney;
		System.out.println("Deposit Money successfully");
	}
	 public void WithDraw(double WithdrawlMoney) {
		 
		 if(this.Balance - WithdrawlMoney < 0) {
			 System.out.println("Withdrawl unsuccessfull only " + this.Balance+ " is left");
		 }
		 else {
			 
		 this.Balance -= WithdrawlMoney;
		 System.out.println("WithDrawl successfull, Current balance is "+ this.Balance);
				 }
		 
	 }

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhno() {
		return Phno;
	}

	public void setPhno(String phno) {
		Phno = phno;
	}
	
	
	
	}
