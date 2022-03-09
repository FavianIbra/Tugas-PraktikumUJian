/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.praktikumujian;

/**
 *
 * @author ACER
 */
public class Vaksin extends Masyarakat {
    public String namaDesa,uu;
    public int np;
    public int sv,bv;
    //overriding
    public void AgendaVaksin(){
        System.out.println("Nama Desa "+ namaDesa);
        System.out.println("Vaksin untuk usia 12-30 "+uu);
        System.out.println("Nomor puskesmas "+np);
    }
       public void AcaraVaksin(){
           System.out.println("Penduduk "+super.masyarakat);
       }
       //overloading
       public int Vaksin(int MasyarakatSudahVaksin){
           this.sv=MasyarakatSudahVaksin;
           return sv;
          
           
       }
        public void Vaksin(double MasyarakatBelumVaksin){
        System.out.println("Belum Vaksin : "+MasyarakatBelumVaksin);
        }
}



