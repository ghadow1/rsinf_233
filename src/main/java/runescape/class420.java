package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
public class class420 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1355047097
   )
   public final int field5033;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      longValue = -2009867072126087687L
   )
   public final long field5037;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lqt;"
   )
   public final class421 field5032;
   @ObfuscatedName("ac")
   String field5034;
   @ObfuscatedName("ap")
   String field5035;

   @ObfuscatedSignature(
      descriptor = "(Lwb;BI)V"
   )
   class420(Buffer var1, byte var2, int var3) {
      this.field5034 = var1.method11207();
      this.field5035 = var1.method11207();
      this.field5033 = var1.readUnsignedShort();
      this.field5037 = var1.method11203();
      int var4 = var1.read32BitArray();
      int var5 = var1.read32BitArray();
      this.field5032 = new class421();
      this.field5032.method8513(2);
      this.field5032.method8525(var2);
      this.field5032.field5040 = var4;
      this.field5032.field5041 = var5;
      this.field5032.field5042 = 0;
      this.field5032.field5038 = 0;
      this.field5032.field5039 = var3;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1237531853"
   )
   public String method8502() {
      return this.field5034;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "542971699"
   )
   public String method8501() {
      return this.field5035;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[Lxk;",
      garbageValue = "-2116850015"
   )
   public static class603[] method8510() {
      return new class603[]{class603.field6000, class603.field6002, class603.field6001};
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "([J[JIII)V",
      garbageValue = "-2142951697"
   )
   public static void method8509(long[] var0, long[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         long var10 = Long.MAX_VALUE == var6 ? 0L : 1L;

         for(int var12 = var2; var12 < var3; ++var12) {
            if (var0[var12] < ((long)var12 & var10) + var6) {
               long var13 = var0[var12];
               var0[var12] = var0[var5];
               var0[var5] = var13;
               long var15 = var1[var12];
               var1[var12] = var1[var5];
               var1[var5++] = var15;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         method8509(var0, var1, var2, var5 - 1);
         method8509(var0, var1, var5 + 1, var3);
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1399594449"
   )
   public static String method8505(String var0) {
      StringBuilder var1 = new StringBuilder(var0.length());
      int var2 = 0;
      int var3 = -1;

      for(int var4 = 0; var4 < var0.length(); ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 == '<') {
            var1.append(var0.substring(var2, var4));
            var3 = var4;
         } else if (var5 == '>' && var3 != -1) {
            String var6 = var0.substring(var3 + 1, var4);
            var3 = -1;
            if (var6.equals("lt")) {
               var1.append("<");
            } else if (var6.equals("gt")) {
               var1.append(">");
            } else if (var6.equals("br")) {
               var1.append("\n");
            }

            var2 = var4 + 1;
         }
      }

      if (var2 < var0.length()) {
         var1.append(var0.substring(var2, var0.length()));
      }

      return var1.toString();
   }
}
