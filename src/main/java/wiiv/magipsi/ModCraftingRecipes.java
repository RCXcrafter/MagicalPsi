package wiiv.magipsi;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import vazkii.psi.common.block.base.ModBlocks;
import vazkii.psi.common.item.base.ModItems;

public class ModCraftingRecipes {

	public static void init() {
		addOreDictRecipe(new ItemStack(ModBlocks.cadAssembler),
				"GWG", "WPW", " G ",
				'G', "ingotGold",
				'W', new ItemStack(Blocks.LOG),
				'P', new ItemStack(Blocks.PISTON));

		addOreDictRecipe(new ItemStack(ModBlocks.programmer),
				"WMW", "WDW", "G G",
				'G', "ingotGold",
				'M', new ItemStack(Items.MAP),
				'W', new ItemStack(Blocks.LOG),
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
				'W', new ItemStack(Blocks.LOG));
		addOreDictRecipe(new ItemStack(ModItems.cadAssembly, 1, 1),
				"I  ", "IWI", "  I",
				'I', "ingotGold",
				'W', new ItemStack(Blocks.LOG));
		addOreDictRecipe(new ItemStack(ModItems.cadAssembly, 1, 2),
				"I  ", "IWI", "  I",
				'I', "ingotPsi",
				'W', new ItemStack(Blocks.LOG));
		addOreDictRecipe(new ItemStack(ModItems.cadAssembly, 1, 3),
				"I  ", "IWI", "  I",
				'I', "ingotEbonyPsi",
				'W', new ItemStack(Blocks.LOG));
		addOreDictRecipe(new ItemStack(ModItems.cadAssembly, 1, 4),
				"I  ", "IWI", "  I",
				'I', "ingotIvoryPsi",
				'W', new ItemStack(Blocks.LOG));

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
				'W', new ItemStack(Blocks.LOG),
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.cadSocket, 1, 1),
				"DIW", "IW ", "W  ",
				'W', new ItemStack(Blocks.LOG),
				'I', "ingotPsi",
				'D', "dustRedstone");
		addOreDictRecipe(new ItemStack(ModItems.cadSocket, 1, 2),
				"DIW", "IW ", "W  ",
				'W', new ItemStack(Blocks.LOG),
				'I', "ingotPsi",
				'D', "dustGlowstone");
		addOreDictRecipe(new ItemStack(ModItems.cadSocket, 1, 3),
				"DIW", "IG ", "W  ",
				'W', new ItemStack(Blocks.LOG),
				'I', "ingotPsi",
				'G', "gemPsi",
				'D', "dustRedstone");
		addOreDictRecipe(new ItemStack(ModItems.cadSocket, 1, 4),
				"DIW", "IG ", "W  ",
				'W', new ItemStack(Blocks.LOG),
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
				'W', new ItemStack(Blocks.LOG),
				'P', new ItemStack(Items.PAPER),
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 2),
				"APD", "  W",
				'W', new ItemStack(Blocks.LOG),
				'P', new ItemStack(Items.PAPER),
				'A', new ItemStack(Items.ARROW),
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 4),
				"APD", "  W",
				'W', new ItemStack(Blocks.LOG),
				'P', new ItemStack(Items.PAPER),
				'A', new ItemStack(Items.STRING),
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 6),
				"APD", "  W",
				'W', new ItemStack(Blocks.LOG),
				'P', new ItemStack(Items.PAPER),
				'A', "slimeball",
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 6),
				"APD", "  W",
				'W', new ItemStack(Blocks.LOG),
				'P', new ItemStack(Items.PAPER),
				'A', new ItemStack(Items.SNOWBALL),
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 8),
				"APD", "  W",
				'W', new ItemStack(Blocks.LOG),
				'P', new ItemStack(Items.PAPER),
				'A', new ItemStack(Items.GUNPOWDER),
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 10),
				"APD", "  W",
				'W', new ItemStack(Blocks.LOG),
				'P', new ItemStack(Items.PAPER),
				'A', "dustRedstone",
				'D', "dustPsi");
		addOreDictRecipe(new ItemStack(ModItems.spellBullet, 1, 12),
				"APD", "  W",
				'W', new ItemStack(Blocks.LOG),
				'P', new ItemStack(Items.PAPER),
				'A', new ItemStack(Blocks.STONE_BUTTON),
				'D', "dustPsi");

		addOreDictRecipe(new ItemStack(ModItems.spellDrive),
				"WIW", "PRP", "PIP",
				'W', new ItemStack(Blocks.LOG),
				'P', new ItemStack(Items.PAPER),
				'I', "ingotPsi",
				'R', "dustRedstone");

		addOreDictRecipe(new ItemStack(ModItems.psimetalShovel),
				"GP", " W", " I",
				'W', new ItemStack(Blocks.LOG),
				'P', "ingotPsi",
				'G', "gemPsi",
				'I', "ingotGold");
		addOreDictRecipe(new ItemStack(ModItems.psimetalPickaxe),
				"PGP", " W ", " I ",
				'W', new ItemStack(Blocks.LOG),
				'P', "ingotPsi",
				'G', "gemPsi",
				'I', "ingotGold");
		addOreDictRecipe(new ItemStack(ModItems.psimetalAxe),
				"GP", "PW", " I",
				'W', new ItemStack(Blocks.LOG),
				'P', "ingotPsi",
				'G', "gemPsi",
				'I', "ingotGold");
		addOreDictRecipe(new ItemStack(ModItems.psimetalSword),
				" P", "IG", " W",
				'W', new ItemStack(Blocks.LOG),
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
				'W', new ItemStack(Blocks.LOG),
				'P', new ItemStack(Items.PAPER),
				'R', "dustRedstone",
				'G', "blockGlassColorless",
				'I', "ingotPsi");
		addOreDictRecipe(new ItemStack(ModItems.vectorRuler),
				"D", "W", "I",
				'W', new ItemStack(Blocks.LOG),
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

	private static void addOreDictRecipe(ItemStack output, Object... recipe) {
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(output, recipe));
	}

	private static void addShapelessOreDictRecipe(ItemStack output, Object... recipe) {
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(output, recipe));
	}
}
