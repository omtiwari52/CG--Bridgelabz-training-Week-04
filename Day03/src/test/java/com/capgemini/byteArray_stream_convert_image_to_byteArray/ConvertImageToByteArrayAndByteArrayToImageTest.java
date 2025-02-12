package com.capgemini.byteArray_stream_convert_image_to_byteArray;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ConvertImageToByteArrayAndByteArrayToImageTest {

    @Test
    void convertImageToByteTest1() throws IOException {
        ConvertImageToByteArrayAndByteArrayToImage.convertImageToByteArray("src/main/java/com/capgemini/byteArray_stream_convert_image_to_byteArray/source_image.jpg");
    }
}
