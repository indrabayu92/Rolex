package com.example.rolex;

import java.util.ArrayList;

class RolexData {
    private static String[][] data = new String[][]{
            {"Rolex ", "Air King", "https://www.intime.co.id/wp-content/uploads/m116900-0001-desktop.jpg","Rolex Air-King yang baru memberi penghormatan kepada para pelopor penerbangan dan peran Oyster dalam kisah epik penerbangan. Dengan case 40 mm dari Oystersteel, tali jam Oyster kaitan padat dengan Oysterclasp, dan dial hitam yang khas, Air-King yang baru berfungsi seperti juga sifatnya yang abadi. Diperbarui untuk pemakai yang modern tetapi juga mempertahankan estetika model tahun 1950-an, Oyster Perpetual Air-King yang baru mengekalkan warisan aeronautika dari Rolex Oyster yang asli."},
            {"Rolex", "Day-Date", "https://www.intime.co.id/wp-content/uploads/m228238-0042-desktop.jpg","Rolex Day-Date membuat debutnya pada tahun 1956. Hanya tersedia dalam emas 18 karat atau platinum, ini adalah jam tangan kronometer pertama yang menunjukkan tanggal dan hari dalam seminggu yang dieja lengkap di jendela di dial. Dengan tali jam President yang khusus diciptakan untuk jam jenis ini, jam tangan Day-Date menjadi jam tangan yang luar biasa bagi para invididu berpengaruh."},
            {"Rolex", "DateJust", "https://www.intime.co.id/wp-content/uploads/m126333-0010-desktop.jpg","Rolex Datejust klasik adalah arketipe jam tangan modern karena estetika dan fungsi yang melampaui batas perubahan dalam mode. Secara estetika, Datejust telah bertahan sepanjang era dan tetap mempertahankan kode abadi yang membuatnya menjadi salah satu yang paling terkenal dan mudah dikenali dari jam tangan."},
            {"Rolex", "Oyster Perpetual", "https://www.intime.co.id/wp-content/uploads/m114300-0004-desktop.jpg","Estetika model Rolex Oyster Perpetual memisahkannya sebagai simbol universal dan gaya klasik. Model-model ini memiliki bentuk dan fungsi abadi, yang secara kuat berakar dalam asal-usul perintisan Rolex. Kesederhanaan dari sesuatu yang asli."},
            {"Rolex", "Submariner", "https://www.intime.co.id/wp-content/uploads/m116613lb-0005-desktop.jpg","Desain kuat dan fungsional Rolex Submariner secara cepat menjadi ikonis. Dengan case Oyster yang didesain ulang, dial khas dengan penanda jam berpendar yang besar, bezel graduasi Cerachrom yang dapat diputar dan tali jam Oyster kaitan padat, generasi terakhir Submariner dan Submariner Date benar-benar sejalan dengan model pertama yang diluncurkan pada tahun 1953."},
            {"Rolex", "Explorer", "https://www.intime.co.id/wp-content/uploads/m216570-0001-desktop.jpg","Diluncurkan pada tahun 1953 sebagai jam tangan ekspedisi dan pendakian gunung yang pamungkas, Explorer memanfaatkan pengalaman beberapa dasawarsa dari Rolex di Himalaya. Explorer dirancang untuk keterbacaan optimal meski dalam gelap – fitur sangat penting bagi penjelajah. Rolex Explorer II, yang pertama kali diluncurkan pada tahun 1971, merupakan pewaris alami dari Rolex Explorer asli – tapi dengan karakter khususnya sendiri. Jam tangan yang kuat, sangat halus, Explorer II dengan cepat menjadi jam tangan pilihan speleolog, vulkanolog, dan penjelajah kutub serta hutan, karena fiturnya yang dirancang khusus."},
            {"Rolex", "Yacht-Master", "https://www.intime.co.id/wp-content/uploads/m226659-0002-desktop.jpg","Rolex Yacht-Master dan Yacht-Master II melambangkan semangat dari pelaut, memasangkan bahan-bahan terpilih untuk kinerja tinggi dengan estetikanya yang sempurna dengan teliti. Terinspirasi oleh warisan yang kaya yang telah mengikatkan Rolex pada dunia pelayaran sejak tahun 1950-an, Yacht-Master memadukan fungsi dan gaya, di mana Yacht-Master II membawa kesempurnaan dalam teknologi Rolex untuk menciptakan sebuah kronograf regatta yang dibuat untuk kejuaraan layar secara bersamaan."}
    };

    static ArrayList<Rolex> getListData(){
        Rolex rolex;
        ArrayList<Rolex> list = new ArrayList<>();
        for (String[] aData : data) {
            rolex = new Rolex();
            rolex.setName(aData[0]);
            rolex.setRemarks(aData[1]);
            rolex.setPhoto(aData[2]);
            rolex.setDescription(aData[3]);

            list.add(rolex);
        }

        return list;
    }
}