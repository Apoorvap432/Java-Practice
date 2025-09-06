public class Array {
    public static void main(String[] args) {
        int nums[] = new int[] { 1, 3, 5, 6, 8 };
        String langs[] = { "Appu", "Pappu", "Chappu", "khappu", "Lappu" };
        System.err.println(nums[0]);

        // --------array iteration using for loop---------
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // ---------array iteration using for-each loop-------------------
        for (String lang : langs) {
            System.out.println(lang);
        }

        //-------------multidimensional array -----------------------------
        int [][] matrix = {
            {1, 2, 3}, 
            {4, 5, 6}
        };
        System.out.println(matrix[1][2]);
    }

}