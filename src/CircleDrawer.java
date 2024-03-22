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
        double radius_pixels = (diameter_mm * resolution_dpi)/MM_TO_INCH;
/*выражение ниже задает шаг угла для итераций в цикле,
                где переменная theta увеличивается на этот шаг на каждой итерации.
                Таким образом, это устанавливает точность или детализацию окружности,
                которая строится вокруг центра (centerX_mm, centerY_mm)
                с радиусом radius_pixels. Более низкое значение resolution_dpi
                приведет к более крупному шагу и меньшей детализации окружности, а
                более высокое значение resolution_dpi приведет к более мелкому шагу и более высокой детализации окружности.
                В данном контексте, переменная stepSize представляет шаг при движении по кругу (в данном случае, по полному обороту). Чем меньше значение stepSize, тем более гладким будет окружность.
Деление 1 на resolution_dpi используется здесь для того, чтобы уменьшить шаг и, следовательно,
увеличить количество точек, которые будут вычислены для построения окружности.
Это позволяет получить более плавную и детализированную окружность при заданном разрешении dpi.
В данном примере шаг stepSize выражен в дюймах из-за перевода радиуса из миллиметров в дюймы и
умножения на разрешение в точках на дюйм. Учитывая, что 1 дюйм равен resolution_dpi точкам, деление 1
на resolution_dpi дает шаг в единицах на дюйм разрешения, что позволяет корректно вычислять точки для построения окружности с заданным разрешением.*/
        double stepSize = 1.0 / resolution_dpi;

        /*        цикл создает серию точек на окружности с радиусом
        radius_pixels и центром в точке с координатами (centerX_mm, centerY_mm).
        Угол theta увеличивается на шаг stepSize в пределах от 0 до 2π (полный оборот).
        Для каждого значения угла theta вычисляются координаты точки на окружности с помощью формулы
        для положения точки на окружности в полярной системе координат.
        Получившиеся координаты добавляются в список points в виде пары целых чисел [x, y].*/

        for (double angleOfRotation = 0; angleOfRotation <= 2 * Math.PI; angleOfRotation += stepSize) {
            int x = (int) Math.round(centerX + radius_pixels * Math.cos(angleOfRotation));
            int y = (int) Math.round(centerY + radius_pixels * Math.sin(angleOfRotation));
            points.add(new int[]{x, y});
        }
        return points;
    }
}