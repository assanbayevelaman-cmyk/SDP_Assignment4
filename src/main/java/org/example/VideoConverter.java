package org.example;

import org.example.subsystem.*;

public class VideoConverter {
    public  String convert(String filename, String format) {
        if (filename == null || filename.isBlank())
            throw new IllegalArgumentException("Filename required");
        if (format == null || format.isBlank())
            throw new IllegalArgumentException("Format required");
        if (!format.equals("mp4") && !format.equals("ogg"))
            throw new IllegalArgumentException("Unsupported format: " + format);
        VideoFile file = new VideoFile(filename);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destCodec = format.equals("mp4") ? new MPEG4Codec() : new OggCodec();
        Buffer buffer = BitrateReader.read(filename, sourceCodec);
        String intermediate = BitrateReader.convert(buffer, destCodec);
        return new AudioMixer().fix(intermediate);
    }
}
