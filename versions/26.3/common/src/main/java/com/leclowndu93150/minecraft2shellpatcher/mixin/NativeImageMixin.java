package com.leclowndu93150.minecraft2shellpatcher.mixin;

import com.mojang.blaze3d.platform.NativeImage;
import org.lwjgl.util.freetype.FreeType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(NativeImage.class)
public class NativeImageMixin {
    @ModifyArg(
        method = "copyFromFont",
        at = @At(value = "INVOKE", target = "Lorg/lwjgl/util/freetype/FreeType;FT_Load_Glyph(Lorg/lwjgl/util/freetype/FT_Face;II)I", remap = false),
        index = 2
    )
    private int minecraft2shellpatcher$disableHinting(int loadFlags) {
        return loadFlags | FreeType.FT_LOAD_NO_HINTING;
    }
}
