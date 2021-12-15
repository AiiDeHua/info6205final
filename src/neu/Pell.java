package edu.neu;

public class Pell {
    public Pell() {
    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");
        long p0 = 0;
        long p1 = 1;
        if(n == p0){
            return p0;
        }else if(n == p1){
            return p1;
        }
//        long result = 1;
//        long tmp = 1;
//        for(int i= 1;i<n;i++){
//            result += p0 + 2 * p1;
//            p0 = p1;
//            p1 = result;
//        }
        return 2*get(n-1) + get(n-2);
//        return result;
    }

    public static void main(String[] args) {
        Pell a = new Pell();
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        System.out.println(a.get(3));
    }
//
//    P0 = 0
//
//    P1 = 1
//
//    Pn = 2 Pn-1 + Pn-2
//    p2 = 2*p1+p0 2
//    p3 = 2*p2+p1 5

//    int first = 0; int second = 1; int nth = 1; for (int i = 2; i <= n; i++) { nth = first + second; first = second; second = nth; }

}