package BinarySearch;

public class ImplementUpperBound {

    public static void main(String[] args) {
        int x1 = 28;
        int[] arr1 = {80, 59, 26, 46};
        int[] result1 = getFloorAndCeil(x1, arr1);
        System.out.println("Floor: " + result1[0] + ", Ceil: " + result1[1]);
    }
    public static int[] getFloorAndCeil(int x, int[] arr) {
        int floorValue = -1;
        int ceilValue = -1;

        for (int value : arr) {
            if (value <= x) {
                floorValue = Math.max(floorValue, value);
            }
            if (value >= x) {
                ceilValue = (ceilValue == -1) ? value : Math.min(ceilValue, value);
            }
        }

        return new int[]{floorValue, ceilValue};
    }
}
