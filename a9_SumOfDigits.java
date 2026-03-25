class answer{
    public int sum(int a){
        int sum=0;
        
        while(a>0){
            sum=sum+a%10;
            a=a/10;
        }
        return sum;
    }
}

public class a9_SumOfDigits {
    
    public static void main(String[] args) {
        
        answer ans =new answer();
        System.out.println(ans.sum(2428));
        
    }
    
}