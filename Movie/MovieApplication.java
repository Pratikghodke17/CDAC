package recap;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;


class Review{
	private String Moviename;
	private String director;
	private double imdb;
	private String review;
	
	Scanner s=new Scanner(System.in);
	
	void getDetails()
	{
		System.out.println("Movie name:- "+Moviename);
		System.out.println("Director name:- "+director);
		System.out.println("IMDB rating:- "+imdb);
		System.out.println("Openion about moview:- "+review);		
	}
	
	void createReview()
	{
		System.out.println("Enter a movie name");
		Moviename=s.nextLine();
		System.out.println("Enter a movie director name");
		director=s.nextLine();
		System.out.println("Enter a rating out of 10");
		imdb=s.nextInt();
		System.out.println("Enter your openion: ");
		s.nextLine();
		review=s.nextLine();
	
	}
	void show(String name)
	{
		if(Moviename.equals(name))
		{
			getDetails();
		}
	}
}

public class MovieApplication {
	static int i=0,exit=0;
	public static void main(String[] args) throws IOException,NullPointerException {
		
      Review[] review=new Review[100];
		
		Scanner s=new Scanner(System.in);
		 do
		 {
			 byte[] arr = new byte[1000];
			 FileInputStream file= new FileInputStream("C:\\Users\\prati\\Desktop\\New folder\\Movie.txt");
				file.read(arr);
				String data =new String(arr);
				System.out.println(data);
				file.close();
	            int choice= s.nextInt();
	                      
	          switch (choice)
	          {                   
	                     case 1: 
	                    	 
        			         review[i]=new Review();
        			         review[i].createReview();
        			         System.out.println("Your review is Stored Sucessfully!");
        			         System.out.println("ThankYou!");
        		         	 System.out.println();
        			         ++i;
        			         break;
	                     case 2:
	                    	 System.out.println("Enter a movie name");
	                    	 String scan=s.next();
	                    	 for(Review mov:review)
	                              {
	                    		 	if(scan == null)
	                            	  {
	                            		  break;
	                            	  }
	                            	  else
	                            	  {
	                            		  mov.show(scan);
	                            	  }
	                              }
	                              break;
	                     case 3: exit=1;
	                     	break;
	                      default:
	                    	  System.out.println("Please enter valid Number");
	              
	          }
		
		 }while(exit!=1);
		 s.close();
	}

}

