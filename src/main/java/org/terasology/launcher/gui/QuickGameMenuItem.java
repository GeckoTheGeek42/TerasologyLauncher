package org.terasology.launcher.gui;

import javafx.scene.control.CheckMenuItem;
import org.terasology.launcher.util.QuickGameSettings;

/**
 * Created by anshuman on 31-10-2014.
 */
public class QuickGameMenuItem extends CheckMenuItem {
    public final String key;

    public QuickGameMenuItem(QuickGameSettings settings) {
        super(settings.toString());
        this.key = settings.name();
    }
}
