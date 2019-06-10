import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void waterCanBeDrunk(){
        waterBottle.drinkWater();
        waterBottle.drinkWater();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void bottleCanBeEmptied(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void bottleCanBeFilled(){
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.getVolume());
    }
}
