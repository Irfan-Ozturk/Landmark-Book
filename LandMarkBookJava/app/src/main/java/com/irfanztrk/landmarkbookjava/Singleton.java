package com.irfanztrk.landmarkbookjava;
//Singleton sadece bir tane obje tutan classlardır
public class Singleton {
   private Landmark sentLantmark;
   private  static  Singleton singleton;
    private Singleton(){
    }

    public Landmark getSentLantmark(){
        return sentLantmark;
    }
    public void setSentLantmark(Landmark sentLantmark){
        this.sentLantmark=sentLantmark;
    }
    public static Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
