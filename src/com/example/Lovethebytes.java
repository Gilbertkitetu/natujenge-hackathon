package com.example;

public class Lovethebytes {
    public static void main (String[] args) {
        System.out.println("Hello");

        //Hackathon
        byte bytes[] = new byte[] {
                0x13, 0x55, (byte) 0xb6, 0x76,
                0x79, (byte) 0x88, 0x29, 0x5e,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x03, 0x00, 0x34,
                0x7e, 0x58, 0x1e, 0x36,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00

        };
        //Source port : 0x79, (byte) 0x88 bytes[4-5]
//        int soucePort1 = bytes[4]&0xff;
//        //bytes[5] --> 00000 0000 mask ist 5 bites
//        // the mask is --> 11111 0000
//        int sourcePort2 = ((bytes[5]&0xff) & 0b111110000);
        int sourcePort = 0;
        sourcePort |= ((bytes[4]&0xff)) << 9;
        sourcePort |= ((bytes[5]&0xff) & 0b111110000);
        System.out.println("Source Port: " + sourcePort);



    }

}
