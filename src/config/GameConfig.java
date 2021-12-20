package config;

import de.ur.mi.oop.colors.Color;

public abstract class GameConfig {

    /**
     * Christmassy colors from https://www.schemecolor.com/christmas-carol.php
     */
    public static final Color FIRE_OPAL = new Color(235, 92, 95);
    public static final Color AMERICAN_PINK = new Color(250, 149, 148);
    public static final Color LINEN = new Color(251, 242, 234);
    public static final Color FLACESCENT = new Color(242, 229, 153);
    public static final Color ARYLIDE_YELLOW = new Color(236, 217, 105);
    public static final Color DARK_SEA_GREEN = new Color(153, 211, 136);

    public static final int WINDOW_WIDTH = 640;
    public static final int WINDOW_HEIGHT = 480;
    public static final Color BACKGROUND_COLOR = LINEN;

}
