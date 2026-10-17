package org.example.subsystem;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String ext = file.name().substring(file.name().lastIndexOf('.') + 1);
        System.out.println("[CodecFactory] Detected source codec: " + ext);
        return ext.equals("mp4") ? new MPEG4Codec() : new OggCodec();
    }
}
