package net.rotgruengelb.blocks_blooms.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rotgruengelb.blocks_blooms.Blocks_Blooms;

public class ModItems {
    public static final Item RAW_XEPLIN = registerItem("raw_xeplin",
            new Item(new FabricItemSettings()));
    public static final Item XEPLIN = registerItem("xeplin",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Blocks_Blooms.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.DECORATIONS, RAW_XEPLIN);
        addToItemGroup(ModItemGroup.DECORATIONS, XEPLIN);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        Blocks_Blooms.LOGGER.info("Registering Mod Items for " + Blocks_Blooms.MOD_ID);

        addItemsToItemGroup();
    }
}
