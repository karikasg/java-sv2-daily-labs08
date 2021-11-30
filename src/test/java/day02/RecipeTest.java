package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void testRecipe() {
        Recipe recipe1 = new Recipe("Kenőcs", "Fájdalomcsillapító kenőcs");
        recipe1.addIngridient("vazelin");
        recipe1.addIngridient("menthol", "efedrin", "kapszaicin");

        assertEquals("vazelin", recipe1.getIngredients().get(0));
        assertEquals("kapszaicin", recipe1.getIngredients().get(3));
        assertEquals("Kenőcs", recipe1.getName());
    }

}