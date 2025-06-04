import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<Integer>();
        while(true){
            int val=s.nextInt();
            if(val==-1){
                break;
            }    
            a.add(val);
        }
        int[] b=new int[a.size()];
        for(int i=0;i<a.size();i++){
            b[i]=a.get(i);
        }
        int c=a.size();
        for(int i=0;i<c;i++){
            int min=i;
            for(int j=i+1;j<c;j++){
                if(b[j]<b[min]){
                    min=j;
                }
            }
            int temp=b[i];
            b[i]=b[min];
            b[min]=temp;
        }
        for(int i=0;i<c;i++){
            System.out.println(b[i]);
        }
        s.close();
    }
}
