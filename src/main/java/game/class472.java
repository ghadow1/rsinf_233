package game;

import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
public class class472 extends class477 {
   @ObfuscatedName("af")
   ArrayList field5287;

   @ObfuscatedSignature(
      descriptor = "(Lsi;Ljava/util/ArrayList;)V"
   )
   public class472(class477 var1, ArrayList var2) {
      super(var1);
      super.field5303 = "ClearRequestTask";
      this.field5287 = var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "40"
   )
   public boolean vmethod9673() {
      if (this.field5287.isEmpty()) {
         return true;
      } else {
         Iterator var1 = this.field5287.iterator();

         while(var1.hasNext()) {
            class351 var2 = (class351)var1.next();

            try {
               if (class339.field3890.contains(var2)) {
                  if (var2 == null) {
                     class339.field3890.remove(var2);
                  } else {
                     if (var2.field4012.field3904 > 0) {
                        --var2.field4012.field3904;
                     }

                     if (var2.field4012.field3904 == 0) {
                        var2.field4012.method7145();
                        var2.field4012.method7143();
                        var2.field4012.method7218(0);
                     }

                     int var3 = var2.field4007;
                     int var4 = var2.field4004;
                     Iterator var5 = class339.field3893.iterator();

                     while(var5.hasNext()) {
                        class345 var6 = (class345)var5.next();
                        var6.vmethod7338(var3, var4);
                     }

                     class339.field3890.remove(var2);
                  }
               }
            } catch (Exception var8) {
               class508.method10161((String)null, var8);
               this.method9659(var8.getMessage());
               class339.field3890.clear();
               return true;
            }
         }

         return true;
      }
   }
}
