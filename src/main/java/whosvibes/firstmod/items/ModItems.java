package whosvibes.firstmod.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import whosvibes.firstmod.Firstmod;

public class ModItems {

    public static final Item BIG_SWORD = registerItem("big_sword", new Item(new Item.Settings()));

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemToCreativeTab);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Firstmod.MOD_ID, name), item);
    }

    public static void addItemToCreativeTab(FabricItemGroupEntries entries){
        entries.add(BIG_SWORD);
    }
}
