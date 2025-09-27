package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
public class class476 extends class477 {
   @ObfuscatedName("ag")
   public static int[] field5295;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnx;"
   )
   class351 field5296 = null;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -677210511
   )
   int field5298 = 0;

   @ObfuscatedSignature(
      descriptor = "(Lsi;IZI)V"
   )
   public class476(class477 var1, int var2, boolean var3, int var4) {
      super(var1);
      super.field5303 = "FadeInTask";
      if (var2 >= 0) {
         if (var3 && var2 < class339.field3895.size()) {
            this.field5296 = (class351)class339.field3895.get(var2);
         } else if (!var3 && var2 < class339.field3890.size()) {
            this.field5296 = (class351)class339.field3890.get(var2);
         }

         this.field5298 = var4;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "40"
   )
   public boolean vmethod9673() {
      if (this.field5296 != null && this.field5296.field4012 != null) {
         this.field5296.field4010 = true;

         try {
            if (this.field5296.field4002 < (float)this.field5296.field4005 && this.field5296.field4012.method7146()) {
               float var1 = this.field5298 == 0 ? (float)this.field5298 : (float)this.field5296.field4005 / (float)this.field5298;
               class351 var10000 = this.field5296;
               var10000.field4002 += 0.0F == var1 ? (float)this.field5296.field4005 : var1;
               if (this.field5296.field4002 > (float)this.field5296.field4005) {
                  this.field5296.field4002 = (float)this.field5296.field4005;
               }

               this.field5296.field4012.method7218((int)this.field5296.field4002);
               return false;
            }
         } catch (Exception var3) {
            this.method9659(var3.getMessage());
            return true;
         }

         this.field5296.field4010 = false;
         return true;
      } else {
         return true;
      }
   }
}
