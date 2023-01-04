package lab1;
import java.util.*;
public class time {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long seconds=sc.nextLong();
		long h=(seconds/3600)%24;
		seconds=seconds%3600;
		long minutes=seconds/60;
		seconds=seconds%60;
		System.out.println( "hours:  minutes: seconds");
		System.out.printf("%d : %02d: %2d",h,minutes,seconds);
		sc.close();
		
	}

}
