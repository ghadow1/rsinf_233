package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public final class class81 extends class75 {
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 976788785
   )
   static int field1185 = 1;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1401387607
   )
   static int field1186 = 1;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lhh;"
   )
   class195 field1184;
   @ObfuscatedName("ap")
   boolean field1188 = false;
   @ObfuscatedName("aq")
   String field1189 = "";
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1952516783
   )
   int field1190 = 31;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lwt;"
   )
   class591 field1191;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lhq;"
   )
   class194 field1187;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lhq;"
   )
   class194 field1193;

   class81(int var1) {
      super(var1);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1895784021"
   )
   void method2716(String var1) {
      this.field1189 = var1 == null ? "" : var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ljn;",
      garbageValue = "-1879635116"
   )
   protected final class241 vmethod5365() {
      if (this.field1184 == null) {
         return null;
      } else {
         class469 var1 = this.method2441();
         class469 var2 = this.method2419(var1);
         if (var1 == null && var2 == null) {
            var2 = super.field1093;
            if (super.field1093.method9567(30)) {
               return null;
            }
         }

         class215 var3 = var1 == null ? null : var1.method9581();
         class215 var4 = var2 == null ? null : var2.method9581();
         int var5 = var1 == null ? -1 : var1.method9565();
         int var6 = var2 == null ? -1 : var2.method9565();
         class241 var7 = null;
         if (this.field1187 != null && this.field1187.field2096) {
            var7 = class76.field1108.field935.method7599(var3, var5, var4, var6);
         } else {
            var7 = this.field1184.method4327(var3, var5, var4, var6, this.field1187);
         }

         if (var7 == null) {
            return null;
         } else {
            var7.method5459();
            super.field1070 = var7.field2801;
            int var8 = var7.field2908;
            var7 = this.method2431(var7);
            if (this.field1184.field2111 == 1) {
               var7.field2941 = true;
            }

            if (super.field1076.method5651() && client.field412 >= super.field1051 && client.field412 < super.field1052) {
               var7.method5491(super.field1076, (short)var8);
            } else {
               var7.method5599();
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-75"
   )
   void method2717(int var1) {
      this.field1190 = var1;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "0"
   )
   boolean method2718(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1190 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1902341714"
   )
   final String method2715() {
      if (!this.field1189.isEmpty()) {
         return this.field1189;
      } else {
         class195 var1 = this.field1184;
         if (var1.field2099 != null) {
            var1 = var1.method4365();
            if (var1 == null) {
               var1 = this.field1184;
            }
         }

         return var1.field2110;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(ILko;S)V",
      garbageValue = "-11531"
   )
   final void method2737(int var1, class280 var2) {
      int var3 = super.field1039[0];
      int var4 = super.field1107[0];
      if (var1 == 0) {
         --var3;
         ++var4;
      }

      if (var1 == 1) {
         ++var4;
      }

      if (var1 == 2) {
         ++var3;
         ++var4;
      }

      if (var1 == 3) {
         --var3;
      }

      if (var1 == 4) {
         ++var3;
      }

      if (var1 == 5) {
         --var3;
         --var4;
      }

      if (var1 == 6) {
         --var4;
      }

      if (var1 == 7) {
         ++var3;
         --var4;
      }

      if (super.field1074.method9566() && super.field1074.method9581().field2485 == 1) {
         this.method2472();
      }

      this.method2421(var3, var4, var2);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "777257420"
   )
   final void method2721(int var1, int var2, boolean var3) {
      if (super.field1074.method9566() && super.field1074.method9581().field2485 == 1) {
         this.method2472();
      }

      if (!var3) {
         int var4 = var1 - super.field1039[0];
         int var5 = var2 - super.field1107[0];
         if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            this.method2421(var1, var2, class280.field3281);
            return;
         }
      }

      this.method2422(var1, var2);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)[I",
      garbageValue = "11"
   )
   int[] method2724() {
      return this.field1191 != null ? this.field1191.method11461() : this.field1184.method4335();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)[S",
      garbageValue = "1661546749"
   )
   short[] method2748() {
      return this.field1191 != null ? this.field1191.method11462() : this.field1184.method4333();
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IISS)V",
      garbageValue = "7361"
   )
   void method2726(int var1, int var2, short var3) {
      if (this.field1191 == null) {
         this.field1191 = new class591(this.field1184);
      }

      this.field1191.method11463(var1, var2, var3);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "([I[SB)V",
      garbageValue = "-53"
   )
   void method2727(int[] var1, short[] var2) {
      if (this.field1191 == null) {
         this.field1191 = new class591(this.field1184);
      }

      this.field1191.method11460(var1, var2);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1731560641"
   )
   void method2759() {
      this.field1191 = null;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)Lhq;",
      garbageValue = "-1902077938"
   )
   class194 method2729() {
      return this.field1193;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1641761362"
   )
   final boolean vmethod2740() {
      return this.field1184 != null;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Lhq;I)V",
      garbageValue = "-2089731197"
   )
   void method2730(class194 var1) {
      this.field1193 = var1;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Lhq;B)V",
      garbageValue = "4"
   )
   void method2731(class194 var1) {
      this.field1187 = var1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "37"
   )
   int vmethod2763() {
      return this.method2440() ? 0 : this.field1184.method4345();
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1553793305"
   )
   void method2732() {
      this.field1193 = null;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "609621424"
   )
   void method2733() {
      this.field1187 = null;
   }

   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-370338102"
   )
   int vmethod2734() {
      return this.field1184.field2118 == -1 ? super.field1070 : this.field1184.field2118;
   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      descriptor = "(Ldr;B)V",
      garbageValue = "45"
   )
   static void method2772(class79 var0) {
      int var1 = client.field335.field1254;
      int[] var2 = client.field335.field1243;

      for(int var3 = 0; var3 < var1; ++var3) {
         if (var2[var3] != client.field519 && var2[var3] != client.field491) {
            class390.method8219(var0, var2[var3], true);
         }
      }

   }

   @ObfuscatedName("km")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IIIIIII)V",
      garbageValue = "663919164"
   )
   static void method2771(class79 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      class436 var7 = var0.field1167[var1][var2][var3];
      if (var7 != null) {
         for(class85 var8 = (class85)var7.method8690(); var8 != null; var8 = (class85)var7.method8692()) {
            if ((var4 & 32767) == var8.field1221 && var5 == var8.field1222) {
               var8.field1222 = var6;
               break;
            }
         }

         class190.method4306(var1, var2, var3);
      }

   }
}
