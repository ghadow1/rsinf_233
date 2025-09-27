package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class108 extends class544 {
   @ObfuscatedName("li")
   @ObfuscatedGetter(
      intValue = 635411313
   )
   static int field1425;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ldu;"
   )
   class102 field1427;

   public class108() {
      this.field1427 = null;
   }

   @ObfuscatedSignature(
      descriptor = "(Leo;)V"
   )
   class108(class110 var1) {
      if (var1 != null) {
         this.field1427 = new class102(var1, (class95)null);
      }
   }

   @ObfuscatedSignature(
      descriptor = "(Ldv;)V"
   )
   public class108(class95 var1) {
      this.field1427 = new class102((class110)null, var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2039137189"
   )
   public boolean method3390() {
      return this.field1427 == null;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Ldv;",
      garbageValue = "-1147295246"
   )
   public class95 method3369() {
      if (this.field1427 != null && this.field1427.field1388.tryLock()) {
         class95 var1;
         try {
            var1 = this.method3389();
         } finally {
            this.field1427.field1388.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ldv;",
      garbageValue = "-1291880381"
   )
   public class95 method3372() {
      if (this.field1427 != null) {
         this.field1427.field1388.lock();

         class95 var1;
         try {
            var1 = this.method3389();
         } finally {
            this.field1427.field1388.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Ldv;",
      garbageValue = "322931494"
   )
   class95 method3389() {
      if (this.field1427.field1387 == null) {
         this.field1427.field1387 = this.field1427.field1386.method3407((int[])null);
         this.field1427.field1386 = null;
      }

      return this.field1427.field1387;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "([JI)Lti;",
      garbageValue = "-271206630"
   )
   static class519 method3371(long[] var0) {
      class519 var1 = new class519(class574.field5816, false);
      var1.field5508 = var0;
      var1.field5502 = var0.length * -698619497;
      var1.field5503 = var0.length;
      return var1;
   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZB)I",
      garbageValue = "1"
   )
   static int method3378(int var0, class55 var1, boolean var2) {
      if (var0 == 7900) {
         int var3 = class46.field659[--class124.field1569];
         client.field384 = Math.max(var3, 0);
         return 1;
      } else if (var0 == 7901) {
         class46.field659[++class124.field1569 - 1] = client.field384;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("kz")
   @ObfuscatedSignature(
      descriptor = "(Ldr;Lck;B)V",
      garbageValue = "30"
   )
   static final void method3388(class79 var0, class74 var1) {
      class230 var2 = var0.field1159;
      long var3 = 0L;
      int var5 = -1;
      int var6 = 0;
      int var7 = 0;
      if (var1.field1021 == 0) {
         var3 = var2.method5127(var1.field1026, var1.field1022, var1.field1036);
      }

      if (var1.field1021 == 1) {
         var3 = var2.method5128(var1.field1026, var1.field1022, var1.field1036);
      }

      if (var1.field1021 == 2) {
         var3 = var2.method5341(var1.field1026, var1.field1022, var1.field1036);
      }

      if (var1.field1021 == 3) {
         var3 = var2.method5215(var1.field1026, var1.field1022, var1.field1036);
      }

      if (0L != var3) {
         int var8 = var2.method5169(var1.field1026, var1.field1022, var1.field1036, var3);
         var5 = class537.method10539(var3);
         var6 = var8 & 31;
         var7 = var8 >> 6 & 3;
      }

      var1.field1024 = var5;
      var1.field1035 = var6;
      var1.field1025 = var7;
   }
}
