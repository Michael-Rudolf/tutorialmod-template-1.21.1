package net.michaelrudolf.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.michaelrudolf.tutorialmod.TutorialMod;
import net.michaelrudolf.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        // Items
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        // Blocks
                        entries.add(ModBlocks.RUBY_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering item groups for " + TutorialMod.MOD_ID + ".");


    }
}
