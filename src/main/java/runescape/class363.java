package runescape;

import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public class class363 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lea;"
   )
   class121 field4061;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lxt;"
   )
   class605 field4063;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lel;)V"
   )
   class363(String var1, class119 var2) {
      try {
         this.field4061 = var2.method3489(new URL(var1));
      } catch (MalformedURLException var4) {
         this.field4061 = null;
      }

   }

   @ObfuscatedSignature(
      descriptor = "(Lea;)V"
   )
   class363(class121 var1) {
      this.field4061 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Lxt;",
      garbageValue = "-999062412"
   )
   class605 method7519() {
      if (this.field4063 == null && this.field4061 != null && this.field4061.method3519()) {
         if (this.field4061.method3520() != null) {
            this.field4063 = class179.method4160(this.field4061.method3520());
         }

         this.field4061 = null;
      }

      return this.field4063;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;BIB)I",
      garbageValue = "114"
   )
   public static int method7521(Buffer var0, byte var1, int var2) {
      int var3 = var1 >> var2 & 3;
      if (var3 == 3) {
         return var0.read32BitArray();
      } else if (var3 == 2) {
         return var0.method11452();
      } else {
         return var3 == 1 ? var0.method11197() : 0;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-1572048165"
   )
   public static boolean method7520(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= 160 && var0 <= 255) {
         return true;
      } else {
         return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
      }
   }
}
