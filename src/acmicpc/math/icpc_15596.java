package acmicpc.math;

public class icpc_15596 {
    public static void main(String[] args){
        int[] a = new int[3000000];
        sum(a);
    }
    public static long sum(int[] a) {
        long result = 0;
        for(int i = 0 ; i < 3000000 ; i++){
            result += a[i];
        }
        return result;
    }
}
