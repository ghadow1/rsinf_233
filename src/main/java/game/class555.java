package game;

import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vc")
public class class555 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   class412 field5738;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   class412 field5739;
   @ObfuscatedName("at")
   HashMap field5740;

   @ObfuscatedSignature(
      descriptor = "(Lpx;Lpx;)V"
   )
   public class555(class412 var1, class412 var2) {
      this.field5738 = var1;
      this.field5739 = var2;
      this.field5740 = new HashMap();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([Lvf;I)Ljava/util/HashMap;",
      garbageValue = "-662771868"
   )
   public HashMap method10839(class556[] var1) {
      HashMap var2 = new HashMap();
      class556[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class556 var5 = var3[var4];
         if (this.field5740.containsKey(var5)) {
            var2.put(var5, this.field5740.get(var5));
         } else {
            class412 var7 = this.field5738;
            class412 var8 = this.field5739;
            String var9 = var5.field5753;
            class461 var6;
            if (!var7.method8355(var9, "")) {
               var6 = null;
            } else {
               int var10 = var7.method8361(var9);
               int var11 = var7.method8354(var10, "");
               class461 var12;
               if (!class587.method11132(var7, var10, var11)) {
                  var12 = null;
               } else {
                  byte[] var14 = var8.method8335(var10, var11);
                  class461 var13;
                  if (var14 == null) {
                     var13 = null;
                  } else {
                     class461 var15 = new class461(var14, class149.field1763, class191.field2082, class255.field3068, class497.field5390, class504.field5414, class7.field25);
                     class388.method8205();
                     var13 = var15;
                  }

                  var12 = var13;
               }

               var6 = var12;
            }

            if (var6 != null) {
               this.field5740.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "37"
   )
   public static int method10840(int var0) {
      return var0 != 0 && var0 != 1 ? -1 : 0;
   }
}
