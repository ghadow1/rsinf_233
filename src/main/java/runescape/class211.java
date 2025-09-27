package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
public class class211 {
    @ObfuscatedName("af")
    @ObfuscatedGetter(
            intValue = 1550815553
    )
    public int field2304 = 0;
    @ObfuscatedName("aw")
    @ObfuscatedGetter(
            intValue = 1849651589
    )
    public int field2305 = 1;
    @ObfuscatedName("at")
    @ObfuscatedGetter(
            intValue = 2140247079
    )
    public int field2306 = 0;
    @ObfuscatedName("ac")
    @ObfuscatedGetter(
            intValue = -905707341
    )
    public int field2303 = 0;
    @ObfuscatedName("ap")
    @ObfuscatedGetter(
            intValue = 523483301
    )
    public int field2307 = 0;

    class211(int var1, int var2, int var3, int var4, int var5) {
        this.field2304 = var1;
        this.field2305 = var2;
        this.field2306 = var3;
        this.field2303 = var4;
        this.field2307 = var5;
    }

    @ObfuscatedName("hx")
    @ObfuscatedSignature(
            descriptor = "(IS)V",
            garbageValue = "-9235"
    )
    static void loginResponse(int var0) {
        System.out.println("login response => " + var0);
        int var1 = class52.field758;
        if (var0 == -3) {
            class66.method2147("Connection timed out.", "Please try using a different world.", "");
        } else if (var0 == -2) {
            class66.method2147("Error connecting to server.", "Please try using a different world.", "");
        } else if (var0 == -1) {
            class66.method2147("No response from server.", "Please try using a different world.", "");
        } else if (var0 == 3) {
            class78.method2677(3);
            class52.field735 = 1;
        } else if (var0 == 4) {
            class78.method2677(14);
            class52.field753 = 0;
        } else if (var0 == 5) {
            class52.field735 = 2;
            class66.method2147("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
        } else if (var0 == 68) {
            if (!client.field454) {
                client.field454 = true;
                class173.method4099();
                return;
            }

            class66.method2147("RuneScape has been updated!", "Please restart your runescape.client.", "");
        } else if (!client.field591 && var0 == 6) {
            class66.method2147("RuneScape has been updated!", "Please restart your runescape.client.", "");
        } else if (var0 == 7) {
            class66.method2147("This world is full.", "Please use a different world.", "");
        } else if (var0 == 8) {
            class66.method2147("Unable to connect.", "Login server offline.", "");
        } else if (var0 == 9) {
            class66.method2147("Login limit exceeded.", "Too many connections from your address.", "");
        } else if (var0 == 10) {
            class66.method2147("Unable to connect.", "Bad session id.", "");
        } else if (var0 == 11) {
            class66.method2147("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
        } else if (var0 == 12) {
            class121.updateGameState(10);
            class66.method2147("You need a members' account to use this world.", "Please subscribe to login to this world,", "or use a different world.");
            class78.method2677(34);
        } else if (var0 == 13) {
            class66.method2147("Could not complete login.", "Please try using a different world.", "");
        } else if (var0 == 14) {
            class66.method2147("The server is being updated.", "Please wait a few minutes", "before trying again.");
        } else if (var0 == 16) {
            class66.method2147("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
            class78.method2677(33);
        } else if (var0 == 17) {
            class66.method2147("To access this free world, log into a", "members world and move your character", "to a non-members area.");
        } else if (var0 == 18) {
            class78.method2677(14);
            class52.field753 = 1;
        } else if (var0 == 19) {
            class66.method2147("This world is running a", "closed Beta. Please ", "use a different world.");
        } else if (var0 == 20) {
            class66.method2147("Invalid loginserver requested.", "Please try using a different world.", "");
        } else if (var0 == 22) {
            class66.method2147("Malformed login incomingServerPackets.", "Please try again.", "");
        } else if (var0 == 23) {
            class66.method2147("No reply from loginserver.", "Please wait 1 minute and try again.", "");
        } else if (var0 == 24) {
            class66.method2147("Error loading your profile.", "Please contact customer support.", "");
        } else if (var0 == 25) {
            class66.method2147("Unexpected loginserver response.", "Please try using a different world.", "");
        } else if (var0 == 26) {
            class66.method2147("This computers address has been blocked", "as it was used to break our rules.", "");
        } else if (var0 == 27) {
            class66.method2147("", "Service unavailable.", "");
        } else if (var0 == 31) {
            class66.method2147("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
        } else if (var0 == 32) {
            class78.method2677(14);
            class52.field753 = 2;
        } else if (var0 == 37) {
            class66.method2147("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
        } else if (var0 == 38) {
            class66.method2147("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
        } else if (var0 == 74) {
            class66.method2147("Access to this world is", "restricted. Please use", "a different world.");
        } else if (var0 == 55) {
            class78.method2677(8);
        } else {
            if (var0 == 56) {
                class66.method2147("Enter the 6-digit code generated by your", "authenticator app.", "");
                class121.updateGameState(11);
                return;
            }

            if (var0 == 57) {
                class66.method2147("The code you entered was incorrect.", "Please try again.", "");
                class121.updateGameState(11);
                return;
            }

            if (var0 == 61) {
                class66.method2147("", "Please enter your date of birth (DD/MM/YYYY)", "");
                class78.method2677(7);
            } else {
                if (var0 == 62) {
                    class121.updateGameState(10);
                    class78.method2677(9);
                    class66.method2147("Login attempt timed out.", "Please try again.", "");
                    return;
                }

                if (var0 == 63) {
                    class121.updateGameState(10);
                    class78.method2677(9);
                    class66.method2147("You were signed out.", "Please sign in again.", "");
                    return;
                }

                if (var0 == 65 || var0 == 67) {
                    class121.updateGameState(10);
                    class78.method2677(9);
                    class66.method2147("Failed to login.", "Please try again.", "");
                    return;
                }

                if (var0 == 71) {
                    class121.updateGameState(10);
                    class78.method2677(7);
                    class66.method2147("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
                } else if (var0 == 73) {
                    class121.updateGameState(10);
                    class78.method2677(6);
                    class66.method2147("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
                } else if (var0 == 72) {
                    class121.updateGameState(10);
                    class78.method2677(32);
                } else {
                    class66.method2147("Unexpected server response", "Please try using a different world.", "");
                }
            }
        }

        class121.updateGameState(10);
        int var4 = class52.field758;
        boolean var5 = var4 != var1;
        if (!var5 && client.field330.method11512()) {
            class78.method2677(9);
        }

    }

    @ObfuscatedName("ki")
    @ObfuscatedSignature(
            descriptor = "(Lme;B)V",
            garbageValue = "31"
    )
    static final void method4600(class328 var0) {
        PacketBuffer var1 = client.packetWriter.packetBuffer;
        int var3;
        int var4;
        int var5;
        int var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var16;
        int var18;
        int var27;
        int var30;
        int var31;
        if (class328.field3651 == var0) {
            var27 = var1.method11241();
            var3 = var1.method11181();
            var4 = var1.method11291();
            var5 = var1.method11181();
            var6 = var1.method11247();
            var30 = var1.method11254();
            var31 = class356.method7413(var30);
            var9 = class356.method7424(var30);
            var10 = class356.method7415(var30);
            var11 = var1.method11181();
            var12 = var1.method11422();
            var13 = var1.method11241();
            int var34 = var1.method11281();
            var15 = var1.method11281();
            var16 = class484.field5343.field1170;
            int var26 = (var15 >> 4 & 7) + class148.field1756 + class484.field5343.field1164;
            var18 = (var15 & 7) + class163.field1873 + class484.field5343.field1165;
            if (var27 != 65535) {
                class53 var19 = new class53(var16, var26, var18, var12, var4, var31, var9, var10, var3, var6, var27, var11 + client.cycle, var13 + client.cycle, var34, var5);
                client.field334.method8689(var19);
            }

        } else if (class328.field3648 == var0) {
            var27 = var1.method11232();
            var3 = (var27 >> 4 & 7) + class148.field1756;
            var4 = (var27 & 7) + class163.field1873;
            var5 = var1.method11281();
            var6 = var5 >> 2;
            var30 = var5 & 3;
            var31 = client.field320[var6];
            if (var3 >= 0 && var4 >= 0 && var3 < class484.field5343.field1162 && var4 < class484.field5343.field1163) {
                var9 = client.field475 == -1 ? class484.field5343.field1170 : client.field475;
                class79.method2702(class484.field5343, var9, var3, var4, var31, -1, var6, var30, 31, (String[]) null, 0, -1);
            }

        } else if (class328.field3645 == var0) {
            boolean var28 = var1.method11196() == 1;
            var3 = var1.method11281();
            var4 = var1.method11230();
            var5 = (var4 >> 4 & 7) + class148.field1756;
            var6 = (var4 & 7) + class163.field1873;
            var30 = var1.method11422();
            var31 = var1.method11281();
            var9 = var1.method11181();
            var10 = var1.method11422();
            var11 = var1.method11252();
            if (var5 >= 0 && var6 >= 0 && var5 < class484.field5343.field1162 && var6 < class484.field5343.field1163) {
                var12 = client.field475 == -1 ? class484.field5343.field1170 : client.field475;
                class71.method2240(var12, var5, var6, var9, var11, var31, var10, var30, var3, var28);
            }

        } else if (class328.field3653 == var0) {
            var27 = var1.readUnsignedShort();
            var3 = var1.method11281();
            var4 = (var3 >> 4 & 7) + class148.field1756;
            var5 = (var3 & 7) + class163.field1873;
            var6 = var1.method11281();
            var30 = var6 >> 2;
            var31 = var6 & 3;
            var9 = client.field320[var30];
            if (0 <= var4 && var4 < 103 && 0 <= var5 && var5 < 103) {
                var10 = client.field475 == -1 ? class484.field5343.field1170 : client.field475;
                class74 var24 = class456.method9208(class484.field5343, var10, var4, var5, var9);
                if (var24 != null) {
                    class212 var25 = class433.method8669(var24.field1027);
                    if (var25.field2323) {
                        ClientPackets.method7038(var10, var4, var5, var30, var31, var9, var27);
                        var24.field1023 = var27;
                        return;
                    }
                }

                boolean var33 = ClientPackets.method7038(var10, var4, var5, var30, var31, var9, var27);
                if (var33) {
                    return;
                }

                if (var24 != null) {
                    var24.field1023 = var27;
                }
            }

        } else if (class328.field3655 == var0) {
            var27 = var1.method11196();
            var3 = (var27 >> 4 & 7) + class148.field1756;
            var4 = (var27 & 7) + class163.field1873;
            var5 = var1.method11181();
            var6 = var1.method11422();
            var30 = var1.method11232();
            if (var3 >= 0 && var4 >= 0 && var3 < class484.field5343.field1162 && var4 < class484.field5343.field1163) {
                var3 = class356.method7416(var3);
                var4 = class356.method7416(var4);
                var31 = client.field475 == -1 ? class484.field5343.field1170 : client.field475;
                class48 var35 = new class48(class484.field5343, var6, var31, var3, var4, class413.method8434(class484.field5343, var3, var4, var31) - var30, var5, client.cycle);
                class484.field5343.field1174.method8689(var35);
            }

        } else if (class328.field3646 == var0) {
            var27 = var1.method11422();
            var3 = var1.method11254();
            var4 = var1.method11232();
            var5 = (var4 >> 4 & 7) + class148.field1756;
            var6 = (var4 & 7) + class163.field1873;
            var30 = class484.field5343.field1170;
            if (0 <= var5 && var5 < 104 && 0 <= var6 && var6 < 104) {
                var31 = client.field475 == -1 ? var30 : client.field475;
                class183.method4179(var31, var5, var6, var27, var3);
            }

        } else if (class328.field3644 == var0) {
            var27 = var1.method11232();
            var3 = (var27 >> 4 & 7) + class148.field1756;
            var4 = (var27 & 7) + class163.field1873;
            var5 = var1.method11181();
            var6 = var1.method11254();
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                var30 = client.field475 == -1 ? class484.field5343.field1170 : client.field475;
                class114.method3454(var30, var3, var4, var5, var6);
            }

        } else if (class328.field3643 == var0) {
            var27 = var1.method11295();
            var3 = var1.method11232();
            var4 = (var3 >> 4 & 7) + class148.field1756;
            var5 = (var3 & 7) + class163.field1873;
            var6 = var1.method11422();
            var30 = var1.method11254();
            if (var4 >= 0 && var5 >= 0 && var4 < class484.field5343.field1162 && var5 < class484.field5343.field1163) {
                var31 = client.field475 == -1 ? class484.field5343.field1170 : client.field475;
                class51.method1895(var31, var4, var5, var6, var30, var27);
            }

        } else if (class328.field3650 == var0) {
            var27 = var1.method11445();
            var3 = var1.method11232();
            var4 = (var3 >> 4 & 7) + class148.field1756;
            var5 = (var3 & 7) + class163.field1873;
            short var29 = (short) var1.method11452();
            var30 = var1.method11295();
            var31 = var1.method11422();
            var9 = var1.method11422();
            var10 = var1.method11244();
            short var32 = (short) var1.method11452();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                var12 = client.field475 == -1 ? class484.field5343.field1170 : client.field475;
                class201.method4425(var12, var4, var5, var31, var30, var29, var27, var32, var10, var9);
            }

        } else if (class328.field3654 == var0) {
            var27 = var1.method11281();
            String[] var22 = null;
            if (var27 > 0) {
                var22 = new String[5];

                for (var4 = 0; var4 < var27; ++var4) {
                    var5 = var1.method11232();
                    String var23 = var1.method11207();
                    if (var5 >= 0 && var5 < 5) {
                        var22[var5] = var23;
                    }
                }
            }

            var4 = var1.method11281();
            var5 = (var4 >> 4 & 7) + class148.field1756;
            var6 = (var4 & 7) + class163.field1873;
            var30 = var1.method11281();
            var31 = var30 >> 2;
            var9 = var30 & 3;
            var10 = client.field320[var31];
            var11 = var1.method11422();
            var12 = var1.method11196();
            if (var5 >= 0 && var6 >= 0 && var5 < class484.field5343.field1162 && var6 < class484.field5343.field1163) {
                var13 = client.field475 == -1 ? class484.field5343.field1170 : client.field475;
                class79.method2702(class484.field5343, var13, var5, var6, var10, var11, var31, var9, var12, var22, 0, -1);
            }

        } else if (class328.field3652 == var0) {
            var27 = var1.method11232();
            var3 = var1.method11241();
            var4 = var1.method11230();
            var5 = var1.method11230() & 31;
            var6 = var1.method11196();
            var30 = var1.method11232();
            var31 = (var30 >> 4 & 7) + class148.field1756;
            var9 = (var30 & 7) + class163.field1873;
            if (var31 >= 0 && var9 >= 0 && var31 < class484.field5343.field1162 && var9 < class484.field5343.field1163) {
                var10 = var5 + 1;
                if (class76.field1108.field1039[0] >= var31 - var10 && class76.field1108.field1039[0] <= var10 + var31 && class76.field1108.field1107[0] >= var9 - var10 && class76.field1108.field1107[0] <= var9 + var10) {
                    class34.method684(class484.field5343.field1172, var3, var31, var9, var5, var27, var4, var6);
                }
            }

        } else {
            if (class328.field3647 == var0) {
                byte var2 = var1.method11259();
                var3 = var1.readUnsignedShort();
                var4 = var1.method11232();
                var5 = (var4 >> 4 & 7) + class148.field1756;
                var6 = (var4 & 7) + class163.field1873;
                byte var7 = var1.method11235();
                byte var8 = var1.method11259();
                var9 = var1.readUnsignedShort();
                var10 = var1.method11230();
                var11 = var10 >> 2;
                var12 = var10 & 3;
                var13 = client.field320[var11];
                byte var14 = var1.method11235();
                var15 = var1.method11422();
                var16 = var1.method11241();
                class69 var17;
                if (var3 == client.field491) {
                    var17 = class76.field1108;
                } else {
                    var17 = (class69) class484.field5343.field1169.method8567((long) var3);
                }

                if (var17 != null) {
                    var18 = client.field475 == -1 ? class484.field5343.field1170 : client.field475;
                    class379.method8174(var18, var5, var6, var11, var12, var13, var15, var9, var16, var8, var2, var14, var7, var17);
                }
            }

            if (class328.field3649 == var0) {
                var27 = var1.readUnsignedShort();
                var3 = var1.method11230();
                var4 = (var3 >> 4 & 7) + class148.field1756;
                var5 = (var3 & 7) + class163.field1873;
                var6 = var1.method11281();
                var30 = class484.field5343.field1170;
                if (var4 >= 0 && var5 >= 0 && var4 < class484.field5343.field1162 && var5 < class484.field5343.field1163) {
                    class436 var20 = class484.field5343.field1167[var30][var4][var5];
                    if (var20 != null) {
                        for (class85 var21 = (class85) var20.method8690(); var21 != null; var21 = (class85) var20.method8692()) {
                            if ((var27 & 32767) == var21.field1221) {
                                var21.method2802(var6);
                                break;
                            }
                        }
                    }

                    if (var4 >= 0 && var5 >= 0 && var4 < class484.field5343.field1162 && var5 < class484.field5343.field1163) {
                        var9 = client.field475 == -1 ? class484.field5343.field1170 : client.field475;
                        class308.method6895(var9, var4, var5, var27, var6);
                    }

                    return;
                }
            }

        }
    }
}
