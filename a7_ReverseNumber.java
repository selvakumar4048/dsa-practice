class answer{
    public String rev(int a){
        String b=Integer.toString(a);
        String c="";
        for(int i=b.length()-1;i>=0;i--){
            c=c+b.charAt(i);
        }
        return c;
    }
}

public class a7_ReverseNumber {
    
    public static void main(String[] args) {
        answer ans =new answer();
        System.out.println(ans.rev(1234));
        
    }
    
}