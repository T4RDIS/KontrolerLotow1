package com.company;

/**
 * Created by kdudkowski on 30.12.15.
 */

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class PlaySound {

    public static class PlayAlarm extends JFrame implements ActionListener {

        JButton btn, btn2, btn3, btn4, btn5;
        AudioClip click;

        public PlayAlarm() {
            setSize(400, 300);

            btn = new JButton("Play");
            btn2 = new JButton("1");
            btn3 = new JButton("2");
            btn4 = new JButton("3");
            btn5 = new JButton("4");
            setTitle("Sound");
            setLayout(new FlowLayout());
            getContentPane().add(btn);
            getContentPane().add(btn2);
            getContentPane().add(btn3);
            getContentPane().add(btn4);
            getContentPane().add(btn5);



            //getContentPane().add(btn);

            btn.addActionListener(PlayAlarm.this);
            btn2.addActionListener(PlayAlarm.this);
            btn3.addActionListener(PlayAlarm.this);
            btn4.addActionListener(PlayAlarm.this);
            btn5.addActionListener(PlayAlarm.this);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn) {
                URL urlClick = PlayAlarm.class.getResource("sounds/sound1.wav");
                click = Applet.newAudioClip(urlClick);
                click.play();
            }

            if (e.getSource() == btn2) {
                click.play();
            }

            if (e.getSource() == btn3) {
                click.stop();
            }

            if (e.getSource() == btn4) {
                click.play();
            }

            if (e.getSource() == btn4) {
                click.play();
            }

            if (e.getSource() == btn5) {
                click.play();
            }


        }

        public static void main(String[] args) {
            PlayAlarm p = new PlayAlarm();
            p.setVisible(true);

            int i = 1;

        }
    }
}
