class Solution {
    public boolean squareIsWhite(String coordinates) {
        int f = (int) coordinates.charAt(0) - 96;
        int s = Integer.parseInt(String.valueOf(coordinates.charAt(1)));
        return (f + s) % 2 != 0;
    }
}