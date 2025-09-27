package runescape;

import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class33 {
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = 1866852397
   )
   static int field174;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -721337871
   )
   int field170;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 834760595
   )
   int field171;

   class33(int var1, int var2) {
      this.field170 = var1;
      this.field171 = var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lbi;I)Z",
      garbageValue = "-1598817630"
   )
   boolean method500(class29 var1) {
      if (var1 == null) {
         return false;
      } else {
         switch(this.field170) {
         case 1:
            return var1.vmethod6115(this.field171);
         case 2:
            return var1.vmethod6123(this.field171);
         case 3:
            return var1.vmethod6117((char)this.field171);
         case 4:
            return var1.vmethod6119(this.field171 == 1);
         default:
            return false;
         }
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1426971814"
   )
   static void method502(int var0) {
      class442.field5140 = var0;
      class453.field5178 = new class453[var0];
      class22.field91 = 0;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIII)F",
      garbageValue = "387159712"
   )
   static float method506(int var0, int var1, int var2) {
      return (float)(var0 - var1) / (float)(var2 - var1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lvx;",
      garbageValue = "1544135680"
   )
   public static class565 method501(String var0, String var1, boolean var2) {
      File var3 = new File(class23.field99, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            class565 var10 = new class565(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (class127.field1577 == 33) {
         var4 = "_rc";
      } else if (class127.field1577 == 34) {
         var4 = "_wip";
      }

      File var5 = new File(class82.field1203, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      class565 var6;
      if (!var2 && var5.exists()) {
         try {
            var6 = new class565(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
         }
      }

      try {
         var6 = new class565(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZB)I",
      garbageValue = "12"
   )
   static int method504(int var0, class55 var1, boolean var2) {
      class369 var3 = class119.field1554.method7476(class46.field659[--class124.field1569]);
      if (var0 == 2500) {
         class46.field659[++class124.field1569 - 1] = var3.field4158;
         return 1;
      } else if (var0 == 2501) {
         class46.field659[++class124.field1569 - 1] = var3.field4204;
         return 1;
      } else if (var0 == 2502) {
         class46.field659[++class124.field1569 - 1] = var3.field4160 * 469894397;
         return 1;
      } else if (var0 == 2503) {
         class46.field659[++class124.field1569 - 1] = var3.field4149 * 1156037777;
         return 1;
      } else if (var0 == 2504) {
         class46.field659[++class124.field1569 - 1] = var3.field4166 ? 1 : 0;
         return 1;
      } else if (var0 == 2505) {
         class46.field659[++class124.field1569 - 1] = var3.field4164;
         return 1;
      } else {
         return 2;
      }
   }
}
