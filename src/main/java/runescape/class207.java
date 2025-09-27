package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
public class class207 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   static class320 field2267 = new class320(64);

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "-2095396192"
   )
   public static int method4519(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 <= 127) {
            ++var2;
         } else if (var4 <= 2047) {
            var2 += 2;
         } else {
            var2 += 3;
         }
      }

      return var2;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-681737568"
   )
   static int method4514(int var0, class55 var1, boolean var2) {
      if (var0 == 3600) {
         if (class40.field279.field648 == 0) {
            class46.field659[++class124.field1569 - 1] = -2;
         } else if (class40.field279.field648 == 1) {
            class46.field659[++class124.field1569 - 1] = -1;
         } else {
            class46.field659[++class124.field1569 - 1] = class40.field279.field642.method9972();
         }

         return 1;
      } else {
         int var3;
         if (var0 == 3601) {
            var3 = class46.field659[--class124.field1569];
            if (class40.field279.method1535() && var3 >= 0 && var3 < class40.field279.field642.method9972()) {
               class496 var8 = (class496)class40.field279.field642.method9982(var3);
               class46.field660[++class46.field658 - 1] = var8.method9942();
               class46.field660[++class46.field658 - 1] = var8.method9945();
            } else {
               class46.field660[++class46.field658 - 1] = "";
               class46.field660[++class46.field658 - 1] = "";
            }

            return 1;
         } else if (var0 == 3602) {
            var3 = class46.field659[--class124.field1569];
            if (class40.field279.method1535() && var3 >= 0 && var3 < class40.field279.field642.method9972()) {
               class46.field659[++class124.field1569 - 1] = ((class503)class40.field279.field642.method9982(var3)).field5411;
            } else {
               class46.field659[++class124.field1569 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3603) {
            var3 = class46.field659[--class124.field1569];
            if (class40.field279.method1535() && var3 >= 0 && var3 < class40.field279.field642.method9972()) {
               class46.field659[++class124.field1569 - 1] = ((class503)class40.field279.field642.method9982(var3)).field5412;
            } else {
               class46.field659[++class124.field1569 - 1] = 0;
            }

            return 1;
         } else {
            String var5;
            if (var0 == 3604) {
               var5 = (String)class46.field660[--class46.field658];
               int var9 = class46.field659[--class124.field1569];
               class78.method2678(var5, var9);
               return 1;
            } else if (var0 == 3605) {
               var5 = (String)class46.field660[--class46.field658];
               class40.field279.method1542(var5);
               return 1;
            } else if (var0 == 3606) {
               var5 = (String)class46.field660[--class46.field658];
               class40.field279.method1567(var5);
               return 1;
            } else if (var0 == 3607) {
               var5 = (String)class46.field660[--class46.field658];
               class40.field279.method1537(var5);
               return 1;
            } else if (var0 == 3608) {
               var5 = (String)class46.field660[--class46.field658];
               boolean var6 = true;
               class40.field279.method1547(var5, var6);
               return 1;
            } else if (var0 == 3609) {
               var5 = (String)class46.field660[--class46.field658];
               var5 = class6.method38(var5);
               class46.field659[++class124.field1569 - 1] = class40.field279.method1540(new class613(var5, class92.loginType), false) ? 1 : 0;
               return 1;
            } else if (var0 == 3611) {
               if (class22.field90 != null) {
                  class46.field660[++class46.field658 - 1] = class22.field90.field5379;
               } else {
                  class46.field660[++class46.field658 - 1] = "";
               }

               return 1;
            } else if (var0 == 3612) {
               if (class22.field90 != null) {
                  class46.field659[++class124.field1569 - 1] = class22.field90.method9972();
               } else {
                  class46.field659[++class124.field1569 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3613) {
               var3 = class46.field659[--class124.field1569];
               if (class22.field90 != null && var3 < class22.field90.method9972()) {
                  class46.field660[++class46.field658 - 1] = class22.field90.method9982(var3).method9949().method11909();
               } else {
                  class46.field660[++class46.field658 - 1] = "";
               }

               return 1;
            } else if (var0 == 3614) {
               var3 = class46.field659[--class124.field1569];
               if (class22.field90 != null && var3 < class22.field90.method9972()) {
                  class46.field659[++class124.field1569 - 1] = ((class503)class22.field90.method9982(var3)).method10055();
               } else {
                  class46.field659[++class124.field1569 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3615) {
               var3 = class46.field659[--class124.field1569];
               if (class22.field90 != null && var3 < class22.field90.method9972()) {
                  class46.field659[++class124.field1569 - 1] = ((class503)class22.field90.method9982(var3)).field5412;
               } else {
                  class46.field659[++class124.field1569 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3616) {
               class46.field659[++class124.field1569 - 1] = class22.field90 != null ? class22.field90.field5380 : 0;
               return 1;
            } else if (var0 == 3617) {
               var5 = (String)class46.field660[--class46.field658];
               class142.method3732(var5);
               return 1;
            } else if (var0 == 3618) {
               class46.field659[++class124.field1569 - 1] = class22.field90 != null ? class22.field90.field5381 : 0;
               return 1;
            } else if (var0 == 3619) {
               var5 = (String)class46.field660[--class46.field658];
               class22.method329(var5);
               return 1;
            } else if (var0 == 3620) {
               class180.method4162();
               return 1;
            } else if (var0 == 3621) {
               if (!class40.field279.method1535()) {
                  class46.field659[++class124.field1569 - 1] = -1;
               } else {
                  class46.field659[++class124.field1569 - 1] = class40.field279.field645.method9972();
               }

               return 1;
            } else if (var0 == 3622) {
               var3 = class46.field659[--class124.field1569];
               if (class40.field279.method1535() && var3 >= 0 && var3 < class40.field279.field645.method9972()) {
                  class502 var4 = (class502)class40.field279.field645.method9982(var3);
                  class46.field660[++class46.field658 - 1] = var4.method9942();
                  class46.field660[++class46.field658 - 1] = var4.method9945();
               } else {
                  class46.field660[++class46.field658 - 1] = "";
                  class46.field660[++class46.field658 - 1] = "";
               }

               return 1;
            } else if (var0 == 3623) {
               var5 = (String)class46.field660[--class46.field658];
               var5 = class6.method38(var5);
               class46.field659[++class124.field1569 - 1] = class40.field279.method1541(new class613(var5, class92.loginType)) ? 1 : 0;
               return 1;
            } else if (var0 == 3624) {
               var3 = class46.field659[--class124.field1569];
               if (class22.field90 != null && var3 < class22.field90.method9972() && class22.field90.method9982(var3).method9949().equals(class76.field1108.field934)) {
                  class46.field659[++class124.field1569 - 1] = 1;
               } else {
                  class46.field659[++class124.field1569 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3625) {
               if (class22.field90 != null && class22.field90.field5376 != null) {
                  class46.field660[++class46.field658 - 1] = class22.field90.field5376;
               } else {
                  class46.field660[++class46.field658 - 1] = "";
               }

               return 1;
            } else if (var0 == 3626) {
               var3 = class46.field659[--class124.field1569];
               if (class22.field90 != null && var3 < class22.field90.method9972() && ((class498)class22.field90.method9982(var3)).method9929()) {
                  class46.field659[++class124.field1569 - 1] = 1;
               } else {
                  class46.field659[++class124.field1569 - 1] = 0;
               }

               return 1;
            } else if (var0 != 3627) {
               if (var0 == 3628) {
                  class40.field279.field642.method9992();
                  return 1;
               } else {
                  boolean var7;
                  if (var0 == 3629) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     class40.field279.field642.method9993(new class596(var7));
                     return 1;
                  } else if (var0 == 3630) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     class40.field279.field642.method9993(new class597(var7));
                     return 1;
                  } else if (var0 == 3631) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     class40.field279.field642.method9993(new class126(var7));
                     return 1;
                  } else if (var0 == 3632) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     class40.field279.field642.method9993(new class122(var7));
                     return 1;
                  } else if (var0 == 3633) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     class40.field279.field642.method9993(new class125(var7));
                     return 1;
                  } else if (var0 == 3634) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     class40.field279.field642.method9993(new EnumComposition(var7));
                     return 1;
                  } else if (var0 == 3635) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     class40.field279.field642.method9993(new class124(var7));
                     return 1;
                  } else if (var0 == 3636) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     class40.field279.field642.method9993(new class123(var7));
                     return 1;
                  } else if (var0 == 3637) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     class40.field279.field642.method9993(new class127(var7));
                     return 1;
                  } else if (var0 == 3638) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     class40.field279.field642.method9993(new class128(var7));
                     return 1;
                  } else if (var0 == 3639) {
                     class40.field279.field642.method10010();
                     return 1;
                  } else if (var0 == 3640) {
                     class40.field279.field645.method9992();
                     return 1;
                  } else if (var0 == 3641) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     class40.field279.field645.method9993(new class596(var7));
                     return 1;
                  } else if (var0 == 3642) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     class40.field279.field645.method9993(new class597(var7));
                     return 1;
                  } else if (var0 == 3643) {
                     class40.field279.field645.method10010();
                     return 1;
                  } else if (var0 == 3644) {
                     if (class22.field90 != null) {
                        class22.field90.method9992();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     if (class22.field90 != null) {
                        class22.field90.method9993(new class596(var7));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     if (class22.field90 != null) {
                        class22.field90.method9993(new class597(var7));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     if (class22.field90 != null) {
                        class22.field90.method9993(new class126(var7));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     if (class22.field90 != null) {
                        class22.field90.method9993(new class122(var7));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     if (class22.field90 != null) {
                        class22.field90.method9993(new class125(var7));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     if (class22.field90 != null) {
                        class22.field90.method9993(new EnumComposition(var7));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     if (class22.field90 != null) {
                        class22.field90.method9993(new class124(var7));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     if (class22.field90 != null) {
                        class22.field90.method9993(new class123(var7));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     if (class22.field90 != null) {
                        class22.field90.method9993(new class127(var7));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     if (class22.field90 != null) {
                        class22.field90.method9993(new class128(var7));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (class22.field90 != null) {
                        class22.field90.method10010();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     class40.field279.field642.method9993(new class129(var7));
                     return 1;
                  } else if (var0 == 3657) {
                     var7 = class46.field659[--class124.field1569] == 1;
                     if (class22.field90 != null) {
                        class22.field90.method9993(new class129(var7));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = class46.field659[--class124.field1569];
               if (class22.field90 != null && var3 < class22.field90.method9972() && ((class498)class22.field90.method9982(var3)).method9927()) {
                  class46.field659[++class124.field1569 - 1] = 1;
               } else {
                  class46.field659[++class124.field1569 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("ox")
   @ObfuscatedSignature(
      descriptor = "(Loi;B)Loi;",
      garbageValue = "-10"
   )
   static class369 method4518(class369 var0) {
      int var2 = class373.method8139(var0);
      int var1 = var2 >> 17 & 7;
      int var3 = var1;
      if (var1 == 0) {
         return null;
      } else {
         for(int var4 = 0; var4 < var3; ++var4) {
            var0 = class119.field1554.method7476(var0.field4164);
            if (var0 == null) {
               return null;
            }
         }

         return var0;
      }
   }
}
