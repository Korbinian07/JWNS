import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MyImage {
    private String name;
    private Image img = null;

    public MyImage(String name) {
        this.name = name;
    }

    public Image get() {
        if (img == null)
            try {
                img = ImageIO.read(getClass().getResource("test.jpg"));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        ;

        return img;
    }

}