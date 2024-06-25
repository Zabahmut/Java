public class Metod {
    public static void main(String[] args) {
        show("Hello World");
        int a = square(160);
        System.out.println(square(5));
        System.out.println(find(new int[]{3,5,6,4,2},6));

        }
        public static void show(String show_consol){
            System.out.println(show_consol);
        }
        public static int square(int Square){
        return Square * Square;
        }
        public static boolean find(int[] arrays,int find2){
        for (int b: arrays){
            if(b == find2){
                return true;
            }
        }
        return false;
        }

}
