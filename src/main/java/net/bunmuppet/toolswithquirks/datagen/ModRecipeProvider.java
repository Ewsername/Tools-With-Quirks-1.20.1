package net.bunmuppet.toolswithquirks.datagen;

import net.bunmuppet.toolswithquirks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider{


    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        //BAMBOO SPECIAL ITEMS RECIPES ---------------------------------------------------------------------------

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BAMBOO_SHANK)
                .input(Items.BAMBOO)
                .input(Items.FLINT)
                .criterion(hasItem(Items.BAMBOO),
                        conditionsFromItem(Items.BAMBOO))
                .criterion(hasItem(Items.FLINT),
                        conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BAMBOO_SHANK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BAMBOO_STALK, 2)
                .input(ModItems.BAMBOO_BUNDLE)
                .input(ModItems.BAMBOO_SHANK)
                .criterion(hasItem(Items.BAMBOO),
                        conditionsFromItem(Items.BAMBOO))
                .criterion(hasItem(ModItems.BAMBOO_SHANK),
                        conditionsFromItem(ModItems.BAMBOO_SHANK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BAMBOO_STALK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BAMBOO_STRIPPED_STALK, 2)
                .input(ModItems.BAMBOO_STALK)
                .input(ModItems.BAMBOO_SHANK)
                .criterion(hasItem(ModItems.BAMBOO_STALK),
                        conditionsFromItem(ModItems.BAMBOO_STALK))
                .criterion(hasItem(ModItems.BAMBOO_SHANK),
                        conditionsFromItem(ModItems.BAMBOO_SHANK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BAMBOO_STRIPPED_STALK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BAMBOO_BUNDLE)
                .pattern("BBB")
                .pattern("BZB")
                .pattern("BBB")
                .input('B', Items.BAMBOO)
                .input('Z', Items.STRING)
                .criterion(hasItem(Items.BAMBOO),
                        conditionsFromItem(Items.BAMBOO))
                .criterion(hasItem(Items.STRING),
                        conditionsFromItem(Items.STRING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BAMBOO_BUNDLE)));

        //MISC BAMBOO
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CARVED_PUMPKIN)
                .input(Items.PUMPKIN)
                .input(ModItems.BAMBOO_SHANK)
                .criterion(hasItem(Items.PUMPKIN),
                        conditionsFromItem(Items.PUMPKIN))
                .criterion(hasItem(ModItems.BAMBOO_SHANK),
                        conditionsFromItem(ModItems.BAMBOO_SHANK))
                .offerTo(exporter, new Identifier(getRecipeName(Items.CARVED_PUMPKIN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STRING)
                .input(Items.BAMBOO)
                .input(ModItems.BAMBOO_SHANK)
                .criterion(hasItem(Items.BAMBOO),
                        conditionsFromItem(Items.BAMBOO))
                .criterion(hasItem(ModItems.BAMBOO_SHANK),
                        conditionsFromItem(ModItems.BAMBOO_SHANK))
                .offerTo(exporter, new Identifier(getRecipeName(Items.STRING)));

        //BAMBOO TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BAMBOO_STALK_AXE)
                .pattern("XR ")
                .pattern("XR ")
                .pattern(" R ")
                .input('R', ModItems.BAMBOO_STALK)
                .input('X', ModItems.BAMBOO_STRIPPED_STALK)
                .criterion(hasItem(ModItems.BAMBOO_STALK),
                        conditionsFromItem(ModItems.BAMBOO_STALK))
                .criterion(hasItem(ModItems.BAMBOO_STRIPPED_STALK),
                        conditionsFromItem(ModItems.BAMBOO_STRIPPED_STALK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BAMBOO_STALK_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BAMBOO_STALK_HOE)
                .pattern("XX ")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', ModItems.BAMBOO_STALK)
                .input('X', ModItems.BAMBOO_STRIPPED_STALK)
                .criterion(hasItem(ModItems.BAMBOO_STALK),
                        conditionsFromItem(ModItems.BAMBOO_STALK))
                .criterion(hasItem(ModItems.BAMBOO_STRIPPED_STALK),
                        conditionsFromItem(ModItems.BAMBOO_STRIPPED_STALK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BAMBOO_STALK_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BAMBOO_STALK_PICKAXE)
                .pattern("XRX")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', ModItems.BAMBOO_STALK)
                .input('X', ModItems.BAMBOO_STRIPPED_STALK)
                .criterion(hasItem(ModItems.BAMBOO_STALK),
                        conditionsFromItem(ModItems.BAMBOO_STALK))
                .criterion(hasItem(ModItems.BAMBOO_STRIPPED_STALK),
                        conditionsFromItem(ModItems.BAMBOO_STRIPPED_STALK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BAMBOO_STALK_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BAMBOO_STALK_SHOVEL)
                .pattern(" XX")
                .pattern(" R ")
                .pattern("   ")
                .input('R', ModItems.BAMBOO_STALK)
                .input('X', ModItems.BAMBOO_STRIPPED_STALK)
                .criterion(hasItem(ModItems.BAMBOO_STALK),
                        conditionsFromItem(ModItems.BAMBOO_STALK))
                .criterion(hasItem(ModItems.BAMBOO_STRIPPED_STALK),
                        conditionsFromItem(ModItems.BAMBOO_STRIPPED_STALK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BAMBOO_STALK_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BAMBOO_STALK_SWORD)
                .pattern(" X ")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', ModItems.BAMBOO_STALK)
                .input('X', ModItems.BAMBOO_STRIPPED_STALK)
                .criterion(hasItem(ModItems.BAMBOO_STALK),
                        conditionsFromItem(ModItems.BAMBOO_STALK))
                .criterion(hasItem(ModItems.BAMBOO_STRIPPED_STALK),
                        conditionsFromItem(ModItems.BAMBOO_STRIPPED_STALK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BAMBOO_STALK_SWORD)));


        //CHERRY TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_CHERRY_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.CHERRY_PLANKS)
                .input('S', Items.CHERRY_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.CHERRY_PLANKS),
                        conditionsFromItem(Items.CHERRY_PLANKS))
                .criterion(hasItem(Items.CHERRY_SLAB),
                        conditionsFromItem(Items.CHERRY_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_CHERRY_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_CHERRY_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.CHERRY_PLANKS)
                .input('S', Items.CHERRY_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.CHERRY_PLANKS),
                        conditionsFromItem(Items.CHERRY_PLANKS))
                .criterion(hasItem(Items.CHERRY_SLAB),
                        conditionsFromItem(Items.CHERRY_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_CHERRY_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_CHERRY_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.CHERRY_PLANKS)
                .input('S', Items.CHERRY_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.CHERRY_PLANKS),
                        conditionsFromItem(Items.CHERRY_PLANKS))
                .criterion(hasItem(Items.CHERRY_SLAB),
                        conditionsFromItem(Items.CHERRY_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_CHERRY_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_CHERRY_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.CHERRY_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.CHERRY_SLAB),
                        conditionsFromItem(Items.CHERRY_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_CHERRY_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_CHERRY_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.CHERRY_PLANKS)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.CHERRY_PLANKS),
                        conditionsFromItem(Items.CHERRY_PLANKS))
                .criterion(hasItem(Items.CHERRY_SLAB),
                        conditionsFromItem(Items.CHERRY_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_CHERRY_SWORD)));

        //ACACIA TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_ACACIA_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.ACACIA_PLANKS)
                .input('S', Items.ACACIA_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.ACACIA_PLANKS),
                        conditionsFromItem(Items.ACACIA_PLANKS))
                .criterion(hasItem(Items.ACACIA_SLAB),
                        conditionsFromItem(Items.ACACIA_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_ACACIA_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_ACACIA_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.ACACIA_PLANKS)
                .input('S', Items.ACACIA_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.ACACIA_PLANKS),
                        conditionsFromItem(Items.ACACIA_PLANKS))
                .criterion(hasItem(Items.ACACIA_SLAB),
                        conditionsFromItem(Items.ACACIA_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_ACACIA_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_ACACIA_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.ACACIA_PLANKS)
                .input('S', Items.ACACIA_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.ACACIA_PLANKS),
                        conditionsFromItem(Items.ACACIA_PLANKS))
                .criterion(hasItem(Items.ACACIA_SLAB),
                        conditionsFromItem(Items.ACACIA_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_ACACIA_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_ACACIA_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.ACACIA_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.ACACIA_SLAB),
                        conditionsFromItem(Items.ACACIA_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_ACACIA_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_ACACIA_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.ACACIA_PLANKS)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.ACACIA_PLANKS),
                        conditionsFromItem(Items.ACACIA_PLANKS))
                .criterion(hasItem(Items.ACACIA_SLAB),
                        conditionsFromItem(Items.ACACIA_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_ACACIA_SWORD)));

        //BIRCH TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_BIRCH_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.BIRCH_PLANKS)
                .input('S', Items.BIRCH_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.BIRCH_PLANKS),
                        conditionsFromItem(Items.BIRCH_PLANKS))
                .criterion(hasItem(Items.BIRCH_SLAB),
                        conditionsFromItem(Items.BIRCH_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_BIRCH_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_BIRCH_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.BIRCH_PLANKS)
                .input('S', Items.BIRCH_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.BIRCH_PLANKS),
                        conditionsFromItem(Items.BIRCH_PLANKS))
                .criterion(hasItem(Items.BIRCH_SLAB),
                        conditionsFromItem(Items.BIRCH_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_BIRCH_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_BIRCH_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.BIRCH_PLANKS)
                .input('S', Items.BIRCH_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.BIRCH_PLANKS),
                        conditionsFromItem(Items.BIRCH_PLANKS))
                .criterion(hasItem(Items.BIRCH_SLAB),
                        conditionsFromItem(Items.BIRCH_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_BIRCH_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_BIRCH_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.BIRCH_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.BIRCH_SLAB),
                        conditionsFromItem(Items.BIRCH_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_BIRCH_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_BIRCH_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.BIRCH_PLANKS)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.BIRCH_PLANKS),
                        conditionsFromItem(Items.BIRCH_PLANKS))
                .criterion(hasItem(Items.BIRCH_SLAB),
                        conditionsFromItem(Items.BIRCH_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_BIRCH_SWORD)));

        //CRIMSON TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_CRIMSON_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.CRIMSON_PLANKS)
                .input('S', Items.CRIMSON_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.CRIMSON_PLANKS),
                        conditionsFromItem(Items.CRIMSON_PLANKS))
                .criterion(hasItem(Items.CRIMSON_SLAB),
                        conditionsFromItem(Items.CRIMSON_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_CRIMSON_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_CRIMSON_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.CRIMSON_PLANKS)
                .input('S', Items.CRIMSON_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.CRIMSON_PLANKS),
                        conditionsFromItem(Items.CRIMSON_PLANKS))
                .criterion(hasItem(Items.CRIMSON_SLAB),
                        conditionsFromItem(Items.CRIMSON_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_CRIMSON_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_CRIMSON_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.CRIMSON_PLANKS)
                .input('S', Items.CRIMSON_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.CRIMSON_PLANKS),
                        conditionsFromItem(Items.CRIMSON_PLANKS))
                .criterion(hasItem(Items.CRIMSON_SLAB),
                        conditionsFromItem(Items.CRIMSON_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_CRIMSON_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_CRIMSON_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.CRIMSON_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.CRIMSON_SLAB),
                        conditionsFromItem(Items.CRIMSON_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_CRIMSON_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_CRIMSON_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.CRIMSON_PLANKS)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.CRIMSON_PLANKS),
                        conditionsFromItem(Items.CRIMSON_PLANKS))
                .criterion(hasItem(Items.CRIMSON_SLAB),
                        conditionsFromItem(Items.CRIMSON_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_CRIMSON_SWORD)));

        //DARK_OAK TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_DARK_OAK_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.DARK_OAK_PLANKS)
                .input('S', Items.DARK_OAK_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.DARK_OAK_PLANKS),
                        conditionsFromItem(Items.DARK_OAK_PLANKS))
                .criterion(hasItem(Items.DARK_OAK_SLAB),
                        conditionsFromItem(Items.DARK_OAK_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_DARK_OAK_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_DARK_OAK_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.DARK_OAK_PLANKS)
                .input('S', Items.DARK_OAK_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.DARK_OAK_PLANKS),
                        conditionsFromItem(Items.DARK_OAK_PLANKS))
                .criterion(hasItem(Items.DARK_OAK_SLAB),
                        conditionsFromItem(Items.DARK_OAK_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_DARK_OAK_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_DARK_OAK_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.DARK_OAK_PLANKS)
                .input('S', Items.DARK_OAK_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.DARK_OAK_PLANKS),
                        conditionsFromItem(Items.DARK_OAK_PLANKS))
                .criterion(hasItem(Items.DARK_OAK_SLAB),
                        conditionsFromItem(Items.DARK_OAK_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_DARK_OAK_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_DARK_OAK_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.DARK_OAK_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.DARK_OAK_SLAB),
                        conditionsFromItem(Items.DARK_OAK_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_DARK_OAK_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_DARK_OAK_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.DARK_OAK_PLANKS)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.DARK_OAK_PLANKS),
                        conditionsFromItem(Items.DARK_OAK_PLANKS))
                .criterion(hasItem(Items.DARK_OAK_SLAB),
                        conditionsFromItem(Items.DARK_OAK_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_DARK_OAK_SWORD)));

        //JUNGLE TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_JUNGLE_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.JUNGLE_PLANKS)
                .input('S', Items.JUNGLE_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.JUNGLE_PLANKS),
                        conditionsFromItem(Items.JUNGLE_PLANKS))
                .criterion(hasItem(Items.JUNGLE_SLAB),
                        conditionsFromItem(Items.JUNGLE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_JUNGLE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_JUNGLE_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.JUNGLE_PLANKS)
                .input('S', Items.JUNGLE_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.JUNGLE_PLANKS),
                        conditionsFromItem(Items.JUNGLE_PLANKS))
                .criterion(hasItem(Items.JUNGLE_SLAB),
                        conditionsFromItem(Items.JUNGLE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_JUNGLE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_JUNGLE_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.JUNGLE_PLANKS)
                .input('S', Items.JUNGLE_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.JUNGLE_PLANKS),
                        conditionsFromItem(Items.JUNGLE_PLANKS))
                .criterion(hasItem(Items.JUNGLE_SLAB),
                        conditionsFromItem(Items.JUNGLE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_JUNGLE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_JUNGLE_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.JUNGLE_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.JUNGLE_SLAB),
                        conditionsFromItem(Items.JUNGLE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_JUNGLE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_JUNGLE_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.JUNGLE_PLANKS)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.JUNGLE_PLANKS),
                        conditionsFromItem(Items.JUNGLE_PLANKS))
                .criterion(hasItem(Items.JUNGLE_SLAB),
                        conditionsFromItem(Items.JUNGLE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_JUNGLE_SWORD)));

        //MANGROVE TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_MANGROVE_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.MANGROVE_PLANKS)
                .input('S', Items.MANGROVE_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.MANGROVE_PLANKS),
                        conditionsFromItem(Items.MANGROVE_PLANKS))
                .criterion(hasItem(Items.MANGROVE_SLAB),
                        conditionsFromItem(Items.MANGROVE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_MANGROVE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_MANGROVE_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.MANGROVE_PLANKS)
                .input('S', Items.MANGROVE_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.MANGROVE_PLANKS),
                        conditionsFromItem(Items.MANGROVE_PLANKS))
                .criterion(hasItem(Items.MANGROVE_SLAB),
                        conditionsFromItem(Items.MANGROVE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_MANGROVE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_MANGROVE_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.MANGROVE_PLANKS)
                .input('S', Items.MANGROVE_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.MANGROVE_PLANKS),
                        conditionsFromItem(Items.MANGROVE_PLANKS))
                .criterion(hasItem(Items.MANGROVE_SLAB),
                        conditionsFromItem(Items.MANGROVE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_MANGROVE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_MANGROVE_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.MANGROVE_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.MANGROVE_SLAB),
                        conditionsFromItem(Items.MANGROVE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_MANGROVE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_MANGROVE_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.MANGROVE_PLANKS)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.MANGROVE_PLANKS),
                        conditionsFromItem(Items.MANGROVE_PLANKS))
                .criterion(hasItem(Items.MANGROVE_SLAB),
                        conditionsFromItem(Items.MANGROVE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_MANGROVE_SWORD)));

        //SPRUCE TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_SPRUCE_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.SPRUCE_PLANKS)
                .input('S', Items.SPRUCE_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.SPRUCE_PLANKS),
                        conditionsFromItem(Items.SPRUCE_PLANKS))
                .criterion(hasItem(Items.SPRUCE_SLAB),
                        conditionsFromItem(Items.SPRUCE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_SPRUCE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_SPRUCE_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.SPRUCE_PLANKS)
                .input('S', Items.SPRUCE_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.SPRUCE_PLANKS),
                        conditionsFromItem(Items.SPRUCE_PLANKS))
                .criterion(hasItem(Items.SPRUCE_SLAB),
                        conditionsFromItem(Items.SPRUCE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_SPRUCE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_SPRUCE_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.SPRUCE_PLANKS)
                .input('S', Items.SPRUCE_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.SPRUCE_PLANKS),
                        conditionsFromItem(Items.SPRUCE_PLANKS))
                .criterion(hasItem(Items.SPRUCE_SLAB),
                        conditionsFromItem(Items.SPRUCE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_SPRUCE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_SPRUCE_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.SPRUCE_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.SPRUCE_SLAB),
                        conditionsFromItem(Items.SPRUCE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_SPRUCE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_SPRUCE_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.SPRUCE_PLANKS)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.SPRUCE_PLANKS),
                        conditionsFromItem(Items.SPRUCE_PLANKS))
                .criterion(hasItem(Items.SPRUCE_SLAB),
                        conditionsFromItem(Items.SPRUCE_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_SPRUCE_SWORD)));

        //WARPED TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_WARPED_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.WARPED_PLANKS)
                .input('S', Items.WARPED_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.WARPED_PLANKS),
                        conditionsFromItem(Items.WARPED_PLANKS))
                .criterion(hasItem(Items.WARPED_SLAB),
                        conditionsFromItem(Items.WARPED_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_WARPED_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_WARPED_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.WARPED_PLANKS)
                .input('S', Items.WARPED_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.WARPED_PLANKS),
                        conditionsFromItem(Items.WARPED_PLANKS))
                .criterion(hasItem(Items.WARPED_SLAB),
                        conditionsFromItem(Items.WARPED_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_WARPED_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_WARPED_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.WARPED_PLANKS)
                .input('S', Items.WARPED_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.WARPED_PLANKS),
                        conditionsFromItem(Items.WARPED_PLANKS))
                .criterion(hasItem(Items.WARPED_SLAB),
                        conditionsFromItem(Items.WARPED_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_WARPED_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_WARPED_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.WARPED_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.WARPED_SLAB),
                        conditionsFromItem(Items.WARPED_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_WARPED_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_WARPED_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.WARPED_PLANKS)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.WARPED_PLANKS),
                        conditionsFromItem(Items.WARPED_PLANKS))
                .criterion(hasItem(Items.WARPED_SLAB),
                        conditionsFromItem(Items.WARPED_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_WARPED_SWORD)));

        //OAK TOOLS RECIPES -----------------------------------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.WOODEN_AXE)
                .pattern(" P ")
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.OAK_PLANKS)
                .input('S', Items.OAK_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.OAK_PLANKS),
                        conditionsFromItem(Items.OAK_PLANKS))
                .criterion(hasItem(Items.OAK_SLAB),
                        conditionsFromItem(Items.OAK_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.WOODEN_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.WOODEN_HOE)
                .pattern("SP ")
                .pattern(" X ")
                .input('P', Items.OAK_PLANKS)
                .input('S', Items.OAK_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.OAK_PLANKS),
                        conditionsFromItem(Items.OAK_PLANKS))
                .criterion(hasItem(Items.OAK_SLAB),
                        conditionsFromItem(Items.OAK_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.WOODEN_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.WOODEN_PICKAXE)
                .pattern("PPS")
                .pattern(" X ")
                .input('P', Items.OAK_PLANKS)
                .input('S', Items.OAK_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.OAK_PLANKS),
                        conditionsFromItem(Items.OAK_PLANKS))
                .criterion(hasItem(Items.OAK_SLAB),
                        conditionsFromItem(Items.OAK_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.WOODEN_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.WOODEN_SHOVEL)
                .pattern("S  ")
                .pattern(" X ")
                .input('S', Items.OAK_SLAB)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.OAK_SLAB),
                        conditionsFromItem(Items.OAK_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.WOODEN_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.WOODEN_SWORD)
                .pattern("P  ")
                .pattern(" X ")
                .input('P', Items.OAK_PLANKS)
                .input('X', ModItems.WOODEN_HANDLE)
                .criterion(hasItem(Items.OAK_PLANKS),
                        conditionsFromItem(Items.OAK_PLANKS))
                .criterion(hasItem(Items.OAK_SLAB),
                        conditionsFromItem(Items.OAK_SLAB))
                .criterion(hasItem(ModItems.WOODEN_HANDLE),
                        conditionsFromItem(ModItems.WOODEN_HANDLE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.WOODEN_SWORD)));
    }
}
