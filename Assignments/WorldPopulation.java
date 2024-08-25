public class WorldPopulation{
    public static void main(String[] args){

	System.out.print("\nThe World's Population is assumed to be about 8,126,326,350 people. This program will calculation the estimated world population for the next 5 years using population growth rate 0.88% according to Macrotrends and 1.1% according to Wikipedia\n");
        
	
	System.out.println("Current World Population: 8126326350.4");
        double growthRateMT = (100+0.88) / 100;
	double growthRateWiki = (100 + 1.1) / 100;

	
        double year2k5M = 8126326350.4 * growthRateMT;
	double year2k6M = year2k5M * growthRateMT;
	double year2k7M = year2k6M * growthRateMT;
	double year2k8M = year2k7M * growthRateMT;
	double year2k9M = year2k8M * growthRateMT;

	double year2k5W = 8126326350.4 * growthRateWiki;
	double year2k6W = year2k5W * growthRateWiki;
	double year2k7W = year2k6W * growthRateWiki;
	double year2k8W = year2k7W * growthRateWiki;
	double year2k9W = year2k8W * growthRateWiki;
	        
        System.out.printf("%nAccording to Macro Trends growth rate, the predicted population for the next 5 years are as follows%nYear2025: %.0f%nYear2026: %.0f%nYear2027: %.0f%nYear2028: %.0f%nYear2029: %.0f%n", year2k5M, year2k6M, year2k7M, year2k8M, year2k9M);
	System.out.printf("%nAccording to Wikipedia growth rate, the predicted population for the next 5 years are as follows%nYear2025: %.0f%nYear2026: %.0f%nYear2027: %.0f%nYear2028: %.0f%nYear2029: %.0f%n", year2k5W, year2k6W, year2k7W, year2k8W, year2k9W);
      
    }
}