public class Main extends {

	public static void main(String[] args) {
		  Student s1=new Student(101,"Sonoo","2000-12-12",23);  
		  Student s2=new Student(102,"Ravi","2000-11-11",21);  
		  Student s2=new Student(103,"Hanumat","1996-11-11",25);  
		  ArrayList<Student>=new ArrayList<Student>();
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);  
		  Iterator itr=al.iterator();    
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();   
		  }  
		 }  
	
