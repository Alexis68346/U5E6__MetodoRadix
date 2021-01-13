package u5e6__metodoradix;

import java.util.ArrayList;

import java.util.List;

public class U5E6__MetodoRadix {
    
     public static void main(String args[]) {
       List<Integer> lista = new ArrayList<Integer>();
       
       lista.add(5);
       lista.add(6);
       lista.add(7);
       lista.add(4);
       lista.add(1);
       lista.add(3);
       lista.add(2);
       
      System.out.println("lista original");
      for(int i=0;i<lista.size();i++){
          System.out.print(lista.get(i)+" ");
      }
         System.out.println("");
          U5E6__MetodoRadix obj= new U5E6__MetodoRadix();

       obj.Radix(lista);
       
  }

    public static void Radix(List<Integer> lis ) {
     int j;
     for(int x=Integer.SIZE-1;x>=0;x--){
      List<Integer> aux = new ArrayList<>();
            j=0;
      for(int s=0; s<lis.size();s++){
      aux.add(0);
      }
      for(int i=0; i<lis.size();i++){
          boolean mover=lis.get(i)<<x>=0;
          
           if(x==0 ? !mover:mover){
              aux.set(j,lis.get(i));
               j++;
            }
           else{
               lis.set(i-j,lis.get(i));
           }
        }   
        for(int i=j;i<aux.size();i++){
          aux.set(i,lis.get(i-j));
      }
      lis=aux;
      }
        System.out.println("Lista ordenada");
         for( j=0;j<lis.size();j++){
          System.out.print(lis.get(j)+" ");
      }
    }
    
    
}
