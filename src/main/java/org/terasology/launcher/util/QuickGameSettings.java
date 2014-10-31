package org.terasology.launcher.util;

import java.util.Arrays;
import java.util.List;

/**
 * Created by anshuman on 30-10-2014.
 */
public enum QuickGameSettings {
    DEFAULT("", "quickSettings_default"),
    LOAD_LAST_GAME("-loadlastgame", "quickSettings_loadLastGame"),
    HEADLESS("-headless", "quickSettings_headless");
    //MORE?

    private final String gameParameter;
    private final String labelKey;

    QuickGameSettings(String gameParameter, String labelKey) {
        this.gameParameter = gameParameter;
        this.labelKey = labelKey;
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
