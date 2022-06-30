package armstrong;

public class Armstrong {
	
	
	
	public void calcularAmstrong(int numA, int numB) {
        int num =0;
        int total =0;
        for( int i = numA+1; i<numB; i++) {
        	total=0;
        	
        	String numeroValue = String.valueOf(i);
        	char[] vector = numeroValue.toCharArray();

        	for(int j = 0; j < vector.length; j++) {
        		 num = Character.getNumericValue(vector[j]);    

        		 if(vector.length<4) {
        			 total =total+( num*num*num); 
        		 }else if(vector.length<5) {
        			 total =total+( num*num*num*num); 
        		 }else if(vector.length<6) {
        			 total =total+( num*num*num*num*num);
        		 }else if(vector.length<7) {
        			 total =total+( num*num*num*num*num*num);
        		 }else if(vector.length<8) {
        			 total =total+( num*num*num*num*num*num*num);
        		 }    
        		 
            }
  
        	if(i==total) {
        		System.out.println("EL numero "+i+" SI es un numero Armstrong");
        	}else {
        		System.out.println("EL numero "+i+" NO es un numero Armstrong");
        	}
        	 
        	
        }
	}

}
