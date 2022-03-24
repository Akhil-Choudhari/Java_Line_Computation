package LineComputationProg;

import java.util.Scanner;

public class LineEqualGreaterSmaller {


public static void main(String[] args) {
	
	int ax1,ax2,ay1,ay2;
	int bx1,bx2,by1,by2;
	
	double dis1;
	double dis2;
	Scanner sc=new Scanner(System.in);	
	
	System.out.println("enter x1 point of first line");
	ax1=sc.nextInt();
	
	System.out.println("enter y1 point of first line");
	ay1=sc.nextInt();
	
	System.out.println("enter x2 point of first line ");
	ax2=sc.nextInt();
	
	System.out.println("enter y2 point of first line");
	ay2=sc.nextInt();    	
		
	System.out.println("enter x1 point of second line");
		
	bx1=sc.nextInt();
	System.out.println("enter y1 point of second line");
		
	by1=sc.nextInt();
	System.out.println("enter x2 point of second line ");
	   
	bx2=sc.nextInt();
	System.out.println("enter y2 point of second line");
	   
	by2=sc.nextInt();  
	dis1=Math.sqrt((ax2-ax1)*(ax2-ax1) + (ay2-ay1)*(ay2-ay1));
	 	    
	System.out.println("distance between,"+"("+ax1+","+ay1+"),"+"("+ax2+","+ay2+"),"+"Length of first line : "+dis1);
		
	dis2=Math.sqrt((bx2-bx1)*(bx2-bx1) + (by2-by1)*(by2-by1));
 	 	    	 	    
	System.out.println("distancebetween,"+"("+bx1+","+by1+"),"+"("+bx2+","+by2+"),"+"Length of Second line : "+dis2);
if (dis1 == dis2) {
System.out.println("Length of First line and Second line is Equal");
}
else if (dis1 < dis2) {
System.out.println("Length of First line is smaller than Second line");
}
else if(dis1 > dis2) {
System.out.println("Length of Second line is smaller than First line");}
}}