package ca.qc.cgmatane.exoplanetes.admin;

import ca.qc.cgmatane.exoplanetes.admin.vue.ExoplaneteVue;

public class App {
    public static void main(String[] args) {
        ExoplaneteVue exoplaneteVue = new ExoplaneteVue();
        exoplaneteVue.launch(ExoplaneteVue.class, args);
    }
}
