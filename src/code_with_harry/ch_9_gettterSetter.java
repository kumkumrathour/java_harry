package code_with_harry;
   class MyStudent{
    private int id;
   private String name;
   
   public MyStudent(){
       id= 21;
       name = "my soul is helping me ";
   }
   public MyStudent(String myname , int myid){
       id = myid ;
       name = myname;
   }
   public void setName(String n){
    name = n;
   }
   public String getName(){
    return name;
   }
   public void setId(int i){
         id = i;
   }
   public int getId(){
    return id;
   }
}
public class ch_9_gettterSetter {
    public static void main(String[] args){
        MyStudent kumkum = new MyStudent();
        // kumkum.id = 553;
        // kumkum.name = "sapna";
        // System.out.println(kumkum.name);   --> through an error because o fprivate access modifier ;
        // kumkum.setName("my strong power girl");
        // System.out.println(kumkum.getName());
            //   --> constructor calling 
        // MyStudent kumkum = new MyStudent("palak",24);
        System.out.println(kumkum.getId());
        System.out.println(kumkum.getName());
    }
}
