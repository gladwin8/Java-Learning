package org.challenges;

import java.util.HashMap;
import java.util.Map;

public class c_Repeated_Integer {

    public static void main(String[] args) {

        int[] arr={1,2,3,3,1};
        repeated_int(arr);
    }

    public static void repeated_int(int[] arr)
    {
        HashMap<Integer,Integer> hs =new HashMap<>();
        for(int a:arr)
        {
            if(hs.containsKey(a))
            {
                hs.put(a,hs.get(a)+1);
            }
            else {
                hs.put(a,1);
            }
        }

        for(Map.Entry<Integer,Integer> map : hs.entrySet())
        {
            if(map.getValue()==1)
            {
                System.out.println(+map.getKey()+" is a unique number");
            }
            else {
                System.out.println(+map.getKey()+ " is displaying "+map.getValue()+" times");
            }
        }
    }
}
