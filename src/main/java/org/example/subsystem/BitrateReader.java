package org.example.subsystem;

public class BitrateReader {
    public static Buffer read(String filename, Codec codec) {
        System.out.println("[BitrateReader] Reading " + filename + " with " + codec.type() + " codec");
        return new Buffer("raw: " + filename);
    }
    public static String convert(Buffer buffer, Codec codec) {
        System.out.println("[BitrateReader] Converting to " + codec.type());
        return "converted(" + buffer.data() + "->" + codec.type() + ")";
    }
}
