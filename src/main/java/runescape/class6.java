package runescape;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public enum class6 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lao;"
   )
   field14(0, 0);

   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1384146919
   )
   public final int field15;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 180165171
   )
   final int field16;

   class6(int var3, int var4) {
      this.field15 = var3;
      this.field16 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field16;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V",
      garbageValue = "939495664"
   )
   static void method39(String var0, boolean var1, String var2, boolean var3) {
      if (var1) {
         if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
            }
         }

         if (class31.field159.startsWith("win") && !var3) {
            class129.method3589(var0, 0, "openjs");
            return;
         }

         if (class31.field159.startsWith("mac")) {
            class129.method3589(var0, 1, var2);
            return;
         }

         class129.method3589(var0, 2, "openjs");
      } else {
         class129.method3589(var0, 3, "openjs");
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[Lcx;",
      garbageValue = "-193330132"
   )
   static class68[] method40() {
      return new class68[]{class68.field925, class68.field928, class68.field926, class68.field929, class68.field924, class68.field923, class68.field927};
   }

   @ObfuscatedName("pg")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1510312183"
   )
   static String method38(String var0) {
      class397[] var1 = class446.method8926();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class397 var3 = var1[var2];
         if (var3.field4815 != -1 && var0.startsWith(class57.method2014(var3.field4815))) {
            var0 = var0.substring(6 + Integer.toString(var3.field4815).length());
            break;
         }
      }

      return var0;
   }
}
