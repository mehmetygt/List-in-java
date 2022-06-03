
package autoboxing.unboxing;

import java.util.ArrayList;


public class AutoboxingUnboxing {

    
    public static void main(String[] args) {
        
      //Biz bir ArrayList oluşturmak için şu yapıyı kllanıyorduk
      
      ArrayList<String> arraylist=new ArrayList<String>();
      
       //Ama
     //   ArrayList<int> arraylist1=new ArrayList<int>();şeklinde kullanımda bir hata alıyoruz.
       
       /*Çünkü String bir  Class olduğundan sıkıtı çıkmaz ama Classs olmayan 
       diğer ilkel veri tipleri kullandığımızda hata alırız.
       Bu sorunu aşmak için java şöyle bir çözüm bulmuştur.
       Her bir ilkel veri tipi için Wrapper Class dediğimiz Classlar oluşturmuştur
       
       
       primitive data type              Wrapper Class
        int---                            -->Integer
        boolean---                        -->Boolean
        char---                           -->Charakter
        float---                          -->Float
        short---                           -->Short
        double---                          -->Double
        long---                            -->Long
        float---                           -->Float               */
       
       
       ArrayList<Integer> arraylist2=new ArrayList<Integer>();
// buraad Wrapper claasstan,Integer class kullandığımızdan hata vermedi .
       
       
        //    Autoboxing Nedir?
        for (int i = 0; i < 10; i++) {
            arraylist2.add(Integer.valueOf(i*4));//Autoboxing
            /* Burada ilkel bir veri tipi olan int ile tutulan i değerini arrayliste attık 
            böylece Autoboxing oldu*/
            
        }
        //ama java şu şekild yapsan kabul ederim kendim autoboxing yaparım diyor ve kabul ediyor.
                for (int i = 0; i < 10; i++) {
            arraylist2.add(i);//Java yanlış bir kullanım olan bu şekli kabul ediyor  autoboxingi kendi yapıyor.
          
        }  
      
                
                 
                //    Unboxing Nedir?
                
                
        for (int i = 0; i < arraylist2.size(); i++) {
            System.out.println(arraylist2.get(i).intValue()); //Unboxing
            /*Burada ilkel bir veri tipi olan int ile tutulan i değerini arraylisteten çıkardık 
            bu işlemede unboxing diyoruz*/
            
        }
        //ama java şu şekild yapsan kabul ederim kendim unboxing yaparım diyor ve kabul ediyor.
                for (int i = 0; i < arraylist2.size(); i++) {
             System.out.println(arraylist2.get(i)); //Java yanlış bir kullanım olan bu şekli kabul ediyor  unboxingi kendi yapıyor.
          
        }  
      
        
        
    }
    
}
