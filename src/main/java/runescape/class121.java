package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.net.URL;
import java.security.SecureRandom;

@ObfuscatedName("ea")
public class class121 {
    @ObfuscatedName("af")
    @ObfuscatedGetter(
            intValue = -1505293149
    )
    static int field1562 = -1;
    @ObfuscatedName("aw")
    @ObfuscatedGetter(
            intValue = 1053060671
    )
    static int field1558 = -2;
    @ObfuscatedName("oh")
    static SecureRandom secureRandom;
    @ObfuscatedName("at")
    final URL field1559;
    @ObfuscatedName("ac")
    @ObfuscatedGetter(
            intValue = 1761040065
    )
    volatile int field1557;
    @ObfuscatedName("ap")
    volatile byte[] field1560;

    class121(URL var1) {
        this.field1557 = field1562;
        this.field1559 = var1;
    }

    @ObfuscatedName("af")
    @ObfuscatedSignature(
            descriptor = "(CI)B",
            garbageValue = "-505757566"
    )
    public static byte method3526(char var0) {
        byte var1;
        if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
            if (var0 == 8364) {
                var1 = -128;
            } else if (var0 == 8218) {
                var1 = -126;
            } else if (var0 == 402) {
                var1 = -125;
            } else if (var0 == 8222) {
                var1 = -124;
            } else if (var0 == 8230) {
                var1 = -123;
            } else if (var0 == 8224) {
                var1 = -122;
            } else if (var0 == 8225) {
                var1 = -121;
            } else if (var0 == 710) {
                var1 = -120;
            } else if (var0 == 8240) {
                var1 = -119;
            } else if (var0 == 352) {
                var1 = -118;
            } else if (var0 == 8249) {
                var1 = -117;
            } else if (var0 == 338) {
                var1 = -116;
            } else if (var0 == 381) {
                var1 = -114;
            } else if (var0 == 8216) {
                var1 = -111;
            } else if (var0 == 8217) {
                var1 = -110;
            } else if (var0 == 8220) {
                var1 = -109;
            } else if (var0 == 8221) {
                var1 = -108;
            } else if (var0 == 8226) {
                var1 = -107;
            } else if (var0 == 8211) {
                var1 = -106;
            } else if (var0 == 8212) {
                var1 = -105;
            } else if (var0 == 732) {
                var1 = -104;
            } else if (var0 == 8482) {
                var1 = -103;
            } else if (var0 == 353) {
                var1 = -102;
            } else if (var0 == 8250) {
                var1 = -101;
            } else if (var0 == 339) {
                var1 = -100;
            } else if (var0 == 382) {
                var1 = -98;
            } else if (var0 == 376) {
                var1 = -97;
            } else {
                var1 = 63;
            }
        } else {
            var1 = (byte) var0;
        }

        return var1;
    }

    @ObfuscatedName("af")
    @ObfuscatedSignature(
            descriptor = "(Lpx;B)V",
            garbageValue = "9"
    )
    public static void method3528(class412 var0) {
        class206.field2259 = var0;
    }

    @ObfuscatedName("hi")
    @ObfuscatedSignature(
            descriptor = "(II)V",
            garbageValue = "-1616444191"
    )
    static void updateGameState(int value) {
        System.out.println("Updating game state to " + value);
        if (value != client.gameState) {
            if (client.gameState == 30) {
                client.field598.method6085();
            }

            if (client.gameState == 0) {
                class521.field5519.method541();
            }

            if (value == 20 || value == 40 || value == 45 || value == 50) {
                HitSplatDefinition.setLoginState(class43.field296);
                client.field351 = 0;
                client.field448 = 0;
                client.timer.method8249(value);
                if (value != 20) {
                    class325.method7035(false);
                }
            }

            if (value != 20 && value != 40 && class10.field50 != null) {
                class10.field50.vmethod10196();
                class10.field50 = null;
            }

            if (client.gameState == 25) {
                client.field476 = 0;
                client.field410 = 0;
                client.field411 = 1;
                client.field329 = 0;
                client.field413 = 1;
            }

            if (value != 5 && value != 10) {
                if (value == 20) {
                    int var4 = client.gameState == 11 ? 4 : 0;
                    class192.method4313(class27.field130, class496.field5387, class332.field3827, false, var4);
                } else if (value == 11) {
                    class192.method4313(class27.field130, class496.field5387, class332.field3827, false, 4);
                } else if (value == 50) {
                    class66.method2147("", "Updating date of birth...", "");
                    class192.method4313(class27.field130, class496.field5387, class332.field3827, false, 7);
                } else if (value != 0 && class4.field9) {
                    class478.field5307 = null;
                    class199.field2175 = null;
                    class447.field5149 = null;
                    class53.field772 = null;
                    class406.field4894 = null;
                    class139.field1686 = null;
                    class39.field273 = null;
                    class289.field3340 = null;
                    class199.field2173 = null;
                    class292.field3380 = null;
                    class42.field283 = null;
                    class122.field1565 = null;
                    class395.field4808 = null;
                    class275.field3231 = null;
                    class155.field1803.method2517();
                    class257.method5884(0, 100);
                    class413 var1 = class297.field3418;
                    var1.method8436(true);
                    class4.field9 = false;
                }
            } else {
                boolean var3 = class36.clientPreferences.method2570() >= client.field388;
                int var2 = var3 ? 0 : 12;
                class192.method4313(class27.field130, class496.field5387, class332.field3827, true, var2);
            }

            System.out.println("Set game state to " + value);
            client.gameState = value;
        }
    }

    @ObfuscatedName("mo")
    @ObfuscatedSignature(
            descriptor = "(Lcv;IIIIB)V",
            garbageValue = "-20"
    )
    static final void method3518(class69 var0, int var1, int var2, int var3, int var4) {
        if (var0.field1103 != client.field491) {
            if (client.field522.field6052 < 400) {
                String var5;
                if (var0.field940 == 0) {
                    var5 = var0.field938[0] + var0.field934 + var0.field938[1] + class444.method8880(var0.field939, class76.field1108.field939) + " " + " (" + "level-" + var0.field939 + ")" + var0.field938[2];
                } else {
                    var5 = var0.field938[0] + var0.field934 + var0.field938[1] + " " + " (" + "skill-" + var0.field940 + ")" + var0.field938[2];
                }

                int var6;
                if (client.field357 == 1) {
                    class423.method8546("Use", client.field528 + " " + "->" + " " + class134.method3619(16777215) + var5, 14, var1, var2, var3, -1, false, var4);
                } else if (client.field529) {
                    if ((class337.field3865 & 8) == 8) {
                        class423.method8546(client.field374, client.field533 + " " + "->" + " " + class134.method3619(16777215) + var5, 15, var1, var2, var3, -1, false, var4);
                    }
                } else {
                    for (var6 = 7; var6 >= 0; --var6) {
                        if (client.field516[var6] != null) {
                            short var7 = 0;
                            if (client.field516[var6].equalsIgnoreCase("Attack")) {
                                if (client.field340 == class84.field1213) {
                                    continue;
                                }

                                if (client.field340 == class84.field1211 || class84.field1214 == client.field340 && var0.field939 > class76.field1108.field939) {
                                    var7 = 2000;
                                }

                                if (class76.field1108.field955 != 0 && var0.field955 != 0) {
                                    if (var0.field955 == class76.field1108.field955) {
                                        var7 = 2000;
                                    } else {
                                        var7 = 0;
                                    }
                                } else if (class84.field1216 == client.field340 && var0.method2167()) {
                                    var7 = 2000;
                                }
                            } else if (client.field439[var6]) {
                                var7 = 2000;
                            }

                            boolean var8 = false;
                            int var9 = client.playerMenuOpcodes[var6] + var7;
                            class423.method8546(client.field516[var6], class134.method3619(16777215) + var5, var9, var1, var2, var3, -1, false, var4);
                        }
                    }
                }

                for (var6 = 0; var6 < client.field522.field6052; ++var6) {
                    if (client.field522.field6055[var6] == 23) {
                        client.field522.field6062[var6] = class134.method3619(16777215) + var5;
                        break;
                    }
                }

            }
        }
    }

    @ObfuscatedName("af")
    @ObfuscatedSignature(
            descriptor = "(B)Z",
            garbageValue = "-63"
    )
    public boolean method3519() {
        return this.field1557 != field1562;
    }

    @ObfuscatedName("aw")
    @ObfuscatedSignature(
            descriptor = "(I)[B",
            garbageValue = "61839400"
    )
    public byte[] method3520() {
        return this.field1560;
    }

    @ObfuscatedName("at")
    @ObfuscatedSignature(
            descriptor = "(I)Ljava/lang/String;",
            garbageValue = "1382447281"
    )
    public String method3527() {
        return this.field1559.toString();
    }
}
