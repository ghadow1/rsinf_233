package game;

import java.nio.ByteBuffer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
public class class373 extends class371 {
   @ObfuscatedName("af")
   ByteBuffer field4316;

   class373() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[B",
      garbageValue = "1821922934"
   )
   byte[] vmethod8133() {
      byte[] var1 = new byte[this.field4316.capacity()];
      this.field4316.position(0);
      this.field4316.get(var1);
      return var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "([BB)V",
      garbageValue = "0"
   )
   void vmethod8137(byte[] var1) {
      this.field4316 = ByteBuffer.allocateDirect(var1.length);
      this.field4316.position(0);
      this.field4316.put(var1);
   }

   @ObfuscatedName("kt")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IIB)V",
      garbageValue = "8"
   )
   static final void method8142(class79 var0, int var1, int var2) {
      class72.method2337(var0, var0.field1170, var1, var2);
   }

   @ObfuscatedName("ly")
   @ObfuscatedSignature(
      descriptor = "(Ldr;Lwf;I)V",
      garbageValue = "-1375360465"
   )
   static final void method8141(class79 var0, class589 var1) {
      for(int var2 = 0; var2 < client.field468; ++var2) {
         int var3 = client.field469[var2];
         class81 var4 = (class81)var0.field1160.method8567((long)var3);
         int var5 = var1.method11196();
         int var6;
         if ((var5 & 2) != 0) {
            var6 = var1.method11196();
            var5 += var6 << 8;
         }

         if ((var5 & 2048) != 0) {
            var6 = var1.method11196();
            var5 += var6 << 16;
         }

         if ((var5 & 32) != 0) {
            var4.field1082 = var1.method11241();
            var4.field1082 += var1.method11232() << 16;
            var6 = 16777215;
            if (var6 == var4.field1082) {
               var4.field1082 = -1;
            }
         }

         int[] var7;
         int var8;
         int var9;
         int var10;
         int var11;
         short[] var14;
         short[] var15;
         long var16;
         boolean var21;
         if ((var5 & 1024) != 0) {
            var6 = var1.method11196();
            if ((var6 & 1) == 1) {
               var4.method2732();
            } else {
               var7 = null;
               if ((var6 & 2) == 2) {
                  var8 = var1.method11232();
                  var7 = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var1.method11198();
                     var10 = var10 == 65535 ? -1 : var10;
                     var7[var9] = var10;
                  }
               }

               var14 = null;
               if ((var6 & 4) == 4) {
                  var9 = 0;
                  if (var4.field1184.field2130 != null) {
                     var9 = var4.field1184.field2130.length;
                  }

                  var14 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var14[var10] = (short)var1.method11198();
                  }
               }

               var15 = null;
               if ((var6 & 8) == 8) {
                  var10 = 0;
                  if (var4.field1184.field2109 != null) {
                     var10 = var4.field1184.field2109.length;
                  }

                  var15 = new short[var10];

                  for(var11 = 0; var11 < var10; ++var11) {
                     var15[var11] = (short)var1.method11241();
                  }
               }

               var21 = false;
               if ((var6 & 16) != 0) {
                  var21 = var1.method11281() == 1;
               }

               var16 = (long)(++class81.field1186 - 1);
               var4.method2730(new class194(var16, var7, var14, var15, var21));
            }
         }

         if ((var5 & 8) != 0) {
            var1.method11181();
            var1.method11422();
            var1.method11196();
         }

         if ((var5 & 16) != 0) {
            var4.field1184 = class63.method2129(var1.method11198());
            class193.method4319(var4);
         }

         if ((var5 & 8192) != 0) {
            var4.field1089 = var1.method11259();
            var4.field1091 = var1.method11197();
            var4.field1072 = var1.method11259();
            var4.field1084 = var1.method11235();
            var4.field1085 = var1.method11241() + client.field412;
            var4.field1094 = var1.method11422() + client.field412;
            var4.field1095 = var1.method11422();
            var4.field1100 = 0;
            var4.field1040 = 0;
            var4.field1089 += var4.field1039[0];
            var4.field1091 += var4.field1107[0];
            var4.field1072 += var4.field1039[0];
            var4.field1084 += var4.field1107[0];
         }

         if ((var5 & '耀') != 0) {
            var4.method2716(var1.method11207());
         }

         int var18;
         if ((var5 & 1) != 0) {
            var6 = var1.method11241();
            if (var6 == 65535) {
               var6 = -1;
            }

            var18 = var1.method11230();
            class215 var23 = var4.field1074.method9581();
            if (var6 == var4.method2484() && var6 != -1) {
               var9 = var23.field2489;
               if (var9 == 1) {
                  var4.field1074.method9572();
                  var4.field1102 = var18;
               }

               if (var9 == 2) {
                  var4.field1074.method9589();
               }
            } else if (var6 == -1 || !var4.field1074.method9566() || class177.method4155(var6).field2480 >= var23.field2480) {
               var4.field1074.method9573(var6);
               var4.field1074.method9572();
               var4.field1102 = var18;
               var4.field1040 = var4.field1100;
            }
         }

         if ((var5 & 256) != 0) {
            var4.method2717(var1.method11232());
         }

         if ((var5 & 16384) != 0) {
            var6 = var1.method11196();
            if ((var6 & 1) == 1) {
               var4.method2733();
            } else {
               var7 = null;
               if ((var6 & 2) == 2) {
                  var8 = var1.method11232();
                  var7 = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var1.method11241();
                     var10 = var10 == 65535 ? -1 : var10;
                     var7[var9] = var10;
                  }
               }

               var14 = null;
               if ((var6 & 4) == 4) {
                  var9 = 0;
                  if (var4.field1184.field2130 != null) {
                     var9 = var4.field1184.field2130.length;
                  }

                  var14 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var14[var10] = (short)var1.method11181();
                  }
               }

               var15 = null;
               if ((var6 & 8) == 8) {
                  var10 = 0;
                  if (var4.field1184.field2109 != null) {
                     var10 = var4.field1184.field2109.length;
                  }

                  var15 = new short[var10];

                  for(var11 = 0; var11 < var10; ++var11) {
                     var15[var11] = (short)var1.method11241();
                  }
               }

               var21 = false;
               if ((var6 & 16) != 0) {
                  var21 = var1.method11232() == 1;
               }

               var16 = (long)(++class81.field1185 - 1);
               var4.method2731(new class194(var16, var7, var14, var15, var21));
            }
         }

         if ((var5 & 128) != 0) {
            var4.field1075 = var1.method11207();
            var4.field1078 = 100;
         }

         if ((var5 & 4096) != 0) {
            var4.field1051 = client.field412 + var1.method11422();
            var4.field1052 = client.field412 + var1.method11241();
            byte var19 = var1.method11235();
            byte var24 = var1.method11233();
            byte var20 = var1.method11235();
            byte var22 = (byte)var1.method11230();
            var4.field1076.method5649(var19, var24, var20, var22);
         }

         if ((var5 & 65536) != 0) {
            var6 = var1.readCustomEndianInt();
            var4.field1064 = (var6 & 1) != 0 ? var1.method11198() : var4.field1184.field2108;
            var4.field1062 = (var6 & 2) != 0 ? var1.method11422() : var4.field1184.field2116;
            var4.field1063 = (var6 & 4) != 0 ? var1.method11241() : var4.field1184.field2117;
            var4.field1088 = (var6 & 8) != 0 ? var1.method11422() : var4.field1184.field2129;
            var4.field1096 = (var6 & 16) != 0 ? var1.method11422() : var4.field1184.field2132;
            var4.field1066 = (var6 & 32) != 0 ? var1.method11181() : var4.field1184.field2113;
            var4.field1067 = (var6 & 64) != 0 ? var1.method11181() : var4.field1184.field2121;
            var4.field1068 = (var6 & 128) != 0 ? var1.method11181() : var4.field1184.field2133;
            var4.field1065 = (var6 & 256) != 0 ? var1.method11198() : var4.field1184.field2155;
            var4.field1090 = (var6 & 512) != 0 ? var1.method11241() : var4.field1184.field2124;
            var4.field1071 = (var6 & 1024) != 0 ? var1.method11422() : var4.field1184.field2125;
            var4.field1069 = (var6 & 2048) != 0 ? var1.method11181() : var4.field1184.field2126;
            var4.field1061 = (var6 & 4096) != 0 ? var1.method11198() : var4.field1184.field2115;
            var4.field1105 = (var6 & 8192) != 0 ? var1.method11198() : var4.field1184.field2122;
            var4.field1060 = (var6 & 16384) != 0 ? var1.method11422() : var4.field1184.field2114;
         }

         if ((var5 & 4) != 0) {
            var6 = var1.method11230();
            int var12;
            if (var6 > 0) {
               for(var18 = 0; var18 < var6; ++var18) {
                  var9 = -1;
                  var10 = -1;
                  var11 = -1;
                  var8 = var1.method11212();
                  if (var8 == 32767) {
                     var8 = var1.method11212();
                     var10 = var1.method11212();
                     var9 = var1.method11212();
                     var11 = var1.method11212();
                  } else if (var8 != 32766) {
                     var10 = var1.method11212();
                  } else {
                     var8 = -1;
                  }

                  var12 = var1.method11212();
                  var4.method2425(var8, var10, var9, var11, client.field412, var12);
               }
            }

            var18 = var1.method11196();
            if (var18 > 0) {
               for(var8 = 0; var8 < var18; ++var8) {
                  var9 = var1.method11212();
                  var10 = var1.method11212();
                  if (var10 != 32767) {
                     var11 = var1.method11212();
                     var12 = var1.method11232();
                     int var13 = var10 > 0 ? var1.method11232() : var12;
                     var4.method2454(var9, client.field412, var10, var11, var12, var13);
                  } else {
                     var4.method2427(var9);
                  }
               }
            }
         }

         if ((var5 & 512) != 0) {
            var4.field1106 = var1.readCustomEndianInt();
         }

         if ((var5 & 524288) != 0) {
            var6 = var1.method11281();

            for(var18 = 0; var18 < var6; ++var18) {
               var8 = var1.method11281();
               var9 = var1.method11422();
               var10 = var1.readLittleEndianInt();
               var4.method2452(var8, var9, var10 >> 16, var10 & '\uffff');
            }
         }

         if ((var5 & 64) != 0) {
            var1.method11181();
            var1.readCustomEndianInt2();
         }

         if ((var5 & 262144) != 0) {
            var6 = var1.method11281();
            if (var6 == 0) {
               var4.method2759();
            } else {
               var7 = new int[8];
               var14 = new short[8];

               for(var9 = 0; var9 < 8; ++var9) {
                  if ((var6 & 1 << var9) != 0) {
                     var7[var9] = var1.method11222();
                     var14[var9] = (short)var1.method11213();
                  } else {
                     var7[var9] = -1;
                     var14[var9] = -1;
                  }
               }

               var4.method2727(var7, var14);
            }
         }

         if ((var5 & 131072) != 0) {
            var4.field1049 = var1.method11198();
            var4.field1050 = var1.method11196() == 1;
         }
      }

   }

   @ObfuscatedName("or")
   @ObfuscatedSignature(
      descriptor = "(Loi;I)I",
      garbageValue = "924285280"
   )
   static int method8139(class369 var0) {
      class359 var1 = (class359)client.field438.method8623((long)var0.field4144);
      class359 var2 = class518.method10317(var1, var0.field4145 * -217986249);
      return var2 != null ? var2.method7503() : var0.field4249;
   }
}
