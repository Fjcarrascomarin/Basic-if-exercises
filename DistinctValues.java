public class DistinctValues {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if ( a != b && b != c && a != c) {
            System.out.println("3");
        } else if ( (a == b && a != c) || ( a == c && a != b) || ( b == c && c != a) ) {
            System.out.println("2");
        } else {
            System.out.println("1");
        }
    }
}
