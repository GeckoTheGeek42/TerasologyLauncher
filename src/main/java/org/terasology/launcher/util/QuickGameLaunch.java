package org.terasology.launcher.util;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuItem;
import org.terasology.launcher.gui.javafx.ApplicationController;

/**
 * Created by anshuman on 31-10-2014.
 */
public enum QuickGameLaunch {
    DEFAULT("", "default"),
    LOAD_LAST_GAME("loadlastgame"),
    HEADLESS("headless");

    private final String launchParameter;
    private final String labelKey;

    QuickGameLaunch(String key) {
        this("-" + key, key);
    }

    QuickGameLaunch(String launchParameter, String labelKey) {
        this.launchParameter = launchParameter;
        this.labelKey = "quickGameLaunch_" + labelKey;
    }

    @Override
    public String toString() {
        return BundleUtils.getLabel(this.labelKey);
    }

    public String getLaunchParameter() {
        return launchParameter;
    }

    public boolean isDefault() {
        return this == DEFAULT;
    }
}
