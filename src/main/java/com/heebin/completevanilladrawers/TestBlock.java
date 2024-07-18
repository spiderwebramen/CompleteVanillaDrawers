package com.heebin.completevanilladrawers;

import net.minecraft.world.level.block.state.BlockBehaviour;
import com.jaquadro.minecraft.storagedrawers.block.BlockStandardDrawers;

public class TestBlock extends BlockStandardDrawers {

    public TestBlock(int drawerCount, boolean halfDepth, int storageUnits, BlockBehaviour.Properties properties) {
        super(drawerCount, halfDepth, storageUnits, properties);
    }

    public TestBlock(int drawerCount, boolean halfDepth, BlockBehaviour.Properties properties) {
        super(drawerCount, halfDepth, properties);
    }
}
