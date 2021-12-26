package Chapter16;

public class TokenisingTelephoneNumbers {
    public static void main(String[] args) {
//        (555) 555-5555

        String s = "(555) 555-5555";
        String areaCode = s.substring(s.lastIndexOf("(") + 1, s.lastIndexOf(")"));
        String last4 = s.substring(s.lastIndexOf("-") + 1);
        String middle = s.substring(s.lastIndexOf(" ") + 1, s.lastIndexOf("-"));
        System.out.println(areaCode);
        System.out.println(last4);
        System.out.println(middle);
        System.out.println(middle.concat(last4));
    }
}
