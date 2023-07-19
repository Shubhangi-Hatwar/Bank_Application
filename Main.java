package project;

public class Main {

	public static void main(String[] args) {
		Account myacc=new Account("12334",0.0, "Shubhangi","shubh@gmail.com","1234567");
		 
		myacc.DepositMoney(100.0);
		myacc.DepositMoney(150.0);
		myacc.WithDraw(200);

	}

}
