package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class class232 {
   @ObfuscatedName("iz")
   @ObfuscatedGetter(
      intValue = 1893703015
   )
   static int field2800;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1337717187
   )
   final int field2793;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1389386173
   )
   int field2799;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1982909743
   )
   int field2794;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1528866355
   )
   int field2795;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1315156917
   )
   int field2796;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -65913531
   )
   int field2797;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1529153599
   )
   int field2792;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lic;"
   )
   class232 field2798;

   class232(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field2793 = var1;
      this.field2799 = var2;
      this.field2794 = var3;
      this.field2795 = var4;
      this.field2796 = var5;
      this.field2797 = var6;
      this.field2792 = var7;
   }

   @ObfuscatedName("hd")
   @ObfuscatedSignature(
      descriptor = "(I)Lvi;",
      garbageValue = "47121015"
   )
   static class554 method5361() {
      return class56.field816;
   }

   @ObfuscatedName("ll")
   @ObfuscatedSignature(
      descriptor = "(Ldr;Lwf;B)V",
      garbageValue = "1"
   )
   static void method5360(class79 var0, PacketBuffer var1) {
      class79 var2 = class484.field5343;
      var2.field1164 = var1.readUnsignedShort();
      var2.field1165 = var1.readUnsignedShort();
      int var3 = var2.field1162 / 8;
      int var4 = var2.field1163 / 8;
      int var5 = var1.readUnsignedShort();
      var1.method11145();

      int var6;
      int var7;
      int var8;
      int var9;
      for(var6 = 0; var6 < 4; ++var6) {
         for(var7 = 0; var7 < var3; ++var7) {
            for(var8 = 0; var8 < var4; ++var8) {
               var9 = var1.method11146(1);
               if (var9 == 1) {
                  client.field423[var6][var7][var8] = var1.method11146(26);
               } else {
                  client.field423[var6][var7][var8] = -1;
               }
            }
         }
      }

      var1.method11147();
      class87.field1235 = new int[var5][4];

      for(var6 = 0; var6 < var5; ++var6) {
         for(var7 = 0; var7 < 4; ++var7) {
            class87.field1235[var6][var7] = var1.read32BitArray();
         }
      }

      class235.field2811 = new int[var5];
      class91.field1281 = new int[var5];
      class100.field1377 = new int[var5];
      class166.field1890 = new byte[var5][];
      class215.field2494 = new byte[var5][];
      var5 = 0;

      for(var6 = 0; var6 < 4; ++var6) {
         for(var7 = 0; var7 < var3; ++var7) {
            for(var8 = 0; var8 < var4; ++var8) {
               var9 = client.field423[var6][var7][var8];
               if (var9 != -1) {
                  int var10 = class253.method5796(var9);
                  int var11 = class34.method689(var9);
                  int var12 = (var10 / 8 << 8) + var11 / 8;

                  int var13;
                  for(var13 = 0; var13 < var5; ++var13) {
                     if (class235.field2811[var13] == var12) {
                        var12 = -1;
                        break;
                     }
                  }

                  if (var12 != -1) {
                     class235.field2811[var5] = var12;
                     var13 = var12 >> 8 & 255;
                     int var14 = var12 & 255;
                     class91.field1281[var5] = class149.field1760.method8361("m" + var13 + "_" + var14);
                     class100.field1377[var5] = class149.field1760.method8361("l" + var13 + "_" + var14);
                     ++var5;
                  }
               }
            }
         }
      }

      class121.updateGameState(25);
      client.field453 = true;
      class243.field2978 = var2;
      class422.method8537(var2);
   }
}
