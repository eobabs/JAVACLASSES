public class PatternD {
    public static void main(String[] args) {
        

        for (int count = 1; count <= 6; count++) {
            for (int counter = 6; counter >= count; counter--) {
                System.out.print("  "); 
            }
            for (int counter = 1; counter <= count; counter++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}