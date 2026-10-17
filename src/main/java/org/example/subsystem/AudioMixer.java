package org.example.subsystem;

public class AudioMixer {
    public String fix(String input) {
        System.out.println("[AudioMixer] Fixing audio track");
        return input + "+audio_fixed";
    }
}
