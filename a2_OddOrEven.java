class answer{
    public String oddEven(int a){
        if(a%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
}
public class a2_OddOrEven {
    
    public static void main(String[] args) {
        answer ans=new answer();
        System.out.println(ans.oddEven(6));
    }
    
}