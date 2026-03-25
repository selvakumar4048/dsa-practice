class answer{
    public int findFact(int a){
        int fact=1;
        if(a<0){
                return -1;
            }
        for(int i=1;i<=a;i++){
            
            
                fact=fact*i;
            
        }
        return fact;
    }
}

public class a5_Factorial {
    
    public static void main(String[] args) {
        answer ans=new answer();
        System.out.println(ans.findFact(-6));
    }
    
}