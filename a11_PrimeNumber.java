class answer{
    public String prime(int a){
        
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return "not prime";
            }
        }
        return "prime";
    }
}

public class a11_PrimeNumber {
    
    public static void main(String[] args) {
        answer ans =new answer();
        System.out.println(ans.prime(9));

                
    }
    
}