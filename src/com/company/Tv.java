package com.company;

public class Tv {
   private int kanal;
   private  int sesSeviyesi;
   private boolean acik;

   public void ac (){
       acik=true;
   }
   public void kapat(){
       acik=false;
   }
    public Tv (){

    }
    public void kanalyukarı(){
       if(acik==true && kanal<120)
       kanal++;
    }
    public void kanalAsagi(){
       if (acik==true && kanal>1){
           kanal--;
       }

    }
    public void sesArtir (
    ){
        if(acik==true&& sesSeviyesi<7){
            sesSeviyesi++;
        }

    }
    public void sesAzalt (){
        if (acik==true && sesSeviyesi>1) {
            sesSeviyesi--;
        }

    }
    public Tv (int kanal, int sesSeviyesi,boolean acik){
        this.kanal=kanal;
        this.sesSeviyesi=sesSeviyesi;
        this.acik=acik;
    }
    public int getKanal(){
        return kanal;
    }
    public void setKanal(int yenikanal){
        if(acik==true&& yenikanal >=1 && yenikanal<=120){

        }
        this.kanal=yenikanal;
    }
    public int getSesSeviyesi(){
       return sesSeviyesi;
    }
    public void setSesSeviyesi(int yenisesSeviyesi){

        if(acik==true&& sesSeviyesi>=1 && sesSeviyesi<=7){

        }
        this.sesSeviyesi=yenisesSeviyesi;
    }
   // public boolean getacik(){
    //    return acik;
    //}
  //  public void setAcik(boolean acik){
   //     this.acik=acik;
//}


}
