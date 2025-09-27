package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
public class class57 {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "[Lbz;"
   )
   class39[] field819 = new class39[100];
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1088846521
   )
   int field821;

   class57() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbz;",
      garbageValue = "1293446909"
   )
   class39 method2012(int var1, String var2, String var3, String var4) {
      class39 var5 = this.field819[99];

      for(int var6 = this.field821; var6 > 0; --var6) {
         if (var6 != 100) {
            this.field819[var6] = this.field819[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new class39(var1, var2, var4, var3);
      } else {
         var5.vmethod10557();
         var5.method10553();
         var5.method748(var1, var2, var4, var3);
      }

      this.field819[0] = var5;
      if (this.field821 < 100) {
         ++this.field821;
      }

      return var5;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)Lbz;",
      garbageValue = "-60"
   )
   class39 method2013(int var1) {
      return var1 >= 0 && var1 < this.field821 ? this.field819[var1] : null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "-8110"
   )
   int method2019() {
      return this.field821;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "455766931"
   )
   static String method2014(int var0) {
      return "<img=" + var0 + ">";
   }
}
