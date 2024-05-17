public class Main {
    public static void main(String[] args){
        double[] data  = {1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 8};
        double[] score = {2, 1, 5, 6, 2, 2, 4, 8, 1, 1, 1};

        Statistik mystatistik = new Statistik(data);

        System.out.println("Mean                : " + mystatistik.calculateMean());
        System.out.println("Modus               : " + mystatistik.calculateModus());
        System.out.println("Median              : " + mystatistik.calculateMedian());
        System.out.println("Standard Deviasi    : " + mystatistik.calculateStandardDeviasi());
        System.out.println("Score Mean          : " + mystatistik.calculateMean(score));
    }
}
