public class BubbleSortRunner {
    public static void main(String[] args){
        int[] testArr=SortingUtil.randIntArr(10);
        System.out.print("Before:");
        for(int num:testArr)
            System.out.print(num+" ");
        System.out.println();
        BubbleSort.bubbleswap(testArr);
        System.out.print("After:");
        for(int num:testArr)
            System.out.print(num+" ");
        System.out.println();
    }
}
