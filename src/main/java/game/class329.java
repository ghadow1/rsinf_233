package game;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class329 extends class544 {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "[Lmy;"
   )
   public static class329[] field3662 = new class329[300];
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -970155801
   )
   public static int field3661 = 0;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   public class327 field3658;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 877204477
   )
   public int field3663;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lwf;"
   )
   public class589 field3664;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 408172313
   )
   public int field3665;

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1371602599"
   )
   public void method7053() {
      if (field3661 < field3662.length) {
         field3662[++field3661 - 1] = this;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lcq;B)V",
      garbageValue = "-21"
   )
   public static void method7047(class65 var0) {
      class137.method3666(var0, 500000, 475000);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1901978652"
   )
   public static int method7048(int var0, int var1) {
      return (-3 - var0 << 8) + var1;
   }

   @ObfuscatedName("oi")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   static final void method7052() {
      Iterator var0 = client.field333.iterator();

      while(var0.hasNext()) {
         class79 var1 = (class79)var0.next();

         for(int var2 = 0; var2 < client.field335.field1254; ++var2) {
            class69 var3 = (class69)var1.field1169.method8567((long)client.field335.field1243[var2]);
            if (var3 != null) {
               var3.method2171();
            }
         }
      }

      var0 = class91.field1287.iterator();

      while(var0.hasNext()) {
         class39 var4 = (class39)var0.next();
         var4.method745();
      }

      if (class22.field90 != null) {
         class22.field90.method9888();
      }

   }
}
