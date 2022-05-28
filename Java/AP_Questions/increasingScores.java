public class increasingScores {

    public static void main(String[] args) {
        increasingScores s = new increasingScores();
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 1, 2, 3, 2 };
        int[] c = { 1, 4, 6, 14 };
        int[] d = { 1, 1, 1, 1 };
        int[] e = { 1, 0, 4, 6 };
        int[] f = { 1, 1, 2, 4, 3, 7 };

        System.out.println(s.isIncreasing(a));
        System.out.println(s.isIncreasing(b));
        System.out.println(s.isIncreasing(c));
        System.out.println(s.isIncreasing(d));
        System.out.println(s.isIncreasing(e));
        System.out.println(s.isIncreasing(f));
    }

    /**
     * 
     * Given an array of scores, return true if each score is equal or greater than
     * the one before. The array will be length 2 or more.
     * 
     * @param scores
     * @return
     */
    public boolean isIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] < scores[i]) {
                return false;
            }
        }
        return true;
    }

}