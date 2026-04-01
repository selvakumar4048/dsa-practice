import java.util.ArrayList;
class answer{
    public int gcd(int a,int b){
        
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        
        for(int i=a;i>=1;i--){
            if(a%i==0){
                arr1.add(i);
            }
        }
        for(int j=b;j>=1;j--){
            if(b%j==0){
                arr2.add(j);
            }
        }
        
        for(int i=0;i<=arr1.size()-1;i++){
            
            if(arr2.contains(arr1.get(i))){
                return arr1.get(i);
            }
        }
        return 1;
        
    }
}

public class a13_GCD {
    
    public static void main(String[] args) {
        
        answer ans =new answer();
        System.out.println(ans.gcd(12,18));
    }
    
}