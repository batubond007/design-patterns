package main.image_component;

import main.image_library.IImageLibrary;
import main.image_library.Image;

import java.util.Arrays;

public class ImageComponent {
    private final IImageLibrary imageLibrary;

    public ImageComponent(IImageLibrary imageLibrary) {
        this.imageLibrary = imageLibrary;
    }

    public void renderImage(String imageId){
        Image image = imageLibrary.getImage(imageId);
        System.out.println("\n-------------------------------");
        System.out.println("Rendering");
        System.out.println("ID: " + image.getId());
        System.out.println("Image: " + Arrays.deepToString(image.getPixelArray()));
        System.out.println("-------------------------------\n");
    }
}
