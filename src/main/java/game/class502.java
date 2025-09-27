package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
public class class502 extends class499 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1135457307
   )
   int field5407;

   class502() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ltc;I)I",
      garbageValue = "475788568"
   )
   int method10050(class502 var1) {
      return this.field5407 - var1.field5407;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ltl;I)I",
      garbageValue = "1554225034"
   )
   public int vmethod10042(class499 var1) {
      return this.method10050((class502)var1);
   }

   public int compareTo(Object var1) {
      return this.method10050((class502)var1);
   }
}
