package gr.aueb.cf.ch6;

public class MappingApp {
    public static void main(String[] args) {
        int[] salaries = { 1000, 900, 3000, 2000, 4000};
        final double BONUS = 500.10;
        double[] bonusWages = getWagesWithBonus(salaries, BONUS);
        for (double salary : bonusWages) {
            System.out.print( salary + " ");
        }

    }

    /**
     * Returns the updated "with bonus", wages.
     *
     * @param wages     the initial wages.
     * @param bonus     the provided bonus.
     * @return          the new array with the updates wages.
     */
    public static double[] getWagesWithBonus(int[] wages, double bonus){
        if (wages == null) return null;
        double[] wagesOut = new double[wages.length];

        for (int i = 0; i < wages.length; i++){
            wagesOut[i] = wages[i] + bonus;
        }
        return wagesOut;
    }

}
