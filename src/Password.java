public class Password {

    public static void main(String[] args) {
        String str2 = "Password";
        System.out.println(password_corekt(str2));
    }

    public static boolean password_corekt(String str2) {
        if (str2.length() < 8) {

            return  false;
        }
        int a = 0;
        int b = 0;

        for (int i = 0; i < str2.length();i++) {
            if (Character.isDigit(str2.charAt(i))) {
                a++;
            } else if (Character.isLetter(str2.charAt(i))) {
                b++;
            } else
                return false;
        }
        if (a>0&&b>0) {
            return true;
        }
        else{
            return false;
        }

    }
}
