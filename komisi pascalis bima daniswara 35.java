import java.util.*;

 // pascalis bima daniswara 

 class komisi_pascalis_bima_daniswara_35
 {
   public static void main(String args[]){ 
     double PJ, a, b, c; 
    Scanner input = new Scanner (System.in);
    System.out.print(" masukkan pendapatan penjualan anda : ");
    PJ = input.nextInt();
    
    if(PJ<=2000000){
      a = 100000 + 0.10*PJ;
      System.out.println("pendapatan anda adalah : Rp. " +a);
      
    }else if (PJ >2000000 && PJ<5000000){
      b = 200000 + 0.15* PJ;
      System.out.println("Pendapatan anda adalah : Rp. " +b);
        
   }else{
     c = 300000 + 0.20* PJ;
     System.out.println("pendapatan anda adalah : Rp."+c);
   
 }
}
}