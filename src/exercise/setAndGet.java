package exercise;

import javax.sound.sampled.SourceDataLine;

class teacher{
      private  int id;
     private   String name ;
     private   int classes;
     public teacher(int myidIs , String myNameIs , int myclassesIs){
        id= myidIs;
        name = myNameIs;
        classes = myclassesIs;
 }
    public void setId(int i){  id = i; }
    public int getId(){ return id;}
    public void setName(String myname){ name = myname;}
    public String getName(){ return name;}
    public void setclasses(int myclass){ classes = myclass;}
    public int getclasses(){return classes ;}
    public teacher(){
        id = 23;
        name = "priya";
        classes = 12;
    }
  
  }


public class setAndGet {
    public static void main(String[] args){
    //    teacher swati = new teacher();
    //    swati.id = 100;
    //    swati.name = "priya";
    //    swati.classes= 8;
    // swati.setId(100);
    // swati.setName("priya");
    // swati.setclasses(12);
    // System.out.println(swati.getId());
    // System.out.println(swati.getName());
    // System.out.println(swati.getclasses());
    // teacher swati = new teacher();
    // System.out.println(swati.getId());
    // System.out.println(swati.getName());
    // System.out.println(swati.getclasses());
    teacher swati  = new teacher(233 , "kumkum" , 12);
    System.out.println(swati.getId());
    System.out.println(swati.getName());
    System.out.println(swati.getclasses());
    }
}
