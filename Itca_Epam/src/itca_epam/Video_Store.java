package itca_epam;
import java.util.*;
public class Video_Store {
	
	ArrayList<Video> store=new ArrayList<Video>(); 
	public void addVideo(String name) {
		store.add(new Video(name));
	}
	public void doCheckout(String name) {
		boolean flag = false;
		for(int i=0;i<store.size();i++) {
			if((store.get(i).videoName).equals(name)) {
				flag=true;
				//store.get(i).checkout=true;
				store.get(i).doCheckout();
		System.out.println("Video \" "+name+"\" checked out successfully");
			}
		}
		if(flag==false)
			System.out.println("Video \" "+name+"\" couldn't be found");
	}
	public void doReturn(String name) {
		for(int i=0;i<store.size();i++)
		{
			if((store.get(i).videoName).equals(name)){
				if(store.get(i).getCheckout()==true) {
				store.get(i).checkout=false;
				System.out.println("Video \""+name+"\" returned successfully");
				}
				else {
					System.out.println("Video \" "+name+"\" couldn't be returned");
				}
					
			}
		}
		
		
	}
	public void recieveRating(String name, int rating) {
		for(int i=0;i<store.size();i++)
		{
			if((store.get(i).videoName).equals(name)){
				store.get(i).rating=rating;
			}
		}
	}
	public void listInventory() {
		System.out.println("-----------------------------------------------------");
		System.out.println("Video Name\t|   Checkout status\t|   Rating   ");
		System.out.println("-----------------------------------------------------");
		for(int i=0;i<store.size();i++) {
			System.out.println(store.get(i).getName()+"\t\t|"+store.get(i).getCheckout() +"\t\t\t|"+store.get(i).getRating());
		}
	}

}
