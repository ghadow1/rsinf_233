package game;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class class42 implements Comparator {
   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      descriptor = "[Lxc;"
   )
   static class604[] field283;
   @ObfuscatedName("af")
   boolean field285;

   class42() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lqi;Lqi;I)I",
      garbageValue = "-852390989"
   )
   int method783(class420 var1, class420 var2) {
      if (var2.field5033 == var1.field5033) {
         return 0;
      } else {
         if (this.field285) {
            if (client.field325 == var1.field5033) {
               return -1;
            }

            if (var2.field5033 == client.field325) {
               return 1;
            }
         }

         return var1.field5033 < var2.field5033 ? -1 : 1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method783((class420)var1, (class420)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZB)I",
      garbageValue = "-5"
   )
   static int method789(int var0, class55 var1, boolean var2) {
      int var3;
      if (var0 == 3500) {
         var3 = class46.field659[--class124.field1569];
         class46.field659[++class124.field1569 - 1] = client.field551.method6138(var3) ? 1 : 0;
         return 1;
      } else if (var0 == 3501) {
         var3 = class46.field659[--class124.field1569];
         class46.field659[++class124.field1569 - 1] = client.field551.method6122(var3) ? 1 : 0;
         return 1;
      } else if (var0 == 3502) {
         var3 = class46.field659[--class124.field1569];
         class46.field659[++class124.field1569 - 1] = client.field551.method6124(var3) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }
}
