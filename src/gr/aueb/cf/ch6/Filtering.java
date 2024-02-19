package gr.aueb.cf.ch6;

public class Filtering {

    public static void main(String[] args) {
        int[] grades = {4, 2, 3, 6, 5, 10, 9, 8};
        final int PASS_LIMIT = 5;


        int[] passed = getPassGrades(grades, PASS_LIMIT);
            for (int grade : grades) {
                System.out.print(grade + " ");
            }
        }


    /**
     * Returns a new array that contains the
     * pass grades of the source array.
     *
     * @param grades    the source array.
     * @param limit     the threshold that
     *                  the pass grades are compared to.
     * @return          a new array with the pass-grades
     */
    public static int[] getPassGrades(int[] grades, int limit) {
        int count = 0;
        if (grades == null) return null;

            for (int grade : grades) {
                if (grade >= limit) {
                    count++;
                }
            }


            int[] passOut = new int[count];
            int pivot= -1;
            for (int grade : grades) {
                if (grade >= limit) {
                    passOut[++pivot] = grade;
                }
            }

        return passOut;
    }
}
