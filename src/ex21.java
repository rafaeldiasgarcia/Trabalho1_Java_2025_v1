public class ex21 {
    public static void main(String[] args) {

        double x1 = 12.5;
        double y1 = 10.0;
        double x2 = 3.5;
        double y2 = 1.0;

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distancia > 10 && distancia < 50) {
            System.out.println("Distância moderada.");
        } else {
            System.out.println("Distâcina fora do intervalo.");
        }

    }
}