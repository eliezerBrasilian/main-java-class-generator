package com.mainclassgenerator.cryxie;

 public class Main {
    public static void main(String[] args) {
        new Generator().generate("com.teste.cryxie", directory -> {
            System.out.println("Directory structure created at: " + directory.getAbsolutePath());
        });
    }
}