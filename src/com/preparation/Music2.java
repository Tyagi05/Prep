package com.preparation;
import javax.sound.midi.*;
public class Music2 {

        public void play() {
            try {
                Sequencer sequencer = MidiSystem.getSequencer();
                System.out.println("Successfully got a sequencer");
            } catch (MidiUnavailableException ex) {
                System.out.println("Bummer");
            }
        }

        public static void main(String[] args) {
            Music2 mt =  new Music2();
            mt.play();

        }
    }

