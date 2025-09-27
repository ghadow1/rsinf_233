package runescape;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class class242 {
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Lre;"
   )
   static final class452 field2962 = new class452();
   @ObfuscatedName("bu")
   public static boolean field2953 = false;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 1879042057
   )
   public static int field2964 = 0;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -758639641
   )
   public static int field2965 = 0;
   @ObfuscatedName("ba")
   public static boolean field2957 = false;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 1232264553
   )
   public static int field2967 = 0;
   @ObfuscatedName("bh")
   public static long[] field2968 = new long[1000];
   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   static class432 field2970;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwf;I)V",
      garbageValue = "-113348182"
   )
   public static void method5611(PacketBuffer var0) {
      class37 var1 = (class37)class36.field241.method8748();
      if (var1 != null) {
         int var2 = var0.offset * 1216585693;
         var0.writeIntBigEndian(var1.field248);

         for(int var3 = 0; var3 < var1.field246; ++var3) {
            if (var1.field249[var3] != 0) {
               var0.writeByte(var1.field249[var3]);
            } else {
               try {
                  int var4 = var1.field247[var3];
                  Field var5;
                  int var6;
                  if (var4 == 0) {
                     var5 = var1.field245[var3];
                     var6 = 0;//Reflection.getInt(var5, (Object)null);
                     var0.writeByte(0);
                     var0.writeIntBigEndian(var6);
                  } else if (var4 == 1) {
                     var5 = var1.field245[var3];
                     //Reflection.setInt(var5, (Object)null, var1.field250[var3]);
                     var0.writeByte(0);
                  } else if (var4 == 2) {
                     var5 = var1.field245[var3];
                     var6 = var5.getModifiers();
                     var0.writeByte(0);
                     var0.writeIntBigEndian(var6);
                  }

                  Method var25;
                  if (var4 != 3) {
                     if (var4 == 4) {
                        var25 = var1.field251[var3];
                        var6 = var25.getModifiers();
                        var0.writeByte(0);
                        var0.writeIntBigEndian(var6);
                     }
                  } else {
                     var25 = var1.field251[var3];
                     byte[][] var10 = var1.field252[var3];
                     Object[] var7 = new Object[var10.length];

                     for(int var8 = 0; var8 < var10.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var11 = null; //Reflection.invoke(var25, (Object)null, var7);
                     if (var11 == null) {
                        var0.writeByte(0);
                     } else if (var11 instanceof Number) {
                        var0.writeByte(1);
                        var0.method11182(((Number)var11).longValue());
                     } else if (var11 instanceof String) {
                        var0.writeByte(2);
                        var0.writeNullTermString((String)var11);
                     } else {
                        var0.writeByte(4);
                     }
                  }
               } catch (ClassNotFoundException var13) {
                  var0.writeByte(-10);
               } catch (InvalidClassException var14) {
                  var0.writeByte(-11);
               } catch (StreamCorruptedException var15) {
                  var0.writeByte(-12);
               } catch (OptionalDataException var16) {
                  var0.writeByte(-13);
               }/* catch (IllegalAccessException var17) {
                  var0.writeByte(-14);
               } */catch (IllegalArgumentException var18) {
                  var0.writeByte(-15);
               }/* catch (InvocationTargetException var19) {
                  var0.writeByte(-16);
               }*/ catch (SecurityException var20) {
                  var0.writeByte(-17);
               } catch (IOException var21) {
                  var0.writeByte(-18);
               } catch (NullPointerException var22) {
                  var0.writeByte(-19);
               } catch (Exception var23) {
                  var0.writeByte(-20);
               } catch (Throwable var24) {
                  var0.writeByte(-21);
               }
            }
         }

         var0.method11225(var2);
         var1.vmethod10557();
      }
   }
}
