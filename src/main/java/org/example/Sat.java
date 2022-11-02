package org.example;

public class Sat {
    private int sati;
    private int minute;
    private int sekunde;

    public Sat(int sati, int minute, int sekunde){
        this.set(sati, minute, sekunde);
    }

    public void set(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }
    public void Sljedeci(){
        this.sekunde++;
        if(this.sekunde == 60) {
            this.sekunde = 0;
            this.minute++;
        }
        if(this.minute == 60){
            this.minute = 0;
            this.sati++;
        }
        if(this.sati == 24) {
            this.sati = 23;
        }
    }
    public void Prethodni(){
        this.sekunde--;
        if (this.sekunde==-1) { this.sekunde=59; this.minute--; }
        if (this.minute==-1) { this.minute=59; this.sati--; }
        if (this.sati==-1) this.sati=23;
    }
    public void PomjeriZa(int pomak){
        if(pomak > 0) {
            for (int i = 0; i < pomak; i++)
                Sljedeci();
        }else
            for(int i=0; i<-pomak; i++)
                Prethodni();
    }
    public int DajSate(){
        return sati;
    }
    public int Minute(){
        return minute;
    }
    public int Sekunde(){
        return sekunde;
    }
    public void Ispisi(){
        System.out.println(sati +":" + minute +":" +sekunde);
    }
}
