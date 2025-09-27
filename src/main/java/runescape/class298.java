package runescape;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
public abstract class class298 {
   @ObfuscatedName("ap")
   short[][][] field3430;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1430745088
   )
   int field3433;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1893584896
   )
   int field3426;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1165886975
   )
   int field3431;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -652642295
   )
   int field3429;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 779834073
   )
   int field3425;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -595421445
   )
   int field3428;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1103265139
   )
   int field3432 = -1;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 48813851
   )
   int field3427 = -1;
   @ObfuscatedName("an")
   short[][][] field3434;
   @ObfuscatedName("ar")
   byte[][][] field3435;
   @ObfuscatedName("ae")
   byte[][][] field3436;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "[[[[Llm;"
   )
   class300[][][][] field3437;
   @ObfuscatedName("ad")
   boolean field3438 = false;
   @ObfuscatedName("ag")
   boolean field3439 = false;

   class298() {
      new LinkedList();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "1975102326"
   )
   abstract void vmethod6791(Buffer var1);

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1653194642"
   )
   boolean method6785() {
      return this.field3438 && this.field3439;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lpx;I)V",
      garbageValue = "1936364964"
   )
   void method6815(class412 var1) {
      if (!this.method6785()) {
         byte[] var2 = var1.method8335(this.field3432, this.field3427);
         if (var2 != null) {
            this.vmethod6791(new Buffer(var2));
            this.field3438 = true;
            this.field3439 = true;
         }

      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1336987502"
   )
   void method6794() {
      this.field3430 = null;
      this.field3434 = null;
      this.field3435 = null;
      this.field3436 = null;
      this.field3437 = null;
      this.field3438 = false;
      this.field3439 = false;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IILwb;I)V",
      garbageValue = "2055219320"
   )
   void method6787(int var1, int var2, Buffer var3) {
      int var4 = var3.method11196();
      if (var4 != 0) {
         if ((var4 & 1) != 0) {
            this.method6810(var1, var2, var3, var4);
         } else {
            this.method6790(var1, var2, var3, var4);
         }

      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IILwb;II)V",
      garbageValue = "-107402450"
   )
   void method6810(int var1, int var2, Buffer var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if (var5) {
         this.field3434[0][var1][var2] = (short)var3.readUnsignedShort();
      }

      this.field3430[0][var1][var2] = (short)var3.readUnsignedShort();
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(IILwb;II)V",
      garbageValue = "-1861650605"
   )
   void method6790(int var1, int var2, Buffer var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.field3430[0][var1][var2] = (short)var3.readUnsignedShort();
      int var8;
      int var9;
      int var11;
      if (var6) {
         var8 = var3.method11196();

         for(var9 = 0; var9 < var8; ++var9) {
            int var14 = var3.readUnsignedShort();
            if (var14 != 0) {
               this.field3434[var9][var1][var2] = (short)var14;
               var11 = var3.method11196();
               this.field3435[var9][var1][var2] = (byte)(var11 >> 2);
               this.field3436[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if (var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.method11196();
            if (var9 != 0) {
               class300[] var10 = this.field3437[var8][var1][var2] = new class300[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.method11222();
                  int var13 = var3.method11196();
                  var10[var11] = new class300(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "32"
   )
   int method6792() {
      return this.field3431;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1620016669"
   )
   int method6793() {
      return this.field3429;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/ArrayList;ZB)V",
      garbageValue = "61"
   )
   static void method6819(ArrayList var0, boolean var1) {
      if (!var1) {
         class339.field3889.clear();
      }

      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         class351 var3 = (class351)var2.next();
         if (var3.field4007 != -1 && var3.field4004 != -1) {
            if (!var1) {
               class339.field3889.add(var3);
            }

            class339.field3895.add(var3);
         }
      }

   }

   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-52"
   )
   static void method6784() {
      client.packetWriter.method2936();
      client.packetWriter.field1289 = 0;
      client.packetWriter.packetBuffer.offset = 0;
      client.packetWriter.serverPacket = null;
      client.packetWriter.field1295 = null;
      client.packetWriter.field1302 = null;
      client.packetWriter.field1306 = null;
      client.packetWriter.serverPacketLength = 0;
      client.packetWriter.field1297 = 0;
      client.rebootTimer = 0;
      class369.method8102();
      client.field585 = 0;
      client.field581 = 0;
      class333.field3836.method2680();
      class557.method10856();
      class121.updateGameState(30);

      for(int var0 = 0; var0 < 100; ++var0) {
         client.field436[var0] = true;
      }

      if (client.packetWriter != null && client.packetWriter.isaacCipher != null) {
         class329 var1 = EnumComposition.getPacketBufferNode(ClientPackets.field3568, client.packetWriter.isaacCipher);
         var1.out.writeByte(class35.getWindowedMode());
         var1.out.writeShortBigEndian(class34.screenWidth);
         var1.out.writeShortBigEndian(class396.screenHeight);
         client.packetWriter.addNode(var1);
      }

   }
}
