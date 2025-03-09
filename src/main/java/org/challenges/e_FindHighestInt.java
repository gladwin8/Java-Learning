package org.challenges;

public class e_FindHighestInt {

    public static void main(String[] args) {
        int[] nums = {100,120,80,10};
        System.out.println("Greatest Integer : "+Highestint(nums));
        System.out.println("Second Highest : "+Second_highestint(nums));
    }

    public static Integer Highestint(int[] nums)
    {
        int highest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(highest<nums[i])
            {
                highest=nums[i];
            }
        }

        return highest;
    }

    public static Integer Second_highestint(int[] nums)
    {
        int highest=0,second=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>highest)
            {
                second = highest;
                highest = nums[i];
            } else if ((nums[i]<highest && nums[i]>second)||second==highest) {
                second = highest;
            }
        }
        return second;
    }


}
