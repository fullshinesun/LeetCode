package problem.challenge.april2021;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerfulIntegers {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> powerX = new ArrayList<>();
        List<Integer> powerY = new ArrayList<>();
        powerX.add(1);
        powerY.add(1);
        Set<Integer> result = new HashSet<>();
        int valueX = 1;
        int valueY = 1;
        while (true) {
            boolean added1 = false;
            boolean added2 = false;
            if (valueX * x < bound && valueX * x != valueX) {
                valueX = valueX * x;
                powerX.add(valueX);
                added1 = true;
            }
            if (valueY * y < bound && valueY * y != valueY) {
                valueY = valueY * y;
                powerY.add(valueY);
                added2 = true;
            }
            if (!added1 && !added2) {
                break;
            }
        }

        for (Integer integer : powerX) {
            for (Integer value : powerY) {
                if (integer + value <= bound) {
                    result.add(integer + value);
                }
            }
        }
        return new ArrayList<>(result);
    }
}
