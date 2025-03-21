public class DataTypeFits {

    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x >= -(Math.pow(2, 16)) && x <= (Math.pow(2, 16))) System.out.println("* sort");
                if (x >= -(Math.pow(2, 32)) && x <= (Math.pow(2, 32))) System.out.println("* int");
                if (x >= -(Math.pow(2, 64)) && x <= (Math.pow(2, 64))) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}