public class Main {
    public static void main(String[] args) {
        double sums = 0;
        int allSums = 0;
        boolean h = false;
        double[] array = {4.1, -1.2, -5.3, -9.3, -6.4, -31.9, -6.5, 1.0, 0.1, 3.5, 4.2, 1.2, -3.3, 2.5, 6.0};
        for (double num : array){
            if (num <0){
                h = true;
            }
            else {
                sums += num;
                allSums++;

            }
        }

        System.out.println(sums );
        System.out.println( allSums);
        System.out.println("Среднее арифметическое  "+sums / allSums);
    }

}



