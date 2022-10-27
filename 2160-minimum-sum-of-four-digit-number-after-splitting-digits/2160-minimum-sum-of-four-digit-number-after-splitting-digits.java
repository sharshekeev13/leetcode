class Solution {
    public int minimumSum(int num) {
        String temp = Integer.toString(num);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            numbers[i] = temp.charAt(i) - '0';
        }
        Arrays.sort(numbers);
        String first = String.valueOf(numbers[0]) + String.valueOf(numbers[3]);
        String second = String.valueOf(numbers[1]) + String.valueOf(numbers[2]);
        return Integer.parseInt(first) + Integer.parseInt(second);
    }
}