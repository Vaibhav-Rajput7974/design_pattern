package com.example.design.patten.stratagePatten;

public class ImageStorage {
    private Compressor compressor;

    public Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){
        compressor.apply(fileName);
        filter.apply(fileName);
    }
}
