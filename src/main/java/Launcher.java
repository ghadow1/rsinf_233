import javax.swing.*;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import game.client;

public class Launcher implements AppletStub {

    public static final Logger logger = Logger.getLogger(Launcher.class.getSimpleName());

    private static final HashMap<String, String> params = new HashMap<String, String>();
    private static final HashMap<String, String> cfg = new HashMap<String, String>();

    static {
        cfg.put("privacyurl", "http://www.jagex.com/g=oldscape/privacy/privacy.ws");
        cfg.put("window_preferredheight", "600");
        cfg.put("msg", "new_version_link=http://oldschool.runescape.com/");
        cfg.put("applet_minwidth", "765");
        cfg.put("adverturl", "http://www.runescape.com/g=oldscape/bare_advert.ws");
        cfg.put("cachedir", "oldschool");
        cfg.put("window_preferredwidth", "800");
        cfg.put("applet_maxheight", "2160");
        cfg.put("win_sub_version", "1");
        cfg.put("browsercontrol_win_x86_jar", "browsercontrol_0_-1928975093.jar");
        cfg.put("other_sub_version", "2");
        cfg.put("initial_jar", "gamepack_4840368.jar");
        cfg.put("advert_height", "96");
        cfg.put("title", "Old School RuneScape");
        cfg.put("storebase", "0");
        cfg.put("initial_class", "game.game.client.class");
        cfg.put("applet_maxwidth", "5760");
        cfg.put("download", "1230228");
        cfg.put("termsurl", "http://www.jagex.com/g=oldscape/terms/terms.ws");
        cfg.put("codebase", "http://oldschool1.runescape.com/");
        cfg.put("mac_sub_version", "2");
        cfg.put("browsercontrol_win_amd64_jar", "browsercontrol_1_1674545273.jar");
        cfg.put("applet_minheight", "503");
        cfg.put("viewerversion", "124");
    }

    private static URL codebase;

    public static void main(String[] args) throws Exception {
        parseParams(new FileInputStream(new File("./data/params.txt")));
        String worldListKey = null;
        for (Map.Entry<String, String> paramEntry : params.entrySet()) {
            String key = paramEntry.getKey();
            String value = paramEntry.getValue();
            if (value.contains("slr.ws")) {
                worldListKey = key;
                break;
            }
        }
        codebase = new URL(args.length == 0 ? "http://127.0.0.1" : args[0]);
        params.put(worldListKey, "http://" + codebase.getHost());
        client game = new client();
        game.setSize(new Dimension(Integer.parseInt(cfg.get("applet_minwidth")),
                Integer.parseInt(cfg.get("applet_minheight"))));
        game.setPreferredSize(new Dimension(Integer.parseInt(cfg.get("applet_minwidth")),
                Integer.parseInt(cfg.get("applet_minheight"))));
        game.setStub(new Launcher());
        game.init();
        String title = new File(".").getCanonicalPath();
        title = title.substring(title.lastIndexOf('\\') + 1);

        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void parseParams(InputStream stream) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
        String line;
        while ((line = br.readLine()) != null) {
            int idx = line.indexOf('=');
            if (idx != -1) {
                String key = line.substring(0, idx);
                String val = line.substring(idx + 1);
                if (key.equals("param")) {
                    idx = val.indexOf('=');
                    key = val.substring(0, idx);
                    val = val.substring(idx + 1);
                    params.put(key, val);
                } else {
                    cfg.put(key, val);
                }
            }
        }
    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public URL getDocumentBase() {
        return codebase;
    }

    @Override
    public URL getCodeBase() {
        return codebase;
    }

    @Override
    public String getParameter(String name) {
        return params.get(name);
    }

    @Override
    public AppletContext getAppletContext() {
        return null;
    }

    @Override
    public void appletResize(int width, int height) {
    }

    public static void log(String format, Object... params) {
        System.out.printf(format + "\n", params);
    }
}
