package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class168 {
   @ObfuscatedName("py")
   @ObfuscatedSignature(
      descriptor = "Lxt;"
   )
   static class605 field1904;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      longValue = 7018002505015220295L
   )
   long field1895;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      longValue = -7923538897576424543L
   )
   public long field1898 = -1L;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lqn;"
   )
   class438 field1900 = new class438();

   @ObfuscatedSignature(
      descriptor = "(Lwb;)V"
   )
   public class168(class590 var1) {
      this.method4039(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;B)V",
      garbageValue = "111"
   )
   void method4039(class590 var1) {
      this.field1895 = var1.method11203();
      this.field1898 = var1.method11203();

      for(int var2 = var1.method11196(); var2 != 0; var2 = var1.method11196()) {
         Object var3;
         if (var2 == 1) {
            var3 = new class163(this);
         } else if (var2 == 4) {
            var3 = new class174(this);
         } else if (var2 == 3) {
            var3 = new class159(this);
         } else if (var2 == 2) {
            var3 = new class157(this);
         } else {
            if (var2 != 5) {
               throw new RuntimeException("");
            }

            var3 = new class164(this);
         }

         ((class167)var3).vmethod4108(var1);
         this.field1900.method8749((class544)var3);
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lgm;I)V",
      garbageValue = "599787228"
   )
   public void method4044(class171 var1) {
      if (var1.field5600 == this.field1895 && this.field1898 == var1.field1922) {
         for(class167 var2 = (class167)this.field1900.method8748(); var2 != null; var2 = (class167)this.field1900.method8762()) {
            var2.vmethod4104(var1);
         }

         ++var1.field1922;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lpx;Ljava/lang/String;Ljava/lang/String;I)[Lxc;",
      garbageValue = "1816728910"
   )
   public static class604[] method4040(class412 var0, String var1, String var2) {
      if (!var0.method8355(var1, var2)) {
         return null;
      } else {
         int var3 = var0.method8361(var1);
         int var4 = var0.method8354(var3, var2);
         class604[] var5;
         if (!class587.method11132(var0, var3, var4)) {
            var5 = null;
         } else {
            class604[] var7 = new class604[class606.field6026];

            for(int var8 = 0; var8 < class606.field6026; ++var8) {
               class604 var9 = var7[var8] = new class604();
               var9.field6005 = class606.field6025;
               var9.field6008 = class581.field5847;
               var9.field6009 = class149.field1763[var8];
               var9.field6011 = class191.field2082[var8];
               var9.field6007 = class255.field3068[var8];
               var9.field6010 = class497.field5390[var8];
               var9.field6006 = class504.field5414;
               var9.field6012 = class7.field25[var8];
            }

            class388.method8205();
            var5 = var7;
         }

         return var5;
      }
   }
}
