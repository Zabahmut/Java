public class Vunktion {
    public static int get_vowel_count(String str1){
        int i ;
        int number = 0;

        for ( i = 0;i< str1.length();i++){
        if (str1.charAt(i) == 'a'||str1.charAt(i)=='e'||str1.charAt(i)=='o'||str1.charAt(i) == 'u'||str1.charAt(i)=='i'){
            number++;


        }
        }
    return number;

    }

    public static void main(String[] args) {
        System.out.println(get_vowel_count("Hello World"));
    }
}




