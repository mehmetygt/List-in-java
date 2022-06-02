
import java.util.ArrayList;


public class Main {
    public static void yazdır(ArrayList<String> array){
        for (int i = 0; i < array.size(); i++) {
            System.out.println(i+". eleman : "+array.get(i));
            
        }
}
    
    public static void main(String[] args) {
        
       // ArrayList oluşturma
        ArrayList<String> arrayList=new ArrayList<String>();
        //Arrayliste eeleman ekleme
        arrayList.add("Metallica");
        arrayList.add("Gans'n Rosees"); 
        arrayList.add("Black Sabbath");
        arrayList.add("Iron Maiden");
        arrayList.add("Megadeth"); 
        
        System.out.println(arrayList);//böle bütün elemanları sıralı alabiliriz
        System.out.println("------------");
         //şöyle tek tek te alabiliriz
         System.out.println(arrayList.get(0));
         System.out.println(arrayList.get(1));
         System.out.println(arrayList.get(2));
         System.out.println(arrayList.get(3));
         
         // ArrayList in uzunluğunu şöyle alırız
         System.out.println("------");
         System.out.println(arrayList.size());
          
         //elemanları for ilede alabiliriz
         System.out.println("----------");
         for (int i = 0; i <arrayList.size(); i++) {
             System.out.println(arrayList.get(i));      
        }
         
        //eleman silmeyi şu şekilde yapabiliriz
        System.out.println("------------");
         arrayList.remove(1);//ya bu şekildeindeks verieiz 
         arrayList.remove("Metallica");//yada içeriği direk veririz ikisi de sler
       System.out.println(arrayList);
// 2 eleman kaldığından ilk ikiyi verip sonra array aşım hatası verecek

     //bir elemanın yerini öğrenme 
        System.out.println("------------");
        System.out.println(arrayList.indexOf("Metallica"));//metallicanın olduğu index numarasını gönderir yoksa -1 döner
        System.out.println(arrayList.get(1));//1 indeksindeki elemanı getirdi
        System.out.println(arrayList.indexOf("Iron Maiden"));//varsa da index numarasını yazar
        
         //arraylist eleman güncelleme 
         System.out.println("----------");
         System.out.println(arrayList);
         arrayList.set(2, "Manga"); //3 indexte ne olursa siler yerine manga yazar,3 eleman yoksa hata verir
         
         //methoda arraylist gönderme
         //class ımızda oluşturduğumuz (psvm üsünde) methodu çağırıyoz
         System.out.println("----");
         yazdır(arrayList);
    }
    
}
