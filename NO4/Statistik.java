import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Statistik {
    private double[] data;
    public Statistik(double[] data){
        this.data = data;
    }

    public double calculateMean(){
        double sum = 0;
        for (double num: data){
            sum += num;
        }
        double mean = sum / data.length;
        return Double.parseDouble(String.format("%.2f", mean));
    }

    public double calculateModus(){
        HashMap<Double, Integer> frequencyMap = new HashMap<>();
        for (double num :  data){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        double Modus = data[0];
        int maxCount = 0;
        for (Map.Entry<Double, Integer>entry : frequencyMap.entrySet()){
            if (entry.getValue()> maxCount) {
                maxCount = entry.getValue();
                Modus = entry.getKey();
            }
        }
        return Double.parseDouble(String.format("%.2f", Modus));
    }

    public double calculateMedian() {
        Arrays.sort(data);
        int length = data.length;
        if (length % 2 == 0) {
            double Median = (data[length / 2 - 1] + data[length / 2] / 2.0);
            return Double.parseDouble(String.format("%.2f", Median));
        } else {
            return Double.parseDouble(String.format("%.2f", data[length / 2]));
        }
    }

        public double calculateStandardDeviasi(){
            double Mean = calculateMean();
            double sum = 0;
            for (double num : data){
                sum += Math.pow(num - Mean, 2);
            }
            double StandardDeviasi = Math.sqrt(sum / data .length);
            return Double.parseDouble(String.format("%.2f", StandardDeviasi));
        }

    public double calculateMean(double[] scores){
        if (scores.length != data.length){
            throw new IllegalArgumentException("Panjang array score harus sama dengan panjang data array");
        }
        double scoredSum = 0;
        double scoreSum = 0;
        for (int i = 0; i < data.length; i++){
            scoredSum += data[i] * scores[i];
            scoreSum += scores[i];
        }
        double Mean = scoredSum / scoreSum;
        return Double.parseDouble(String.format("%.2f", Mean));
    }
}
