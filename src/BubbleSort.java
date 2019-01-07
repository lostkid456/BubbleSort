public class BubbleSort {

    public static void bubbleswap(int[] a) {
        int counter = 1;
        while (counter > 0) {
            counter=0;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    SortingUtil.swap(a, i, i + 1);
                    counter++;
                }
            }
        }
    }
}
