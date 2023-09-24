package test;

import org.junit.Test;
import praktikum.BaseTest;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTypeTest extends BaseTest {

    @Test
    public void testValues() {
        IngredientType[] values = IngredientType.values();
        assertEquals(2, values.length);
        assertEquals(IngredientType.SAUCE, values[0]);
        assertEquals(IngredientType.FILLING, values[1]);
    }
}
