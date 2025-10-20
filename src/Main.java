public class Main {
    public static void main(String[] args) {
            zahlen z = new zahlen();
            int [] a = {1,3,0,0,0,0};
            int [] b = {8,7,0,0,0,0};
            int [] ergebnis = z.Summe(a,b);
            for (int i = 0; i < ergebnis.length; i++) {
                System.out.println(ergebnis[i]);
            }
            int [] c = {8,3,0,0,0,0};
            int [] d = {5,4,0,0,0,0};
            int [] rsult = z.diff(c,d);
            System.out.println("Diff:");
            for (int i = 0; i < rsult.length; i++) {
                System.out.println(rsult[i]);
            }
            int [] e = {1,2,4,3,0,0};
            int mul = 2;
            int [] produkt = z.multiply(e,mul);
            System.out.println("Multiplikation:");
            for (int i = 0; i < produkt.length; i++) {
                System.out.println(produkt[i]);
            }
        }
    }
