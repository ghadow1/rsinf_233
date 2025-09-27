package runescape;

import java.lang.ref.SoftReference;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mo")
public class class319 extends class322 {
   @ObfuscatedName("af")
   SoftReference field3521;

   class319(Object var1, int var2) {
      super(var2);
      this.field3521 = new SoftReference(var1);
   }

   @ObfuscatedName("af")
   Object vmethod7027() {
      return this.field3521.get();
   }

   @ObfuscatedName("aw")
   boolean vmethod7026() {
      return true;
   }
}
