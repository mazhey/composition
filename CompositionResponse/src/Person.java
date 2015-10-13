
public class Person {
	//composition has-a relationship
    private Job job;
    public Education education ;
    public Person(){
        this.job=new Job();
       this.education = new Education();
        job.setSalary(1000L);
//      education.toString();
    }
    public long getSalary() {
        return job.getSalary();
    }

    public String toString(){
    	System.out.println();
    	System.out.println(education.toString());
    	return "";
    }
   
		
    
	
}
