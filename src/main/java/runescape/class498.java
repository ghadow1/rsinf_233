package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
public class class498 extends class503 {
   @ObfuscatedName("np")
   static boolean field5394;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lth;"
   )
   class504 field5393;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lth;"
   )
   class504 field5392;

   class498() {
      this.field5393 = class504.field5415;
      this.field5392 = class504.field5415;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "32"
   )
   void method9924() {
      this.field5393 = class504.field5415;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1240944519"
   )
   public final boolean method9929() {
      if (this.field5393 == class504.field5415) {
         this.method9925();
      }

      return this.field5393 == class504.field5416;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-469389825"
   )
   void method9925() {
      this.field5393 = class40.field279.field642.method9974(super.field5397) ? class504.field5416 : class504.field5418;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "95073197"
   )
   void method9926() {
      this.field5392 = class504.field5415;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "0"
   )
   public final boolean method9927() {
      if (this.field5392 == class504.field5415) {
         this.method9928();
      }

      return this.field5392 == class504.field5416;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-32"
   )
   void method9928() {
      this.field5392 = class40.field279.field645.method9974(super.field5397) ? class504.field5416 : class504.field5418;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lpx;Ljava/lang/String;Ljava/lang/String;B)[Lxt;",
      garbageValue = "-127"
   )
   public static class605[] method9930(class412 var0, String var1, String var2) {
      if (!var0.method8355(var1, var2)) {
         return null;
      } else {
         int var3 = var0.method8361(var1);
         int var4 = var0.method8354(var3, var2);
         return class463.method9400(var0, var3, var4);
      }
   }
}
