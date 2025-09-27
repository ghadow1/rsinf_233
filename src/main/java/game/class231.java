package game;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public class class231 extends class238 {
   @ObfuscatedName("bt")
   static GarbageCollectorMXBean field2787;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lrj;"
   )
   class454 field2791;
   @ObfuscatedName("aw")
   float[] field2790 = new float[3];
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      longValue = -462666941977619849L
   )
   long field2786 = 0L;

   @ObfuscatedSignature(
      descriptor = "(Lrj;)V"
   )
   class231(class454 var1) {
      this.field2791 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Liz;IIIIJ)V"
   )
   void vmethod5415(class233 var1, int var2, int var3, int var4, int var5, long var6) {
      int var8 = class242.field2967;
      boolean var16;
      if (this.field2786 != 0L) {
         boolean var11 = var6 != 0L;
         boolean var12;
         if (var11) {
            var12 = (int)(var6 >>> 19 & 1L) == 1;
            var11 = !var12;
         }

         var12 = !var11;
         long var14;
         if (!var12) {
            var14 = this.field2786;
            var16 = var14 != 0L;
            if (var16) {
               boolean var17 = (int)(var14 >>> 19 & 1L) == 1;
               var16 = !var17;
            }

            var12 = var16;
         }

         if (var12) {
            long var18 = this.field2786;
            var14 = var18 & -524289L;
            var6 = var14;
         }
      }

      var1.vmethod5480(var2, this.field2791, var3, var4, var5, var6);
      if (0L != this.field2786) {
         int var22 = class242.field2967;
         if (var22 != var8) {
            long var20 = this.field2786;
            boolean var15 = 0L != var20;
            if (var15) {
               var16 = (int)(var20 >>> 19 & 1L) == 1;
               var15 = !var16;
            }

            this.field2786 = class123.method3544(0, 0, 0, 5, !var15, 0, 0);
         }
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lit;Ljt;IIIB)V",
      garbageValue = "1"
   )
   void vmethod5408(class230 var1, class245 var2, int var3, int var4, int var5) {
      float var6;
      float var7 = var6 = (float)(var4 << 7);
      float var8;
      float var9 = var8 = (float)(var5 << 7);
      float var10;
      float var11 = var10 = 128.0F + var7;
      float var12;
      float var13 = var12 = var9 + 128.0F;
      float var14 = (float)var1.field2728[var3][var4][var5];
      float var15 = (float)var1.field2728[var3][var4 + 1][var5];
      float var16 = (float)var1.field2728[var3][var4 + 1][var5 + 1];
      float var17 = (float)var1.field2728[var3][var4][var5 + 1];
      this.field2791.method9085(var7, var14, var9, this.field2790);
      var7 = this.field2790[0];
      var14 = this.field2790[1];
      var9 = this.field2790[2];
      if (!(var9 < 50.0F)) {
         this.field2791.method9085(var11, var15, var8, this.field2790);
         var11 = this.field2790[0];
         var15 = this.field2790[1];
         var8 = this.field2790[2];
         if (!(var8 < 50.0F)) {
            this.field2791.method9085(var10, var16, var13, this.field2790);
            var10 = this.field2790[0];
            var16 = this.field2790[1];
            var13 = this.field2790[2];
            if (!(var13 < 50.0F)) {
               this.field2791.method9085(var6, var17, var12, this.field2790);
               var6 = this.field2790[0];
               var17 = this.field2790[1];
               var12 = this.field2790[2];
               if (!(var12 < 50.0F)) {
                  this.method5411(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12);
               }
            }
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lit;Ljp;III)V",
      garbageValue = "-535692172"
   )
   void vmethod5410(class230 var1, class239 var2, int var3, int var4) {
      int var5 = var2.field2858.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         float var7 = (float)var2.field2858[var6];
         float var8 = (float)var2.field2868[var6];
         float var9 = (float)var2.field2860[var6];
         this.field2791.method9085(var7, var8, var9, this.field2790);
         var7 = this.field2790[0];
         var8 = this.field2790[1];
         var9 = this.field2790[2];
         if (var9 < 50.0F) {
            return;
         }

         if (var2.field2867 != null) {
            class239.field2855[var6] = (int)var7;
            class239.field2856[var6] = (int)var8;
            class239.field2854[var6] = (int)var9;
         }

         class239.field2850[var6] = (float)class225.method4933() + var7 * (float)class225.method4938() / var9;
         class239.field2857[var6] = (float)class225.method4946() + var8 * (float)class225.method4938() / var9;
         class239.field2866[var6] = class145.method3742(var9);
      }

      this.method5409(var1, var2, var3, var4);
   }

   @ObfuscatedName("ai")
   void method5350(long var1) {
      this.field2786 = var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1038093422"
   )
   public static void method5344() {
      Iterator var0 = class339.field3890.iterator();

      while(true) {
         class351 var1;
         do {
            if (!var0.hasNext()) {
               class339.field3890.clear();
               return;
            }

            var1 = (class351)var0.next();
         } while(var1 == null);

         var1.field4012.method7145();
         var1.field4012.method7143();
         var1.field4012.method7218(0);
         var1.field4012.field3904 = 0;
         int var2 = var1.field4007;
         int var3 = var1.field4004;
         Iterator var4 = class339.field3893.iterator();

         while(var4.hasNext()) {
            class345 var5 = (class345)var4.next();
            var5.vmethod7338(var2, var3);
         }
      }
   }

   @ObfuscatedName("lk")
   @ObfuscatedSignature(
      descriptor = "(IIII[Ljava/lang/Object;I)V",
      garbageValue = "-1613690713"
   )
   static void method5359(int var0, int var1, int var2, int var3, Object[] var4) {
      boolean var5 = false;
      class369 var6 = class119.field1554.method7477(var0, var1);
      if (var5 || var6 != null) {
         int var8;
         if (!var5) {
            var8 = class373.method8139(var6);
            boolean var7 = (var8 >> 23 & 1) != 0;
            if (!var7) {
               return;
            }
         }

         class329 var16 = class130.method3593(class327.field3579, client.field314.field1308);
         var16.field3664.writeShortBigEndian(0);
         var8 = var16.field3664.buffer * 1216585693;
         var16.field3664.putIntLittleEndian(var3);
         var16.field3664.writeIntBigEndian(var0);
         var16.field3664.method11236(var2);
         var16.field3664.method11325(var1);
         Object[] var9 = var4;

         for(int var10 = 0; var10 < var9.length; ++var10) {
            Object var11 = var9[var10];
            if (var11 instanceof Integer) {
               var16.field3664.method11443((Integer)var11);
            } else if (var11 instanceof String) {
               var16.field3664.writeNullTermString((String)var11);
            } else if (var11 instanceof class519) {
               class519 var12 = (class519)var11;
               int var13 = var12.method10322();
               var16.field3664.method11192(var13);
               int var15;
               if (var12.field5504 == class574.field5820) {
                  int[] var17 = var12.method10318();

                  for(var15 = 0; var15 < var13; ++var15) {
                     var16.field3664.method11443(var17[var15]);
                  }
               } else {
                  Object[] var14 = var12.method10321();

                  for(var15 = 0; var15 < var13; ++var15) {
                     var16.field3664.writeNullTermString((String)var14[var15]);
                  }
               }
            } else if (var11 == null) {
               var16.field3664.writeByte(0);
            }
         }

         var16.field3664.putUnsignedShortBigEndian(var16.field3664.buffer * 1216585693 - var8);
         client.field314.prepData(var16);
      }
   }
}
