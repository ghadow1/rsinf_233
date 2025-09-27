package game;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public class class79 extends class544 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   final class436 field1157 = new class436();
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 542989475
   )
   public int field1172;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lit;"
   )
   public class230 field1159;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "[Lkb;"
   )
   class275[] field1175 = new class275[4];
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -71765503
   )
   public int field1170;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 688942373
   )
   public int field1162;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1737912357
   )
   public int field1163;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1803587969
   )
   int field1164;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1957453421
   )
   int field1165;
   @ObfuscatedName("au")
   int[][] field1166;
   @ObfuscatedName("ai")
   int[][][] field1173;
   @ObfuscatedName("aa")
   byte[][][] field1168;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lqf;"
   )
   public class424 field1169;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lqf;"
   )
   class424 field1160;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lqm;"
   )
   class426 field1171;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "[[[Lqs;"
   )
   class436[][][] field1167;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   class436 field1158 = new class436();
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   class436 field1174 = new class436();
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lsn;"
   )
   class486 field1161 = new class486(149);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lsn;"
   )
   class486 field1176 = new class486(25);

   @ObfuscatedSignature(
      descriptor = "(IIIILio;)V"
   )
   class79(int var1, int var2, int var3, int var4, class217 var5) {
      this.field1172 = var1;
      this.field1162 = var2;
      this.field1163 = var3;
      this.field1169 = new class424(var1 == -1 ? 512 : 8);
      this.field1160 = new class424(var1 == -1 ? 128 : 8);
      this.field1171 = new class426(var1 == -1 ? 32 : 1);
      this.field1167 = new class436[4][var2][var3];
      this.field1173 = new int[4][var2 + 1][var3 + 1];
      this.field1168 = new byte[4][var2][var3];
      this.field1166 = new int[var2][var3];
      boolean var6 = var1 != -1;

      for(int var7 = 0; var7 < 4; ++var7) {
         this.field1175[var7] = new class275(var2, var3, var6);
      }

      this.field1159 = new class230(var1, 4, var2, var3, var4, var5, this.field1173);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1129049926"
   )
   boolean method2691() {
      return this.field1172 == -1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1923596588"
   )
   void method2681() {
      this.field1161.method9793();
      this.field1176.method9793();
      this.field1169.method8560();
      this.field1160.method8560();
      this.field1171.method8591();
      this.field1174.method8685();
      this.field1158 = new class436();

      int var1;
      for(var1 = 0; var1 < 4; ++var1) {
         for(int var2 = 0; var2 < this.field1162; ++var2) {
            for(int var3 = 0; var3 < this.field1163; ++var3) {
               this.field1167[var1][var2][var3] = null;
            }
         }
      }

      this.field1159.method5101();

      for(var1 = 0; var1 < 4; ++var1) {
         this.field1175[var1].method6165();
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1814219322"
   )
   void method2680() {
      this.field1169.method8560();

      class75 var2;
      for(Iterator var1 = this.field1160.iterator(); var1.hasNext(); var2.field1048 = false) {
         var2 = (class75)var1.next();
         var2.field1082 = -1;
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)Lcv;",
      garbageValue = "-51"
   )
   class69 method2683(int var1) {
      return (class69)this.field1169.method8567((long)var1);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)Lqs;",
      garbageValue = "90"
   )
   class436 method2684() {
      return this.field1157;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IIILib;II)V",
      garbageValue = "2089182867"
   )
   void method2685(int var1, int var2, int var3, class212 var4, int var5) {
      class72 var6 = new class72(this.field1172, var1, var2, var3, var5, var4);
      this.field1157.method8689(var6);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1463268347"
   )
   void method2686() {
      for(class72 var1 = (class72)this.field1157.method8690(); var1 != null; var1 = (class72)this.field1157.method8692()) {
         var1.method2252();
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IIILib;IB)V",
      garbageValue = "2"
   )
   void method2687(int var1, int var2, int var3, class212 var4, int var5) {
      if (var4 != null && var4.method4614()) {
         int var6 = var4.field2329;
         int var7 = var4.field2330;
         if (var5 == 1 || var5 == 3) {
            var6 = var4.field2330;
            var7 = var4.field2329;
         }

         int var8 = class356.method7417(var6 + var2);
         int var9 = class356.method7417(var3 + var7);
         var2 = class356.method7417(var2);
         var3 = class356.method7417(var3);
         int var10 = var4.field2358;
         int var11 = class356.method7417(var4.field2359);
         int var12 = class356.method7417(var4.field2352);
         if (var4.field2355 != null) {
            class212 var13 = var4.method4611();
            if (var13 != null) {
               var10 = var13.field2358;
               var11 = class356.method7417(var13.field2359);
               var12 = class356.method7417(var13.field2352);
            }
         }

         for(class72 var14 = (class72)this.field1157.method8690(); var14 != null; var14 = (class72)this.field1157.method8692()) {
            if (var14.method2260() == var1 && var14.method2254() == var2 && var14.method2317() == var3 && var14.method2255() == var8 && var14.method2257() == var9 && var14.method2290() == var10 && var14.method2259() == var11 && var14.method2300() == var12) {
               var14.method2252();
               break;
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "951678344"
   )
   protected static final int method2701() {
      return class34.field193.method381();
   }

   @ObfuscatedName("ky")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IIIIIIII[Ljava/lang/String;IIB)V",
      garbageValue = "-67"
   )
   static void method2702(class79 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String[] var9, int var10, int var11) {
      class436 var12 = var0.field1158;
      class74 var13 = null;

      for(class74 var14 = (class74)var12.method8690(); var14 != null; var14 = (class74)var12.method8692()) {
         if (var14.field1026 == var1 && var2 == var14.field1022 && var3 == var14.field1036 && var4 == var14.field1021) {
            var13 = var14;
            break;
         }
      }

      if (var13 == null) {
         var13 = new class74();
         var13.field1026 = var1;
         var13.field1021 = var4;
         var13.field1022 = var2;
         var13.field1036 = var3;
         var13.field1023 = -1;
         class108.method3388(var0, var13);
         var12.method8689(var13);
      }

      var13.field1027 = var5;
      var13.field1029 = var6;
      var13.field1028 = var7;
      var13.field1031 = var10;
      var13.field1032 = var11;
      var13.method2398(var8);
      var13.method2399(var9);
   }
}
