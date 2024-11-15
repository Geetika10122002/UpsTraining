public class uts {
    public static int getSum(int[] array) {
        int T = array[0];
        int countA = 0;
        for (int i = 0; i < T; i++) {
            int A_score = array[2 * i + 1];
            int B_score = array[2 * i + 2];
            int totalPoints = A_score + B_score;
            if ((totalPoints / 2) % 2 == 0) {
                countA++;
            }
        }

        return countA;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 2, 7, 4};
        System.out.println(getSum(array));
    }
}