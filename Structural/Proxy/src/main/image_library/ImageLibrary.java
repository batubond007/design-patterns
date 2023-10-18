package main.image_library;

import java.util.HashMap;

public class ImageLibrary implements IImageLibrary {
    @Override
    public HashMap<String, Image> popularImages() {
        createConnection("www.some.com");
        return null;
    }

    @Override
    public Image getImage(String id) {
        createConnection("www.some.com");
        return getImageById(id);
    }

    private void createConnection(String url) {
        System.out.println("Connecting to: " + url);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connected to: " + url);
    }

    private HashMap<String, Image> getRandomImages() {
        System.out.print("Downloading populars... ");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        HashMap<String, Image> hmap = new HashMap<String, Image>();
        hmap.put("catImage", new Image("catImage",
                new int[][]{new int[]{1, 1, 1}, new int[]{1, 1, 1}, new int[]{1, 1, 1}}));
        hmap.put("dogImage", new Image("dogImage",
                new int[][]{new int[]{1, 1, 1}, new int[]{1, 1, 1}, new int[]{1, 1, 1}}));

        System.out.print("Done!" + "\n");
        return hmap;
    }

    private Image getImageById(String imageId) {
        System.out.print("Downloading image... ");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Image image = new Image(imageId, new int[][]{new int[]{1, 1, 1}, new int[]{1, 1, 1}, new int[]{1, 1, 1}});

        System.out.print("Done!" + "\n");
        return image;
    }
}
