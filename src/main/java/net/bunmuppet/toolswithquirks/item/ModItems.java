package net.bunmuppet.toolswithquirks.item;


import net.bunmuppet.toolswithquirks.ToolsWithQuirks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //ITEM GROUPS
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(WOODEN_HANDLE);
        entries.add(BAMBOO_STALK);
        entries.add(BAMBOO_STRIPPED_STALK);
        entries.add(BAMBOO_BUNDLE);
    }

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries){
        entries.add(WOODEN_BIRCH_SWORD);
        entries.add(WOODEN_ACACIA_SWORD);
        entries.add(WOODEN_SPRUCE_SWORD);
        entries.add(WOODEN_CRIMSON_SWORD);
        entries.add(WOODEN_DARK_OAK_SWORD);
        entries.add(WOODEN_JUNGLE_SWORD);
        entries.add(WOODEN_MANGROVE_SWORD);
        entries.add(WOODEN_WARPED_SWORD);
        entries.add(WOODEN_CHERRY_SWORD);
        entries.add(BAMBOO_STALK_SWORD);
        entries.add(WOODEN_BIRCH_AXE);
        entries.add(WOODEN_ACACIA_AXE);
        entries.add(WOODEN_SPRUCE_AXE);
        entries.add(WOODEN_CRIMSON_AXE);
        entries.add(WOODEN_DARK_OAK_AXE);
        entries.add(WOODEN_JUNGLE_AXE);
        entries.add(WOODEN_MANGROVE_AXE);
        entries.add(WOODEN_WARPED_AXE);
        entries.add(WOODEN_CHERRY_AXE);
        entries.add(BAMBOO_STALK_AXE);
        entries.add(BAMBOO_SHANK);
    }

    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries){
        entries.add(WOODEN_BIRCH_PICKAXE);
        entries.add(WOODEN_ACACIA_PICKAXE);
        entries.add(WOODEN_SPRUCE_PICKAXE);
        entries.add(WOODEN_CRIMSON_PICKAXE);
        entries.add(WOODEN_DARK_OAK_PICKAXE);
        entries.add(WOODEN_JUNGLE_PICKAXE);
        entries.add(WOODEN_MANGROVE_PICKAXE);
        entries.add(WOODEN_WARPED_PICKAXE);
        entries.add(WOODEN_CHERRY_PICKAXE);
        entries.add(BAMBOO_STALK_PICKAXE);
        entries.add(WOODEN_BIRCH_HOE);
        entries.add(WOODEN_ACACIA_HOE);
        entries.add(WOODEN_SPRUCE_HOE);
        entries.add(WOODEN_CRIMSON_HOE);
        entries.add(WOODEN_DARK_OAK_HOE);
        entries.add(WOODEN_JUNGLE_HOE);
        entries.add(WOODEN_MANGROVE_HOE);
        entries.add(WOODEN_WARPED_HOE);
        entries.add(WOODEN_CHERRY_HOE);
        entries.add(BAMBOO_STALK_HOE);
        entries.add(WOODEN_BIRCH_SHOVEL);
        entries.add(WOODEN_ACACIA_SHOVEL);
        entries.add(WOODEN_SPRUCE_SHOVEL);
        entries.add(WOODEN_CRIMSON_SHOVEL);
        entries.add(WOODEN_DARK_OAK_SHOVEL);
        entries.add(WOODEN_JUNGLE_SHOVEL);
        entries.add(WOODEN_MANGROVE_SHOVEL);
        entries.add(WOODEN_WARPED_SHOVEL);
        entries.add(WOODEN_CHERRY_SHOVEL);
        entries.add(BAMBOO_STALK_SHOVEL);

    }

    //MISC ITEMS STATISTICS
    public static final Item BAMBOO_BUNDLE = registerItem("bamboo_bundle", new Item(new Item.Settings()));
    public static final Item BAMBOO_STRIPPED_STALK = registerItem("bamboo_stripped_stalk", new Item(new Item.Settings()));

    //MISC ITEMS LOGIC
    public static Item registerItem(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(ToolsWithQuirks.MOD_ID, name), item
        );
    }

    //WOODEN HANDLE STATISTICS
    public static final Item WOODEN_HANDLE = registerTool("wooden_handle", new Item(new Item.Settings()));
    public static final Item BAMBOO_STALK = registerTool("bamboo_stalk", new Item(new Item.Settings()));

    //HANDLE LOGIC
    public static Item registerTool(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(ToolsWithQuirks.MOD_ID, name), item
        );
    }

    //BAMBOO SHANK STATISTICS
    public static final Item BAMBOO_SHANK = DurabilityCraftingSwordItem("bamboo_shank",
            ToolMaterials.WOOD, 1, -0.4F);

    //BAMBOO SHANK LOGIC
    public static Item DurabilityCraftingSwordItem(String name, ToolMaterial material, int attackDamage, float attackSpeed) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(ToolsWithQuirks.MOD_ID, name),
                new DurabilityCraftingSwordItem(material, attackDamage, attackSpeed, new Item.Settings().maxDamage(30))
        );
    }


    // SWORD STATISTICS
    public static final Item WOODEN_BIRCH_SWORD = registerSword("wooden_birch_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_ACACIA_SWORD = registerSword("wooden_acacia_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_SPRUCE_SWORD = registerSword("wooden_spruce_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_CRIMSON_SWORD  = registerSword("wooden_crimson_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_DARK_OAK_SWORD  = registerSword("wooden_dark_oak_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_JUNGLE_SWORD  = registerSword("wooden_jungle_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_MANGROVE_SWORD  = registerSword("wooden_mangrove_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_WARPED_SWORD  = registerSword("wooden_warped_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item WOODEN_CHERRY_SWORD  = registerSword("wooden_cherry_sword",
            ToolMaterials.WOOD, 3, -2.4F);
    public static final Item BAMBOO_STALK_SWORD  = registerSword("bamboo_stalk_sword",
            ToolMaterials.WOOD, 3, -2.4F);

    // SWORD LOGIC
    public static Item registerSword(String name, ToolMaterials material, int attackDamage, float attackSpeed) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(ToolsWithQuirks.MOD_ID, name),
                new SwordItem(material, attackDamage, attackSpeed, new Item.Settings())
        );
    }
    //PICKAXE STATISTICS
    public static final Item WOODEN_BIRCH_PICKAXE = registerPickaxe("wooden_birch_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_ACACIA_PICKAXE = registerPickaxe("wooden_acacia_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_SPRUCE_PICKAXE = registerPickaxe("wooden_spruce_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_CRIMSON_PICKAXE = registerPickaxe("wooden_crimson_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_DARK_OAK_PICKAXE = registerPickaxe("wooden_dark_oak_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_JUNGLE_PICKAXE = registerPickaxe("wooden_jungle_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_MANGROVE_PICKAXE = registerPickaxe("wooden_mangrove_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_WARPED_PICKAXE = registerPickaxe("wooden_warped_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item WOODEN_CHERRY_PICKAXE = registerPickaxe("wooden_cherry_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);
    public static final Item BAMBOO_STALK_PICKAXE = registerPickaxe("bamboo_stalk_pickaxe",
            ToolMaterials.WOOD, 1, -2.8F);

    //PICKAXE LOGIC
    public static Item registerPickaxe(String name, ToolMaterials material, int attackDamage, float attackSpeed) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(ToolsWithQuirks.MOD_ID, name),
                new PickaxeItem(material, attackDamage, attackSpeed, new Item.Settings())
        );
    }
    //AXE STATISTICS
    public static final Item WOODEN_BIRCH_AXE = registerAxe("wooden_birch_axe",
            ToolMaterials.WOOD,  6, -3.2F);
    public static final Item WOODEN_ACACIA_AXE = registerAxe("wooden_acacia_axe",
            ToolMaterials.WOOD,  6, -3.2F);
    public static final Item WOODEN_SPRUCE_AXE = registerAxe("wooden_spruce_axe",
            ToolMaterials.WOOD,  6, -3.2F);
    public static final Item WOODEN_CRIMSON_AXE = registerAxe("wooden_crimson_axe",
            ToolMaterials.WOOD,  6, -3.2F);
    public static final Item WOODEN_DARK_OAK_AXE = registerAxe("wooden_dark_oak_axe",
            ToolMaterials.WOOD,  6, -3.2F);
    public static final Item WOODEN_JUNGLE_AXE = registerAxe("wooden_jungle_axe",
            ToolMaterials.WOOD,  6, -3.2F);
    public static final Item WOODEN_MANGROVE_AXE = registerAxe("wooden_mangrove_axe",
            ToolMaterials.WOOD,  6, -3.2F);
    public static final Item WOODEN_WARPED_AXE = registerAxe("wooden_warped_axe",
            ToolMaterials.WOOD,  6, -3.2F);
    public static final Item WOODEN_CHERRY_AXE = registerAxe("wooden_cherry_axe",
            ToolMaterials.WOOD,  6, -3.2F);
    public static final Item BAMBOO_STALK_AXE = registerAxe("bamboo_stalk_axe",
            ToolMaterials.WOOD,  6, -3.2F);

    //AXE LOGIC
    public static Item registerAxe(String name, ToolMaterials material, int attackDamage, float attackSpeed) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(ToolsWithQuirks.MOD_ID, name),
                new AxeItem(material, attackDamage, attackSpeed, new Item.Settings())
        );
    }

    //HOE STATISTICS
    public static final Item WOODEN_BIRCH_HOE = registerHoe("wooden_birch_hoe",
            ToolMaterials.WOOD,  0, -3.0F);
    public static final Item WOODEN_ACACIA_HOE = registerHoe("wooden_acacia_hoe",
            ToolMaterials.WOOD,  0, -3.0F);
    public static final Item WOODEN_SPRUCE_HOE = registerHoe("wooden_spruce_hoe",
            ToolMaterials.WOOD,  0, -3.0F);
    public static final Item WOODEN_CRIMSON_HOE  = registerHoe("wooden_crimson_hoe",
            ToolMaterials.WOOD,  0, -3.0F);
    public static final Item WOODEN_DARK_OAK_HOE  = registerHoe("wooden_dark_oak_hoe",
            ToolMaterials.WOOD,  0, -3.0F);
    public static final Item WOODEN_JUNGLE_HOE  = registerHoe("wooden_jungle_hoe",
            ToolMaterials.WOOD,  0, -3.0F);
    public static final Item WOODEN_MANGROVE_HOE  = registerHoe("wooden_mangrove_hoe",
            ToolMaterials.WOOD,  0, -3.0F);
    public static final Item WOODEN_WARPED_HOE  = registerHoe("wooden_warped_hoe",
            ToolMaterials.WOOD,  0, -3.0F);
    public static final Item WOODEN_CHERRY_HOE  = registerHoe("wooden_cherry_hoe",
            ToolMaterials.WOOD,  0, -3.0F);
    public static final Item BAMBOO_STALK_HOE  = registerHoe("bamboo_stalk_hoe",
            ToolMaterials.WOOD,  0, -3.0F);


    //HOE LOGIC
    public static Item registerHoe(String name, ToolMaterials material, int attackDamage, float attackSpeed) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(ToolsWithQuirks.MOD_ID, name),
                new HoeItem(material, attackDamage, attackSpeed, new Item.Settings())
        );
    }

    //SHOVEL STATISTICS
    public static final Item WOODEN_BIRCH_SHOVEL = registerShovel("wooden_birch_shovel",
            ToolMaterials.WOOD,  1.5, -3.0F);
    public static final Item WOODEN_ACACIA_SHOVEL = registerShovel("wooden_acacia_shovel",
            ToolMaterials.WOOD,  1.5, -3.0F);
    public static final Item WOODEN_SPRUCE_SHOVEL = registerShovel("wooden_spruce_shovel",
            ToolMaterials.WOOD,  1.5, -3.0F);
    public static final Item WOODEN_CRIMSON_SHOVEL  = registerShovel("wooden_crimson_shovel",
            ToolMaterials.WOOD,  1.5, -3.0F);
    public static final Item WOODEN_DARK_OAK_SHOVEL  = registerShovel("wooden_dark_oak_shovel",
            ToolMaterials.WOOD,  1.5, -3.0F);
    public static final Item WOODEN_JUNGLE_SHOVEL  = registerShovel("wooden_jungle_shovel",
            ToolMaterials.WOOD,  1.5, -3.0F);
    public static final Item WOODEN_MANGROVE_SHOVEL  = registerShovel("wooden_mangrove_shovel",
            ToolMaterials.WOOD,  1.5, -3.0F);
    public static final Item WOODEN_WARPED_SHOVEL  = registerShovel("wooden_warped_shovel",
            ToolMaterials.WOOD,  1.5, -3.0F);
    public static final Item WOODEN_CHERRY_SHOVEL  = registerShovel("wooden_cherry_shovel",
            ToolMaterials.WOOD,  1.5, -3.0F);
    public static final Item BAMBOO_STALK_SHOVEL  = registerShovel("bamboo_stalk_shovel",
            ToolMaterials.WOOD,  1.5, -3.0F);

    //SHOVEL LOGIC
    public static Item registerShovel(String name, ToolMaterials material, double attackDamage, float attackSpeed) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(ToolsWithQuirks.MOD_ID, name),
                new ShovelItem(material,(float) attackDamage, attackSpeed, new Item.Settings())
        );
    }

    public static void registerModItems() {
        ToolsWithQuirks.LOGGER.info("Registering Mod Items for " + ToolsWithQuirks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }
}