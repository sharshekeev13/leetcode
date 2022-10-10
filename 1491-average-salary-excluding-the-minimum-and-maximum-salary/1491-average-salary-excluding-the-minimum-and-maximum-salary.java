class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int [] newArray = Arrays.copyOfRange(salary,1,salary.length-1);
        return (double) Arrays.stream(newArray).sum()/newArray.length;
    }
}