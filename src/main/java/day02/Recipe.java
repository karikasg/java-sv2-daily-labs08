package day02;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

//Készíts egy day02.Recipe osztályt, melynek van egy neve, egy hozzávalók listája és egy leírása (minden String típusú).
// Receptet létre lehet hozni csak a neve alapján, vagy név és leírás alapján.
//Legyen egy addIngridient() metódus, amivel LEGALÁBB egy hozzávalót hozzá lehet adni a listához. (Egyet kötelező!)

    private String name;
    private List<String> ingredients = new ArrayList<>();
    private String description;

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addIngridient(String ingredient1, String... moreIngredients) {
        ingredients.add(ingredient1);
        for (String ingredient : moreIngredients) {
            ingredients.add(ingredient);
        }
    }

    public static void main(String[] args) {
        Recipe recipe1 = new Recipe("Kenőcs", "Fájdalomcsillapító kenőcs");
        recipe1.addIngridient("vazelin");
        recipe1.addIngridient("menthol", "efedrin", "kapszaicin");

        System.out.println(recipe1);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", description='" + description + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getDescription() {
        return description;
    }
}
