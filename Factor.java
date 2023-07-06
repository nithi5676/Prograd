
class Factor {
    public static void main(String args[]) {
        int n = 25;
        // int count = 0;
        // for (int i = 1; i < n; i++) {
        // // System.out.println(count++);
        // if (n % i == 0) {
        // // System.out.println(i);
        // System.out.println(count++);
        // }
        // }
        // int res= Syste
        System.out.println(countOfFactor(n));
    }

    public static int countOfFactor(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    count++;
                } else
                    count += 2;
            }
        }
        return count;
    }
}