package files;

import java.util.ArrayList;
import java.util.List;

public class CBlock implements CompositeBlock {
    private String color;
    private String material;

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public CBlock() {
    }

    public CBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }
    public List getBlocks(){
        List blocks = new ArrayList<CBlock>();
        blocks.add(new CBlock("green", "metal"));
        blocks.add(new CBlock("blue", "plastic"));
        blocks.add(new CBlock("white", "metal"));
        return blocks;
    }
}
