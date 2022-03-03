package com.example.recyclerview_22_starry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.gintoki,
                "Gintoki Sakata",
                "Gintoki Sakata (坂田 , Sakata Gintoki) adalah " +
                        "\nprotagonis utama dari seri Gintama." +
                        "\nDia adalah pendiri dan presiden Yorozuya , serta seorang" +
                        "\nsamurai yang sangat terampil, yang pernah bertempur dalam Perang Joui di masa lalu." +
                        "\nSelama perang, ia dikenal sebagai Shiroyasha (secara harfiah berarti " +
                        "\n\"Yaksha Putih\", sejenis setan dalam agama Buddha dan Hindu) karena ilmu pedang yang kuat, penampilan setan," +
                        "\npakaian putih, dan rambut perak."
            ),
            Superhero(
                R.drawable.lawliet,
                "L Lawliet",
                "L Lawliet, juga disebut sebagai Ryūzaki," +
                        "\nadalah antagonis utama heroik dari serial" +
                        "\nanime dan manga Death Note, berperan" +
                        "\nsebagai antagonis utama dari paruh pertama seri dan antagonis menyeluruh anumerta" +
                        "\ndari babak kedua. Dia juga merupakan protagonis" +
                        "\ntituler dari film L: Change the World. Dianggap" +
                        "\nsebagai detektif terhebat di dunia, dia adalah pria penuh teka-teki yang menghabiskan seri" +
                        "\nmencoba menangkap main hakim sendiri/pembunuh massal Kira," +
                        "\nyang tidak lain adalah protagonis jahat Light Yagami."
            ),
            Superhero(
                R.drawable.yagami,
                "Light Yagami",
                "Light Yagami (夜神月, Yagami Raito)" +
                        "\nadalah protagonis utama dari seri Death Note." +
                        "\nSetelah menemukan Death Note," +
                        "\nia memutuskan untuk menggunakannya untuk membersihkan dunia dari penjahat." +
                        "\nPembunuhannya akhirnya dicap oleh orang-orang yang tinggal di Jepang sebagai karya \" Kira.\""
            ),
            Superhero(
                R.drawable.tomie,
                "Tomie Kawakami",
                "Tomie Kawakami (川上 , Kawakami Tomie ) " +
                        "\nadalah karakter antagonis dan tituler utama " +
                        "\ndalam serial manga dengan nama yang sama. Dia " +
                        "\nmemiliki kemampuan untuk meregenerasi dirinya menjadi beberapa klon, yang merupakan tema " +
                        "\nberulang dalam cerita yang menampilkan Tomie.",
            ),
            Superhero(
                R.drawable.shouichi,
                "Souichi Tsujii",
                "Souichi Tsujii adalah karakter utama dari" +
                        "\nbanyak cerita pendek di Manga Koleksi Junji Ito," +
                        "\ndan ditampilkan dalam anime Koleksi Junji Ito yang baru. Dia biasanya terlihat" +
                        "\nmenggigit paku besi/baja di mulutnya karena kekurangan zat besi di tubuhnya." +
                        "\nSeperti banyak karakter antagonis Junji Ito, Souichi dikenal karena" +
                        "\nskemanya, meskipun banyak dari mereka menjadi bumerang dengan cara komedi dan" +
                        "\nironis.",
            ),
            Superhero(
                R.drawable.zoro,
                "Roronoa Zoro",
                "Roronoa Zoro, juga dikenal sebagai" +
                        "\n\"Pirate Hunter\" Zoro, adalah" +
                        "\npetarung Bajak Laut Topi Jerami, dan salah" +
                        "\nsatu dari dua pendekar pedang mereka." +
                        "\nSebelumnya seorang pemburu hadiah, dia" +
                        "\nadalah anggota kedua dari kru Luffy dan yang" +
                        "\npertama bergabung, melakukannya di Arc" +
                        "\nRomance Dawn.",
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter( this, superheroList){
            val intent = Intent( this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }

}