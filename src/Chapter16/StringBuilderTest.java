package Chapter16;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello how are you?");
        System.out.printf("%d %d %s", sb.length(), sb.capacity(), sb.toString());
        sb.ensureCapacity(70);
        sb.setLength(10);
        System.out.println(sb.toString());
        System.out.println(sb.charAt(5));
        sb.append("Subash");
        System.out.println(sb);
        sb.setCharAt(4, 's');
        System.out.println(sb);
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        float a = 123.0f;
        sb.append(charArray);
        System.out.println(sb.append(a));

    }
}
