package oopsConcept.MethodsDemo;

public class VarArgs {
   public void argsD(int... mk){
       System.out.println(mk.length);
       int sum=0;
       for(int i=0;i< mk.length;i++){
           sum=sum+mk[i];
       }
       System.out.println(sum);
   }

    public static void main(String[] args) {
       VarArgs varArgs=new VarArgs();
        varArgs.argsD(10);
        varArgs.argsD(10,10,10);
    }
}
