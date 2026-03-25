class answer{
    public String palin(int a){
        int val=a;
        int b=0;
        while(a>0){
            b=b*10+a%10;
            a=a/10;
        }
        if(val==b){
            return "Palindrome "+b;
        }
        else{
            return "not Palindrome "+b;

        }
    }
}

public class a8_PalindromeWithoutConvertString {
    
    public static void main(String[] args) {
        answer ans =new answer();
        System.out.println(ans.palin(242));
        
        
    }
    
}