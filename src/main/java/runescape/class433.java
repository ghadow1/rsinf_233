package runescape;

import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
public enum class433 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   field5120("", 0, new StudioGame[]{StudioGame.field5087, StudioGame.field5088}),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   field5106("", 1, new StudioGame[]{StudioGame.field5086, StudioGame.field5087, StudioGame.field5088}),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   field5118("", 2, new StudioGame[]{StudioGame.field5086, StudioGame.field5085, StudioGame.field5087}),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   field5107("", 3, new StudioGame[]{StudioGame.field5086}),
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   field5108("", 4),
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   field5110("", 5, new StudioGame[]{StudioGame.field5086, StudioGame.field5087}),
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   field5111("", 6, new StudioGame[]{StudioGame.field5087}),
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   field5112("", 8, new StudioGame[]{StudioGame.field5086, StudioGame.field5087}),
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   field5113("", 9, new StudioGame[]{StudioGame.field5086, StudioGame.field5085}),
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   field5114("", 10, new StudioGame[]{StudioGame.field5086}),
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   field5115("", 11, new StudioGame[]{StudioGame.field5086}),
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   field5109("", 12, new StudioGame[]{StudioGame.field5086, StudioGame.field5087}),
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   field5117("", 13, new StudioGame[]{StudioGame.field5086});

   @ObfuscatedName("sd")
   @ObfuscatedGetter(
      intValue = 785422869
   )
   static int field5116;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1423102717
   )
   final int field5105;
   @ObfuscatedName("ar")
   final Set field5119 = new HashSet();

   static {
      method8668();
   }

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I[Lqj;)V"
   )
   class433(String var3, int var4, StudioGame[] var5) {
      this.field5105 = var4;
      StudioGame[] var6 = var5;

      for(int var7 = 0; var7 < var6.length; ++var7) {
         StudioGame var8 = var6[var7];
         this.field5119.add(var8);
      }

   }

   class433(String var3, int var4) {
      this.field5105 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field5105;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IB)Lib;",
      garbageValue = "1"
   )
   public static class212 method8669(int var0) {
      class212 var1 = (class212)class212.field2314.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class212.field2317.method8335(6, var0);
         var1 = new class212();
         var1.field2321 = var0;
         if (var2 != null) {
            var1.method4604(new Buffer(var2));
         }

         var1.method4603();
         if (var1.field2353) {
            var1.field2331 = 0;
            var1.field2332 = false;
         }

         class212.field2314.method7009(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)Lhn;",
      garbageValue = "-125"
   )
   public static class201 method8663(int var0) {
      class201 var1 = (class201)class201.field2194.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class201.field2203.method8335(13, var0);
         var1 = new class201();
         var1.field2205 = var0;
         if (var2 != null) {
            var1.method4421(new Buffer(var2));
         }

         class201.field2194.method7009(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[Lqy;",
      garbageValue = "1391760667"
   )
   static class433[] method8668() {
      return new class433[]{field5114, field5120, field5112, field5118, field5110, field5107, field5117, field5108, field5115, field5113, field5109, field5106, field5111};
   }

   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      descriptor = "(Ldr;Lhw;I)V",
      garbageValue = "-860845225"
   )
   static final void method8666(class79 var0, class197 var1) {
      for(int var2 = 0; var2 < var0.field1161.method9790(); ++var2) {
         class81 var3 = (class81)var0.field1160.method8567((long)var0.field1161.method9787(var2));
         if (var3 != null && var3.vmethod2740() && var3.field1184.field2154 == var1 && var3.field1184.method4331()) {
            int var4 = var0.field1170;
            int var5 = var3.field1055 >> 7;
            int var6 = var3.field1056 >> 7;
            if (var5 >= 0 && var5 < var0.field1162 && var6 >= 0 && var6 < var0.field1163) {
               if (var3.field1059 * 92278784 == 1 && (var3.field1055 & 127) == 64 && (var3.field1056 & 127) == 64) {
                  if (var0.field1166[var5][var6] == client.field502) {
                     continue;
                  }

                  var0.field1166[var5][var6] = client.field502;
               }

               long var7 = class123.method3544(0, 0, 0, 1, !var3.field1184.field2144, var3.field1103, var0.field1172);
               var3.field1087 = client.cycle;
               int var9 = class255.method5812(var0, var3.field1055, var3.field1056, var4, var3.vmethod2763());
               var9 -= var3.method2417();
               int var10 = var3.field1059 * 1610874880 - 64 + 60;
               var0.field1159.method5112(var4, var3.field1055, var3.field1056, var9, var10, var3, var3.field1057, var7, var3.field1058);
            }
         }
      }

   }
}
