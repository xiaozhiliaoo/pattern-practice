package org.lili.structural.adapter.ex5;

/**
 * Created by lili on 2017/7/14.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);

    }

    public void playMp4(String fileName) {

    }
}
