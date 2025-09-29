package runescape;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public class class92 {
   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      descriptor = "Lva;"
   )
   static LoginType loginType;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqn;"
   )
   class438 field1299 = new class438();
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -239473435
   )
   int field1290 = 0;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lwb;"
   )
   Buffer field1291 = new Buffer(5000);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lxj;"
   )
   public IsaacCipher isaacCipher;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lwf;"
   )
   PacketBuffer packetBuffer = new PacketBuffer(40000);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   ServerPackets serverPacket = null;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 745654293
   )
   int serverPacketLength = 0;
   @ObfuscatedName("as")
   boolean field1296 = true;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 2129789557
   )
   int field1297 = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -841317061
   )
   int field1298 = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1330573823
   )
   int field1289 = 0;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1710742239
   )
   int field1300;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   ServerPackets field1295;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   ServerPackets field1302;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   ServerPackets field1306;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Ltf;"
   )
   SBuffer field1301;

   class92() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1156810850"
   )
   final void method2936() {
      this.field1299.method8738();
      this.field1290 = 0;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "16"
   )
   final void flush() throws IOException {
      if (this.field1301 != null && this.field1290 > 0) {
         this.field1291.offset = 0;

         while(true) {
            class329 var1 = (class329)this.field1299.method8748();
            if (var1 == null || var1.field3665 > this.field1291.array.length - this.field1291.offset * 1216585693) {
               this.field1301.vmethod10197(this.field1291.array, 0, this.field1291.offset * 1216585693);
               this.field1298 = 0;
               break;
            }

            this.field1291.copyArray(var1.out.array, 0, var1.field3665);
            this.field1290 -= var1.field3665;
            var1.vmethod10557();
            var1.out.vmethod11176();
            var1.method7053();
         }
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lmy;S)V",
      garbageValue = "15888"
   )
   public final void addNode(class329 var1) {
      this.field1299.method8749(var1);
      var1.field3665 = var1.out.offset * 1216585693;
      var1.out.offset = 0;
      this.field1290 += var1.field3665;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-1"
   )
   void close() {
      if (this.field1301 != null) {
         this.field1301.vmethod10196();
         this.field1301 = null;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "933471756"
   )
   void method2940() {
      this.field1301 = null;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Ltf;",
      garbageValue = "-482460285"
   )
   SBuffer getSocket() {
      return this.field1301;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ltf;B)V",
      garbageValue = "36"
   )
   void method2951(SBuffer var1) {
      this.field1301 = var1;
   }

   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1875660210"
   )
   static boolean method2956() {
      if (client.field602 != null && client.field487 < client.field602.size()) {
         while(client.field487 < client.field602.size()) {
            class61 var0 = (class61)client.field602.get(client.field487);
            if (!var0.method2088()) {
               return false;
            }

            ++client.field487;
         }

         return true;
      } else {
         return true;
      }
   }
}
