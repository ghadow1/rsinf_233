package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("td")
public class class496 extends class503 {
   @ObfuscatedName("kj")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field5387;
   @ObfuscatedName("af")
   boolean field5385;
   @ObfuscatedName("aw")
   boolean field5386;

   class496() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ltd;B)I",
      garbageValue = "20"
   )
   int method9914(class496 var1) {
      if (super.field5411 == client.field325 && client.field325 != var1.field5411) {
         return -1;
      } else if (client.field325 == var1.field5411 && super.field5411 != client.field325) {
         return 1;
      } else if (super.field5411 != 0 && var1.field5411 == 0) {
         return -1;
      } else if (var1.field5411 != 0 && super.field5411 == 0) {
         return 1;
      } else if (this.field5385 && !var1.field5385) {
         return -1;
      } else if (!this.field5385 && var1.field5385) {
         return 1;
      } else if (this.field5386 && !var1.field5386) {
         return -1;
      } else if (!this.field5386 && var1.field5386) {
         return 1;
      } else {
         return super.field5411 != 0 ? super.field5410 - var1.field5410 : var1.field5410 - super.field5410;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ltl;I)I",
      garbageValue = "1554225034"
   )
   public int vmethod10042(class499 var1) {
      return this.method9914((class496)var1);
   }

   public int compareTo(Object var1) {
      return this.method9914((class496)var1);
   }
}
