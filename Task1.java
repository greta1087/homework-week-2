package homework.week.two;

public class Task1 {
    public static void main (String[] args) {
    rectanglePerimeter();
    rectangleArea();
    }
    public static void rectanglePerimeter () {
        int a = 2;
        int b = 6;
        int P = 2*a + 2*b;
        System.out.println("Периметърът на правоъгълника е " + P + " см.");
    }
    public static void rectangleArea () {
        int a = 2;
        int b = 6;
        int S = a * b;
        System.out.println("Лицето на правоъгълника е " + S + " кв.см.");
    }
}
