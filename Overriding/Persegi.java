package Overriding;

class Persegi extends BangunDatar {
    private int sisi;
 
    public Persegi(int sisi) {
       this.sisi = sisi;
    }
 
    public float luas() {
       return (float)(this.sisi * this.sisi);
    }
 
    public float keliling() {
       return (float)(this.sisi * 4);
    }
 }
 
