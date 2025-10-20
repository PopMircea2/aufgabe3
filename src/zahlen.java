public class zahlen {

    public int[] Summe (int [] a,int [] b){
        int [] summe = new int[a.length+1];
        for(int i=a.length-1;i>0;i--){
            if (summe[i]+a[i] + b[i] > 9) {
                summe[i] = (a[i] + b[i]) % 10;
                summe[i-1] = (a[i] + b[i]) / 10;
            }
            else
                summe[i] = a[i] + b[i];
        }
        if (summe[0] == 0) {
            int [] ergebnis = new int[summe.length-1];
            for (int i = 0; i < ergebnis.length; i++) {
                ergebnis[i] = summe[i+1];
            }
            return ergebnis;
        }
        else
        if(summe[summe.length-1] == 0){
            int [] ergebnis = new int[summe.length-1];
            for (int i = 0; i < ergebnis.length; i++) {
                ergebnis[i] = summe[i];
            }
            return ergebnis;
        }
        return summe;
    }
    public int[] diff(int [] a,int [] b){
        int[] result = new int[a.length];
        int borrow = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            int diff = a[i] - b[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }
        return result;
    }
    public int[] multiply(int[] a, int x) {
        int[] result = new int[a.length+1];
        int carry =0;
        for (int i = a.length - 1; i >= 0; i--) {
            int mul = a[i] * x + carry;
            result[i+1] = mul % 10;
            carry = mul / 10;
        }
        result[0] = carry;
        if (result[0] == 0) {
            int[] shorter = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                shorter[i] = result[i + 1];
            }
            return shorter;
        }
        return result;
    }
}




