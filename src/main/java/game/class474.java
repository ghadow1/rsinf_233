package game;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
public class class474 extends class477 {
   @ObfuscatedSignature(
      descriptor = "(Lsi;)V"
   )
   public class474(class477 var1) {
      super(var1);
      super.field5303 = "StartSongTask";
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "40"
   )
   public boolean vmethod9673() {
      Iterator var1 = class339.field3890.iterator();

      while(var1.hasNext()) {
         class351 var2 = (class351)var1.next();
         if (var2 != null && !var2.field4009 && var2.field4012 != null) {
            try {
               var2.field4012.method7142();
               var2.field4012.method7218(0);
               if (var2.field4003 != null) {
                  var2.field4012.method7247(var2.field4003, var2.field4013);
               }

               var2.field4003 = null;
               var2.field4006 = null;
               var2.field4014 = null;
               var2.field4009 = true;
            } catch (Exception var4) {
               class508.method10161((String)null, var4);
               this.method9659(var4.getMessage());
               return true;
            }
         }
      }

      super.field5301 = true;
      return true;
   }
}
