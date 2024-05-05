package avm.repository;

import avm.products.ClothProduct;

import java.util.*;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Project AVM/ClothShop
 * @author Valerian
 * @version Apr-2024
 */
public class ClothRepository {
    private Map<Integer, ClothProduct> clothMap;

    public ClothRepository() {
        clothMap = new HashMap<>();
    }

    public void put(ClothProduct clothProduct) {
        clothMap.put(clothProduct.getId(), clothProduct);
    }

    public ClothProduct get(int id) {
        return clothMap.get(id);
    }

    public void remove(int id) {
        clothMap.remove(id);
    }

    public Collection<ClothProduct> values() {
        return clothMap.values();
    }

    public void initCloth() {
        List<ClothProduct> clothProducts = new ArrayList<>(List.of(
                new ClothProduct("Jeans", 150, 39, 50),
                new ClothProduct("Esprit", 500, 42, 40),
                new ClothProduct("Jeans", 90, 38, 30),
                new ClothProduct("Boss", 150, 44, 50),
                new ClothProduct("Hilfiger", 9, 45, 20)
        ));
        clothProducts.forEach(clothProduct -> put(clothProduct));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCloth Repository:\n");
        clothMap.forEach((Integer, clothProduct) -> {
            sb.append(clothProduct).append("\n");
        });
        return sb.toString();
    }
}