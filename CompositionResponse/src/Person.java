
public class Person {
	//composition has-a relationship
    private Job job;
    private Education education ;
    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
    }
    public long getSalary() {
        return job.getSalary();
    }

   
   
		
		
	
}