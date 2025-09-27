package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public class class343 {
   @ObfuscatedName("so")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   static class369 field3950;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -334449371
   )
   int field3949;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lec;"
   )
   class108 field3948;

   @ObfuscatedSignature(
      descriptor = "(ILec;)V"
   )
   class343(int var1, class108 var2) {
      this.field3949 = var1;
      this.field3948 = var2;
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      descriptor = "(Ldr;Lct;II)V",
      garbageValue = "2105103989"
   )
   static void method7327(class79 var0, class75 var1, int var2) {
      class356 var3 = var1.method2435(var0);
      int var5 = var1.field1055;
      int var6 = var1.field1059 * 92278784 - 1;
      int var4 = var5 + (var6 << 6);
      int var8 = class356.method7418(var1.field1056, var1.field1059 * 92278784 - 1);
      class41.method774(var0, var3.field4026, var3.field4025, var4, var8, var2, var1.vmethod2763());
   }
}
