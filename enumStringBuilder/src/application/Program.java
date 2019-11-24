package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");

		Post p1 = new Post(sdf.parse("20/11/2019 20:41:50"), "Travelling to NZ",
				"I'm going to visit this wonderful country.", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1); //toString
		
		//segundo post
		Comment c3 = new Comment("Good night!");
		Comment c4 = new Comment("See you tomorrow!");

		Post p2 = new Post(sdf.parse("20/11/2019 20:58:50"), "Good night guys",
				"May the Force be with you all.", 5);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2); //toString
	}

}
