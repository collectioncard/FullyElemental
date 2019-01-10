package com.collectioncard.fullyelemental.biomes;


import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;








public class TestBiome {

	public static BiomeGenCustom biome;
	static {
		Biome.BiomeProperties properties = new Biome.BiomeProperties("Test Biome");
		properties.setRainfall(0F);
		properties.setBaseHeight(0.1F);
		properties.setHeightVariation(0.2F);
		properties.setTemperature(0.5F);
		biome = new BiomeGenCustom(properties);
	}

	public static void load(FMLInitializationEvent event) {
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.FOREST);
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 151));
	}

	static class BiomeGenCustom extends Biome {

		public BiomeGenCustom(Biome.BiomeProperties properties) {
			super(properties);
			setRegistryName("biome");
			topBlock = Blocks.DIAMOND_BLOCK.getDefaultState();
			fillerBlock = Blocks.EMERALD_BLOCK.getDefaultState();
			decorator.generateFalls = true;
			decorator.treesPerChunk = 0;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
		}
	}
	
	
}
