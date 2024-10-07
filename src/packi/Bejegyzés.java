package packi;

import java.time.LocalDateTime;

public class Bejegyzés {

    public Bejegyzés(String tartalom, String szerzo) {
        this.tartalom = tartalom;
        this.szerzo = szerzo;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkeztve = LocalDateTime.now();
    }

    private  String szerzo;
    private  String tartalom;
    private Integer likeok;
    private LocalDateTime letrejott;
    private  LocalDateTime szerkeztve;

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public void setLetrejott(LocalDateTime letrejott) {
        this.letrejott = letrejott;
    }

    public Integer getLikeok() {
        return likeok;
    }

    public void setLikeok(Integer likeok) {
        this.likeok = likeok;
    }

    public LocalDateTime getSzerkeztve() {
        return szerkeztve;
    }

    public void setSzerkeztve(LocalDateTime szerkeztve) {
        this.szerkeztve = szerkeztve;
    }
    public void like(){
        this.likeok+=1;
    }

    @Override
    public String toString() {
        String s="";
        s+=this.szerzo + "-" + this.likeok +"-" +this.letrejott +"\n";
        if(this.szerkeztve==this.letrejott){
            s+= "szerkeztve:" +this.szerkeztve+"\n";
        }
        else {
            s+="nem lett olyonann szerkeztve \n";
        }
        s+=this.tartalom;
        return  s;

    }

}
