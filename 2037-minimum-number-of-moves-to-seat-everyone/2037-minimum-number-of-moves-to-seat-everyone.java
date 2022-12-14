class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int res = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i = 0; i < seats.length; i++) {
            res = res + Math.abs(students[i] - seats[i]);
        }
        return res;
    }
}