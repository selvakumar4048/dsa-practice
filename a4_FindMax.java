class answer{
    public int findMax(int[] a){
        int max=a[0];
        
        for(int i=1;i<=a.length-1;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}

public class a4_FindMax {
    
    public static void main(String[] args) {
        answer ans=new answer();
        int[] arr={10,15,17,12};
        System.out.println(ans.findMax(arr));
        
    }
    
}