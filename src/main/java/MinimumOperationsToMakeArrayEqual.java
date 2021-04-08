public class MinimumOperationsToMakeArrayEqual {
    public int minOperations(int n) {
        int avg = 0;
        for (int i = 0; i < n; i++) {
            avg += 2 * i + 1;
        }
        avg /= n;

        int count = 0;
        for (int i = 0; 2 * i + 1 < avg; i++) {
            int curr = 2 * i + 1;
            count += avg - curr;

        }

        return count;
    }
}
