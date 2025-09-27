package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
public class class405 {
   @ObfuscatedName("pt")
   static int[] field4880;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lqm;ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1620759139"
   )
   static String method8274(class426 var0, int var1, String var2) {
      if (var0 == null) {
         return var2;
      } else {
         class541 var3 = (class541)var0.method8596((long)var1);
         return var3 == null ? var2 : (String)var3.field5595;
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)V",
      garbageValue = "0"
   )
   static void method8273(int var0, int var1, int var2, int var3, int var4, int var5) {
      class201.field2208 = (var3 + var0) / 2;
      class204.field2248 = (var4 + var1) / 2;
      class179.field1967 = (var5 + var2) / 2;
      class450.field5166 = (var3 - var0) / 2;
      class179.field1965 = (var4 - var1) / 2;
      class130.field1591 = (var5 - var2) / 2;
      class76.field1113 = Math.abs(class450.field5166);
      class556.field5750 = Math.abs(class179.field1965);
      class308.field3500 = Math.abs(class130.field1591);
      class242.field2962.method8993((float)(var3 - var0), (float)(var4 - var1), (float)(var5 - var2));
      class242.field2962.method9042();
      class242.field2957 = true;
   }
}
