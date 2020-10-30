import java.util.*;
public class Ushtrimi4 {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("SHKRUJE NAJ FJAL TKARIT");
		String alfa=sc.next();
		int count=0;
		int count1=0;
		while(!alfa.equals("EXIT")){
			System.out.println("SHKRUJ NAJ FJAL TKARIT PRAP");
			alfa=sc.next();
			count++;
			if(contains(alfa)){
				count1++;
			}
		}
		System.out.println("I KI SHKRU " + count + " EDHE QEKAQ E KAN PAS CSE ATY " + count1 );
		
	}
	public static boolean contains(String guxha) {
		if(guxha.contains("CSE")){
			return true;
		}
			return false;
	}	
}