package OOPs;

class metro{
	String metroname;
	int totalstation;
	double ticketprice;
	
	metro(){
		
		
	}
	
	
	
	metro(String name,int station,double ticket){
		
		metroname=name;
		totalstation=station;
		ticketprice=ticket;
	}
	void print() {
		System.out.println("metroname : "+metroname);
		System.out.println("totalstation : "+totalstation);
		System.out.println("ticketprice : "+ticketprice);
	}
		
}

public class june15hw {

	public static void main(String[] args) {
		
		metro me = new metro();
		me.print();
		metro me1 = new metro("pune metro",5,35.0);
		me1.print();
	}

}
