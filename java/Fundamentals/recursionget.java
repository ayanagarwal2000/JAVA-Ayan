import java.io.*; 
import java.util.*; 

import java.util.Scanner;
class recursionget {
	public static void main (String[] args){
		System.out.println(getpermu("abc"));
		
		System.out.println(getpermuboard(0,0,2,2));
		
		System.out.println(boarddiag(0,0,2,2));
		
		System.out.println(boardcount(0,0,2,2));
		
	}
	
	
	
	
	public static ArrayList<String> getpermu(String str){  //getpermu
		
		if (str.length()==0){
			ArrayList<String> bls = new ArrayList<>();
			bls.add("");
			return bls;
		
		}
		char chr= str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> rr= getpermu(ros);
		
		ArrayList<String> mr = new ArrayList<>();
		
		for (String rs :rr){
			for (int i=0;i<=rs.length();i++){
				String val= rs.substring(0,i) + chr + rs.substring(i);
				mr.add(val);
				
				
			}
		}
		
		return mr;
	}
	
	public static ArrayList<String> getpermuboard(int cc,int cr,int ec,int er){   //getpermuboard
	
		
		if (cc == ec && cr == er){
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		
		if (cc >ec || cr >er ){
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		
		ArrayList<String> mr = new ArrayList<>();
		
		ArrayList<String> rrh = getpermuboard(cc,cr + 1,ec,er);
		
		for (String rrhs : rrh){
			mr.add("H" + rrhs);
		}
		ArrayList<String> rrv = getpermuboard(cc + 1,cr,ec,er);
		
		for (String rrvs : rrv){
			mr.add("V" + rrvs);
		}
		return mr;

		}

	
	public static ArrayList<String> boarddiag(int cc,int cr,int ec,int er){   //board diagonal
		
		if (cc == ec && cr == er){
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		
		if (cc >ec || cr >er ){
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		
		ArrayList<String> mr = new ArrayList<>();
		
		ArrayList<String> rrh = boarddiag(cc,cr + 1,ec,er);
		
		for (String rrhs : rrh){
			mr.add("H" + rrhs);
		}
		ArrayList<String> rrv = boarddiag(cc + 1,cr,ec,er);
		
		for (String rrvs : rrv){
			mr.add("V" + rrvs);
		}
		ArrayList<String> rrd = boarddiag(cc + 1,cr + 1,ec,er);
		
		for (String rrds : rrd){
			mr.add("D" + rrds);
		}
		
		return mr;

		}
		
	public static int boardcount(int cc,int cr,int ec,int er){   //board count
		
		if (cc == ec && cr == er){
			
			return 1;
		}
		
		if (cc >ec || cr >er ){
			
			return 0;
		}
		
	
		
		int ch = boardcount(cc,cr + 1,ec,er);
				
		int cv = boardcount(cc + 1,cr,ec,er);
		
		int cd = boardcount(cc + 1,cr + 1,ec,er);
			
		return cv+ch+cd;

		}
}

/* interprise level which is multitear not multilyred.*/