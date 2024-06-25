public class Arrays {
    public static void main(String[] args) {
        int [] temperatur = {18,16,15,20,16,15,14};
        int max = 0;
        int min = 100;
        int summe = 0;
        for (int i = 0; i < temperatur.length; i++){
            summe += temperatur[i];
            if (temperatur [i] > max){
                max = temperatur[i];

            }
        if (temperatur [i] < min){
            min = temperatur[i];

        }
        }
        double average = summe / temperatur.length;
        System.out.println(min);
        System.out.println(max);
        System.out.println(average);
        int []biger_than_average = new int[7];
        for (int i = 0; i < temperatur.length; i++){
            if (temperatur[i] > average){
                biger_than_average[i]=temperatur[i];
            }
        }
        for(int t : biger_than_average){
            System.out.println(t);

        }
    }

}
