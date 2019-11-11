import java.util.Arrays;

public class Mass {
    private int[] num;      // Ссылка на массив чисел.
    private int[] mas;      // Ссылка на массив весов.
    private int[] arrMas;   // Ссылка на вспомогательный массив, который будет заполнен числами в соответствии с их весами.
    private int sumMas;     // Размер вспомогательного массива.

    Mass (int[] num, int[] mas){
        this.num = num;
        this.mas = mas;
    }

    // Метод, который возвращает число.
    int numRand(){
        fillArrMas();
        int i;
        i = (int)(Math.random()*sumMas);
        return arrMas[i];
    }

    void fillArrMas(){
        sumMas = 0;
        for (int i:mas) {
            sumMas += i;
        }

        // Выделяется память под вспомогательный массив.
        arrMas = new int[sumMas];

        // Заполнение массива.
        int counter = 0;
        for (int i=0; i<mas.length; i++){
            for(int j=0; j<mas[i]; j++){
                arrMas[counter] = num[i];
                counter++;
            }
        }

    }
}

