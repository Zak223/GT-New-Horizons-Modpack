package com.dreammaster.creativetab;

import com.dreammaster.item.ItemList;

import eu.usrv.yamcore.creativetabs.CreativeTabsManager;
import eu.usrv.yamcore.creativetabs.ModCreativeTab;
import eu.usrv.yamcore.items.ModItemManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;

public class ModTabList {
	public static String ModGenericTab = "tabDreamCraftItems_Generic";
	public static String ModShapesTab = "tabDreamCraftItems_Shapes";
	public static String ModMoldsTab = "tabDreamCraftItems_Molds";
	public static String ModThaumcraftTab = "tabDreamCraftItems_Thaum";
	public static String ModCircuitsTab = "tabDreamCraftItems_Circuit";
	public static String ModFluidsTab = "tabDreamCraftFluids";
	
	public static void InitModTabs(CreativeTabsManager pTabManager, ModItemManager pItemManager)
	{
		pTabManager.AddCreativeTab(new ModCreativeTab(ModGenericTab, ItemList.AsteroidsStoneDust.Item.getConstructedItem()));
		pTabManager.AddCreativeTab(new ModCreativeTab(ModShapesTab, ItemList.ShapeBlock.Item.getConstructedItem()));
		pTabManager.AddCreativeTab(new ModCreativeTab(ModMoldsTab, ItemList.MoldFormAnvil.Item.getConstructedItem()));
		pTabManager.AddCreativeTab(new ModCreativeTab(ModThaumcraftTab, ItemList.ChargedVoidWandCap.Item.getConstructedItem()));
		pTabManager.AddCreativeTab(new ModCreativeTab(ModCircuitsTab, ItemList.SuperCircuit.Item.getConstructedItem()));
		pTabManager.AddCreativeTab(new ModCreativeTab(ModFluidsTab, Items.bucket));
	}
}
