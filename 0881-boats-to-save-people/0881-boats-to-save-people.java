class Solution {
    public int numRescueBoats(int[] people, int limit) {
       // Sort Array first
        Arrays.sort(people);

        int start = 0;
        int end = people.length-1;

        int boatsCount = 0;

        while(start <= end){
            if(people[start] + people[end] <= limit){
                start++;
                end--;
                // boatsCount++; in every condition
            } else {
               end --;
               // boatsCount++; in every condition
            }
            boatsCount++;
        }
          return boatsCount;
    }
}