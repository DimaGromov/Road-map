public class Work_with_vector {

    // Метод, вычисляющий длину вектора.
    static double vLen(Vector a) {
        return (Math.sqrt((a.getX() * a.getX()) + (a.getY() * a.getY())));
    }

    // Метод вычисляющий скалярное произведение векторов.
    static int vScal(Vector a, Vector b){
        return (a.getX() * b.getX()) + (a.getY() * b.getY());
    }

    // Метод, вычисляющий являются ли векторы перпендекулярными.
    // * Условие перепендекулярности векторов: их скалярное произведение равно 0.
    static boolean vPer(Vector a, Vector b) {
        if ((vScal(a, b)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Метод, вычисляющий угол между двумя векторами.
    static double vCos(Vector a, Vector b){
        return vScal(a, b)/(vLen(a)*vLen(b));
    }

    // Метод, вычисляющий сумму векторов.
    // Так как суммой двух и более векторов является вектор, возращаемым значением будет объект класса Vector.
    static Vector vSum(Vector ...a){
        int sumX=0;
        int sumY=0;
        for(int i=0; i<a.length; i++){
            sumX += a[i].getX();
            sumY += a[i].getY();
        }
        Vector b = new Vector(sumX, sumY);
        return b;
    }

}
