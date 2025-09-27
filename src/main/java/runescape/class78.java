package runescape;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public class class78 {
   @ObfuscatedName("ap")
   final Map field1142 = new LinkedHashMap();
   @ObfuscatedName("aq")
   boolean field1143;
   @ObfuscatedName("ao")
   boolean field1144 = false;
   @ObfuscatedName("as")
   boolean field1139;
   @ObfuscatedName("al")
   boolean field1147 = false;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 315939591
   )
   int field1146;
   @ObfuscatedName("ai")
   double field1154 = 0.8D;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1152869359
   )
   int field1149 = 127;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -551024363
   )
   int field1150 = 127;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -885292175
   )
   int field1155 = 127;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1416937907
   )
   int field1152 = -1;
   @ObfuscatedName("ae")
   String field1153 = null;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 2036401987
   )
   int field1148 = 1;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1274384627
   )
   int field1145 = 25;
   @ObfuscatedName("ag")
   boolean field1156 = true;

   class78() {
      this.method2553(true);
   }

   @ObfuscatedSignature(
      descriptor = "(Lwb;)V"
   )
   class78(Buffer var1) {
      if (var1 != null && var1.array != null) {
         int var2 = var1.method11196();
         if (var2 >= 0 && var2 <= 12) {
            if (var1.method11196() == 1) {
               this.field1143 = true;
            }

            if (var2 > 1) {
               this.field1139 = var1.method11196() == 1;
            }

            if (var2 > 3) {
               this.field1148 = var1.method11196();
            }

            if (var2 > 2) {
               int var3 = var1.method11196();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.read32BitArray();
                  int var6 = var1.read32BitArray();
                  this.field1142.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.field1153 = var1.method11206();
            }

            if (var2 > 5) {
               this.field1144 = var1.method11412();
            }

            if (var2 > 6) {
               this.field1154 = (double)var1.method11196() / 100.0D;
               this.field1149 = var1.method11196();
               this.field1150 = var1.method11196();
               this.field1155 = var1.method11196();
            }

            if (var2 > 7) {
               this.field1152 = var1.method11196();
            }

            if (var2 > 8) {
               this.field1147 = var1.method11196() == 1;
            }

            if (var2 > 9) {
               this.field1146 = var1.read32BitArray();
            }

            if (var2 > 10) {
               this.field1145 = var1.method11196();
            }

            if (var2 > 11) {
               this.field1156 = var1.method11196() == 1;
            }
         } else {
            this.method2553(true);
         }
      } else {
         this.method2553(true);
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-2001065707"
   )
   void method2553(boolean var1) {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Lwb;",
      garbageValue = "-1410525161"
   )
   Buffer method2632() {
      Buffer var1 = new Buffer(419, true);
      var1.writeByte(12);
      var1.writeByte(this.field1143 ? 1 : 0);
      var1.writeByte(this.field1139 ? 1 : 0);
      var1.writeByte(this.field1148);
      var1.writeByte(this.field1142.size());
      Iterator var2 = this.field1142.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.writeIntBigEndian((Integer)var3.getKey());
         var1.writeIntBigEndian((Integer)var3.getValue());
      }

      var1.writeNullTermString(this.field1153 != null ? this.field1153 : "");
      var1.method11264(this.field1144);
      var1.writeByte((int)(100.0D * this.field1154));
      var1.writeByte(this.field1149);
      var1.writeByte(this.field1150);
      var1.writeByte(this.field1155);
      var1.writeByte(this.field1152);
      var1.writeByte(this.field1147 ? 1 : 0);
      var1.writeIntBigEndian(this.field1146);
      var1.writeByte(this.field1145);
      var1.writeByte(this.field1156 ? 1 : 0);
      return var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "64"
   )
   boolean method2672() {
      return this.field1143;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-531511425"
   )
   void method2556(boolean var1) {
      this.field1143 = var1;
      class61.savePreferences();
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-343703719"
   )
   boolean method2557() {
      return this.field1144;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-911451607"
   )
   void method2558(boolean var1) {
      this.field1144 = var1;
      class61.savePreferences();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-35"
   )
   boolean method2559() {
      return this.field1139;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-70000"
   )
   void method2560(boolean var1) {
      this.field1139 = var1;
      class61.savePreferences();
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1530104499"
   )
   void method2561() {
      this.method2563(!this.field1147);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "428640380"
   )
   boolean method2562() {
      return this.field1147;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "43"
   )
   void method2563(boolean var1) {
      this.field1147 = var1;
      class61.savePreferences();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-91"
   )
   int method2616() {
      return this.field1146;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1930578388"
   )
   void method2565(int var1) {
      this.field1146 = var1;
      class61.savePreferences();
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)D",
      garbageValue = "-1889206810"
   )
   double method2566() {
      return this.field1154;
   }

   @ObfuscatedName("ae")
   void method2652(double var1) {
      this.field1154 = var1;
      class61.savePreferences();
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1077565518"
   )
   int method2568() {
      return this.field1149;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-120024719"
   )
   void method2625(int var1) {
      this.field1149 = var1;
      class61.savePreferences();
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1968910673"
   )
   int method2618() {
      return this.field1150;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-262529518"
   )
   void method2571(int var1) {
      this.field1150 = var1;
      class61.savePreferences();
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   int method2673() {
      return this.field1155;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-948290005"
   )
   void method2573(int var1) {
      this.field1155 = var1;
      class61.savePreferences();
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "744430621"
   )
   String method2597() {
      return this.field1153;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "0"
   )
   void method2588(String var1) {
      this.field1153 = var1;
      class61.savePreferences();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "44"
   )
   int method2570() {
      return this.field1152;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2117386014"
   )
   void method2627(int var1) {
      this.field1152 = var1;
      class61.savePreferences();
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-751617617"
   )
   int method2574() {
      return this.field1148;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "33"
   )
   void method2567(int var1) {
      this.field1148 = var1;
      class61.savePreferences();
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)V",
      garbageValue = "-346128981"
   )
   void put(String var1, int var2) {
      int var3 = this.method2583(var1);
      if (this.field1142.size() >= 10 && !this.field1142.containsKey(var3)) {
         Iterator var4 = this.field1142.entrySet().iterator();
         var4.next();
         var4.remove();
      }

      this.field1142.put(var3, var2);
      class61.savePreferences();
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "1384261789"
   )
   boolean method2572(String var1) {
      int var2 = this.method2583(var1);
      return this.field1142.containsKey(var2);
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "2003065833"
   )
   int method2581(String var1) {
      int var2 = this.method2583(var1);
      return !this.field1142.containsKey(var2) ? 0 : (Integer)this.field1142.get(var2);
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "1572296391"
   )
   int method2583(String var1) {
      return class417.method8492(var1.toLowerCase());
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-327873777"
   )
   void method2555(int var1) {
      this.field1145 = var1;
      if (class333.field3836 != null) {
         class333.field3836.field1159.method5138(class36.clientPreferences.method2585());
      }

      class61.savePreferences();
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "-24689"
   )
   int method2585() {
      return this.field1145;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "108"
   )
   boolean method2586() {
      return this.field1156;
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "2144553092"
   )
   void method2668(boolean var1) {
      this.field1156 = var1;
      class61.savePreferences();
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)V",
      garbageValue = "-551182200"
   )
   static final void method2678(String var0, int var1) {
      class329 var2 = EnumComposition.getPacketBufferNode(ClientPackets.field3560, client.packetWriter.isaacCipher);
      var2.out.writeByte(class288.method6418(var0) + 1);
      var2.out.writeNullTermString(var0);
      var2.out.method11227(var1);
      client.packetWriter.addNode(var2);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "-28976"
   )
   static void method2677(int var0) {
      if (var0 != class52.field758) {
         class52.field758 = var0;
      }
   }
}
