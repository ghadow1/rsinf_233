package game;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
public class class35 implements MouseListener, MouseMotionListener, FocusListener {
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -2138446539
   )
   public static int field218 = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -817960703
   )
   public static int field231 = 0;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1414060127
   )
   public static int field220 = 0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      longValue = 4751595727970646201L
   )
   public static long field232 = 0L;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 973036237
   )
   public static int field222 = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -166288193
   )
   public static int field221 = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 199036767
   )
   public static int field224 = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      longValue = 4975405132303531979L
   )
   public static long field219 = 0L;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lby;"
   )
   public static class35 field226 = new class35();
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1672683823
   )
   static volatile int field227 = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 680500039
   )
   static volatile int field228 = 0;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 907123867
   )
   static volatile int field225 = -1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 2053848077
   )
   static volatile int field230 = -1;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      longValue = 2285020244942267005L
   )
   static volatile long field237 = -1L;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -889529417
   )
   static volatile int field235 = 0;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 33836281
   )
   static volatile int field233 = 0;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1721125715
   )
   static volatile int field234 = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      longValue = -8159394147947739947L
   )
   static volatile long field216 = 0L;
   @ObfuscatedName("lb")
   static String field236;

   class35() {
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/event/MouseEvent;B)I",
      garbageValue = "-105"
   )
   final int method691(MouseEvent var1) {
      int var2 = var1.getButton();
      if (!var1.isAltDown() && var2 != 2) {
         return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (field226 != null) {
         field227 = 0;
         field225 = var1.getX();
         field230 = var1.getY();
         field237 = var1.getWhen();
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final void mouseClicked(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (field226 != null) {
         field228 = 0;
      }

   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (field226 != null) {
         field227 = 0;
         field233 = var1.getX();
         field234 = var1.getY();
         field216 = class189.method4284();
         field235 = this.method691(var1);
         if (field235 != 0) {
            field228 = field235;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (field226 != null) {
         field227 = 0;
         field228 = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (field226 != null) {
         field227 = 0;
         field225 = -1;
         field230 = -1;
         field237 = var1.getWhen();
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;I)V",
      garbageValue = "1187606351"
   )
   public static void method730(class412 var0) {
      class209.field2278 = var0;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Ljj;",
      garbageValue = "-925416155"
   )
   static class235 method728(int var0) {
      class235 var1 = (class235)class215.field2467.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         var1 = class292.method6690(class215.field2465, class216.field2510, var0);
         if (var1 != null) {
            class215.field2467.method7009(var1, (long)var0);
         }

         return var1;
      }
   }

   @ObfuscatedName("hs")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-577725239"
   )
   static void method726() {
      class168.field1904 = null;
      class181.field1976 = null;
      class34.field202 = null;
      class213.field2438 = null;
      class77.field1137 = null;
      class400.field4848 = null;
      class208.field2276 = null;
      class195.field2156 = null;
      class200.field2185 = null;
      class255.field3065 = null;
      class432.field5104 = null;
   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "99289463"
   )
   static int method729() {
      return client.field431 ? 2 : 1;
   }

   @ObfuscatedName("nr")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "49"
   )
   static boolean method727(int var0) {
      for(int var1 = 0; var1 < client.field442; ++var1) {
         if (client.field511[var1] == var0) {
            return true;
         }
      }

      return false;
   }
}
