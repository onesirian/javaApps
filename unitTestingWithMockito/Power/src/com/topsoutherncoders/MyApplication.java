package com.topsoutherncoders;


import static com.codename1.ui.CN.*;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.Label;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.io.Log;
import com.codename1.ui.Toolbar;
import java.io.IOException;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.io.NetworkEvent;
/**
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose 
 * of building native mobile applications using Java.
 */
public class MyApplication {

    public void main() {
        return powerOfFour(839224);
    }

    public boolean powerOfFour(int i) {
        while(i>4) {
            i = i/4;
        }
        if (i==1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
