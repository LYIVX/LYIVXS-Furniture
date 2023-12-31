package net.mcreator.lsfurniture;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@mezz.jei.api.JeiPlugin
public class JeiPlugin implements IModPlugin {
    public static RecipeType<CarpentryRecipe> CARPENTRY_TYPE =
            new RecipeType<>(CarpentryRecipeCategory.UID, CarpentryRecipe.class);

    public static RecipeType<CarpentryTickRecipe> CARPENTRY_TICK_TYPE =
            new RecipeType<>(CarpentryTickRecipeCategory.UID, CarpentryTickRecipe.class);

    public static RecipeType<MasonryRecipe> MASONRY_TYPE =
            new RecipeType<>(MasonryRecipeCategory.UID, MasonryRecipe.class);

    public static RecipeType<MasonryTickRecipe> MASONRY_TICK_TYPE =
            new RecipeType<>(MasonryTickRecipeCategory.UID, MasonryTickRecipe.class);

    public static RecipeType<MetallurgyRecipe> METALLURGY_TYPE =
            new RecipeType<>(MetallurgyRecipeCategory.UID, MetallurgyRecipe.class);

    public static RecipeType<MetallurgyTickRecipe> METALLURGY_TICK_TYPE =
            new RecipeType<>(MetallurgyTickRecipeCategory.UID, MetallurgyTickRecipe.class);

    public static RecipeType<BotanistRecipe> BOTANIST_TYPE =
            new RecipeType<>(BotanistRecipeCategory.UID, BotanistRecipe.class);

    public static RecipeType<EngineeringRecipe> ENGINEERING_TYPE =
            new RecipeType<>(EngineeringRecipeCategory.UID, EngineeringRecipe.class);

    public static RecipeType<WeaveryRecipe> WEAVERY_TYPE =
            new RecipeType<>(WeaveryRecipeCategory.UID, WeaveryRecipe.class);

    public static RecipeType<GlassblowerRecipe> GLASSBLOWER_TYPE =
            new RecipeType<>(GlassblowerRecipeCategory.UID, GlassblowerRecipe.class);

    public static RecipeType<WorldInteractionRecipe> WORLD_INTERACTION_TYPE =
            new RecipeType<>(WorldInteractionRecipeCategory.UID, WorldInteractionRecipe.class);

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(LsFurnitureMod.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new CarpentryRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new CarpentryTickRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new MasonryRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new MasonryTickRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new MetallurgyRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new MetallurgyTickRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new BotanistRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new EngineeringRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new WeaveryRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new GlassblowerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new WorldInteractionRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<CarpentryRecipe> recipesCraftingCarpentry = rm.getAllRecipesFor(CarpentryRecipe.Type.INSTANCE);
        registration.addRecipes(CARPENTRY_TYPE, recipesCraftingCarpentry);

        List<CarpentryTickRecipe> recipesCraftingCarpentryTick = rm.getAllRecipesFor(CarpentryTickRecipe.Type.INSTANCE);
        registration.addRecipes(CARPENTRY_TICK_TYPE, recipesCraftingCarpentryTick);

        List<MasonryRecipe> recipesCraftingMasonry = rm.getAllRecipesFor(MasonryRecipe.Type.INSTANCE);
        registration.addRecipes(MASONRY_TYPE, recipesCraftingMasonry);

        List<MasonryTickRecipe> recipesCraftingMasonryTick = rm.getAllRecipesFor(MasonryTickRecipe.Type.INSTANCE);
        registration.addRecipes(MASONRY_TICK_TYPE, recipesCraftingMasonryTick);

        List<MetallurgyRecipe> recipesCraftingMetallurgy = rm.getAllRecipesFor(MetallurgyRecipe.Type.INSTANCE);
        registration.addRecipes(METALLURGY_TYPE, recipesCraftingMetallurgy);

        List<MetallurgyTickRecipe> recipesCraftingMetallurgyTick = rm.getAllRecipesFor(MetallurgyTickRecipe.Type.INSTANCE);
        registration.addRecipes(METALLURGY_TICK_TYPE, recipesCraftingMetallurgyTick);

        List<BotanistRecipe> recipesCraftingBotanist = rm.getAllRecipesFor(BotanistRecipe.Type.INSTANCE);
        registration.addRecipes(BOTANIST_TYPE, recipesCraftingBotanist);

        List<EngineeringRecipe> recipesCraftingEngineering = rm.getAllRecipesFor(EngineeringRecipe.Type.INSTANCE);
        registration.addRecipes(ENGINEERING_TYPE, recipesCraftingEngineering);

        List<WeaveryRecipe> recipesCraftingWeavery = rm.getAllRecipesFor(WeaveryRecipe.Type.INSTANCE);
        registration.addRecipes(WEAVERY_TYPE, recipesCraftingWeavery);

        List<GlassblowerRecipe> recipesCraftingGlassblower = rm.getAllRecipesFor(GlassblowerRecipe.Type.INSTANCE);
        registration.addRecipes(GLASSBLOWER_TYPE, recipesCraftingGlassblower);

        List<WorldInteractionRecipe> recipesCraftingWorldInteraction = rm.getAllRecipesFor(WorldInteractionRecipe.Type.INSTANCE);
        registration.addRecipes(WORLD_INTERACTION_TYPE, recipesCraftingWorldInteraction);
    }

}
