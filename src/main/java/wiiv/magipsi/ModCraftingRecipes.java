package wiiv.magipsi;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import vazkii.psi.common.block.base.ModBlocks;
import vazkii.psi.common.item.base.ModItems;

public class ModCraftingRecipes {

	public static void preInit() {
		addOreDictRecipe(new ItemStack(ModBlocks.cadAssembler),
				"GWG", "WPW", " G ",
				'G', "ingotGold",
				'W', "logWood",
				'P', new ItemStack(Blocks.PISTON));

		addOreDictRecipe(new ItemStack(ModBlocks.programmer),
				"WMW", "WDW", "G G",
				'G', "ingotGold",
				'M', new ItemStack(Items.MAP),
				'W', "logWood",
				'D', "dustPsi");

		addOreDictRecipe(new ItemStack(ModItems.material, 1, 3),
				"SSS", "SIS", "SSS",
				'S', "substanceEbony",
				'I', "ingotPsi");
		addOreDictRecipe(new ItemStack(ModItems.material, 1, 4),
				"SSS", "SIS", "SSS",
				'S', "substanceIvory",
				'I', "ingotPsi");

		addOreDictRecipe(new ItemStack(ModItems.cadAssembly, 1, 0),
				"I  ", "IWI", "  I",
				'I', "ingotIron",
				'W', "logWood");
		addOreDictRecipe(new ItemStack(ModItems.cadAssembly, 1, 1),
				"I  ", "IWI", "  I",
				'I', "ingotGold",
				'W', "logWood");
		addOreDictRecipe(new ItemStack(ModItems.cadAssembly, 1, 2),
				"I  ", "IWI", "  I",
				'I', "ingotPsi",
				'W', "logWood");
		addOreDictRecipe(new ItemStack(ModItems.cadAssembly, 1, 3),
				"I  ", "IWI", "  I",
				'I', "ingotEbonyPsi",
				'W', "logWood");
		addOreDictRecipe(new ItemStack(ModItems.cadAssembly, 1, 4),
				"I  ", "IWI", "  I",
				'I', "ingotIvoryPsi",
				'W', "logWood");

		addOreDictRecipe(new ItemStack(ModItems.cadCore, 1, 0),
				"I  ", "DPD", "  I",
				'I', "ingotIron",
				'D', "dustRedstone",
				'P', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.cadCore, 1, 1),
				"I  ", "DPD", "  I",
				'I', "ingotGold",
				'D', "dustRedstone",
				'P', "ingotPsi");
		addOreDictRecipe(new ItemStack(ModItems.cadCore, 1, 2),
				"I  ", "DPD", "  I",
				'I', "ingotGold",
				'D', "dustGlowstone",
				'P', "ingotPsi");
		addOreDictRecipe(new ItemStack(ModItems.cadCore, 1, 3),
				"I  ", "DPD", "  I",
				'I', "ingotGold",
				'D', "dustRedstone",
				'P', "gemPsi");
		addOreDictRecipe(new ItemStack(ModItems.cadCore, 1, 4),
				"I  ", "DPD", "  I",
				'I', "ingotGold",
				'D', "dustGlowstone",
				'P', "gemPsi");

		addOreDictRecipe(new ItemStack(ModItems.cadSocket, 1, 0),
				"DW", "W ",
				'W', "logWood",
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.cadSocket, 1, 1),
				"DIW", "IW ", "W  ",
				'W', "logWood",
				'I', "ingotPsi",
				'D', "dustRedstone");
		addOreDictRecipe(new ItemStack(ModItems.cadSocket, 1, 2),
				"DIW", "IW ", "W  ",
				'W', "logWood",
				'I', "ingotPsi",
				'D', "dustGlowstone");
		addOreDictRecipe(new ItemStack(ModItems.cadSocket, 1, 3),
				"DIW", "IG ", "W  ",
				'W', "logWood",
				'I', "ingotPsi",
				'G', "gemPsi",
				'D', "dustRedstone");
		addOreDictRecipe(new ItemStack(ModItems.cadSocket, 1, 4),
				"DIW", "IG ", "W  ",
				'W', "logWood",
				'I', "ingotPsi",
				'G', "gemPsi",
				'D', "dustGlowstone");

		addOreDictRecipe(new ItemStack(ModItems.cadBattery, 1, 0),
				"I", "D", "I",
				'I', "ingotGold",
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.cadBattery, 1, 1),
				"I", "D", "I",
				'I', "ingotGold",
				'D', "ingotPsi");
		addOreDictRecipe(new ItemStack(ModItems.cadBattery, 1, 2),
				"I", "D", "I",
				'I', "ingotGold",
				'D', "gemPsi");

		String[] dyes = {
				"White", "Orange", "Magenta", "LightBlue", "Yellow", "Lime", "Pink", "Gray", "LightGray", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"
		};
		for(int i = 0; i < 16; i++)
			addOreDictRecipe(new ItemStack(ModItems.cadColorizer, 1, i),
					" D ", "GCG", " I ",
					'I', "ingotIron",
					'G', "blockGlass",
					'C', "dye" + dyes[i],
					'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.cadColorizer, 1, 16),
				" D ", "GCG", " I ",
				'I', "ingotIron",
				'G', "blockGlass",
				'C', "crystalsPrismarine",
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.cadColorizer, 1, 17),
				" D ", "GDG", " I ",
				'I', "ingotIron",
				'G', "blockGlass",
				'D', "dustPsi");

		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 0),
				"DP", " W",
				'W', "logWood",
				'P', "paper",
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 2),
				"APD", "  W",
				'W', "logWood",
				'P', "paper",
				'A', new ItemStack(Items.ARROW),
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 4),
				"APD", "  W",
				'W', "logWood",
				'P', "paper",
				'A', new ItemStack(Items.STRING),
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 6),
				"APD", "  W",
				'W', "logWood",
				'P', "paper",
				'A', "slimeball",
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 6),
				"APD", "  W",
				'W', "logWood",
				'P', "paper",
				'A', new ItemStack(Items.SNOWBALL),
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 8),
				"APD", "  W",
				'W', "logWood",
				'P', "paper",
				'A', new ItemStack(Items.GUNPOWDER),
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 10),
				"APD", "  W",
				'W', "logWood",
				'P', "paper",
				'A', "dustRedstone",
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 12),
				"APD", "  W",
				'W', "logWood",
				'P', "paper",
				'A', new ItemStack(Blocks.STONE_BUTTON),
				'D', "dustPsi");

		addOreDictRecipe(new ItemStack(ModItems.spellDrive),
				"WIW", "PRP", "PIP",
				'W', "logWood",
				'P', "paper",
				'I', "ingotPsi",
				'R', "dustRedstone");

		addOreDictRecipe(new ItemStack(ModItems.psimetalShovel),
				"GP", " W", " I",
				'W', "logWood",
				'P', "ingotPsi",
				'G', "gemPsi",
				'I', "ingotGold");
		addOreDictRecipe(new ItemStack(ModItems.psimetalPickaxe),
				"PGP", " W ", " I ",
				'W', "logWood",
				'P', "ingotPsi",
				'G', "gemPsi",
				'I', "ingotGold");
		addOreDictRecipe(new ItemStack(ModItems.psimetalAxe),
				"GP", "PW", " I",
				'W', "logWood",
				'P', "ingotPsi",
				'G', "gemPsi",
				'I', "ingotGold");
		addOreDictRecipe(new ItemStack(ModItems.psimetalSword),
				" P", "IG", " W",
				'W', "logWood",
				'P', "ingotPsi",
				'G', "gemPsi",
				'I', "ingotGold");

		addOreDictRecipe(new ItemStack(ModItems.psimetalExosuitHelmet),
				"GPG", "P P",
				'P', "ingotPsi",
				'G', "gemPsi");
		addOreDictRecipe(new ItemStack(ModItems.psimetalExosuitChestplate),
				"P P", "GPG", "PPP",
				'P', "ingotPsi",
				'G', "gemPsi");
		addOreDictRecipe(new ItemStack(ModItems.psimetalExosuitLeggings),
				"GPG", "P P", "P P",
				'P', "ingotPsi",
				'G', "gemPsi");
		addOreDictRecipe(new ItemStack(ModItems.psimetalExosuitBoots),
				"G G", "P P",
				'P', "ingotPsi",
				'G', "gemPsi");

		addOreDictRecipe(new ItemStack(ModItems.detonator),
				" B ", "IPI",
				'P', "dustPsi",
				'B', new ItemStack(Blocks.STONE_BUTTON),
				'I', "ingotGold");
		addOreDictRecipe(new ItemStack(ModItems.exosuitController),
				"WRW", "PGP", "WIW",
				'W', "logWood",
				'P', "paper",
				'R', "dustRedstone",
				'G', "blockGlassColorless",
				'I', "ingotPsi");
		addOreDictRecipe(new ItemStack(ModItems.vectorRuler),
				"D", "W", "I",
				'W', "logWood",
				'D', "dustPsi",
				'I', "ingotGold");

		addOreDictRecipe(new ItemStack(ModItems.exosuitSensor, 1, 0),
				" I ", "IMR", " R ",
				'M', "dustGlowstone",
				'I', "ingotPsi",
				'R', "ingotGold");
		addOreDictRecipe(new ItemStack(ModItems.exosuitSensor, 1, 1),
				" I ", "IMR", " R ",
				'M', "shardPrismarine",
				'I', "ingotPsi",
				'R', "ingotGold");
		addOreDictRecipe(new ItemStack(ModItems.exosuitSensor, 1, 2),
				" I ", "IMR", " R ",
				'M', new ItemStack(Items.FIRE_CHARGE),
				'I', "ingotPsi",
				'R', "ingotGold");
		addOreDictRecipe(new ItemStack(ModItems.exosuitSensor, 1, 3),
				" I ", "IMR", " R ",
				'M', new ItemStack(Items.SPECKLED_MELON),
				'I', "ingotPsi",
				'R', "ingotGold");

		addOreDictRecipe(new ItemStack(ModBlocks.psiDecorative, 1, 0),
				"OOO", "OOO", "OOO",
				'O', "dustPsi");
		addOreDictRecipe(new ItemStack(ModBlocks.psiDecorative, 1, 1),
				"OOO", "OOO", "OOO",
				'O', "ingotPsi");
		addOreDictRecipe(new ItemStack(ModBlocks.psiDecorative, 1, 2),
				"OOO", "OOO", "OOO",
				'O', "gemPsi");
		addOreDictRecipe(new ItemStack(ModBlocks.psiDecorative, 1, 7),
				"OOO", "OOO", "OOO",
				'O', "ingotEbonyPsi");
		addOreDictRecipe(new ItemStack(ModBlocks.psiDecorative, 1, 8),
				"OOO", "OOO", "OOO",
				'O', "ingotIvoryPsi");
		addShapelessOreDictRecipe(new ItemStack(ModItems.material, 9, 0), new ItemStack(ModBlocks.psiDecorative, 1, 0));
		addShapelessOreDictRecipe(new ItemStack(ModItems.material, 9, 1), new ItemStack(ModBlocks.psiDecorative, 1, 1));
		addShapelessOreDictRecipe(new ItemStack(ModItems.material, 9, 2), new ItemStack(ModBlocks.psiDecorative, 1, 2));
		addShapelessOreDictRecipe(new ItemStack(ModItems.material, 9, 3), new ItemStack(ModBlocks.psiDecorative, 1, 7));
		addShapelessOreDictRecipe(new ItemStack(ModItems.material, 9, 4), new ItemStack(ModBlocks.psiDecorative, 1, 8));

		addOreDictRecipe(new ItemStack(ModBlocks.psiDecorative, 6, 3),
				" C ", "CIC", " C ",
				'C', "coal",
				'I', "ingotPsi");
		addOreDictRecipe(new ItemStack(ModBlocks.psiDecorative, 6, 5),
				" C ", "CIC", " C ",
				'C', "gemQuartz",
				'I', "ingotPsi");	
		addShapelessOreDictRecipe(new ItemStack(ModBlocks.psiDecorative, 1, 4), new ItemStack(ModBlocks.psiDecorative, 1, 3), "dustGlowstone");
		addShapelessOreDictRecipe(new ItemStack(ModBlocks.psiDecorative, 1, 6), new ItemStack(ModBlocks.psiDecorative, 1, 5), "dustGlowstone");
	}
	
	public static void init() {
		if(Loader.isModLoaded("psionup")) {
			List<IRecipe> oldRecipes = new ArrayList<IRecipe>();
			List<String> newRecipes = new ArrayList<String>();
			newRecipes.add("fakeCAD");
			newRecipes.add("wideSocket");
			newRecipes.add("bioticSensor");
			newRecipes.add("gaussRifle");
			newRecipes.add("gaussBullet");
			newRecipes.add("cadAssemblyBlaster");
			for (IRecipe recipe : CraftingManager.getInstance().getRecipeList()){
				if (recipe != null && recipe.getRecipeOutput() != null && recipe.getRecipeOutput().getItem() != null && recipe.getRecipeOutput().getItem().getRegistryName() != null && recipe.getRecipeOutput().getItem().getRegistryName().getResourcePath() != null) {
					if (newRecipes.contains(recipe.getRecipeOutput().getItem().getRegistryName().getResourcePath()))
						oldRecipes.add(recipe);
				}
			}
			CraftingManager.getInstance().getRecipeList().removeAll(oldRecipes);

			String copper = "dustRedstone";
			if (OreDictionary.doesOreNameExist("ingotCopper"))
				copper = "ingotCopper";

			addOreDictRecipe(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("psionup", "fakeCAD")), 1, 0),
					"M  ", "MSM", "  G",
					'M', "ingotPsi",
					'S', new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("psionup", "wideSocket")), 1, 0),
					'G', "gemPsi");

			addOreDictRecipe(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("psionup", "wideSocket")), 1, 0),
					" GW", "DW ", "W  ",
					'W', "logWood",
					'D', "dustPsi",
					'G', "dustGlowstone");

			addOreDictRecipe(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("psionup", "bioticSensor")), 1, 0),
					" P ", "PEI", " I ",
					'P', "ingotPsi",
					'E', Items.ENDER_EYE,
					'I', "ingotGold");

			addOreDictRecipe(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("psionup", "gaussRifle")), 1, 0),
					"IC ", "IWI", " PI",
					'C', copper,
					'I', "ingotIron",
					'P', "dustPsi",
					'W', "logWood");

			addOreDictRecipe(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("psionup", "gaussBullet")), 2, 0),
					"CPD", "  W",
					'W', "logWood",
					'P', "paper",
					'C', copper,
					'D', "dustPsi");

			if(Loader.isModLoaded("Botania")) {
				addOreDictRecipe(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("psionup", "cadAssemblyBlaster")), 1, 0),
						"P  ", "LSL", "  M",
						'M', "runeManaB",
						'L', "ingotManasteel",
						'P', "gemPsi",
						'S', new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("botania", "spreader")), 1, 1));
			}
		}
	}

	private static void addOreDictRecipe(ItemStack output, Object... recipe) {
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(output, recipe));
	}

	private static void addShapelessOreDictRecipe(ItemStack output, Object... recipe) {
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(output, recipe));
	}
}
