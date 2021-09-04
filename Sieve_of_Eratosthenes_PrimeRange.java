class Sieve_of_Eratosthenes_PrimeRange{
	public static void main(String[] ar){
			
			findPrimeRange(20);
	}
	
	public static void findPrimeRange(int n){
			//create a boolean array from 0 to n with True as value
			
			boolean arr[] = new boolean[n+1];
			//insert true value for all the array elements
			
			for(int i = 0; i<=n; i++){
					arr[i] = true;
			}
			
			//travel from second element of array
			
			for(int p =2; p*p <=n; p++){
					if(arr[p] == true){
						for(int i = p*p; i<=n; i+=p){
							if(arr[i] == true)
								arr[i] = false;
						}
					}
			}
			
			for(int i =2; i<=n; i++){
				if(arr[i] == true)
					System.out.print("\t"+ i);
			}
	}
}


/*

public class MyClass {
 public static void main(String[] args) {
        rangePrime(50);
    }
    
    public static void rangePrime(int n){
        boolean arr[] = new boolean[n+1];
        
        for(int i = 0; i<=n; i++){
            arr[i] = true;
        }
        
        for(int p= 2; p*p <=n; p++){
            if(arr[p]== true){
                System.out.println("Test "+ (p-1) + " removed element");
                for(int i= p*p; i<=n; i+=p){
                    if(arr[i] == true){
                        arr[i] = false;
                        System.out.print("\t"+ i);
                    }
                }
            }
            System.out.println();
        }
        for(int i = 2; i<=n; i++){
            if(arr[i] == true){
                System.out.print("\t" + i);
            }
        }
    }
}

*/