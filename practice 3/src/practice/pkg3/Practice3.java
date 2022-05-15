
package practice.pkg3;

import javax.swing.JOptionPane;

public class Practice3 {

    public static void main(String[] args) {
        String Name = JOptionPane.showInputDialog("masukan nama anda :");
        String Umur = JOptionPane.showInputDialog("masukan umur anda :");
            int umur= Integer.parseInt(Umur);
        String berat = JOptionPane.showInputDialog("masukan Berat badan anda :");
            double Berat = Double.parseDouble(berat);
            Berat = Berat * 2;
            umur = umur + 3;
        String cita = JOptionPane.showInputDialog("masukan cita-cita anda :");
        String Hobi = JOptionPane.showInputDialog("masukan hobi anda :");
        String pendidikan = JOptionPane.showInputDialog("masukan pendidikan anda :");
        String makan  = JOptionPane.showInputDialog("masukan makanan favorit anda :");
        String jurusan = JOptionPane.showInputDialog("masukan jurusan anda :");
        String ayah = JOptionPane.showInputDialog("masukan ayah anda :");
        String ibu = JOptionPane.showInputDialog("masukan ibu anda :");

        System.out.println("hallo teman saya, " +Name+" tiga tahun lagi kamu sudah berumur " +umur+ 
        " jika tidak berolahraga rutin,maka berat badan kamu bisa naik sampai " + Berat+  " Kg. Jadi Rajinlah berolahraga dan kurangi makan" +makan);
        System.out.println(" kamu adalah kebanggan dari Pak "+ayah+ " dengan Bu " + ibu + " kamu memiliki hobi "+ Hobi+ " sehingga kamu berpendidikn terakhir "+pendidikan+
 " dengan mengambil jurusan " +jurusan+ " sehingga kamu dapat menggapai cita cita kamu yaitu " +cita);
    }

    
}
