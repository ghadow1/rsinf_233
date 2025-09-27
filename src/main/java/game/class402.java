package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
public class class402 {
   @ObfuscatedName("af")
   public boolean field4865 = false;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      longValue = -8444671973689126785L
   )
   long field4860 = -1L;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      longValue = 5152616498439631411L
   )
   long field4859 = -1L;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      longValue = 6715840556874542751L
   )
   long field4857 = 0L;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      longValue = -3256971789739317415L
   )
   long field4861 = 0L;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      longValue = 5837439338484093793L
   )
   long field4862 = 0L;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1357269797
   )
   int field4863 = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1988686483
   )
   int field4864 = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 792333441
   )
   int field4858 = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1632527543
   )
   int field4866 = 0;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "2"
   )
   public void method8246() {
      this.field4860 = class189.method4284();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "120"
   )
   public void method8248() {
      if (this.field4860 != -1L) {
         this.field4861 = class189.method4284() - this.field4860;
         this.field4860 = -1L;
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "132230892"
   )
   public void method8249(int var1) {
      this.field4859 = class189.method4284();
      this.field4863 = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-1"
   )
   public void method8250() {
      if (-1L != this.field4859) {
         this.field4857 = class189.method4284() - this.field4859;
         this.field4859 = -1L;
      }

      ++this.field4858;
      this.field4865 = true;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1206226470"
   )
   public void method8253() {
      this.field4865 = false;
      this.field4864 = 0;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1833000534"
   )
   public void method8252() {
      this.method8250();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "1720703541"
   )
   public void method8264(class590 var1) {
      long var2 = this.field4861;
      var2 /= 10L;
      if (var2 < 0L) {
         var2 = 0L;
      } else if (var2 > 65535L) {
         var2 = 65535L;
      }

      var1.writeShortBigEndian((int)var2);
      long var4 = this.field4857;
      var4 /= 10L;
      if (var4 < 0L) {
         var4 = 0L;
      } else if (var4 > 65535L) {
         var4 = 65535L;
      }

      var1.writeShortBigEndian((int)var4);
      long var6 = this.field4862;
      var6 /= 10L;
      if (var6 < 0L) {
         var6 = 0L;
      } else if (var6 > 65535L) {
         var6 = 65535L;
      }

      var1.writeShortBigEndian((int)var6);
      var1.writeShortBigEndian(this.field4863);
      var1.writeShortBigEndian(this.field4864);
      var1.writeShortBigEndian(this.field4858);
      var1.writeShortBigEndian(this.field4866);
   }

   @ObfuscatedName("lu")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "905663720"
   )
   static void method8270() {
      if (client.field529) {
         class369 var0 = class119.field1554.method7477(class433.field5116, client.field530);
         if (var0 != null && var0.field4189 != null) {
            class65 var1 = new class65();
            var1.field893 = var0;
            var1.field898 = var0.field4189;
            class329.method7047(var1);
         }

         client.field407 = -1;
         client.field529 = false;
         class89.method2877(var0);
      }
   }

   @ObfuscatedName("mp")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIIIII)V",
      garbageValue = "1451027019"
   )
   static final void method8247(int var0, String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (!client.field521) {
         if (class45.method1591(var8, var3)) {
            if (var0 >= 0 && var0 < client.field522.field6061.length) {
               if (client.field522.field6061[var0] == null) {
                  client.field522.field6061[var0] = new class610(false);
               }

               client.field522.field6061[var0].method11879(var1, var2, var3, var4, var5, var6, var7, false, var8);
            }
         }
      }
   }
}
