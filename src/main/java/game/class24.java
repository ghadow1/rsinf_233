package game;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public class class24 extends class97 {
   @ObfuscatedName("af")
   SourceDataLine field103;
   @ObfuscatedName("aw")
   AudioFormat field102;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1363245259
   )
   int field104;
   @ObfuscatedName("ac")
   byte[] field105;

   class24() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1247260340"
   )
   public void vmethod3066() {
      this.field102 = new AudioFormat((float)class97.field1356, 16, class97.field1339 ? 2 : 1, true, false);
      this.field105 = new byte[512 << (class97.field1339 ? 2 : 1)];
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-1"
   )
   public void vmethod3056(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.field102, var1 << (class97.field1339 ? 2 : 1));
         this.field103 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field103.open();
         this.field103.start();
         this.field104 = var1;
      } catch (LineUnavailableException var3) {
         if (class164.method4009(var1) != 1) {
            this.vmethod3056(class165.method4019(var1));
         } else {
            this.field103 = null;
            throw var3;
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-6"
   )
   protected int vmethod3057() {
      return this.field104 - (this.field103.available() >> (class97.field1339 ? 2 : 1));
   }

   @ObfuscatedName("ac")
   protected void vmethod3058() {
      int var1 = 512;
      if (class97.field1339) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.field1340[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field105[var2 * 2] = (byte)(var3 >> 8);
         this.field105[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field103.write(this.field105, 0, var1 << 1);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1150401319"
   )
   protected void vmethod3059() {
      if (this.field103 != null) {
         this.field103.close();
         this.field103 = null;
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1549248030"
   )
   protected void vmethod3060() {
      this.field103.flush();
   }
}
