public class variance{
    public static void main(String args[]) {
        double[] sales2021 = {100.0,100.0,75.0};
        double[] sales2022 = {120.0,110.0,100.0};
        double mean2021 = calculateMean(sales2021);
        double mean2022 = calculateMean(sales2022);
        double variance2021 = calculateVariance(sales2021,mean2021);
        double variance2022 = calculateVariance(sales2022,mean2022);
        double variancepct = (variance2022-variance2021)/variance2021*100.0;
        System.out.printf("2021 Variance:%2f\n",variance2021);
        System.out.printf("2022 Variance:%2f\n",variance2022);
        System.out.printf("Variance pct:%2f%%\n",variancepct);
    }
    private static double calculateMean(double[] data) {
        double sum=0.0;
        for(double d : data){
            sum+=d;
        }
        return sum/data.length;
    }
    private static double calculateVariance(double[] data,double mean) {
        double sumsquares = 0.0;
        for(double d : data){
            sumsquares +=(d-mean)*(d-mean);
        }
        return sumsquares / (data.length-1);
    }    
}
//output//
2021 Variance:208.333333
2022 Variance:100.000000
Variance pct:-52.000000%
