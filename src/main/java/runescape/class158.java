package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class158 extends class151 {
   @ObfuscatedName("af")
   boolean field1819;
   @ObfuscatedName("aw")
   byte field1820;
   @ObfuscatedName("at")
   byte field1823;
   @ObfuscatedName("ac")
   byte field1821;
   @ObfuscatedName("ap")
   byte field1822;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfz;"
   )
   final class154 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfz;)V"
   )
   class158(class154 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-2943315"
   )
   void vmethod4111(Buffer var1) {
      this.field1819 = var1.method11196() == 1;
      this.field1820 = var1.method11197();
      this.field1823 = var1.method11197();
      this.field1821 = var1.method11197();
      this.field1822 = var1.method11197();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lgs;I)V",
      garbageValue = "2108880901"
   )
   void vmethod4112(class162 var1) {
      var1.field1847 = this.field1819;
      var1.field1850 = this.field1820;
      var1.field1846 = this.field1823;
      var1.field1852 = this.field1821;
      var1.field1853 = this.field1822;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ILwb;B)Lgq;",
      garbageValue = "-98"
   )
   public static class176 method3879(int var0, Buffer var1) {
      int var2 = var1.method11196();
      boolean var3 = (var2 & 1) != 0;
      boolean var4 = (var2 & 2) != 0;
      boolean var5 = (var2 & 4) != 0;
      boolean var6 = (var2 & 8) != 0;
      class176 var7 = new class176(var0);
      int var8;
      int[] var9;
      boolean var10;
      int var11;
      short var12;
      if (var3) {
         var8 = var1.method11196();
         var9 = new int[]{var8 & 15, var8 >> 4 & 15};
         var10 = var7.field1947 != null && var9.length == var7.field1947.length;

         for(var11 = 0; var11 < 2; ++var11) {
            if (var9[var11] != 15) {
               var12 = (short)var1.readUnsignedShort();
               if (var10) {
                  var7.field1947[var9[var11]] = var12;
               }
            }
         }
      }

      if (var4) {
         var8 = var1.method11196();
         var9 = new int[]{var8 & 15, var8 >> 4 & 15};
         var10 = var7.field1949 != null && var9.length == var7.field1949.length;

         for(var11 = 0; var11 < 2; ++var11) {
            if (var9[var11] != 15) {
               var12 = (short)var1.readUnsignedShort();
               if (var10) {
                  var7.field1949[var9[var11]] = var12;
               }
            }
         }
      }

      if (var5) {
         var7.field1950 = var1.readUnsignedShort();
         var7.field1951 = var1.readUnsignedShort();
      }

      if (var6) {
         var7.field1944 = var1.readUnsignedShort();
         var7.field1952 = var1.readUnsignedShort();
      }

      return var7;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Lil;",
      garbageValue = "631872554"
   )
   public static class209 method3882(int var0) {
      class209 var1 = (class209)class209.field2277.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class209.field2278.method8335(34, var0);
         var1 = new class209();
         if (var2 != null) {
            var1.method4544(new Buffer(var2));
         }

         var1.method4556();
         class209.field2277.method7009(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lti;I)I",
      garbageValue = "-2111630728"
   )
   public static int method3884(class519 var0) {
      class218.method4826(var0, (class574)null, false);
      byte var1 = 0;
      int var2 = var0.method10322();
      int var3 = -1;
      int var8;
      if (var0.field5504 == class574.field5820) {
         int[] var4 = var0.method10318();

         for(var8 = var1; var8 < var2; ++var8) {
            if (var3 == -1 || var4[var8] > var4[var3]) {
               var3 = var8;
            }
         }
      } else if (var0.field5504 == class574.field5816) {
         long[] var9 = var0.method10320();

         for(var8 = var1; var8 < var2; ++var8) {
            if (var3 == -1 || var9[var8] > var9[var3]) {
               var3 = var8;
            }
         }
      } else if (var0.field5504 == class574.field5824) {
         String var10 = null;
         Object[] var5 = var0.method10321();

         for(int var6 = var1; var6 < var2; ++var6) {
            String var7 = (String)var5[var6];
            if (var3 == -1 || var7 != null && var7.compareTo(var10) > 0) {
               var3 = var6;
               var10 = var7;
            }
         }
      }

      return var3;
   }

   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "-6162"
   )
   static final int method3883() {
      return client.field522.field6052 - 1;
   }
}
