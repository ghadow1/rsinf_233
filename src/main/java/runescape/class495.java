package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
public class class495 extends class501 {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lva;"
   )
   final LoginType field5382;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lse;"
   )
   final class493 field5377;
   @ObfuscatedName("ac")
   public String field5379 = null;
   @ObfuscatedName("ap")
   public String field5376 = null;
   @ObfuscatedName("aq")
   public byte field5380;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1887561389
   )
   public int field5381;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1704514931
   )
   int field5378 = 1;

   @ObfuscatedSignature(
      descriptor = "(Lva;Lse;)V"
   )
   public class495(LoginType var1, class493 var2) {
      super(500);
      this.field5382 = var1;
      this.field5377 = var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Ltl;",
      garbageValue = "690274569"
   )
   class499 vmethod10007() {
      return new class498();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)[Ltl;",
      garbageValue = "-102"
   )
   class499[] vmethod9991(int var1) {
      return new class498[var1];
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "0"
   )
   final void method9892(String var1) {
      long var5 = 0L;
      int var7 = var1.length();

      for(int var8 = 0; var8 < var7; ++var8) {
         var5 *= 37L;
         char var9 = var1.charAt(var8);
         if (var9 >= 'A' && var9 <= 'Z') {
            var5 += (long)(var9 + 1 - 65);
         } else if (var9 >= 'a' && var9 <= 'z') {
            var5 += (long)(var9 + 1 - 97);
         } else if (var9 >= '0' && var9 <= '9') {
            var5 += (long)(var9 + 27 - 48);
         }

         if (var5 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var5 % 37L && 0L != var5) {
         var5 /= 37L;
      }

      String var10 = class189.method4285(var5);
      if (var10 == null) {
         var10 = "";
      }

      this.field5379 = var10;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "0"
   )
   final void method9884(String var1) {
      this.field5376 = class346.method7342(var1);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lwb;B)V",
      garbageValue = "122"
   )
   public final void method9886(Buffer var1) {
      this.method9884(var1.method11207());
      long var2 = var1.method11203();
      long var5 = var2;
      String var4;
      int var7;
      if (var2 > 0L && var2 < 6582952005840035281L) {
         if (var2 % 37L == 0L) {
            var4 = null;
         } else {
            var7 = 0;

            for(long var8 = var2; 0L != var8; var8 /= 37L) {
               ++var7;
            }

            StringBuilder var10 = new StringBuilder(var7);

            while(var5 != 0L) {
               long var11 = var5;
               var5 /= 37L;
               var10.append(class447.field5151[(int)(var11 - 37L * var5)]);
            }

            var4 = var10.reverse().toString();
         }
      } else {
         var4 = null;
      }

      this.method9892(var4);
      this.field5380 = var1.method11197();
      var7 = var1.method11213();
      if (var7 != -1) {
         this.method9971();

         for(int var13 = 0; var13 < var7; ++var13) {
            class498 var9 = (class498)this.method10016(new class613(var1.method11207(), this.field5382));
            int var14 = var1.readUnsignedShort();
            var9.method10054(var14, ++this.field5378 - 1);
            var9.field5412 = var1.method11197();
            var1.method11207();
            this.method9881(var9);
         }

      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-250321513"
   )
   public final void method9887(Buffer var1) {
      class613 var2 = new class613(var1.method11207(), this.field5382);
      int var3 = var1.readUnsignedShort();
      byte var4 = var1.method11197();
      boolean var5 = false;
      if (var4 == -128) {
         var5 = true;
      }

      class498 var6;
      if (var5) {
         if (this.method9972() == 0) {
            return;
         }

         var6 = (class498)this.method9976(var2);
         if (var6 != null && var6.method10055() == var3) {
            this.method10014(var6);
         }
      } else {
         var1.method11207();
         var6 = (class498)this.method9976(var2);
         if (var6 == null) {
            if (this.method9972() > super.field5406) {
               return;
            }

            var6 = (class498)this.method10016(var2);
         }

         var6.method10054(var3, ++this.field5378 - 1);
         var6.field5412 = var4;
         this.method9881(var6);
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "127"
   )
   public final void method9888() {
      for(int var1 = 0; var1 < this.method9972(); ++var1) {
         ((class498)this.method9982(var1)).method9924();
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-271651505"
   )
   public final void method9889() {
      for(int var1 = 0; var1 < this.method9972(); ++var1) {
         ((class498)this.method9982(var1)).method9926();
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ltp;I)V",
      garbageValue = "-819942610"
   )
   final void method9881(class498 var1) {
      if (var1.method9949().equals(this.field5377.vmethod9864())) {
         this.field5381 = var1.field5412;
      }

   }
}
