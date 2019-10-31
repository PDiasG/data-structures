public class MergeSort {

    public void mergesort(int[] arr) {
        mergesort(arr, 0, arr.length - 1);
    }

    private void mergesort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergesort(arr, low, middle);
            mergesort(arr, middle + 1, high);
            merge(arr, low, middle, high);
        }
    }

    private void merge(int[] arr, int low, int middle, int high) {
        int[] n1 = new int[middle - low + 1];
        int[] n2 = new int[high - middle];

        for (int i = 0; i < n1.length; i++) {
            n1[i] = arr[i+low]
        }
        for (int i = 0; i < n2.length; i++) {
            n2[i] = arr[i+middle+1]
        }

        int i = 0, j = 0;
        int k = low;
        while (i < n1.length && j < n2.length){
            if (n1[i] < n2[j]) {
                arr[k++] = n1[i++];
            }
            else {
                arr[k++] = n2[j++];
            }
        }

        while (i < n1.length) {
            arr[k++] = n1[i++]
        }
        while (j < n2.length) {
            arr[k++] = n2[j++]
        }

    }

}
