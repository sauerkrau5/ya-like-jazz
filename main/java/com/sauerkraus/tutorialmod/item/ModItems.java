package com.sauerkraus.tutorialmod.item;

import com.sauerkraus.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                TutorialMod.MOD_ID);

        // items
        public static final RegistryObject<Item> AMETHYST = ITEMS.register
                ("amethyst", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));


        public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }

    }
