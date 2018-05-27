/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author doilhan
 */
public class Alarm {
    
    public static final String file = "/Users/doilhan/NetBeansProjects/Homework_Manager/src/homework_manager_resources/alarm.wav";
    InputStream in;
    AudioStream audioStream;
    
    Alarm() throws FileNotFoundException, IOException {
        in = new FileInputStream(file);
        audioStream = new AudioStream(in);
    }
    
    public void play(){
        AudioPlayer.player.start(audioStream);
    }
    
    public void stop() {
        AudioPlayer.player.stop(audioStream);
    }
}

