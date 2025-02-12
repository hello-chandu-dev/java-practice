package org.example.oops.access.Strings;

public class StringExamplesBuilder {
    public static void main(String[] args) {
       /* StringBuilder sb=new StringBuilder("chandu");
        sb.append("software");
        System.out.println(sb);

        StringBuilder s=new StringBuilder("chandana");
                s.insert(8,"reddy");
        System.out.println(s);*/

        /*StringBuilder s=new StringBuilder("raja");
        s.replace(1,2,"rani");
        System.out.println(s);
        */

     /*StringBuilder s=new StringBuilder("chanduuuu");
       s.delete(5,8);
        System.out.println(s);
*/
       /*StringBuilder s=new StringBuilder("chandana");
        s.reverse();
        System.out.println(s);
*/
// initially capacity is 16 and next onwards (16*2)+2
        //older capacity will erase


        /*StringBuilder s=new StringBuilder("chandana is a good girl");
        s.capacity();
        System.out.println(s);*/

        // while using Hashcode we can see the difference b/w String&StringBuffer
        // we can see the difference in concatenation
        String str="java";
        System.out.println(str.hashCode());
        str=str+"tpoint";
        System.out.println(str.hashCode());

        StringBuilder st=new StringBuilder("java");
        System.out.println(st.hashCode());
        st.append("tpoint");
        System.out.println(st.hashCode());

        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        }


    }

