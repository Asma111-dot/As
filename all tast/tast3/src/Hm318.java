import java.util.Arrays;

/**
 * Created by EBH on 16/02/21.
 */
public class Hm318 {
    public void repeat2(int arr[]){
        Arrays.sort(arr);

        for (int i = 0; i <arr.length-2 ; i++) {
            if(arr[i]==arr[i+1])
                System.out.println(arr[i]+" ");

        }
    }

    public static void main(String[] args) {
        int x[]={1,1,13,6,7,9,8,90,56,32,32,56,90};
        Hm318 o=new Hm318();
        o.repeat2(x);
    }
}
