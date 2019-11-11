import java.util.Arrays;

public class Mass {
    private int[] arr;

    Mass (int[] arr){
        this.arr=arr;

        // Заполним массив случайными числами.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*1000);
        }
    }

    // Нахождение максимама.
    void maxNum(){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Максимальное значение массива: " + max);
    }

    // Нахождение минимума.
    void minNum(){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Максимальное значение массива: " + min);
    }

    // Нахождение среднего значения.
    void srNum(){
        int sum = 0;
        for (int i:arr) {
            sum += i;
        }
        double sr = (double)sum/(double) arr.length;
        System.out.println("Среднее равно: " + sr);
    }

    // Печать массива
    void printMs(){
        System.out.println(Arrays.toString(arr));
    }



}
