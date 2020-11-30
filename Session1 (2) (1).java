import java.util.Date;
import java.util.Scanner;
import java.util.Random;


public class Session1 {
   private String name;
   private Problems prblm;
  
   public Session1(String name,int _no,char ch,int mn,int mx){
       this.name=name;
       this.prblm=new Problems(_no,ch,mn,mx);
   }
  
   public String getProblem(int i){
       String ret="";
       if(this.prblm.getType()=='A' || this.prblm.getType()=='a'){
           ret+=this.prblm.getFirstVals()[i]+" + "+this.prblm.getSecondVals()[i]+" = ";
       }
   if(this.prblm.getType()=='S' || this.prblm.getType()=='s'){
           ret+=this.prblm.getFirstVals()[i]+" * "+this.prblm.getSecondVals()[i]+" = ";
       }
  if(this.prblm.getType()=='M' || this.prblm.getType()=='m'){
           ret+=this.prblm.getFirstVals()[i]+" - "+this.prblm.getSecondVals()[i]+" = ";
       }
 if(this.prblm.getType()=='D' || this.prblm.getType()=='d'){
           ret+=this.prblm.getFirstVals()[i]+" / "+this.prblm.getSecondVals()[i]+" = ";
       }


       return ret;
   }
  
   public int getAnswer(int i){
       return this.prblm.getAnsVals()[i];
   }
  
   public void start(Scanner sc){
       int countc=0;
       int countic=0;
       int [] ansLst=new int[this.prblm.getSize()];
       long start=System.currentTimeMillis();
       for(int i=0;i<this.prblm.getSize();i++){
           System.out.print(this.getProblem(i));
           int ans=sc.nextInt();
           ansLst[i]=ans;
           if(Math.abs(ans-this.getAnswer(i))<.001){
               System.out.println("correct");
               countc++;
           }
           else{
               System.out.println("incorrect");
               countic++;
           }          
       }
       long end=System.currentTimeMillis();  
      
       System.out.println(this.getSummary(countc, end-start, ansLst));
   }
  
  
   public String getSummary(int countc,long time,int [] lst){
       String ret="\nSession Summary\n\n";
      
       ret+=this.prblm.getSize()+" problems, "+countc+" correct, score is "+(countc*100/(double)this.prblm.getSize())+", time is "+(time/1000)+" sec\n\n";
      
       ret+="Session: "+this.name+", ";

       	if(this.prblm.getType()=='A' || this.prblm.getType()=='a'){
               ret+="Addition, ";
           }
           if(this.prblm.getType()=='S' || this.prblm.getType()=='s'){
               ret+="Subtraction, ";
           }
           if(this.prblm.getType()=='M' || this.prblm.getType()=='m'){
               ret+="Multiplication, ";
           }
           if(this.prblm.getType()=='D' || this.prblm.getType()=='d'){
               ret+="Division, ";
    }

      
       ret+="Division, ";
       ret+=this.prblm.getMin()+", ";
       ret+=this.prblm.getMax()+", ";


       Date date=new Date();
       ret+=(1900+date.getYear())+"-"+date.getMonth()+"-"+date.getDay()+", "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds()+", ";
       ret+=this.prblm.getSize()+", ";
       ret+=countc+", ";
       ret+=(countc*100/(double)this.prblm.getSize())+", ";
       ret+=((this.prblm.getSize()-countc)*100/(double)this.prblm.getSize())+"\n\n";
      
       for(int i=0;i<this.prblm.getSize();i++){
           ret+=this.getProblem(i)+lst[i]+" A : "+this.getAnswer(i);
          
           if(Math.abs(lst[i]-this.getAnswer(i))<.001){
               ret+=" correct\n";
           }
           else{
               ret+=" incorrect\n";
           }          
       }
      
       return ret;
   }
}