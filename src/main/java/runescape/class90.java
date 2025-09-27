package runescape;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class class90 {
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   public static class412 field1280;
   @ObfuscatedName("at")
   boolean[] field1276;
   @ObfuscatedName("ac")
   Map field1277;
   @ObfuscatedName("ap")
   boolean field1274 = false;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      longValue = -2684128781197586211L
   )
   long field1279;

   class90() {
      int var1 = class182.field1986.method8347(19);
      this.field1277 = new HashMap();
      this.field1276 = new boolean[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class185 var4 = (class185)class185.field2015.method7018((long)var2);
         class185 var3;
         if (var4 != null) {
            var3 = var4;
         } else {
            byte[] var5 = class185.field2018.method8335(19, var2);
            var4 = new class185();
            if (var5 != null) {
               var4.method4207(new Buffer(var5));
            }

            class185.field2015.method7009(var4, (long)var2);
            var3 = var4;
         }

         this.field1276[var2] = var3.field2016;
      }

      this.method2888();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-333896370"
   )
   void method2881(int var1, int var2) {
      this.field1277.put(var1, var2);
      if (this.field1276[var1]) {
         this.field1274 = true;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IS)I",
      garbageValue = "-20224"
   )
   int method2916(int var1) {
      Object var2 = this.field1277.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "1284760077"
   )
   void method2883(int var1, String var2) {
      this.field1277.put(var1, var2);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "-81"
   )
   String method2884(int var1) {
      Object var2 = this.field1277.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-396416853"
   )
   void method2885() {
      for(int var1 = 0; var1 < this.field1276.length; ++var1) {
         if (!this.field1276[var1]) {
            this.field1277.remove(var1);
         }
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ZI)Lvx;",
      garbageValue = "1140045067"
   )
   class565 method2886(boolean var1) {
      return class33.method501("2", StudioGame.field5084.field4419, var1);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "56"
   )
   void write() {
      class565 var1 = this.method2886(true);

      try {
         int var2 = 3;
         int var3 = 0;
         Iterator var4 = this.field1277.entrySet().iterator();

         while(var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            int var6 = (Integer)var5.getKey();
            if (this.field1276[var6]) {
               Object var7 = var5.getValue();
               var2 += 3;
               if (var7 instanceof Integer) {
                  var2 += 4;
               } else if (var7 instanceof String) {
                  var2 += class288.method6418((String)var7);
               }

               ++var3;
            }
         }

         Buffer var23 = new Buffer(var2);
         var23.writeByte(2);
         var23.writeShortBigEndian(var3);
         Iterator var24 = this.field1277.entrySet().iterator();

         while(var24.hasNext()) {
            Entry var12 = (Entry)var24.next();
            int var13 = (Integer)var12.getKey();
            if (this.field1276[var13]) {
               var23.writeShortBigEndian(var13);
               Object var8 = var12.getValue();
               class574 var9 = class574.method11012(var8.getClass());
               var23.writeByte(var9.field5815);
               class574.method11013(var8, var23);
            }
         }

         var1.method10909(var23.array, 0, var23.offset * 1216585693);
      } catch (Exception var21) {
      } finally {
         try {
            var1.method10891();
         } catch (Exception var20) {
         }

      }

      this.field1274 = false;
      this.field1279 = class189.method4284();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-163576607"
   )
   void method2888() {
      class565 var1 = this.method2886(false);

      label245: {
         try {
            byte[] var2 = new byte[(int)var1.method10905()];

            int var4;
            for(int var3 = 0; var3 < var2.length; var3 += var4) {
               var4 = var1.method10894(var2, var3, var2.length - var3);
               if (var4 == -1) {
                  throw new EOFException();
               }
            }

            Buffer var14 = new Buffer(var2);
            if (var14.array.length - var14.offset * 1216585693 >= 1) {
               int var15 = var14.method11196();
               if (var15 >= 0 && var15 <= 2) {
                  int var7;
                  int var8;
                  int var9;
                  int var16;
                  if (var15 >= 2) {
                     var16 = var14.readUnsignedShort();
                     var7 = 0;

                     while(true) {
                        if (var7 >= var16) {
                           break label245;
                        }

                        var8 = var14.readUnsignedShort();
                        var9 = var14.method11196();
                        class574 var10 = (class574)class173.findEnumerated(class574.method11023(), var9);
                        Object var11 = var10.method11020(var14);
                        if (var8 >= 0 && var8 < this.field1276.length && this.field1276[var8]) {
                           this.field1277.put(var8, var11);
                        }

                        ++var7;
                     }
                  } else {
                     var16 = var14.readUnsignedShort();

                     for(var7 = 0; var7 < var16; ++var7) {
                        var8 = var14.readUnsignedShort();
                        var9 = var14.read32BitArray();
                        if (var8 >= 0 && var8 < this.field1276.length && this.field1276[var8]) {
                           this.field1277.put(var8, var9);
                        }
                     }

                     var7 = var14.readUnsignedShort();
                     var8 = 0;

                     while(true) {
                        if (var8 >= var7) {
                           break label245;
                        }

                        var14.readUnsignedShort();
                        var14.method11207();
                        ++var8;
                     }
                  }
               }

               return;
            }
         } catch (Exception var25) {
            break label245;
         } finally {
            try {
               var1.method10891();
            } catch (Exception var24) {
            }

         }

         return;
      }

      this.field1274 = false;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-1"
   )
   void method2895() {
      if (this.field1274 && this.field1279 < class189.method4284() - 60000L) {
         this.write();
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1003938773"
   )
   boolean hasUnwrittenChanges() {
      return this.field1274;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1234601879"
   )
   static void method2893(int var0, String var1, String var2) {
      class109.method3399(var0, var1, var2, (String)null);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1379295961"
   )
   public static void method2891() {
      class180.field1971.method7011();
   }

   @ObfuscatedName("ok")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-789039467"
   )
   static final void method2915(int var0, int var1) {
      class171 var2 = var0 >= 0 ? client.field582[var0] : class86.field1229;
      if (var2 != null && var1 >= 0 && var1 < var2.method4076()) {
         class153 var3 = (class153)var2.field1918.get(var1);
         if (var3.field1782 == -1) {
            String var4 = var3.field1779.method11909();
            class329 var5 = EnumComposition.getPacketBufferNode(ClientPackets.field3604, client.packetWriter.isaacCipher);
            var5.out.writeByte(3 + class288.method6418(var4));
            var5.out.writeByte(var0);
            var5.out.writeShortBigEndian(var1);
            var5.out.writeNullTermString(var4);
            client.packetWriter.addNode(var5);
         }
      }
   }
}
