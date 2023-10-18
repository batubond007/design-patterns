package main;

import main.image_component.ImageComponent;
import main.image_library.ImageCacheProxy;
import main.image_library.ImageLibrary;

public class Main {
    public static void main(String[] args) {
        ImageComponent imageComponent = new ImageComponent(new ImageLibrary());
        ImageComponent cachedImageComponent = new ImageComponent(new ImageCacheProxy());

        imageComponent.renderImage("catImage");
        imageComponent.renderImage("dogImage");
        cachedImageComponent.renderImage("catImage");
        cachedImageComponent.renderImage("dogImage");
    }
}