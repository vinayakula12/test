package prac;

public class kadane {
	public static int largesum(int ar[]){
		int sofar=0;
		int maxnow=0;
		int a=ar.length;
		
		for(int i=0;i<a;i++) {
			if(sofar<maxnow) {
				sofar=maxnow;
			}
			if(maxnow<0) {
				maxnow=0;
			}
			maxnow=maxnow +ar[i];
			
		}
		return sofar;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        System.out.println("Maximum contiguous sum is " + 
        		largesum(a)); 

	}

}
