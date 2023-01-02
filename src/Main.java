public class Main {
    public static void main(String[] args) {
        System.out.println(getPrecioIVA(500));
    }

    static double getPrecioIVA(double precio){
        return precio * 1.21;
    }
}