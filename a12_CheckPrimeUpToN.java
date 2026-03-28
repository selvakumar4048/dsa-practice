class answer{
    public int prime(int a){
        int count=0;
        
        for(int i=2;i<=a;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                count+=1;
            }
            
        }
        return count;
    }
}

public class a12_CheckPrimeUpToN {
    
    public static void main(String[] args) {
        answer ans =new answer();
        System.out.println(ans.prime(23));
        
    }
    
}