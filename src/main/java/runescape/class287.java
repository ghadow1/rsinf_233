package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
public class class287 extends Occluder {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -51663707
   )
   final int field3307;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Llb;"
   )
   final class290 field3309;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1381594615
   )
   int field3308;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   class302 field3314;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 2074827413
   )
   int field3310;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -696966113
   )
   int field3311;

   @ObfuscatedSignature(
      descriptor = "(Lna;Lna;ILlb;)V"
   )
   class287(class356 var1, class356 var2, int var3, class290 var4) {
      super(var1, var2);
      this.field3307 = var3;
      this.field3309 = var4;
      this.method6378();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "2"
   )
   void method6378() {
      this.field3308 = class433.method8669(this.field3307).method4611().field2342;
      this.field3314 = this.field3309.method6529(class198.method4395(this.field3308));
      class184 var1 = class198.method4395(this.vmethod6870());
      class605 var2 = var1.method4184(false);
      if (var2 != null) {
         this.field3310 = var2.field6019;
         this.field3311 = var2.field6020;
      } else {
         this.field3310 = 0;
         this.field3311 = 0;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1313098329"
   )
   public int vmethod6870() {
      return this.field3308;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Lls;",
      garbageValue = "-1635642188"
   )
   class302 vmethod6866() {
      return this.field3314;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   int vmethod6869() {
      return this.field3310;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1852373606"
   )
   int vmethod6868() {
      return this.field3311;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(S)[Lme;",
      garbageValue = "1259"
   )
   public static class328[] method6393() {
      return new class328[]{class328.field3643, class328.field3644, class328.field3645, class328.field3646, class328.field3647, class328.field3648, class328.field3655, class328.field3649, class328.field3650, class328.field3652, class328.field3653, class328.field3654, class328.field3651};
   }
}
