# SDP_Assignment4

**Name:** Assanbayev Yelaman  
**Group:** SE-2538  
**Topic:** A (Media/File Conversion Facade)  

Facade pattern demo: converts media files between formats through a single `VideoConverter.convert(filename, format)` call, hiding a subsystem of codec/buffer/audio classes.

## Pattern roles

- **Facade:** `VideoConverter`
- **Subsystem:** `VideoFile`, `Codec`, `MPEG4Codec`, `OggCodec`, `CodecFactory`, `Buffer`, `BitrateReader`, `AudioMixer`
- **Client:** `Main`

## Build & Run

1. Open the project in IntelliJ IDEA.
2. Run `Main` from the run configuration.
