package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class100 {
   @ObfuscatedName("ps")
   static int[] field1377;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   class412 field1373;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   class412 field1376;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lqw;"
   )
   class428 field1375;

   @ObfuscatedSignature(
      descriptor = "(Lpx;Lpx;)V"
   )
   public class100(class412 var1, class412 var2) {
      new class428(256);
      this.field1375 = new class428(256);
      this.field1373 = var1;
      this.field1376 = var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II[IB)Ldv;",
      garbageValue = "-79"
   )
   class95 method3118(int var1, int var2, int[] var3) {
      long var4 = this.method3122(var1, var2, false);
      class108 var6 = (class108)this.field1375.method8623(var4);
      if (var6 != null) {
         return var6.method3372();
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class94 var7 = class94.method2996(this.field1373, var1, var2);
         if (var7 == null) {
            return null;
         } else {
            class95 var8 = var7.method2998();
            this.field1375.method8625(new class108(var8), var4);
            if (var3 != null) {
               var3[0] -= var8.field1322.length;
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)Lec;",
      garbageValue = "489673497"
   )
   class108 method3143(int var1, int var2) {
      long var3 = this.method3122(var1, var2, true);
      class108 var5 = (class108)this.field1375.method8623(var3);
      if (var5 != null) {
         return var5;
      } else {
         class110 var6 = class110.method3417(this.field1376, var1, var2);
         if (var6 == null) {
            return new class108();
         } else {
            class108 var7 = new class108(var6);
            this.field1375.method8625(var7, var3);
            return var7;
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I[IB)Ldv;",
      garbageValue = "50"
   )
   class95 method3119(int var1, int[] var2) {
      if (this.field1373.method8344() == 1) {
         return this.method3118(0, var1, var2);
      } else if (this.field1373.method8347(var1) - 1 == 1) {
         return this.method3118(var1, 1, var2);
      } else if (this.field1373.method8347(var1) - 1 == 0) {
         return this.method3118(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)Lec;",
      garbageValue = "1318867147"
   )
   public class108 method3120(int var1) {
      if (this.field1376.method8344() == 1) {
         return this.method3143(0, var1);
      } else if (this.field1376.method8347(var1) == 1) {
         return this.method3143(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)Ldv;",
      garbageValue = "1047739201"
   )
   public class95 method3121(int var1) {
      return this.method3119(var1, (int[])null);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IIZB)J",
      garbageValue = "-55"
   )
   long method3122(int var1, int var2, boolean var3) {
      int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >> 12);
      var4 |= var1 << 16;
      return var3 ? (long)var4 ^ 4294967296L : (long)var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lpx;III)Lxt;",
      garbageValue = "-1019010004"
   )
   public static class605 method3145(class412 var0, int var1, int var2) {
      if (!class587.method11132(var0, var1, var2)) {
         return null;
      } else {
         class605 var4 = new class605();
         var4.field6022 = class606.field6025;
         var4.field6024 = class581.field5847;
         var4.field6021 = class149.field1763[0];
         var4.field6023 = class191.field2082[0];
         var4.field6019 = class255.field3068[0];
         var4.field6020 = class497.field5390[0];
         int var5 = var4.field6020 * var4.field6019;
         byte[] var6 = class7.field25[0];
         var4.field6018 = new int[var5];

         for(int var7 = 0; var7 < var5; ++var7) {
            var4.field6018[var7] = class504.field5414[var6[var7] & 255];
         }

         class388.method8205();
         return var4;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-62"
   )
   static final void method3117(String var0) {
      class329 var1 = class130.method3593(class327.field3592, client.field314.field1308);
      var1.field3664.writeByte(class288.method6418(var0));
      var1.field3664.writeNullTermString(var0);
      client.field314.prepData(var1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(FFFFI)F",
      garbageValue = "2011880333"
   )
   static final float method3130(float var0, float var1, float var2, float var3) {
      return var0 * var2 - var3 * var1;
   }
}
