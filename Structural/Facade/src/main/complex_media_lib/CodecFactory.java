package main.complex_media_lib;

public class CodecFactory {
    public static Codec extract(VideoFile file){
        return switch (file.getCodecType()) {
            case "mp4" -> {
                System.out.println("CodecFactory: extracting mpeg audio...");
                yield new MPEG4CompressionCodec();
            }
            case "ogg" -> {
                System.out.println("CodecFactory: extracting ogg audio...");
                yield new OggCompressionCodec();
            }
            default -> {
                System.out.println("CodecFactory: invalid Codec Type");
                yield null;
            }
        };
    }
}
