package Array;

import java.sql.SQLOutput;

public class RectangleOverlap {
    public static void main(String[] args) {
    int rec1[] = {2,4,10,8};
    int rec2[] = {1,2,6,6};

    boolean ans = isRectangleOverlaped(rec1,rec2);

        if (ans) {
            System.out.println("Rectangles are overlapping");
        } else {
            System.out.println("Rectangles are not overlapping");
        }

    }
    public static boolean isRectangleOverlaped(int rec1[],int rec2[]){

        if(
                rec1[2] <= rec2[0] || // rec1 is to the left of rec2
                rec1[0] >= rec2[2] || //rec1 is to the right of rec2
                rec1[1] >= rec2[3] || //rec1 is to the top of rec2
                rec1[3] <= rec2[1]    // rec1 is bottom to rec2
        ) return false;
        else {
            return true;
        }
    }
}
