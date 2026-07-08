class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = salary[0];

        for (int i = 1; i < salary.length; i++) {
            if (max < salary[i]) {
                max = salary[i];
            }
            if (min > salary[i]) {
                min = salary[i];
            }
            sum = sum + salary[i];
        }
        //calculating average 
         sum = sum - max - min;
        // typecast in double 
        double ans = (double) sum / (salary.length - 2);
        return ans;
    }
}