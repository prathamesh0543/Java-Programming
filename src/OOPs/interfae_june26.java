package OOPs;

interface one11
{
	
		//abstract + concrete
		void get();
		
		//concrete-> implemented
		default void show() {
			System.out.println("show");
		}
}
class two12 implements one11
{
	public void get()
	{
		System.out.println("get");
	}
}
		public class interfae_june26 {

			public static void main(String[] args) {
				
				two12 o1=new two12();
				o1.get();
				o1.show();

	}

}
