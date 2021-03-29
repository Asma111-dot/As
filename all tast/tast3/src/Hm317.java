/**
 * Created by EBH on 16/02/21.
 */
public class Hm317 {
    public void repeated(int arr[]  ){

        for(int i=0; i<arr.length;i++){
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j])
                    System.out.print(arr[i]+" ");

            }
        }
    }
    public static void main(String[] args) {
        Hm317 o=new Hm317();
        int x[]={4,4,1,3,3,3};
        System.out.println("Repeated Elements are :");
        o.repeated(x);
    }
}
