public class TugasAkarKuadrat01 {

    public static int akarKuadratBF(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int result = 1;
        while (result * result <= n) {
            result++;
        }
        return result - 1;
    }

    public static int akarKuadratDC(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return akarKuadratDCUtil(n, 0, n);
    }

    private static int akarKuadratDCUtil(int n, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            int midSq = mid * mid;

            if (midSq == n) {
                return mid;
            }

            if (midSq < n && (mid + 1) * (mid + 1) > n) {
                return mid;
            }

            if (midSq > n) {
                return akarKuadratDCUtil(n, start, mid - 1);
            }

            return akarKuadratDCUtil(n, mid + 1, end);
        }
        return -1;
    }

    public static void main(String[] args) {
        int bilangan = 16;

        int akarBF = akarKuadratBF(bilangan);
        System.out.println("Akar kuadrat dari " + bilangan + " ( Brute Force )        : " + akarBF);

        int akarDC = akarKuadratDC(bilangan);
        System.out.println("Akar kuadrat dari " + bilangan + " ( Divide and Conquer ) : " + akarDC);
    }
}
