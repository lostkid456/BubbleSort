public class BubbleSort {

    public static void bubbleswap(int[]a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length;i++){
                if(a[i]>a[j]){
                    SortingUtil.swap(a,i,j);
                }
        }
    }}

}
