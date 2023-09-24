package test;

import org.junit.Test;
import praktikum.BaseTest;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTest extends BaseTest {

    @Test
    public void testGetName() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Курица", 100);
        assertEquals("Курица", ingredient.getName());
    }

    @Test
    public void testGetType() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Говядина", 200);
        assertEquals(IngredientType.SAUCE, ingredient.getType());
    }

    @Test
    public void testGetPrice() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "Рыба", 100);
        assertEquals(100.0F, ingredient.getPrice(), 0);
    }
}

