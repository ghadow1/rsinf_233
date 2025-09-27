package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public class class247 {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Ljz;"
   )
   final class244 field3001 = new class244();
   @ObfuscatedName("au")
   boolean field3002 = false;
   @ObfuscatedName("ai")
   public boolean field2999 = true;
   @ObfuscatedName("aa")
   int field3004 = 0;
   @ObfuscatedName("am")
   public int field3005 = 512;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   public class251 field3010;
   @ObfuscatedName("ar")
   int field3003;
   @ObfuscatedName("ae")
   int field3008;
   @ObfuscatedName("ay")
   int field2997;
   @ObfuscatedName("ad")
   int field3009;
   @ObfuscatedName("ag")
   int field3011;
   @ObfuscatedName("av")
   int field3012;
   @ObfuscatedName("ah")
   int field3013;
   @ObfuscatedName("ab")
   int field3014;
   @ObfuscatedName("ax")
   int[] field3015 = new int[1024];
   @ObfuscatedName("az")
   int field3016 = -1;
   @ObfuscatedName("bt")
   int field3019 = -1;

   class247() {
   }

   @ObfuscatedName("af")
   void method5695() {
      this.field3003 = this.field2997 / 2;
      this.field3008 = this.field3009 / 2;
      this.field3011 = -this.field3003;
      this.field3012 = this.field2997 - this.field3003;
      this.field3013 = -this.field3008;
      this.field3014 = this.field3009 - this.field3008;
   }

   @ObfuscatedName("aw")
   void method5694(int var1, int var2, int var3, int var4) {
      this.field3003 = var1 - var2;
      this.field3008 = var3 - var4;
      this.field3011 = -this.field3003;
      this.field3012 = this.field2997 - this.field3003;
      this.field3013 = -this.field3008;
      this.field3014 = this.field3009 - this.field3008;
   }

   @ObfuscatedName("at")
   void method5697(int var1, int var2, int var3) {
      this.field3002 = var1 < 0 || var1 > this.field2997 || var2 < 0 || var2 > this.field2997 || var3 < 0 || var3 > this.field2997;
   }
}
