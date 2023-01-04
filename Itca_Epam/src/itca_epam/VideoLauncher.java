package itca_epam;
import java.io.*;
public class VideoLauncher {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Video_Store vs=new Video_Store();
        boolean flag=true;
        do {
        	System.out.println("***********\nMAIN MENU \n***********");
        	System.out.println("1. Add Videos: ");
        	System.out.println("2. Check Out Video: ");
        	System.out.println("3. Return Video: ");
        	System.out.println("4. Recieve Rating : ");
        	System.out.println("5. List Inventory : ");
        	System.out.println("6. Exit");
        	System.out.println("Enter your choice (1..6) : ");
        	int n=Integer.parseInt(br.readLine());
        	
        	String name=new String();
        	switch(n) {
        	case 1: System.out.println("Enter the name of the video you want to add : ");
        	        name=br.readLine();
        		    vs.addVideo(name);break;
        	case 2: System.out.println("Enter the name of the video you want to checkout : ");
	                name=br.readLine(); 
	                vs.doCheckout(name);
	                break;
        	case 3: System.out.println("Enter the name of the video you want to return : ");
                    name=br.readLine(); 
                    vs.doReturn(name);
                    break;
        	case 4: System.out.println("Enter the video name and its rating : ");
        	        name=br.readLine();
        	        int rating =Integer.parseInt(br.readLine());
        	        vs.recieveRating(name, rating);
        	        break;
        	case 5: vs.listInventory();break;
        	case 6: flag=false;
        	}
        }while(flag);
	}

}
