package class_project;

public class book_information {
	public static void main(String[]args) {
		//book information
		//book_name,author_name,book_id,price,pages,mob_no,type_of_books,publication_year,available_or_not,rating;
		
		String book_name ="Wings of Fire",author_name = "A.P.J Abdul Kalam";
		int book_id = 205, pages = 250;
	    int publication_year =  2020;
	    char type_of_books ='5';
		double price = 260.00;
		long mob_no = 9022123633l;
		boolean available_or_not = true;
		float rating = 4.5f;
		
		System.out.println(book_name+"\n  "+author_name+" \n "+book_id+"  \n   "+type_of_books+" \n  "+publication_year);
		System.out.println(price+" \n "+mob_no+" \n "+available_or_not+"  \n"+rating);

		
	}

}
