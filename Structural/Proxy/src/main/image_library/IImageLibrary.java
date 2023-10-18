package main.image_library;

import java.util.HashMap;

public interface IImageLibrary {
    HashMap<String, Image> popularImages();

    Image getImage(String id);
}
