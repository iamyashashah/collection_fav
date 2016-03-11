import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;



public class Collection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> books = new ArrayList<String>();
		String thing = "";
		System.out.println("Enter books you like");
		thing = sc.nextLine();
		while(thing.equals("")!= true)
		{
			books.add(thing);
			System.out.println("Enter books you like");
			thing = sc.nextLine();
		}
		Collections.sort(books);
		for(String favorites : books)
		{
			System.out.println(favorites);
		}

	}

}
