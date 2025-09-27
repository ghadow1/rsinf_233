package game;

import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class9 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lau;"
   )
   public static final class9 field34 = new class9(0, "POST", true, true);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lau;"
   )
   public static final class9 field30 = new class9(1, "GET", true, false);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lau;"
   )
   static final class9 field31 = new class9(2, "PUT", false, true);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lau;"
   )
   static final class9 field39 = new class9(3, "PATCH", false, true);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lau;"
   )
   static final class9 field33 = new class9(4, "DELETE", false, true);
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 562401379
   )
   int field29;
   @ObfuscatedName("ao")
   String field35;
   @ObfuscatedName("as")
   boolean field36;
   @ObfuscatedName("al")
   boolean field37;

   class9(int var1, String var2, boolean var3, boolean var4) {
      this.field29 = var1;
      this.field35 = var2;
      this.field36 = var3;
      this.field37 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field29;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "50"
   )
   boolean method80() {
      return this.field36;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-596675877"
   )
   public String method69() {
      return this.field35;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2124004968"
   )
   boolean method70() {
      return this.field37;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/io/File;ZB)Z",
      garbageValue = "-75"
   )
   static boolean method82(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if (var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-20"
   )
   public static int method74(int var0) {
      return class535.field5564[var0 & 16383];
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(FFFFLff;B)V",
      garbageValue = "-47"
   )
   static void method81(float var0, float var1, float var2, float var3, class138 var4) {
      float var5 = var1 - var0;
      float var6 = var2 - var1;
      float var7 = var3 - var2;
      float var8 = var6 - var5;
      var4.field1672 = var7 - var6 - var8;
      var4.field1671 = var8 + var8 + var8;
      var4.field1670 = var5 + var5 + var5;
      var4.field1669 = var0;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "-125"
   )
   static boolean method84(char var0) {
      for(int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) {
         if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
            return true;
         }
      }

      return false;
   }
}
