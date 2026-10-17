package org.example;

import org.example.subsystem.*;

public class VideoConverter {
    public  String convert(String filename, String format) {
        VideoFile file = new VideoFile(filename);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destCodec = format.equals("mp4") ? new MPEG4Codec() : new OggCodec();
        Buffer buffer = BitrateReader.read(filename, sourceCodec);
        String intermediate = BitrateReader.convert(buffer, destCodec);
        return new AudioMixer().fix(intermediate);
    }
}
