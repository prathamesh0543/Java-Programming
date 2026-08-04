package OOPs;

class bank{
	String accountholdername;
	long accountnumber;
	double Bbalance;
	
	bank(){
		accountholdername="prathamesh";
		accountnumber=12345;
		Bbalance=14000.00;
		
		
	}
	
	bank(String name,long acnum,double balance){
		accountholdername=name;
		accountnumber=acnum;
		Bbalance=balance;
	}
	void print() {
		System.out.println("bank name:"+accountholdername);
		System.out.println("Ac number:"+accountnumber);
		System.out.println("Bank balance:"+Bbalance);
	}
	
}

public class june16_constructer_overloading_jm {

	public static void main(String[] args) {
		bank b=new bank();
		b.print();
		bank b1=new bank("HDFC",1234567890,14000.00);
		b1.print();
		
		
	}

}
