package runescape;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class146 extends class540 {
   @ObfuscatedName("ms")
   @ObfuscatedSignature(
      descriptor = "Lkx;"
   )
   static class261 field1728;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1277799945
   )
   int field1729;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "[[Lff;"
   )
   public class138[][] field1732 = null;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "[[Lff;"
   )
   class138[][] field1737 = null;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lin;"
   )
   public class229 field1731;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1520836279
   )
   int field1730 = 0;
   @ObfuscatedName("as")
   boolean field1735;
   @ObfuscatedName("al")
   Future field1734;
   @ObfuscatedName("au")
   List field1733;

   @ObfuscatedSignature(
      descriptor = "(Lpx;Lpx;I)V"
   )
   class146(class412 var1, class412 var2, int var3) {
      this.field1729 = var3;
      byte[] var4 = var1.method8335(this.field1729 >> 16 & '\uffff', this.field1729 & '\uffff');
      Buffer var5 = new Buffer(var4);
      int var6 = var5.method11196();
      int var7 = var5.readUnsignedShort();
      byte[] var8 = var2.method8343(var7, 0);
      this.field1731 = new class229(var7, var8);
      this.field1733 = new ArrayList();
      this.field1734 = class86.field1231.submit(new class143(this, var5, var6));
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwb;IB)V",
      garbageValue = "71"
   )
   void method3783(Buffer var1, int var2) {
      var1.readUnsignedShort();
      var1.readUnsignedShort();
      this.field1730 = var1.method11196();
      int var3 = var1.readUnsignedShort();
      this.field1737 = new class138[this.field1731.method5095().method5026()][];
      this.field1732 = new class138[this.field1731.method5094()][];
      class137[] var4 = new class137[var3];

      int var5;
      int var7;
      int var9;
      for(var5 = 0; var5 < var3; ++var5) {
         var7 = var1.method11196();
         class139 var16 = (class139)class173.findEnumerated(class389.method8215(), var7);
         if (var16 == null) {
            var16 = class139.field1685;
         }

         var9 = var1.method11211();
         int var11 = var1.method11196();
         class140 var12 = (class140)class173.findEnumerated(class297.method6781(), var11);
         if (var12 == null) {
            var12 = class140.field1704;
         }

         class138 var13 = new class138();
         var13.method3670(var1, var2);
         var4[var5] = new class137(this, var13, var16, var12, var9);
         int var14 = var16.method3707();
         class138[][] var15;
         if (var16 == class139.field1682) {
            var15 = this.field1737;
         } else {
            var15 = this.field1732;
         }

         if (var15[var9] == null) {
            var15[var9] = new class138[var14];
         }

         if (var16 == class139.field1687) {
            this.field1735 = true;
         }
      }

      var5 = var3 / class86.field1230;
      int var6 = var3 % class86.field1230;
      int var8 = 0;

      for(var9 = 0; var9 < class86.field1230; ++var9) {
         var7 = var8;
         var8 += var5;
         if (var6 > 0) {
            ++var8;
            --var6;
         }

         if (var8 == var7) {
            break;
         }

         this.field1733.add(class86.field1231.submit(new class141(this, var7, var8, var4)));
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1947499881"
   )
   public boolean method3754() {
      if (this.field1734 == null && this.field1733 == null) {
         return true;
      } else {
         if (this.field1734 != null) {
            if (!this.field1734.isDone()) {
               return false;
            }

            this.field1734 = null;
         }

         boolean var1 = true;

         for(int var2 = 0; var2 < this.field1733.size(); ++var2) {
            if (!((Future)this.field1733.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.field1733.remove(var2);
               --var2;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.field1733 = null;
            return true;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2011880333"
   )
   public int method3755() {
      return this.field1730;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-44"
   )
   public boolean method3756() {
      return this.field1735;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ILfa;III)V",
      garbageValue = "-1827910137"
   )
   public void method3757(int var1, class135 var2, int var3, int var4) {
      class454 var5 = class401.method8245();
      this.method3758(var5, var3, var2, var1);
      this.method3770(var5, var3, var2, var1);
      this.method3759(var5, var3, var2, var1);
      var2.method3636(var5);
      var5.method9140();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lrj;ILfa;II)V",
      garbageValue = "-1899615591"
   )
   void method3758(class454 var1, int var2, class135 var3, int var4) {
      float[] var5 = var3.method3630(this.field1730);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1737[var2] != null) {
         class138 var9 = this.field1737[var2][0];
         class138 var10 = this.field1737[var2][1];
         class138 var11 = this.field1737[var2][2];
         if (var9 != null) {
            var6 = var9.method3672(var4);
         }

         if (var10 != null) {
            var7 = var10.method3672(var4);
         }

         if (var11 != null) {
            var8 = var11.method3672(var4);
         }
      }

      class453 var16 = class74.method2414();
      var16.method9056(1.0F, 0.0F, 0.0F, var6);
      class453 var14 = class74.method2414();
      var14.method9056(0.0F, 1.0F, 0.0F, var7);
      class453 var15 = class74.method2414();
      var15.method9056(0.0F, 0.0F, 1.0F, var8);
      class453 var12 = class74.method2414();
      var12.method9059(var15);
      var12.method9059(var16);
      var12.method9059(var14);
      class454 var13 = class401.method8245();
      var13.method9107(var12);
      var1.method9173(var13);
      var16.method9054();
      var14.method9054();
      var15.method9054();
      var12.method9054();
      var13.method9140();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lrj;ILfa;IB)V",
      garbageValue = "1"
   )
   void method3759(class454 var1, int var2, class135 var3, int var4) {
      float[] var5 = var3.method3631(this.field1730);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1737[var2] != null) {
         class138 var9 = this.field1737[var2][3];
         class138 var10 = this.field1737[var2][4];
         class138 var11 = this.field1737[var2][5];
         if (var9 != null) {
            var6 = var9.method3672(var4);
         }

         if (var10 != null) {
            var7 = var10.method3672(var4);
         }

         if (var11 != null) {
            var8 = var11.method3672(var4);
         }
      }

      var1.field5186[12] = var6;
      var1.field5186[13] = var7;
      var1.field5186[14] = var8;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lrj;ILfa;IB)V",
      garbageValue = "-84"
   )
   void method3770(class454 var1, int var2, class135 var3, int var4) {
      float[] var5 = var3.method3632(this.field1730);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1737[var2] != null) {
         class138 var9 = this.field1737[var2][6];
         class138 var10 = this.field1737[var2][7];
         class138 var11 = this.field1737[var2][8];
         if (var9 != null) {
            var6 = var9.method3672(var4);
         }

         if (var10 != null) {
            var7 = var10.method3672(var4);
         }

         if (var11 != null) {
            var8 = var11.method3672(var4);
         }
      }

      class454 var12 = class401.method8245();
      var12.method9132(var6, var7, var8);
      var1.method9173(var12);
      var12.method9140();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;I)V",
      garbageValue = "2006370656"
   )
   public static void method3777(class412 var0) {
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZS)I",
      garbageValue = "323"
   )
   static int method3752(int var0, class55 var1, boolean var2) {
      if (var0 == 5000) {
         class46.field659[++class124.field1569 - 1] = client.field444;
         return 1;
      } else if (var0 == 5001) {
         class124.field1569 -= 3;
         client.field444 = class46.field659[class124.field1569];
         class184.field2013 = class297.method6780(class46.field659[class124.field1569 + 1]);
         if (class184.field2013 == null) {
            class184.field2013 = class611.field6070;
         }

         client.field440 = class46.field659[class124.field1569 + 2];
         class329 var13 = EnumComposition.getPacketBufferNode(ClientPackets.field3584, client.packetWriter.isaacCipher);
         var13.out.writeByte(client.field444);
         var13.out.writeByte(class184.field2013.field6073);
         var13.out.writeByte(client.field440);
         client.packetWriter.addNode(var13);
         return 1;
      } else {
         class329 var6;
         int var7;
         String var8;
         int var9;
         if (var0 == 5002) {
            var8 = (String)class46.field660[--class46.field658];
            class124.field1569 -= 2;
            var7 = class46.field659[class124.field1569];
            var9 = class46.field659[class124.field1569 + 1];
            var6 = EnumComposition.getPacketBufferNode(ClientPackets.field3594, client.packetWriter.isaacCipher);
            var6.out.writeByte(class288.method6418(var8) + 2);
            var6.out.writeNullTermString(var8);
            var6.out.writeByte(var7 - 1);
            var6.out.writeByte(var9);
            client.packetWriter.addNode(var6);
            return 1;
         } else {
            int var3;
            class39 var5;
            if (var0 == 5003) {
               class124.field1569 -= 2;
               var3 = class46.field659[class124.field1569];
               var7 = class46.field659[class124.field1569 + 1];
               var5 = class47.method1873(var3, var7);
               if (var5 != null) {
                  class46.field659[++class124.field1569 - 1] = var5.field267;
                  class46.field659[++class124.field1569 - 1] = var5.field261;
                  class46.field660[++class46.field658 - 1] = var5.field264 != null ? var5.field264 : "";
                  class46.field660[++class46.field658 - 1] = var5.field266 != null ? var5.field266 : "";
                  class46.field660[++class46.field658 - 1] = var5.field271 != null ? var5.field271 : "";
                  class46.field659[++class124.field1569 - 1] = var5.method749() ? 1 : (var5.method744() ? 2 : 0);
               } else {
                  class46.field659[++class124.field1569 - 1] = -1;
                  class46.field659[++class124.field1569 - 1] = 0;
                  class46.field660[++class46.field658 - 1] = "";
                  class46.field660[++class46.field658 - 1] = "";
                  class46.field660[++class46.field658 - 1] = "";
                  class46.field659[++class124.field1569 - 1] = 0;
               }

               return 1;
            } else {
               class39 var4;
               if (var0 == 5004) {
                  var3 = class46.field659[--class124.field1569];
                  var4 = class212.method4650(var3);
                  if (var4 != null) {
                     class46.field659[++class124.field1569 - 1] = var4.field263;
                     class46.field659[++class124.field1569 - 1] = var4.field261;
                     class46.field660[++class46.field658 - 1] = var4.field264 != null ? var4.field264 : "";
                     class46.field660[++class46.field658 - 1] = var4.field266 != null ? var4.field266 : "";
                     class46.field660[++class46.field658 - 1] = var4.field271 != null ? var4.field271 : "";
                     class46.field659[++class124.field1569 - 1] = var4.method749() ? 1 : (var4.method744() ? 2 : 0);
                  } else {
                     class46.field659[++class124.field1569 - 1] = -1;
                     class46.field659[++class124.field1569 - 1] = 0;
                     class46.field660[++class46.field658 - 1] = "";
                     class46.field660[++class46.field658 - 1] = "";
                     class46.field660[++class46.field658 - 1] = "";
                     class46.field659[++class124.field1569 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 5005) {
                  if (class184.field2013 == null) {
                     class46.field659[++class124.field1569 - 1] = -1;
                  } else {
                     class46.field659[++class124.field1569 - 1] = class184.field2013.field6073;
                  }

                  return 1;
               } else {
                  class329 var12;
                  if (var0 == 5008) {
                     var8 = (String)class46.field660[--class46.field658];
                     var7 = class46.field659[--class124.field1569];
                     var12 = class577.method11058(var7, var8, class242.field2970, -1);
                     client.packetWriter.addNode(var12);
                     return 1;
                  } else if (var0 == 5009) {
                     class46.field658 -= 2;
                     var8 = (String)class46.field660[class46.field658];
                     String var11 = (String)class46.field660[class46.field658 + 1];
                     var12 = EnumComposition.getPacketBufferNode(ClientPackets.field3605, client.packetWriter.isaacCipher);
                     var12.out.writeShortBigEndian(0);
                     int var10 = var12.out.offset * 1216585693;
                     var12.out.writeNullTermString(var8);
                     class359.method7497(var12.out, var11);
                     var12.out.putUnsignedShortBigEndian(var12.out.offset * 1216585693 - var10);
                     client.packetWriter.addNode(var12);
                     return 1;
                  } else if (var0 == 5010) {
                     var8 = (String)class46.field660[--class46.field658];
                     class124.field1569 -= 2;
                     var7 = class46.field659[class124.field1569];
                     var9 = class46.field659[class124.field1569 + 1];
                     var6 = class577.method11058(var7, var8, class242.field2970, var9);
                     client.packetWriter.addNode(var6);
                     return 1;
                  } else if (var0 != 5015) {
                     if (var0 == 5016) {
                        class46.field659[++class124.field1569 - 1] = client.field440;
                        return 1;
                     } else if (var0 == 5017) {
                        var3 = class46.field659[--class124.field1569];
                        class46.field659[++class124.field1569 - 1] = class311.method6968(var3);
                        return 1;
                     } else if (var0 == 5018) {
                        var3 = class46.field659[--class124.field1569];
                        class46.field659[++class124.field1569 - 1] = class154.method3836(var3);
                        return 1;
                     } else if (var0 == 5019) {
                        var3 = class46.field659[--class124.field1569];
                        class46.field659[++class124.field1569 - 1] = class220.method4910(var3);
                        return 1;
                     } else if (var0 == 5020) {
                        var8 = (String)class46.field660[--class46.field658];
                        class154.method3846(var8);
                        return 1;
                     } else if (var0 == 5021) {
                        client.field441 = ((String)class46.field660[--class46.field658]).toLowerCase().trim();
                        return 1;
                     } else if (var0 == 5022) {
                        class46.field660[++class46.field658 - 1] = client.field441;
                        return 1;
                     } else if (var0 == 5023) {
                        var8 = (String)class46.field660[--class46.field658];
                        System.out.println(var8);
                        return 1;
                     } else if (var0 == 5030) {
                        class124.field1569 -= 2;
                        var3 = class46.field659[class124.field1569];
                        var7 = class46.field659[class124.field1569 + 1];
                        var5 = class47.method1873(var3, var7);
                        if (var5 != null) {
                           class46.field659[++class124.field1569 - 1] = var5.field267;
                           class46.field659[++class124.field1569 - 1] = var5.field261;
                           class46.field660[++class46.field658 - 1] = var5.field264 != null ? var5.field264 : "";
                           class46.field660[++class46.field658 - 1] = var5.field266 != null ? var5.field266 : "";
                           class46.field660[++class46.field658 - 1] = var5.field271 != null ? var5.field271 : "";
                           class46.field659[++class124.field1569 - 1] = var5.method749() ? 1 : (var5.method744() ? 2 : 0);
                           class46.field660[++class46.field658 - 1] = "";
                           class46.field659[++class124.field1569 - 1] = 0;
                        } else {
                           class46.field659[++class124.field1569 - 1] = -1;
                           class46.field659[++class124.field1569 - 1] = 0;
                           class46.field660[++class46.field658 - 1] = "";
                           class46.field660[++class46.field658 - 1] = "";
                           class46.field660[++class46.field658 - 1] = "";
                           class46.field659[++class124.field1569 - 1] = 0;
                           class46.field660[++class46.field658 - 1] = "";
                           class46.field659[++class124.field1569 - 1] = 0;
                        }

                        return 1;
                     } else if (var0 == 5031) {
                        var3 = class46.field659[--class124.field1569];
                        var4 = class212.method4650(var3);
                        if (var4 != null) {
                           class46.field659[++class124.field1569 - 1] = var4.field263;
                           class46.field659[++class124.field1569 - 1] = var4.field261;
                           class46.field660[++class46.field658 - 1] = var4.field264 != null ? var4.field264 : "";
                           class46.field660[++class46.field658 - 1] = var4.field266 != null ? var4.field266 : "";
                           class46.field660[++class46.field658 - 1] = var4.field271 != null ? var4.field271 : "";
                           class46.field659[++class124.field1569 - 1] = var4.method749() ? 1 : (var4.method744() ? 2 : 0);
                           class46.field660[++class46.field658 - 1] = "";
                           class46.field659[++class124.field1569 - 1] = 0;
                        } else {
                           class46.field659[++class124.field1569 - 1] = -1;
                           class46.field659[++class124.field1569 - 1] = 0;
                           class46.field660[++class46.field658 - 1] = "";
                           class46.field660[++class46.field658 - 1] = "";
                           class46.field660[++class46.field658 - 1] = "";
                           class46.field659[++class124.field1569 - 1] = 0;
                           class46.field660[++class46.field658 - 1] = "";
                           class46.field659[++class124.field1569 - 1] = 0;
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if (class76.field1108 != null && class76.field1108.field934 != null) {
                        var8 = class76.field1108.field934.method11909();
                     } else {
                        var8 = "";
                     }

                     class46.field660[++class46.field658 - 1] = var8;
                     return 1;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "(Loi;I)V",
      garbageValue = "775445120"
   )
   static void method3782(class369 var0) {
      var0.method7970();
      var0.method7971().method7677(new class86(var0));
      var0.method7971().method7648(new class87(var0));
   }

   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      descriptor = "(Lkg;S)V",
      garbageValue = "-3583"
   )
   static void method3781(class273 var0) {
      if (var0 != null && var0.field3196 != null) {
         if (var0.field3196.field4145 * -217986249 >= 0) {
            class369 var1 = class119.field1554.method7476(var0.field3196.field4164);
            if (var1 == null || var1.field4286 == null || var1.field4286.length == 0 || var0.field3196.field4145 * -217986249 >= var1.field4286.length || var0.field3196 != var1.field4286[var0.field3196.field4145 * -217986249]) {
               return;
            }
         }

         if (var0.field3196.field4147 == 11 && var0.field3200 == 0) {
            if (var0.field3196.method7959(var0.field3197, var0.field3199, 0, 0)) {
               var0.field3196.method7967().method5816().method5962(1, var0.field3196.method7967().method5825());
               switch(var0.field3196.method7963()) {
               case 0:
                  class22.method330(var0.field3196.method7965(), true, false);
                  break;
               case 1:
                  if (class328.method7044(class373.method8139(var0.field3196))) {
                     int[] var4 = var0.field3196.method7966();
                     if (var4 != null) {
                        class329 var2 = EnumComposition.getPacketBufferNode(ClientPackets.field3620, client.packetWriter.isaacCipher);
                        var2.out.putIntCustomEndian(var4[0]);
                        var2.out.putIntLittleEndian(var4[2]);
                        var2.out.putIntCustomEndian234(var4[1]);
                        var2.out.method11238(var0.field3196.field4145 * -217986249);
                        var2.out.writeIntBigEndian(var0.field3196.field4144);
                        var2.out.putIntLittleEndian(var0.field3196.method7964());
                        client.packetWriter.addNode(var2);
                     }
                  }
               }
            }
         } else if (var0.field3196.field4147 == 12) {
            class366 var3 = var0.field3196.method7971();
            if (var3 != null && var3.method7654()) {
               switch(var0.field3200) {
               case 0:
                  client.field598.method6104(var0.field3196);
                  var3.method7605(true);
                  var3.method7641(var0.field3197, var0.field3199, client.field551.method6138(82), client.field551.method6138(81));
                  break;
               case 1:
                  var3.method7642(var0.field3197, var0.field3199);
               }
            }
         }

      }
   }
}
