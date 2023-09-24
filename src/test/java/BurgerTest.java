package test;

import org.junit.Test;
import praktikum.*;

import static org.junit.Assert.assertEquals;

public class BurgerTest extends BaseTest {

    @Test
    public void testGetPrice() {
        Burger burger = new Burger();
        burger.setBuns(mockBun);
        burger.addIngredient(mockIngredient1);
        burger.addIngredient(mockIngredient2);

        assertEquals(325.0F, burger.getPrice(), 0);
    }

    @Test
    public void testAddAndRemoveIngredient() {
        Burger burger = new Burger();
        burger.setBuns(mockBun);
        burger.addIngredient(mockIngredient1);
        burger.addIngredient(mockIngredient2);
        burger.removeIngredient(1);

        assertEquals(250.0F, burger.getPrice(), 0);
    }
    @Test
    public void testMoveIngredient() {
        Burger burger = new Burger();
        burger.setBuns(mockBun);
        burger.addIngredient(mockIngredient1);
        burger.addIngredient(mockIngredient2);

        // Переместим ингредиент mockIngredient1 на позицию 1
        burger.moveIngredient(0, 1);

        // Проверим, что ингредиенты были перемещены правильно
        assertEquals(mockIngredient2, burger.ingredients.get(0));
        assertEquals(mockIngredient1, burger.ingredients.get(1));
    }

    @Test
    public void testGetReceipt() {
        // Создаем экземпляры булки и ингредиентов
        Bun bun = new Bun("sesame bun", 100);
        Ingredient ingredient1 = new Ingredient(IngredientType.SAUCE, "ketchup", 50);
        Ingredient ingredient2 = new Ingredient(IngredientType.FILLING, "beef patty", 100);

        // Устанавливаем булку и добавляем ингредиенты в бургер
        burger.setBuns(bun);
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);

        // Ожидаемая строка чека
        String expectedReceipt = "(==== sesame bun ====)\r\n" +
                "= sauce ketchup =\r\n" +
                "= filling beef patty =\r\n" +
                "(==== sesame bun ====)\r\n" +
                "\r\n" +
                String.format("Price: %.6f\r\n", burger.getPrice()); // Используем String.format

        // Получаем реальное значение чека с помощью метода getReceipt()
        String actualReceipt = burger.getReceipt();

        // Проверяем, что ожидаемая строка и реальное значение совпадают
        assertEquals(expectedReceipt, actualReceipt);
    }
}

