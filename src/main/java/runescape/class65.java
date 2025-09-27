package runescape;

import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
public class class65 extends class544 {
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -246449449
   )
   public static int field904;
   @ObfuscatedName("af")
   boolean field899;
   @ObfuscatedName("aw")
   Object[] field898;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   class369 field893;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -16830371
   )
   int field900;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 718756911
   )
   int field895;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1368322837
   )
   int field891;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1604733201
   )
   int field897;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   class369 field896;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -163423073
   )
   int field892;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 595835473
   )
   int field894;
   @ObfuscatedName("ai")
   String field901;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 777036783
   )
   int field902;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1145176903
   )
   int field903 = 76;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/Object;I)V",
      garbageValue = "125546287"
   )
   public void method2143(Object[] var1) {
      this.field898 = var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1771288626"
   )
   public void method2135(int var1) {
      this.field903 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Loi;I)V",
      garbageValue = "1403497876"
   )
   public void method2136(class369 var1) {
      this.field893 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "0"
   )
   static boolean method2139() {
      try {
         if (class44.field630 == null) {
            class44.field630 = class114.field1507.method3489(new URL(class268.field3179));
         } else if (class44.field630.method3519()) {
            byte[] var0 = class44.field630.method3520();
            Buffer var1 = new Buffer(var0);
            var1.read32BitArray();
            class44.field626 = var1.readUnsignedShort();
            class44.field624 = new class44[class44.field626];

            class44 var3;
            for(int var2 = 0; var2 < class44.field626; var3.field637 = var2++) {
               var3 = class44.field624[var2] = new class44();
               var3.field640 = var1.readUnsignedShort();
               var3.field632 = var1.read32BitArray();
               var3.field634 = var1.method11207();
               var3.field622 = var1.method11207();
               var3.field635 = var1.method11196();
               var3.field628 = var1.method11452();
            }

            class464.method9401(class44.field624, 0, class44.field624.length - 1, class44.field629, class44.field636);
            class44.field630 = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         class44.field630 = null;
      }

      return false;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwb;B)Ljava/lang/String;",
      garbageValue = "-114"
   )
   public static String method2145(Buffer var0) {
      String var1;
      try {
         int var2 = var0.method11212();
         if (var2 > 32767) {
            var2 = 32767;
         }

         byte[] var3 = new byte[var2];
         var0.offset += class376.field4328.method8148(var0.array, var0.offset * 1216585693, var3, 0, var2) * -290410379;
         String var4 = class214.method4757(var3, 0, var2);
         var1 = var4;
      } catch (Exception var6) {
         var1 = "Cabbage";
      }

      return var1;
   }
}
