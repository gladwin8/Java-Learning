package org.challenges;

public class b_Count_Occurences {
    public static void main(String[] args) {
        String name = "gladwain";
        System.out.println(countOccurences(name,'n'));
        
    }
    
    public static int countOccurences(String name,char c)
    {
        char[] a = name.toCharArray();
        int count=0;
        for(int i=0;i<a.length;i++)
        {
          if(a[i]==c)
          {
              count++;
          }
        }
        return count;
    }
}
