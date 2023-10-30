package tech.alexnijjar.golemoverhaul.common.registry;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import tech.alexnijjar.golemoverhaul.GolemOverhaul;
import tech.alexnijjar.golemoverhaul.common.blocks.CandleGolemBlock;

public class ModBlocks {
    public static final ResourcefulRegistry<Block> BLOCKS = ResourcefulRegistries.create(BuiltInRegistries.BLOCK, GolemOverhaul.MOD_ID);

    public static final RegistryEntry<Block> CANDLE_GOLEM_BLOCK = BLOCKS.register("candle_golem_block", () -> new CandleGolemBlock(Block.Properties.copy(Blocks.CANDLE).lightLevel(s -> s.getValue(CandleGolemBlock.LIT) ? 12 : 0)));
}
