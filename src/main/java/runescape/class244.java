package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
public class class244 {
   @ObfuscatedName("af")
   byte field2982 = -1;
   @ObfuscatedName("aw")
   byte field2981 = -1;
   @ObfuscatedName("at")
   byte field2980 = -1;
   @ObfuscatedName("ac")
   byte field2983 = 0;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljz;)V"
   )
   void method5648(class244 var1) {
      this.field2982 = var1.field2982;
      this.field2981 = var1.field2981;
      this.field2980 = var1.field2980;
      this.field2983 = var1.field2983;
   }

   @ObfuscatedName("aw")
   public void method5649(byte var1, byte var2, byte var3, byte var4) {
      this.field2982 = var1;
      this.field2981 = var2;
      this.field2980 = var3;
      this.field2983 = var4;
   }

   @ObfuscatedName("at")
   public void method5650() {
      this.field2982 = -1;
      this.field2981 = -1;
      this.field2980 = -1;
      this.field2983 = 0;
   }

   @ObfuscatedName("ac")
   public boolean method5651() {
      return this.field2983 > 0;
   }
}
