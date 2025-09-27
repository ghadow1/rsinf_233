package runescape;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public final class class21 implements class261, MouseWheelListener {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -2125995235
   )
   int field88 = 0;

   class21() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;B)V",
      garbageValue = "4"
   )
   void method315(Component var1) {
      var1.addMouseWheelListener(this);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "1153445746"
   )
   void method318(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "5999"
   )
   public synchronized int vmethod5934() {
      int var1 = this.field88;
      this.field88 = 0;
      return var1;
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.field88 += var1.getWheelRotation();
   }
}
