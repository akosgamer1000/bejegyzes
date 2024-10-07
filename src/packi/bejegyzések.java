package packi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class bejegyzések {
    Random r=new Random();
    List<Bejegyzés> s=new ArrayList<Bejegyzés>();

    public List<Bejegyzés> getS() {
        return s;
    }

    public void add(Bejegyzés z){
        s.add(z);
    }
    public  void ReadIn(){
        try (Scanner scanner = new Scanner(new File("bejegyzesek.csv"))) {
            while (scanner.hasNextLine()) {
                String line=scanner.nextLine();
                var lines=line.split(";");
                s.add(new Bejegyzés(lines[0],lines[1]));
            }
        }
        catch (IOException  e){

        }

    }
    public void kioszt(){

        Integer kiosztan=s.size()*20;
        while (kiosztan!=0){
            Integer ran=r.nextInt(0,s.size());
            s.get(ran).like();
            kiosztan--;
        }

    }
    public void modyfy(String szoveg){
        s.get(1).setTartalom(szoveg);
        update(s.get(1));
    }
    public void update(Bejegyzés k){
        k.setSzerkeztve(LocalDateTime.now());
    }
    public void readall(){
        for(var k:s){
            System.out.println(k);
        }
    }
    public void maxlike(){
        Integer max=0;
        for(var k:s){
            if(k.getLikeok()>max){
                max=k.getLikeok();
            }
        }
        System.out.println("A legnagyobb like menyiség:"+max);
    }
    public void vane35(){
        Boolean van=false;
        for(var k:s){
            if(k.getLikeok()>35){
                van=true;
            }

        }
        if(van){
            System.out.println("Van 35 néll nagyobb ");
        }
        else {
            System.out.println("nincs 35 néll nagyobb");
        }
    }
    public void lessten(){
        Integer count=0;
        for(var k:s){
            if(k.getLikeok()<15){
                count++;
            }
        }
        System.out.println("A 15 nél kissebek száma:"+count);
    }
    public void rendezés(){
        s.sort((o1, o2)
                -> o2.getLikeok().compareTo(
                o1.getLikeok()));

    }
}
