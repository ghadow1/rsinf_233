package game;

import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class137 implements Callable {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lff;"
   )
   final class138 field1654;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lfe;"
   )
   final class139 field1651;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lfk;"
   )
   final class140 field1650;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1707620043
   )
   final int field1653;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class146 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfh;Lff;Lfe;Lfk;I)V"
   )
   class137(class146 var1, class138 var2, class139 var3, class140 var4, int var5) {
      this.this$0 = var1;
      this.field1654 = var2;
      this.field1651 = var3;
      this.field1650 = var4;
      this.field1653 = var5;
   }

   public Object call() {
      this.field1654.method3671();
      class138[][] var1;
      if (this.field1651 == class139.field1682) {
         var1 = this.this$0.field1737;
      } else {
         var1 = this.this$0.field1732;
      }

      var1[this.field1653][this.field1650.method3716()] = this.field1654;
      return null;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)[B",
      garbageValue = "21"
   )
   public static byte[] method3661(int var0) {
      return class403.method8271(var0, false);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lcq;III)V",
      garbageValue = "-1566246001"
   )
   static void method3666(class65 var0, int var1, int var2) {
      Object[] var3 = var0.field898;
      class55 var4;
      if (class208.method4530(var0.field903)) {
         class235.field2810 = (class312)var3[0];
         class184 var6 = class198.method4395(class235.field2810.field3512);
         var4 = class19.method297(var0.field903, var6.field1992, var6.field2004);
      } else {
         int var5 = (Integer)var3[0];
         var4 = class324.method7033(var5);
      }

      if (var4 != null) {
         class249.method5775(var0, var4, var1, var2);
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1977960047"
   )
   public static void method3667() {
      synchronized(class408.field4903) {
         if (class408.field4901 != 0) {
            class408.field4901 = 1;

            try {
               class408.field4903.wait();
            } catch (InterruptedException var5) {
            }
         }
      }

      synchronized(class408.field4904) {
         class408.field4904.method8685();
         class408.field4908.method8685();
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "([BI)Lcg;",
      garbageValue = "1464521330"
   )
   static class55 method3668(byte[] var0) {
      class55 var1 = new class55();
      class590 var2 = new class590(var0);
      var2.buffer = (var2.index.length - 2) * -290410379;
      int var3 = var2.method11198();
      int var4 = var2.index.length - 2 - var3 - 12;
      var2.buffer = var4 * -290410379;
      int var5 = var2.method11202();
      var1.field799 = var2.method11198();
      var1.field797 = var2.method11198();
      var1.field802 = var2.method11198();
      var1.field804 = var2.method11198();
      int var6 = var2.method11196();
      int var7;
      int var8;
      if (var6 > 0) {
         var1.field794 = var1.method1993(var6);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.method11198();
            class426 var9 = new class426(var8 > 0 ? class165.method4019(var8) : 1);
            var1.field794[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.method11202();
               int var11 = var2.method11202();
               var9.method8590(new class543(var11), (long)var10);
            }
         }
      }

      var2.buffer = 0;
      var1.field795 = var2.method11206();
      var1.field796 = new int[var5];
      var1.field801 = new int[var5];
      var1.field798 = new String[var5];

      for(var7 = 0; var2.buffer * 1216585693 < var4; var1.field796[var7++] = var8) {
         var8 = var2.method11198();
         switch(var8) {
         case 3:
            var1.field798[var7] = var2.method11207();
            break;
         case 21:
         case 38:
         case 39:
         case 63:
            var1.field801[var7] = var2.method11196();
            break;
         default:
            if (var8 <= 99) {
               var1.field801[var7] = var2.method11202();
            } else {
               var1.field801[var7] = var2.method11196();
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "4"
   )
   static void method3665() {
      class52.local_password = class52.local_password.trim();
      if (class52.local_password.isEmpty()) {
         class66.method2147("", "Please enter your username/email address.", "");
      } else if (class52.field726.isEmpty()) {
         class66.method2147("", "Please enter your password.", "");
      } else {
         class66.method2147("", "Connecting to server...", "");
         class325.method7035(false);
         class121.method3521(20);
      }
   }
}
