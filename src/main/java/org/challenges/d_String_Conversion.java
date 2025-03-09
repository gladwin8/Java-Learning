package org.challenges;

public class d_String_Conversion {

    public static void main(String[] args) {

        String name="gLADWIN iSAAC";
        System.out.println(stringconvertor(name));

    }

    public static String stringconvertor(String name)
    {
        String[] word = name.split(" ");
        String temp="";
        for(int i =0;i<word.length;i++)
        {
            char[] ch = word[i].toCharArray();
            for(char c:ch)
            {
                if(Character.isUpperCase(c))
                {
                    temp+= Character.toLowerCase(c);
                }
                else {
                    temp+= Character.toUpperCase(c);
                }
            }
            if(i<word.length-1)
            {
                temp+=" ";
            }

        }
        return temp;
    }

}
