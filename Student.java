public class Student{
     
     private int id;
     private String name;
     private int marks;
     
     public Student(int id, String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;

     }
     public int getid(){
        return id;
     }
     public void setName(String name){
        this.name=name;

    }
      public void setName(int marks){
        this.marks=marks; 
    }
    public void display(){
        System.out.println(id + "\t" + name + "\t" + marks);
    }

}