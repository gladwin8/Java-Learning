package org.challenges;

/**
 * Hello world!
 *
 */
public class a_Reverse_String
{
    public static void main( String[] args )
    {
        String name="gladwin";
        System.out.println(reverse_name(name));
        String sentence = "gladwin's learning java";
        reverse_sentence(sentence);
        reverse_whole_sentence(sentence);
    }

    public static String reverse_name(String name)
    {
        char[] c= name.toCharArray();
        String temp="";
        for (int i = c.length-1; i >=0 ; i--) {
            temp += c[i];
        }
        return temp;
    }

    public static void reverse_sentence(String sentence)
    {
        String[] sent = sentence.split(" ");
        String temp="";
        for (int i = 0; i < sent.length; i++) {
            temp = reverse_name(sent[i]);
            if(i<sent.length-1)
            {
                temp+=" ";
            }
            System.out.print(temp);
        }
        System.out.println();
    }

    public static void reverse_whole_sentence(String sentence)
    {
        String[] sent = sentence.split(" ");
        for (int i= sent.length-1;i>=0;i--)
        {
            String temp = reverse_name(sent[i]);
            if(i>0)
            {
                temp+=" ";
            }
            System.out.print(temp);
        }
    }
}
