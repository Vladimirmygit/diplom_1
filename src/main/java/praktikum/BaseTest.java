package praktikum;

import org.junit.Before;
import org.mockito.Mockito;

public class BaseTest {

    protected Bun mockBun;
    protected Ingredient mockIngredient1;
    protected Ingredient mockIngredient2;
    public Burger burger;
    @Before
    public void setUp() {
        burger = new Burger();

        mockBun = Mockito.mock(Bun.class);
        Mockito.when(mockBun.getPrice()).thenReturn(100F);

        mockIngredient1 = Mockito.mock(Ingredient.class);
        Mockito.when(mockIngredient1.getPrice()).thenReturn(50F);

        mockIngredient2 = Mockito.mock(Ingredient.class);
        Mockito.when(mockIngredient2.getPrice()).thenReturn(75F);
    }
}

