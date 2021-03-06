package io.github.teamgalacticraft.galacticraft.api.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateFactory;
import net.minecraft.state.property.EnumProperty;

/**
 * @author <a href="https://github.com/teamgalacticraft">TeamGalacticraft</a>
 */
public class AbstactMachineBlockAbstract extends AbstractHorizontalDirectionalBlock {

    /**
     * Set {@link MachineBlockStatus} as a block property.
     */
    public final EnumProperty<MachineBlockStatus> MACHINE_STATUS = EnumProperty.create("status", MachineBlockStatus.class);

    public AbstactMachineBlockAbstract(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateFactory.Builder<Block, BlockState> blockStateBuilder) {
        super.appendProperties(blockStateBuilder);
        blockStateBuilder.with(MACHINE_STATUS);
    }
}
