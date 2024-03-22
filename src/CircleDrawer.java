import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CircleDrawer {
    private static final double MM_TO_INCH = 50.8;

    public static List<int[]> drawCircle(int centerX,
                                         int centerY,
                                         int diameter_mm,
                                         int resolution_dpi) {
        List<int[]> points = new ArrayList<>();
        double radius_pixels = (diameter_mm * resolution_dpi) / MM_TO_INCH;
        double stepSize = 1.0 / resolution_dpi;
        for (double angleOfRotation = 0; angleOfRotation <= 2 * Math.PI; angleOfRotation += stepSize) {
            int x = (int) Math.round(centerX + radius_pixels * Math.cos(angleOfRotation));
            int y = (int) Math.round(centerY + radius_pixels * Math.sin(angleOfRotation));
            points.add(new int[]{x, y});
        }
        return points;
    }
}