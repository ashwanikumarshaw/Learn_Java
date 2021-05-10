package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] l= {-11,1,9,2,8,-2,9,6};
		int n =l.length;
		for(int i=0; i < n-1; i++){
			boolean c=true;
			for(int j=1; j < (n-1-i); j++){
			if(l[j-1] > l[j]){
					int temp=l[j];
					l[j]=l[j-1];
					l[j-1]=temp;
					c=false;
				}
			}
			if(c)
				break;
		}
		
		for(int item:l) 
			System.out.println(item);
			

	}

}
