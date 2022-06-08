import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;

import files.CBlock;

public class Wall implements Structure {

    private static List<CBlock> blocks;

    public Optional findBlockByColor(String color) {
        for (int i = 0; i < blocks.size(); i++) {
            if (color.equals(blocks.get(i).getColor()))
                return Optional.of(blocks.get(i));
        }
        return null;
    }

    public List findBlocksByMaterial(String material) {
        List blocksWithMaterial = new ArrayList<CBlock>();
        for (int i = 0; i < blocks.size(); i++) {
            if (material.equals(blocks.get(i).getMaterial()))
                blocksWithMaterial.add(blocks.get(i));
        }
        return blocksWithMaterial;
    }

    public int count() {
        return blocks.size();
    }

    public static void main(String[] args) {
        Wall wall = new Wall();
        wall.blocks = new CBlock().getBlocks();
        System.out.println(wall.findBlockByColor("blue"));
        System.out.println(wall.findBlocksByMaterial("metal"));
        System.out.println(wall.count());
    }
}
