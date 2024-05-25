package com.example.design.patten.practise.stratagePatten;

public class JpgCompresor implements Compressor{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying JpgCompressor on file +"+fileName);
    }
}
