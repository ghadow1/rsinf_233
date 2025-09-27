package runescape;

import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class154 {
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      longValue = 6324853694559966035L
   )
   long field1793;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1465256899
   )
   public int field1787 = -1;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Lqn;"
   )
   class438 field1794 = new class438();

   @ObfuscatedSignature(
      descriptor = "(Lwb;)V"
   )
   public class154(Buffer var1) {
      this.method3837(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "882958875"
   )
   void method3837(Buffer var1) {
      this.field1793 = var1.method11203();
      this.field1787 = var1.read32BitArray();

      for(int var2 = var1.method11196(); var2 != 0; var2 = var1.method11196()) {
         Object var3;
         if (var2 == 3) {
            var3 = new class173(this);
         } else if (var2 == 1) {
            var3 = new class149(this);
         } else if (var2 == 13) {
            var3 = new class166(this);
         } else if (var2 == 4) {
            var3 = new class158(this);
         } else if (var2 == 6) {
            var3 = new class165(this);
         } else if (var2 == 5) {
            var3 = new class150(this);
         } else if (var2 == 2) {
            var3 = new class155(this);
         } else if (var2 == 7) {
            var3 = new class148(this);
         } else if (var2 == 14) {
            var3 = new class152(this);
         } else if (var2 == 8) {
            var3 = new class169(this);
         } else if (var2 == 9) {
            var3 = new class175(this);
         } else if (var2 == 10) {
            var3 = new class161(this);
         } else if (var2 == 11) {
            var3 = new class156(this);
         } else if (var2 == 12) {
            var3 = new class160(this);
         } else {
            if (var2 != 15) {
               throw new RuntimeException("");
            }

            var3 = new SecureRandomFuture(this);
         }

         ((class151)var3).vmethod4111(var1);
         this.field1794.method8749((class544)var3);
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lgs;B)V",
      garbageValue = "50"
   )
   public void method3839(class162 var1) {
      if (this.field1793 == var1.field1845 && this.field1787 == var1.field1870) {
         for(class151 var2 = (class151)this.field1794.method8748(); var2 != null; var2 = (class151)this.field1794.method8762()) {
            var2.vmethod4112(var1);
         }

         ++var1.field1870;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1556025904"
   )
   static final boolean method3838(int var0) {
      return var0 == 1002 || var0 == 1003 || var0 == 1004 || var0 == 1013;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IS)I",
      garbageValue = "2799"
   )
   static int method3836(int var0) {
      class39 var1 = (class39)class91.field1287.method8596((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.field5592 == class91.field1283.field5135 ? -1 : ((class39)var1.field5592).field267;
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Loi;IIII)V",
      garbageValue = "1103064930"
   )
   static final void method3847(class369 var0, int var1, int var2, int var3) {
      if (var0.field4220 == null) {
         throw new RuntimeException();
      } else {
         var0.field4220[var1] = var2;
         var0.field4233[var1] = var3;
      }
   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1386877498"
   )
   static final void method3846(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         class36.clientPreferences.method2556(!class36.clientPreferences.method2672());
         if (class36.clientPreferences.method2672()) {
            class90.method2893(99, "", "Roofs are now all hidden");
         } else {
            class90.method2893(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.startsWith("zbuf")) {
         boolean var1 = class190.method4308(var0.substring(5).trim()) == 1;
         class521.field5519.method523(var1);
         class225.method4927(var1);
      }

      if (var0.equalsIgnoreCase("z")) {
         client.field400 = !client.field400;
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         class36.clientPreferences.method2561();
      }

      if (var0.equalsIgnoreCase("renderself")) {
         client.field391 = !client.field391;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         client.field527 = !client.field527;
      }

      int var2;
      String[] var4;
      if (var0.startsWith("setdrawdistance")) {
         var4 = var0.split(" ");

         try {
            var2 = Integer.parseInt(var4[1]);
            class36.clientPreferences.method2555(var2);
         } catch (NumberFormatException var8) {
            class90.method2893(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var4[1]));
         }
      }

      if (var0.startsWith("settilerendermode")) {
         var4 = var0.split(" ");

         try {
            var2 = Integer.parseInt(var4[1]);
            class333.field3836.field1159.method5139(class217.method4823()[var2]);
         } catch (NumberFormatException var7) {
            class90.method2893(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var4[1]));
         }
      }

      if (var0.equalsIgnoreCase("getdrawdistance")) {
         class90.method2893(99, "", String.format("%d", class36.clientPreferences.method2585()));
      }

      if (client.field428 >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            class56.field816.field5686 = !class56.field816.field5686;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            class36.clientPreferences.method2563(true);
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            class36.clientPreferences.method2563(false);
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            class361.method7512();
         }

         if (var0.equalsIgnoreCase("clientreload")) {
            class173.method4099();
         } else if (var0.equalsIgnoreCase("sfx8bit")) {
            class36.clientPreferences.method2668(true);
         } else if (var0.equalsIgnoreCase("sfx16bit")) {
            class36.clientPreferences.method2668(false);
         } else if (var0.startsWith("playsong ")) {
            String var9 = var0.substring("playsong ".length());

            try {
               if (class36.clientPreferences.method2568() == 0) {
                  class257.method5884(0, 0);
               } else {
                  var2 = class36.clientPreferences.method2568();
                  class257.method5884(0, 0);
                  ArrayList var3 = new ArrayList();
                  var3.add(new class351(class358.field4042, var9, "", var2, false));
                  class271.method6081(var3, 0, 0, 0, 100, false);
               }
            } catch (Exception var6) {
               class90.method2893(99, "", "Can't play the midi named " + var9);
            }
         } else if (var0.equalsIgnoreCase("stopsong")) {
            class257.method5884(0, 0);
         }
      }

      class329 var10 = EnumComposition.getPacketBufferNode(ClientPackets.field3635, client.packetWriter.isaacCipher);
      var10.out.writeByte(var0.length() + 1);
      var10.out.writeNullTermString(var0);
      client.packetWriter.addNode(var10);
   }
}
