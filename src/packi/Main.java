package packi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws IOException {

            bejegyzések s=new bejegyzések();
            s.add(new Bejegyzés("hello","hello"));
            s.add(new Bejegyzés("hello1","hello1"));
            System.out.println("kérek egy számot");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Integer num=Integer.parseInt(reader.readLine());
            if(num>0){
                for (Integer i=0;i<num;i++){
                    s.add(new Bejegyzés("hello","hello"));
                }
            }
            else {
                System.out.println("ngyobb kell nullánál lenie");
            }
            s.ReadIn();
            s.kioszt();
            System.out.println("kérem a szöveget");
            System.out.println(s.s.get(1));
            s.modyfy(reader.readLine());
            System.out.println(s.s.get(1));
            s.readall();
            s.maxlike();
            s.vane35();
            s.lessten();
            s.rendezés();
        System.out.println("------");
            s.readall();
        }
    }
