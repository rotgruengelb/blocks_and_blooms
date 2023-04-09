package net.rotgruengelb.blocks_blooms.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rotgruengelb.blocks_blooms.Blocks_Blooms;

public class ModItemGroup {
    public static ItemGroup DECORATIONS;

    public static void registerItemGroups() {
        DECORATIONS = FabricItemGroup.builder(new Identifier(Blocks_Blooms.MOD_ID, "decorations"))
                .displayName(Text.translatable("itemgroup.decorations"))
                .icon(() -> new ItemStack(ModItems.XEPLIN)).build();
    }
}
