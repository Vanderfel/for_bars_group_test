import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int centerX_mm = 0;
        int centerY_mm = 0;
        int diameter_mm = 25;
        int resolutionDpi = 150;
        List<int[]> circlePoints = CircleDrawer.drawCircle(centerX_mm, centerY_mm, diameter_mm, resolutionDpi);
        for (int[] point : circlePoints) {
            System.out.println(Arrays.toString(point));
        }
    }
}