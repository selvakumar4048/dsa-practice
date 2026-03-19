class answer{
    public String swap(int a,int b){
        //5 10
        a=a+b;
        b=a-b;
        a=a-b;
        return "a is :"+a+" b is : "+b;
        
    }
}

public class a3_SwapTwoVariables {
    
    public static void main(String[] args) {
        answer ans=new answer();
        System.out.println(ans.swap(5,10));
    }
    
}