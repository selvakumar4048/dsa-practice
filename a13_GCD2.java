class answer{
    public int gcd(int a,int b){
        
        for(int i=Math.max(a,b);i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        
        return 1;
        
    }
}

public class b13_GCD {
    
    public static void main(String[] args) {
        answer ans =new answer();
        System.out.println(ans.gcd(12,18));

        
    }
    
}