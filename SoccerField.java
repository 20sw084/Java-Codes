package Pharamacy_Management_System;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.net.URL;
import javax.imageio.ImageIO;

public class SoccerField {

    private JPanel ui = null;
    int[] x = {0, 35, 70, 107, 142, 177, 212, 247, 282, 315};
    int[] y = {0, 45, 85, 140, 180, 225, 265, 280, 320, 345};
    Color brighter = new Color(255,255,255,92);
    Color darker = new Color(0,0,0,92);

    SoccerField() {
        initUI();
    }

    public void initUI() {
        if (ui != null) {
            return;
        }

        ui = new JPanel(new GridBagLayout());
        ui.setBackground(Color.RED);

        try {
            URL url = new URL("http://i.stack.imgur.com/9E5ky.jpg");
            BufferedImage img = ImageIO.read(url);
            BufferedImage field = img.getSubimage(100, 350, 315, 345);

            BufferedImage[] bi = subSampleImageColumns(field);
            BufferedImage[][] fieldParts = new BufferedImage[bi.length][];
            for (int ii=0; ii<bi.length; ii++) {
                fieldParts[ii] = subSampleImageRows(bi[ii]);
            }
            for (int ii=0; ii<fieldParts[0].length; ii++) {
                for (int jj=0; jj<fieldParts.length; jj++) {
                    addImageToPanel(ui, fieldParts[ii][jj], ii, jj);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void addImageToPanel(
            JPanel panel, BufferedImage img, int row, int col) {
        Insets insets = new Insets(0,0,0,0);
        double weighty = img.getHeight()==40 ? .5 : .1;
        GridBagConstraints gbc = new GridBagConstraints(
                row, col, 
                1, 1, 
                .5, weighty, 
                GridBagConstraints.CENTER, 
                GridBagConstraints.BOTH, 
                insets, 0, 0);
        ImageIcon ii = new ImageIcon(img);
        JButton b = new JButton(ii);
        b.setRolloverIcon(new ImageIcon(getFadeImage(img, brighter)));
        b.setPressedIcon(new ImageIcon(getFadeImage(img, darker)));

        b.setBorder(null);
        b.setBorder(new EmptyBorder(0, 0, 0, 0));
        b.setBorderPainted(false);
        b.setContentAreaFilled(false);
        b.setFocusPainted(false);
        panel.add(b, gbc);
    }

    private BufferedImage[] subSampleImageColumns(BufferedImage img) {
        BufferedImage[] imageRows = new BufferedImage[x.length - 1];
        for (int ii = 0; ii < x.length - 1; ii++) {
            BufferedImage bi = img.getSubimage(
                    x[ii], 0, x[ii + 1] - x[ii], img.getHeight());
            imageRows[ii] = bi;
        }

        return imageRows;
    }

    private BufferedImage[] subSampleImageRows(BufferedImage img) {
        BufferedImage[] imageRows = new BufferedImage[y.length - 1];
        for (int ii = 0; ii < y.length - 1; ii++) {
            BufferedImage bi = img.getSubimage(
                    0, y[ii], img.getWidth(), y[ii + 1] - y[ii]);
            imageRows[ii] = bi;
        }

        return imageRows;
    }

    private BufferedImage getFadeImage(BufferedImage img, Color clr) {
        BufferedImage bi = new BufferedImage(
                img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.getGraphics();

        g.drawImage(img, 0, 0, ui);
        g.setColor(clr);
        g.fillRect(0, 0, img.getWidth(), img.getHeight());
        g.dispose();

        return bi;
    }

    public JComponent getUI() {
        return ui;
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception useDefault) {
                }
                SoccerField o = new SoccerField();

                JFrame f = new JFrame(o.getClass().getSimpleName());
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setLocationByPlatform(true);

                f.setContentPane(o.getUI());
                f.pack();

                f.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}
