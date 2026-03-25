import java.util.ArrayList;
import java.util.List;

class answer{
    public List<Integer> fibo(int a){
        List<Integer> num=new ArrayList<>();
        int first=0;
        int second=0;
        int sum=0;
        for(int i=0;i<a-1;i++){
            if(i<1){
                num.add(i);
                num.add(i+1);
                first=i;
                second=i+1;
            }
            else{
                sum=first+second;
                first=second;
                second=sum;
                num.add(sum);
            }
            
        }
        return num;
    }
}

public class a6_Fibonacci {
    
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<Integer>();
        answer ans=new answer();
        System.out.println(ans.fibo(7));
    }
    
    
}