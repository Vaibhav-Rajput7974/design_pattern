package com.example.design.patten.stratagePatten;

public class PngCompressor implements Compressor{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying PngCompressor on file +"+fileName);
    }
}
