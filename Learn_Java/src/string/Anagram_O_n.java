package string;

public class Anagram_O_n {

	public static void main(String[] args) {
		//O(n)
		String s1="ashu";
		String s2="Hsau";

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
		boolean isAna=true;
		int[] a=new int[256];
		//int[] b=new int[256];
		
		for(char s:s1.toCharArray()){
			int index=(int) s;
			a[index]++;
		}
		for(char s:s2.toCharArray()){
			int index=(int) s;
			a[index]--;
			//b[index]++;
		}
		
		
//		for(int i=0;i<256;i++)
//			if(a[i]!=b[i])
//				isAna=false;
		
		for(int i=0;i<256;i++)
			if(a[i]!=0)
				isAna=false;
		
		if(isAna)
			System.out.println("Anagram");
		else
			
			System.out.println("NOT Anagram");
		
	}

}
