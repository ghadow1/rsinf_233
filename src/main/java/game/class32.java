package game;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public final class class32 extends class602 {
   @ObfuscatedName("af")
   Image field164;
   @ObfuscatedName("aw")
   Component field165;

   class32(int var1, int var2, Component var3, boolean var4) {
      super.field5997 = var1;
      super.field5998 = var2;
      super.field5996 = new int[var2 * var1 + 1];
      if (var4) {
         super.field5999 = new float[var2 * var1 + 1];
      }

      DataBufferInt var5 = new DataBufferInt(super.field5996, super.field5996.length);
      DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super.field5997, super.field5998), var5, (Point)null);
      this.field164 = new BufferedImage(var6, var7, false, new Hashtable());
      this.method483(var3);
      this.method11655();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "-1271571432"
   )
   final void method483(Component var1) {
      this.field165 = var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1889941463"
   )
   public final void vmethod11645(int var1, int var2) {
      this.method498(this.field165.getGraphics(), var1, var2);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-540591436"
   )
   public final void vmethod11646(int var1, int var2, int var3, int var4) {
      this.method487(this.field165.getGraphics(), var1, var2, var3, var4);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Graphics;III)V",
      garbageValue = "1667486302"
   )
   final void method498(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.field164, var2, var3, this.field165);
      } catch (Exception var5) {
         this.field165.repaint();
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Graphics;IIIII)V",
      garbageValue = "1495523507"
   )
   final void method487(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field164, 0, 0, this.field165);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.field165.repaint();
      }

   }
}
