package org.example.oops.access.Strings;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("abc");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.ensureCapacity(30);
        System.out.println(sb.capacity());
        sb.append("saas");
        System.out.println(sb);
        sb.setCharAt(1,'A');
        System.out.println(sb);
//        sb.setLength(10);
        System.out.println(sb.charAt(2));
        System.out.println(sb.indexOf("s"));

//        sb.delete(2,5);
//        System.out.println(sb.reverse());
        System.out.println(sb.subSequence(1,3));
        System.out.println(sb.substring(1,3));
        System.out.println(sb.substring(2));
//        System.out.println(sb.appendCodePoint(2));
    }
}
