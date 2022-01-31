import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void volumeStartsAt100() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkingReducesVolumeBy10() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }



}
