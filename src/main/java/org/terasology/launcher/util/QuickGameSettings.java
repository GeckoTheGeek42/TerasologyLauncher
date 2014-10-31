package org.terasology.launcher.util;

import javafx.scene.control.CheckMenuItem;
import org.terasology.launcher.LauncherSettings;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by anshuman on 30-10-2014.
 */
public enum QuickGameSettings {
    DEFAULT("", "default"),
    LOAD_LAST_GAME("-loadlastgame", "loadlastgame"),
    HEADLESS("-headless", "headless"),
    NO_CRASH_REPORT("noCrashReport");
    //MORE?

    private final String gameParameter;
    private final String labelKey;

    QuickGameSettings(String gameParameter, String labelKey) {
        this.gameParameter = gameParameter;
        this.labelKey = "quickSettings_" + labelKey;
    }

    QuickGameSettings(String key) {
        this("-" + key, key);
    }

    public boolean isDefault() { return this == DEFAULT; }

    @Override
    public String toString() {
        return BundleUtils.getLabel(labelKey);
    }

    public String getGameParameter() {
        return gameParameter;
    }

    public List<String> getGameParameterList() {
        return Arrays.asList(gameParameter.split("\\s+"));
    }
}
