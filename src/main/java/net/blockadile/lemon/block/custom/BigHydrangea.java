package net.blockadile.lemon.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class BigHydrangea extends TallFlowerBlock {
    public BigHydrangea(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }
}
