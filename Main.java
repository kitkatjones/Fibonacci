public class Main {
    public static void main(String[] args) {

        fibonacci(20);
    }

    private static void fibonacci(int number){
        int current = 1;
        int previous = 1;
        int next = current + previous;
        System.out.println(previous);
        System.out.println(current);
        System.out.println(next);
        for(int i=4; i<=number; i++) {
            current = next;
            next = current + previous;
            previous = current;

            System.out.println(next);
        }
    }
}
