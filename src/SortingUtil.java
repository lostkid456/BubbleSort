public class SortingUtil{

    public static void swap(int[] arr,int i,int j){
        int b=arr[i];
        arr[i]=arr[j];
        arr[j]=b;
    }

    public static int[] randIntArr(int count){
        int[] arr=new int[count];
        for(int i=0; i<arr.length;i++){
            arr[i]=(int)(Math.random()*10001);
        }
        return arr;
    }

    public static boolean isSorted(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after){
        int a=0;
        int b=0;
        for(int i:before){
            a+=before[i];
            b+=after[i];
        }
        return(a==b);
    }

}
