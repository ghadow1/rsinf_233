package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
public class class351 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   public class412 field4014;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1633172061
   )
   public int field4007 = -1;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1874982089
   )
   public int field4004 = -1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 300103545
   )
   public int field4005 = 0;
   @ObfuscatedName("ap")
   public float field4002 = 0.0F;
   @ObfuscatedName("aq")
   public boolean field4013 = false;
   @ObfuscatedName("ao")
   public boolean field4008;
   @ObfuscatedName("as")
   public boolean field4009;
   @ObfuscatedName("al")
   public boolean field4010 = false;
   @ObfuscatedName("au")
   boolean field4011 = false;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lnf;"
   )
   public class340 field4012;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Ldi;"
   )
   public class100 field4006;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lnd;"
   )
   public class348 field4003;

   @ObfuscatedSignature(
      descriptor = "(Lpx;Ljava/lang/String;Ljava/lang/String;IZ)V"
   )
   public class351(class412 var1, String var2, String var3, int var4, boolean var5) {
      this.field4007 = var1.method8361(var2);
      this.field4004 = var1.method8354(this.field4007, var3);
      this.method7384(var1, this.field4007, this.field4004, var4, var5);
   }

   @ObfuscatedSignature(
      descriptor = "(Lpx;IIIZ)V"
   )
   public class351(class412 var1, int var2, int var3, int var4, boolean var5) {
      this.method7384(var1, var2, var3, var4, var5);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;IIIZI)V",
      garbageValue = "625955701"
   )
   void method7384(class412 var1, int var2, int var3, int var4, boolean var5) {
      this.field4014 = var1;
      this.field4007 = var2;
      this.field4004 = var3;
      this.field4005 = var4;
      this.field4013 = var5;
   }
}
