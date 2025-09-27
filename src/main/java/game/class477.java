package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
public abstract class class477 {
   @ObfuscatedName("io")
   @ObfuscatedSignature(
      descriptor = "Lpf;"
   )
   static class414 field5305;
   @ObfuscatedName("at")
   boolean field5301;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lsi;"
   )
   class477 field5304;
   @ObfuscatedName("ap")
   String field5302;
   @ObfuscatedName("aq")
   String field5303;
   @ObfuscatedName("ao")
   boolean field5300;

   @ObfuscatedSignature(
      descriptor = "(Lsi;)V"
   )
   class477(class477 var1) {
      this.field5304 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "40"
   )
   public abstract boolean vmethod9673();

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "120"
   )
   public boolean method9658() {
      return this.field5300;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "989276897"
   )
   public boolean method9661() {
      return this.field5301;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-870109646"
   )
   public String method9662() {
      return "Error in task: " + this.field5303 + ", Error message: " + this.field5302;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)Lsi;",
      garbageValue = "-2051560722"
   )
   public class477 method9664() {
      return this.field5304;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1370191055"
   )
   void method9659(String var1) {
      this.field5300 = true;
      this.field5302 = var1;
   }
}
