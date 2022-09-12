public class Main {
    public static void main(String[] args) {
        Trabalhadora trabalhadora = new Trabalhadora();

        System.out.println(trabalhadora.getVector());
        trabalhadora.makeVector(10);
        System.out.println(trabalhadora.getVector());
        trabalhadora.bubble_sort();
        System.out.println(trabalhadora.getVector());
    }
}
