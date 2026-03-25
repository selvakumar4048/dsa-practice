class answer{
    public String num(int a){
        int n=0;
        int b=a;
        int sum=0;
        int c=a;
        while(a>0){
            n=n+1;
            a=a/10;
        }
        
        while(b>0){
            int i=(int) Math.pow((b%10),n);
            sum=sum+i;
            b=b/10;
        }
        if(sum==c){
            return "Its a Armstrong number : "+sum;

        }
        else{
            return "Not Armstrong number : "+sum;
        }        
    }
}

public class a10_ArmstrongNumber {
    
    public static void main(String[] args) {
        answer ans =new answer();
        System.out.println(ans.num(153));

        
    }
    
}