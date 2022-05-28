public class hundredScores {
    public static void main(String[] args) {
        hundredScores s = new hundredScores();
        int[] a = { 1, 100, 100, 4 };
        int[] b = { 1, 2, 100, 2 };
        int[] c = { 100, 4, 100, 100 };
        int[] d = { 1, 1, 1, 1 };

        System.out.println(s.scores100(a));
        System.out.println(s.scores100(b));
        System.out.println(s.scores100(c));
        System.out.println(s.scores100(d));

    }
    

    /**
     * 
     * Given an array of scores, return true if there are scores of 100 next to each
     * other in the array. The array length will be at least 2.     * 
     * 
     * @param scores
     * @return
     */
    public boolean scores100(int[] scores) {
        for(int i=0; i<scores.length-1;i++) {
            if(scores[i]==100 && scores[i+1]==scores[i]) {
                return true;
            }
        }
        return false;
    }
}
