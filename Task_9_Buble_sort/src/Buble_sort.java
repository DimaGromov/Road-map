public class Buble_sort {
    static void bSort(int[] arr){
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]>arr[i+1]){
                    int a = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = a;
                }
            }
        }
    }
}
