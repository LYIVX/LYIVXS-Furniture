package net.mcreator.lsfurniture.procedures;

import net.minecraft.world.entity.Entity;

public class SinkRecipeCallerProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		OakSinkRecipeProcedure.execute(entity);
		DarkOakSinkRecipeProcedure.execute(entity);
		SpruceSinkRecipeProcedure.execute(entity);
		AcaciaSinkRecipeProcedure.execute(entity);
		BirchSinkRecipeProcedure.execute(entity);
		JungleSinkRecipeProcedure.execute(entity);
		MangroveSinkRecipeProcedure.execute(entity);
		CrimsonSinkRecipeProcedure.execute(entity);
		WarpedSinkRecipeProcedure.execute(entity);
		OakBricksSinkRecipeProcedure.execute(entity);
		DarkOakDeepslateSinkRecipeProcedure.execute(entity);
		SpruceAndesiteSinkRecipeProcedure.execute(entity);
		AcaciaDioriteSinkRecipeProcedure.execute(entity);
		BirchGraniteSinkRecipeProcedure.execute(entity);
		JungleNetherBricksSinkRecipeProcedure.execute(entity);
		MangroveQuartzSinkRecipeProcedure.execute(entity);
		CrimsonNetherWartSinkRecipeProcedure.execute(entity);
		WarpedWarpedWartSinkRecipeProcedure.execute(entity);
	}
}
