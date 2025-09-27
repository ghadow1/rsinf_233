package game;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class25 implements KeyListener, FocusListener {
   @ObfuscatedName("vd")
   @ObfuscatedGetter(
      intValue = 320269081
   )
   static int field114;
   @ObfuscatedName("aw")
   boolean[] field107 = new boolean[112];
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "[Lbi;"
   )
   class29[] field108 = new class29[3];
   @ObfuscatedName("ac")
   Collection field109 = new ArrayList(100);
   @ObfuscatedName("ap")
   Collection field110 = new ArrayList(100);
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1011970509
   )
   volatile int field111 = 0;

   class25() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lbi;II)V",
      garbageValue = "-462126009"
   )
   void method376(class29 var1, int var2) {
      this.field108[var2] = var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1713261876"
   )
   int method381() {
      return this.field111;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1815145700"
   )
   public boolean method375() {
      return this.field111 <= 1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "-1148542591"
   )
   void method360(Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;B)V",
      garbageValue = "-19"
   )
   synchronized void method361(Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.field109.add(new class33(4, 0));
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "453620510"
   )
   void method362() {
      ++this.field111;
      this.method363();
      Iterator var1 = this.field110.iterator();

      while(var1.hasNext()) {
         class33 var2 = (class33)var1.next();

         for(int var3 = 0; var3 < this.field108.length && !var2.method500(this.field108[var3]); ++var3) {
         }
      }

      this.field110.clear();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "10"
   )
   synchronized void method363() {
      Collection var1 = this.field110;
      this.field110 = this.field109;
      this.field109 = var1;
   }

   public final synchronized void focusGained(FocusEvent var1) {
      this.field109.add(new class33(4, 1));
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      int var2;
      label28: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = class27.field129.length;
            if (var2 < var4) {
               var2 = class306.method6859(var2);
               boolean var5 = (var2 & 128) != 0;
               if (var5) {
                  var2 = -1;
               }
               break label28;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         if (!this.field107[var2]) {
            this.field111 = 0;
         }

         this.field107[var2] = true;
         this.field109.add(new class33(1, var2));
      }

      var1.consume();
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      int var2;
      label17: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = class27.field129.length;
            if (var2 < var4) {
               var2 = class306.method6859(var2) & -129;
               break label17;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.field107[var2] = false;
         this.field109.add(new class33(2, var2));
      }

      var1.consume();
   }

   public final synchronized void keyTyped(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != 0 && var2 != '\uffff') {
         boolean var3;
         if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
            var3 = true;
         } else {
            label53: {
               if (var2 != 0) {
                  char[] var4 = class443.field5142;

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     char var6 = var4[var5];
                     if (var6 == var2) {
                        var3 = true;
                        break label53;
                     }
                  }
               }

               var3 = false;
            }
         }

         if (var3) {
            this.field109.add(new class33(3, var2));
         }
      }

      var1.consume();
   }

   public final synchronized void focusLost(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.field107[var2]) {
            this.field107[var2] = false;
            this.field109.add(new class33(2, var2));
         }
      }

      this.field109.add(new class33(4, 0));
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "2"
   )
   static boolean method399() {
      if ((client.field385 ) != 0) {
         class52.field765 = "";
         class52.field744 = "This is a <col=00ffff>Beta<col=ffffff> world.";
         class52.field745 = "Your normal account will not be affected.";
         class52.field746 = "";
         class78.method2677(1);
         return true;
      } else if ((client.field385) != 0) {
         if ((client.field385) != 0) {
            class52.field744 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
            class52.field745 = "Players can attack each other almost everywhere";
            class52.field746 = "and the Protect Item prayer won't work.";
         } else {
            class52.field744 = "This is a <col=ff0000>PvP<col=ffffff> world.";
            class52.field745 = "Players can attack each other";
            class52.field746 = "almost everywhere.";
         }

         class52.field765 = "Warning!";
         class78.method2677(1);
         return true;
      } else if ((client.field385) != 0) {
         class52.field744 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
         class52.field745 = "The Protect Item prayer will";
         class52.field746 = "not work on this world.";
         class52.field765 = "Warning!";
         class78.method2677(1);
         return true;
      } else {
         return false;
      }
   }
}
