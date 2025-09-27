package game;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
public abstract class class34 extends Applet implements Runnable, FocusListener, WindowListener {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1169396423
   )
   protected static int field190 = 20;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1307172027
   )
   protected static int field179 = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1240233703
   )
   public static int screenWidth;
   @ObfuscatedName("ao")
   protected static String field180;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lxo;"
   )
   public static class602 field181;
   @ObfuscatedName("al")
   protected static boolean field178;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lbl;"
   )
   static class34 field183 = null;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -671758833
   )
   static int field204 = 0;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      longValue = 3584617927767132481L
   )
   static long field185 = 0L;
   @ObfuscatedName("am")
   static boolean field186 = false;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1081140069
   )
   static int field187 = 1;
   @ObfuscatedName("ay")
   static long[] field188 = new long[32];
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -796834517
   )
   static int field189;
   @ObfuscatedName("ag")
   static long[] field184 = new long[32];
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1783679815
   )
   static int field191 = 500;
   @ObfuscatedName("aj")
   static volatile boolean field192 = true;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Laz;"
   )
   protected static class25 field193 = new class25();
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      longValue = -2203745554587028599L
   )
   static long field194 = -1L;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      longValue = -570430037039674629L
   )
   static long field195 = -1L;
   @ObfuscatedName("px")
   @ObfuscatedSignature(
      descriptor = "[Lxc;"
   )
   static class604[] field202;
   @ObfuscatedName("bi")
   final EventQueue field196;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = 2040231847
   )
   protected int field197;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -1689383621
   )
   protected int field198;
   @ObfuscatedName("bb")
   protected boolean field206 = false;
   @ObfuscatedName("bo")
   boolean field200 = false;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -2096197807
   )
   int field201 = 0;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = -1343377085
   )
   int field199 = 0;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 213583523
   )
   int field176;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -2022529849
   )
   int field210;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = -1165530793
   )
   int field205;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 669964059
   )
   int field203;
   @ObfuscatedName("bn")
   Frame field182;
   @ObfuscatedName("be")
   Canvas field208;
   @ObfuscatedName("bh")
   volatile boolean field209 = true;
   @ObfuscatedName("bk")
   boolean field177 = false;
   @ObfuscatedName("bp")
   volatile boolean field211 = false;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      longValue = 2194492845561783507L
   )
   volatile long field212 = 0L;
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Lab;"
   )
   class21 field213;
   @ObfuscatedName("bj")
   Clipboard field214;

   protected class34() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
      }

      this.field196 = var1;
      class22 var2 = new class22();
      class199.field2176 = var2;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1357739915"
   )
   protected final void method591(int var1, int var2) {
      if (this.field205 != var1 || var2 != this.field203) {
         this.method529();
      }

      this.field205 = var1;
      this.field203 = var2;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;B)V",
      garbageValue = "109"
   )
   final void method509(Object var1) {
      if (this.field196 != null) {
         for(int var2 = 0; var2 < 50 && this.field196.peekEvent() != null; ++var2) {
            class164.method4001(1L);
         }

         if (var1 != null) {
            this.field196.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)Lkx;",
      garbageValue = "837180285"
   )
   protected class261 method663() {
      if (this.field213 == null) {
         this.field213 = new class21();
         this.field213.method315(this.field208);
      }

      return this.field213;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "97"
   )
   protected void method511() {
      this.field214 = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "63"
   )
   protected void method559(String var1) {
      this.field214.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
      garbageValue = "-535030348"
   )
   protected Clipboard method685() {
      return this.field214;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-281659749"
   )
   protected final void method512() {
      if (class258.field3092.toLowerCase().indexOf("microsoft") != -1) {
         class27.field129[186] = 57;
         class27.field129[187] = 27;
         class27.field129[188] = 71;
         class27.field129[189] = 26;
         class27.field129[190] = 72;
         class27.field129[191] = 73;
         class27.field129[192] = 58;
         class27.field129[219] = 42;
         class27.field129[220] = 74;
         class27.field129[221] = 43;
         class27.field129[222] = 59;
         class27.field129[223] = 28;
      } else {
         class27.field129[44] = 71;
         class27.field129[45] = 26;
         class27.field129[46] = 72;
         class27.field129[47] = 73;
         class27.field129[59] = 57;
         class27.field129[61] = 27;
         class27.field129[91] = 42;
         class27.field129[92] = 74;
         class27.field129[93] = 43;
         class27.field129[192] = 28;
         class27.field129[222] = 58;
         class27.field129[520] = 59;
      }

      field193.method360(this.field208);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1761432429"
   )
   protected final void method664() {
      field193.method362();
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Lbi;II)V",
      garbageValue = "1095860943"
   )
   protected void method547(class29 var1, int var2) {
      field193.method376(var1, var2);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   protected final void method517() {
      Canvas var1 = this.field208;
      var1.addMouseListener(class35.field226);
      var1.addMouseMotionListener(class35.field226);
      var1.addFocusListener(class35.field226);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2054073640"
   )
   final void method638() {
      Container var1 = this.method513();
      if (var1 != null) {
         class449 var2 = this.method544();
         this.field197 = Math.max(var2.field5162, this.field176);
         this.field198 = Math.max(var2.field5163, this.field210);
         if (this.field197 <= 0) {
            this.field197 = 1;
         }

         if (this.field198 <= 0) {
            this.field198 = 1;
         }

         screenWidth = Math.min(this.field197, this.field205);
         class396.screenHeight = Math.min(this.field198, this.field203);
         this.field201 = (this.field197 - screenWidth) / 2;
         this.field199 = 0;
         this.field208.setSize(screenWidth, class396.screenHeight);
         field181 = new class32(screenWidth, class396.screenHeight, this.field208, this.field206);
         if (var1 == this.field182) {
            Insets var3 = this.field182.getInsets();
            this.field208.setLocation(var3.left + this.field201, var3.top + this.field199);
         } else {
            this.field208.setLocation(this.field201, this.field199);
         }

         this.field209 = true;
         this.vmethod848();
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "19"
   )
   protected abstract void vmethod848();

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1768960839"
   )
   void method532() {
      int var1 = this.field201;
      int var2 = this.field199;
      int var3 = this.field197 - screenWidth - var1;
      int var4 = this.field198 - class396.screenHeight - var2;
      if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.method513();
            int var6 = 0;
            int var7 = 0;
            if (var5 == this.field182) {
               Insets var8 = this.field182.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
               var10.fillRect(var6, var7, var1, this.field198);
            }

            if (var2 > 0) {
               var10.fillRect(var6, var7, this.field197, var2);
            }

            if (var3 > 0) {
               var10.fillRect(var6 + this.field197 - var3, var7, var3, this.field198);
            }

            if (var4 > 0) {
               var10.fillRect(var6, var7 + this.field198 - var4, this.field197, var4);
            }
         } catch (Exception var9) {
         }
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "75"
   )
   final void method520() {
      field193.method361(this.field208);
      class537.method10541(this.field208);
      if (this.field213 != null) {
         this.field213.method318(this.field208);
      }

      this.method522();
      field193.method360(this.field208);
      Canvas var1 = this.field208;
      var1.addMouseListener(class35.field226);
      var1.addMouseMotionListener(class35.field226);
      var1.addFocusListener(class35.field226);
      if (this.field213 != null) {
         this.field213.method315(this.field208);
      }

      this.method529();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "1408244092"
   )
   protected final void method521(int var1, int var2, int var3, int var4) {
      try {
         if (field183 != null) {
            ++field204;
            if (field204 >= 3) {
               this.method542("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field183 = this;
         screenWidth = var1;
         class396.screenHeight = var2;
         class616.field6085 = var3;
         class616.field6088 = var4;
         class616.field6091 = this;
         if (class122.field1566 == null) {
            class122.field1566 = new class258();
         }

         class122.field1566.method5889(this, 1);
      } catch (Exception var6) {
         class508.method10161((String)null, var6);
         this.method542("crash");
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1519221307"
   )
   final synchronized void method522() {
      Container var1 = this.method513();
      if (this.field208 != null) {
         this.field208.removeFocusListener(this);
         var1.remove(this.field208);
      }

      screenWidth = Math.max(var1.getWidth(), this.field176);
      class396.screenHeight = Math.max(var1.getHeight(), this.field210);
      Insets var2;
      if (this.field182 != null) {
         var2 = this.field182.getInsets();
         screenWidth -= var2.right + var2.left;
         class396.screenHeight -= var2.top + var2.bottom;
      }

      this.field208 = new class23(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.field208);
      this.field208.setSize(screenWidth, class396.screenHeight);
      this.field208.setVisible(true);
      this.field208.setBackground(Color.BLACK);
      if (var1 == this.field182) {
         var2 = this.field182.getInsets();
         this.field208.setLocation(this.field201 + var2.left, this.field199 + var2.top);
      } else {
         this.field208.setLocation(this.field201, this.field199);
      }

      this.field208.addFocusListener(this);
      this.field208.requestFocus();
      this.field209 = true;
      if (field181 != null && screenWidth == field181.field5997 && class396.screenHeight == field181.field5998) {
         ((class32)field181).method483(this.field208);
         field181.vmethod11645(0, 0);
      } else {
         field181 = new class32(screenWidth, class396.screenHeight, this.field208, this.field206);
      }

      this.field211 = false;
      this.field212 = class189.method4284();
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-97086529"
   )
   protected void method523(boolean var1) {
      if (this.field206 != var1) {
         this.field206 = var1;
         field181.method11643(var1);
         field181.method11655();
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1066016372"
   )
   protected final boolean method531() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if (var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(!var1.isEmpty() && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if (var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.method542("invalidhost");
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "5"
   )
   void method525() {
      long var1 = class189.method4284();
      long var3 = field184[class204.field2249];
      field184[class204.field2249] = var1;
      class204.field2249 = class204.field2249 + 1 & 31;
      if (var3 != 0L && var1 > var3) {
      }

      synchronized(this) {
         field178 = field192;
      }

      this.vmethod1090();
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   protected final void method658() {
      this.field209 = true;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   void method527() {
      Container var1 = this.method513();
      long var2 = class189.method4284();
      long var4 = field188[field189];
      field188[field189] = var2;
      field189 = field189 + 1 & 31;
      if (var4 != 0L && var2 > var4) {
         int var6 = (int)(var2 - var4);
         field179 = ((var6 >> 1) + 32000) / var6;
      }

      if (++field191 - 1 > 50) {
         field191 -= 50;
         this.field209 = true;
         this.field208.setSize(screenWidth, class396.screenHeight);
         this.field208.setVisible(true);
         if (var1 == this.field182) {
            Insets var7 = this.field182.getInsets();
            this.field208.setLocation(this.field201 + var7.left, this.field199 + var7.top);
         } else {
            this.field208.setLocation(this.field201, this.field199);
         }
      }

      if (this.field211) {
         this.method520();
      }

      this.method594();
      this.vmethod807(this.field209);
      if (this.field209) {
         this.method532();
      }

      this.field209 = false;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   final void method594() {
      class449 var1 = this.method544();
      if (var1.field5162 != this.field197 || this.field198 != var1.field5163 || this.field177) {
         this.method638();
         this.field177 = false;
      }

   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "19458"
   )
   final void method529() {
      this.field177 = true;
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "14"
   )
   final synchronized void method666() {
      if (!field186) {
         field186 = true;

         try {
            this.field208.removeFocusListener(this);
         } catch (Exception var5) {
         }

         try {
            this.vmethod808();
         } catch (Exception var4) {
         }

         if (this.field182 != null) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
            }
         }

         if (class122.field1566 != null) {
            try {
               class122.field1566.method5891();
            } catch (Exception var2) {
            }
         }

         this.vmethod793();
      }
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   protected abstract void vmethod934();

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-746677036"
   )
   protected abstract void vmethod1090();

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "2034911949"
   )
   protected abstract void vmethod807(boolean var1);

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1798389214"
   )
   protected abstract void vmethod808();

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;ZZI)V",
      garbageValue = "762745119"
   )
   protected final void method642(int var1, String var2, boolean var3, boolean var4) {
      try {
         Graphics var5 = this.field208.getGraphics();
         if (class190.field2077 == null) {
            class190.field2077 = new Font("Helvetica", 1, 13);
            class180.field1973 = this.field208.getFontMetrics(class190.field2077);
         }

         if (var3 && !var4) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, screenWidth, class396.screenHeight);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (class514.field5468 == null) {
               class514.field5468 = this.field208.createImage(304, 34);
            }

            Graphics var7 = class514.field5468.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var7.setFont(class190.field2077);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - class180.field1973.stringWidth(var2)) / 2, 22);
            var5.drawImage(class514.field5468, screenWidth / 2 - 152, class396.screenHeight / 2 + (var4 ? 50 : -18), (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = screenWidth / 2 - 152;
            int var9 = class396.screenHeight / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
            var5.setColor(Color.black);
            var5.drawRect(var8 + 1, var9 + 1, 301, 31);
            var5.fillRect(var1 * 3 + var8 + 2, var9 + 2, 300 - var1 * 3, 30);
            var5.setFont(class190.field2077);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - class180.field1973.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.field208.repaint();
      }

   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1411811965"
   )
   protected final void method541() {
      class514.field5468 = null;
      class190.field2077 = null;
      class180.field1973 = null;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-674505337"
   )
   protected void method542(String var1) {
      if (!this.field200) {
         this.field200 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/awt/Container;",
      garbageValue = "17932105"
   )
   Container method513() {
      return (Container)(this.field182 != null ? this.field182 : this);
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(B)Lrw;",
      garbageValue = "1"
   )
   class449 method544() {
      Container var1 = this.method513();
      int var2 = Math.max(var1.getWidth(), this.field176);
      int var3 = Math.max(var1.getHeight(), this.field210);
      if (this.field182 != null) {
         Insets var4 = this.field182.getInsets();
         var2 -= var4.left + var4.right;
         var3 -= var4.top + var4.bottom;
      }

      return new class449(var2, var3);
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "12507"
   )
   protected final boolean method545() {
      return this.field182 != null;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "6314826"
   )
   protected abstract void vmethod793();

   public final synchronized void paint(Graphics var1) {
      if (this == field183 && !field186) {
         this.field209 = true;
         if (class189.method4284() - this.field212 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= screenWidth && var2.height >= class396.screenHeight) {
               this.field211 = true;
            }
         }

      }
   }

   public final void destroy() {
      if (this == field183 && !field186) {
         field185 = class189.method4284();
         class164.method4001(5000L);
         this.method666();
      }
   }

   public void run() {
      try {
         if (class258.field3092 != null) {
            String var1 = class258.field3092.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = class129.field1588;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method542("wrongjava");
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class406.method8275(var2.charAt(var3)); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (class45.method1590(var4) && class190.method4308(var4) < 10) {
                     this.method542("wrongjava");
                     return;
                  }
               }

               field187 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method522();
         this.vmethod934();

         Object var8;
         try {
            var8 = new class254();
         } catch (Throwable var6) {
            var8 = new class263();
         }

         class556.field5741 = (class271)var8;

         while(0L == field185 || class189.method4284() < field185) {
            class360.field4051 = class556.field5741.vmethod6074(field190, field187);

            for(int var5 = 0; var5 < class360.field4051; ++var5) {
               this.method525();
            }

            this.method527();
            this.method509(this.field208);
         }
      } catch (Exception var7) {
         class508.method10161((String)null, var7);
         this.method542("crash");
      }

      this.method666();
   }

   public final void start() {
      if (this == field183 && !field186) {
         field185 = 0L;
      }
   }

   public final void stop() {
      if (this == field183 && !field186) {
         field185 = class189.method4284() + 4000L;
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void focusGained(FocusEvent var1) {
      field192 = true;
      this.field209 = true;
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   public abstract void init();

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void focusLost(FocusEvent var1) {
      field192 = false;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "63"
   )
   public static int method689(int var0) {
      return var0 >> 3 & 2047;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIII)V",
      garbageValue = "-672165524"
   )
   static void method684(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (class36.field239.method2673() != 0 && var6 > 0 && class58.field836 < 50) {
         class260.method5932(class484.field5343.field1172, var1, var2, var3, var4, var5, var6, var7, false);
      }

   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "133688325"
   )
   static int method528(int var0, class55 var1, boolean var2) {
      if (var0 == 6500) {
         class46.field659[++class124.field1569 - 1] = class65.method2139() ? 1 : 0;
         return 1;
      } else {
         class44 var9;
         if (var0 == 6501) {
            var9 = class517.method10311();
            if (var9 != null) {
               class46.field659[++class124.field1569 - 1] = var9.field640;
               class46.field659[++class124.field1569 - 1] = var9.field632;
               class46.field660[++class46.field658 - 1] = var9.field622;
               class46.field659[++class124.field1569 - 1] = var9.field635;
               class46.field659[++class124.field1569 - 1] = var9.field628;
               class46.field660[++class46.field658 - 1] = var9.field634;
            } else {
               class46.field659[++class124.field1569 - 1] = -1;
               class46.field659[++class124.field1569 - 1] = 0;
               class46.field660[++class46.field658 - 1] = "";
               class46.field659[++class124.field1569 - 1] = 0;
               class46.field659[++class124.field1569 - 1] = 0;
               class46.field660[++class46.field658 - 1] = "";
            }

            return 1;
         } else if (var0 == 6502) {
            var9 = class27.method415();
            if (var9 != null) {
               class46.field659[++class124.field1569 - 1] = var9.field640;
               class46.field659[++class124.field1569 - 1] = var9.field632;
               class46.field660[++class46.field658 - 1] = var9.field622;
               class46.field659[++class124.field1569 - 1] = var9.field635;
               class46.field659[++class124.field1569 - 1] = var9.field628;
               class46.field660[++class46.field658 - 1] = var9.field634;
            } else {
               class46.field659[++class124.field1569 - 1] = -1;
               class46.field659[++class124.field1569 - 1] = 0;
               class46.field660[++class46.field658 - 1] = "";
               class46.field659[++class124.field1569 - 1] = 0;
               class46.field659[++class124.field1569 - 1] = 0;
               class46.field660[++class46.field658 - 1] = "";
            }

            return 1;
         } else {
            int var3;
            class44 var7;
            int var8;
            if (var0 == 6506) {
               var3 = class46.field659[--class124.field1569];
               var7 = null;

               for(var8 = 0; var8 < class44.field626; ++var8) {
                  if (var3 == class44.field624[var8].field640) {
                     var7 = class44.field624[var8];
                     break;
                  }
               }

               if (var7 != null) {
                  class46.field659[++class124.field1569 - 1] = var7.field640;
                  class46.field659[++class124.field1569 - 1] = var7.field632;
                  class46.field660[++class46.field658 - 1] = var7.field622;
                  class46.field659[++class124.field1569 - 1] = var7.field635;
                  class46.field659[++class124.field1569 - 1] = var7.field628;
                  class46.field660[++class46.field658 - 1] = var7.field634;
               } else {
                  class46.field659[++class124.field1569 - 1] = -1;
                  class46.field659[++class124.field1569 - 1] = 0;
                  class46.field660[++class46.field658 - 1] = "";
                  class46.field659[++class124.field1569 - 1] = 0;
                  class46.field659[++class124.field1569 - 1] = 0;
                  class46.field660[++class46.field658 - 1] = "";
               }

               return 1;
            } else if (var0 == 6507) {
               class124.field1569 -= 4;
               var3 = class46.field659[class124.field1569];
               boolean var10 = class46.field659[class124.field1569 + 1] == 1;
               var8 = class46.field659[class124.field1569 + 2];
               boolean var6 = class46.field659[class124.field1569 + 3] == 1;
               class172.method4087(var3, var10, var8, var6);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == 6512) {
                  client.field355 = class46.field659[--class124.field1569] == 1;
                  return 1;
               } else {
                  int var4;
                  class208 var5;
                  if (var0 == 6513) {
                     class124.field1569 -= 2;
                     var3 = class46.field659[class124.field1569];
                     var4 = class46.field659[class124.field1569 + 1];
                     var5 = class97.method3080(var4);
                     if (var5.method4524()) {
                        class46.field660[++class46.field658 - 1] = class63.method2129(var3).method4337(var4, var5.field2269);
                     } else {
                        class46.field659[++class124.field1569 - 1] = class63.method2129(var3).method4332(var4, var5.field2273);
                     }

                     return 1;
                  } else if (var0 == 6514) {
                     class124.field1569 -= 2;
                     var3 = class46.field659[class124.field1569];
                     var4 = class46.field659[class124.field1569 + 1];
                     var5 = class97.method3080(var4);
                     if (var5.method4524()) {
                        class46.field660[++class46.field658 - 1] = class433.method8669(var3).method4602(var4, var5.field2269);
                     } else {
                        class46.field659[++class124.field1569 - 1] = class433.method8669(var3).method4612(var4, var5.field2273);
                     }

                     return 1;
                  } else if (var0 == 6515) {
                     class124.field1569 -= 2;
                     var3 = class46.field659[class124.field1569];
                     var4 = class46.field659[class124.field1569 + 1];
                     var5 = class97.method3080(var4);
                     if (var5.method4524()) {
                        class46.field660[++class46.field658 - 1] = class84.method2800(var3).method4670(var4, var5.field2269);
                     } else {
                        class46.field659[++class124.field1569 - 1] = class84.method2800(var3).method4695(var4, var5.field2273);
                     }

                     return 1;
                  } else if (var0 == 6516) {
                     class124.field1569 -= 2;
                     var3 = class46.field659[class124.field1569];
                     var4 = class46.field659[class124.field1569 + 1];
                     var5 = class97.method3080(var4);
                     if (var5.method4524()) {
                        class46.field660[++class46.field658 - 1] = class158.method3882(var3).method4547(var4, var5.field2269);
                     } else {
                        class46.field659[++class124.field1569 - 1] = class158.method3882(var3).method4546(var4, var5.field2273);
                     }

                     return 1;
                  } else if (var0 == 6518) {
                     class46.field659[++class124.field1569 - 1] = client.field591 ? 1 : 0;
                     return 1;
                  } else if (var0 == 6519) {
                     class46.field659[++class124.field1569 - 1] = client.field376;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == 6521) {
                     return 1;
                  } else if (var0 == 6522) {
                     --class46.field658;
                     --class124.field1569;
                     return 1;
                  } else if (var0 == 6523) {
                     --class46.field658;
                     --class124.field1569;
                     return 1;
                  } else if (var0 == 6524) {
                     class46.field659[++class124.field1569 - 1] = -1;
                     return 1;
                  } else if (var0 == 6525) {
                     class46.field659[++class124.field1569 - 1] = 1;
                     return 1;
                  } else if (var0 == 6526) {
                     class46.field659[++class124.field1569 - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     class46.field659[++class124.field1569 - 1] = client.field390;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = class46.field659[--class124.field1569];
               if (var3 >= 0 && var3 < class44.field626) {
                  var7 = class44.field624[var3];
                  class46.field659[++class124.field1569 - 1] = var7.field640;
                  class46.field659[++class124.field1569 - 1] = var7.field632;
                  class46.field660[++class46.field658 - 1] = var7.field622;
                  class46.field659[++class124.field1569 - 1] = var7.field635;
                  class46.field659[++class124.field1569 - 1] = var7.field628;
                  class46.field660[++class46.field658 - 1] = var7.field634;
               } else {
                  class46.field659[++class124.field1569 - 1] = -1;
                  class46.field659[++class124.field1569 - 1] = 0;
                  class46.field660[++class46.field658 - 1] = "";
                  class46.field659[++class124.field1569 - 1] = 0;
                  class46.field659[++class124.field1569 - 1] = 0;
                  class46.field660[++class46.field658 - 1] = "";
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-107006704"
   )
   static int method686(int var0, class55 var1, boolean var2) {
      return 2;
   }

   @ObfuscatedName("mi")
   @ObfuscatedSignature(
      descriptor = "(Ldt;IIIII)V",
      garbageValue = "65280"
   )
   static final void method665(class81 var0, int var1, int var2, int var3, int var4) {
      class195 var5 = var0.field1184;
      if (client.field522.field6052 < 400) {
         if (var5.field2099 != null) {
            var5 = var5.method4365();
         }

         if (var5 != null) {
            if (var5.field2144) {
               if (!var5.field2146 || client.field429 == var1) {
                  String var6 = var0.method2715();
                  int var7;
                  if (var5.field2135 != 0 && var0.field1106 != 0) {
                     var7 = var0.field1106 != -1 ? var0.field1106 : var5.field2135;
                     var6 = var6 + class444.method8880(var7, class76.field1108.field939) + " " + " (" + "level-" + var7 + ")";
                  }

                  if (var5.field2147 && client.field355) {
                     class423.method8546("Examine", class134.method3619(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
                  }

                  if (!class498.field5394 && client.field357 == 1) {
                     class423.method8546("Use", client.field528 + " " + "->" + " " + class134.method3619(16776960) + var6, 7, var1, var2, var3, -1, false, var4);
                  } else if (client.field529) {
                     if (!class498.field5394 && (class337.field3865 & 2) == 2) {
                        class423.method8546(client.field374, client.field533 + " " + "->" + " " + class134.method3619(16776960) + var6, 8, var1, var2, var3, -1, false, var4);
                     }
                  } else {
                     var7 = var5.field2147 && client.field355 ? 2000 : 0;
                     String[] var8 = var5.field2142;
                     int var9;
                     int var10;
                     if (var8 != null) {
                        for(var9 = 4; var9 >= 0; --var9) {
                           if (!class498.field5394 && var0.method2718(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase("Attack")) {
                              var10 = 0;
                              if (var9 == 0) {
                                 var10 = var7 + 9;
                              }

                              if (var9 == 1) {
                                 var10 = var7 + 10;
                              }

                              if (var9 == 2) {
                                 var10 = var7 + 11;
                              }

                              if (var9 == 3) {
                                 var10 = var7 + 12;
                              }

                              if (var9 == 4) {
                                 var10 = var7 + 13;
                              }

                              class423.method8546(var8[var9], class134.method3619(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
                           }
                        }
                     }

                     if (var8 != null) {
                        for(var9 = 4; var9 >= 0; --var9) {
                           if (!class498.field5394 && var0.method2718(var9) && var8[var9] != null && var8[var9].equalsIgnoreCase("Attack")) {
                              short var11 = 0;
                              if (client.field318 != class84.field1213) {
                                 if (client.field318 == class84.field1211 || class84.field1214 == client.field318 && var5.field2135 > class76.field1108.field939) {
                                    var11 = 2000;
                                 }

                                 var10 = 0;
                                 if (var9 == 0) {
                                    var10 = var11 + 9;
                                 }

                                 if (var9 == 1) {
                                    var10 = var11 + 10;
                                 }

                                 if (var9 == 2) {
                                    var10 = var11 + 11;
                                 }

                                 if (var9 == 3) {
                                    var10 = var11 + 12;
                                 }

                                 if (var9 == 4) {
                                    var10 = var11 + 13;
                                 }

                                 class423.method8546(var8[var9], class134.method3619(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
                              }
                           }
                        }
                     }

                     if (!var5.field2147 || !client.field355) {
                        class423.method8546("Examine", class134.method3619(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("mt")
   @ObfuscatedSignature(
      descriptor = "(Loi;II)I",
      garbageValue = "1489104352"
   )
   static final int method637(class369 var0, int var1) {
      if (var0.field4274 != null && var1 < var0.field4274.length) {
         try {
            int[] var2 = var0.field4274[var1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;

            while(true) {
               int var6 = var2[var4++];
               int var7 = 0;
               byte var8 = 0;
               if (var6 == 0) {
                  return var3;
               }

               if (var6 == 1) {
                  var7 = client.field539[var2[var4++]];
               }

               if (var6 == 2) {
                  var7 = client.field402[var2[var4++]];
               }

               if (var6 == 3) {
                  var7 = client.field353[var2[var4++]];
               }

               int var9;
               class369 var10;
               int var11;
               int var12;
               if (var6 == 4) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = class119.field1554.method7476(var9);
                  var11 = var2[var4++];
                  if (var11 != -1 && (!class84.method2800(var11).field2402 || client.field326)) {
                     for(var12 = 0; var12 < var10.field4259.length; ++var12) {
                        if (var11 + 1 == var10.field4259[var12]) {
                           var7 += var10.field4281[var12];
                        }
                     }
                  }
               }

               if (var6 == 5) {
                  var7 = class355.field4022[var2[var4++]];
               }

               if (var6 == 6) {
                  var7 = class379.field4369[client.field402[var2[var4++]] - 1];
               }

               if (var6 == 7) {
                  var7 = class355.field4022[var2[var4++]] * 100 / '뜛';
               }

               if (var6 == 8) {
                  var7 = class76.field1108.field939;
               }

               if (var6 == 9) {
                  for(var9 = 0; var9 < 25; ++var9) {
                     if (class379.field4368[var9]) {
                        var7 += client.field402[var9];
                     }
                  }
               }

               if (var6 == 10) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = class119.field1554.method7476(var9);
                  var11 = var2[var4++];
                  if (var11 != -1 && (!class84.method2800(var11).field2402 || client.field326)) {
                     for(var12 = 0; var12 < var10.field4259.length; ++var12) {
                        if (var11 + 1 == var10.field4259[var12]) {
                           var7 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var6 == 11) {
                  var7 = client.field592;
               }

               if (var6 == 12) {
                  var7 = client.field490;
               }

               if (var6 == 13) {
                  var9 = class355.field4022[var2[var4++]];
                  int var13 = var2[var4++];
                  var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
               }

               if (var6 == 14) {
                  var9 = var2[var4++];
                  var7 = class281.method6324(var9);
               }

               if (var6 == 15) {
                  var8 = 1;
               }

               if (var6 == 16) {
                  var8 = 2;
               }

               if (var6 == 17) {
                  var8 = 3;
               }

               if (var6 == 18) {
                  var7 = (class76.field1108.field1055 >> 7) + class333.field3836.field1164;
               }

               if (var6 == 19) {
                  var7 = (class76.field1108.field1056 >> 7) + class333.field3836.field1165;
               }

               if (var6 == 20) {
                  var7 = var2[var4++];
               }

               if (var8 == 0) {
                  if (var5 == 0) {
                     var3 += var7;
                  }

                  if (var5 == 1) {
                     var3 -= var7;
                  }

                  if (var5 == 2 && var7 != 0) {
                     var3 /= var7;
                  }

                  if (var5 == 3) {
                     var3 *= var7;
                  }

                  var5 = 0;
               } else {
                  var5 = var8;
               }
            }
         } catch (Exception var14) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   @ObfuscatedName("pi")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-81"
   )
   static void method533() {
      if (client.field336 == 1) {
         client.field377 = true;
      }

   }
}
