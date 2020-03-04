package per.gyx.hongyistore.common;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private static List<List<String>> categories = new ArrayList<>();
    static {
        List<String> skinCare = new ArrayList<>();
        skinCare.add("hairmask");
        skinCare.add("washwater");
        categories.add(skinCare);
    }

    public static List<List<String>> getCategories() {
        return categories;
    }

    public static void setCategories(List<List<String>> categories) {
        Category.categories = categories;
    }
}
