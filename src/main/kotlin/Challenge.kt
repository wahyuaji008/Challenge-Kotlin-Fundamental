import java.awt.SystemColor.menu
import java.util.Scanner
import kotlin.math.ceil

public var input = Scanner(System.`in`)

fun main (){
    //membuat object scanner
    val input = Scanner(System. `in`)

    //menginputkan identitas
    println("Masukkan identitas anda")
    print("Nama : ")
    val nama : String? = input.nextLine()
    if(nama.isNullOrEmpty()){
        println("Wajib diisi!")
        main()
    }
    print("Kelas : ")
    val kelas : String? = input.nextLine()
    if(kelas.isNullOrEmpty()){
        println("Wajib diisi!")
        main()
    }
    print("Absen : ")
    val absen : String? = input.nextLine()
    if(absen.isNullOrEmpty()){
        println("Wajib diisi!")
        main()
    }
    println("   ")
    println("MENGHITUNG BANGUN RUANG")
    println("1. Volume Kerucut")
    println("2. Volume Tabung")
    println("3. Volume Balok")
    println("4. Volume Kubus")
    print("Masukkan menu pilihan : ")
    val menu = readLine()

    when (menu) {
        "1"-> {
            println("Volume kerucut")
            println("Masukkan tinggi kerucut : ")
            val t1 : Double = input.nextDouble()
            println("Masukkan jari jari alas : ")
            val r1 : Double = input.nextDouble()
            val volkerucut : Double = Math.PI*1/3*r1*r1*t1;

            println("Volume kerucut adalah : $volkerucut")
            val volumeBulatkan = ceil(volkerucut)
            println( String.format("%.2f", volkerucut ) + "\n volume kerucut setelah dibulatkan $volumeBulatkan")

            print("kembali ke menu? [Y/N] : ")
            val next2 = readLine()
            if(next2=="Y" || next2=="y"){
                main()
            }
            else {
                print("Tekan enter untuk keluar")
            }
        }
        "2"-> {
            println("Volume tabung")
            println("Masukkan tinggi tabung : ")
            val t1 : Double = input.nextDouble()
            println("Masukkan jari jari alas : ")
            val r1 : Double = input.nextDouble()
            val voltabung : Double = 2*Math.PI*r1*r1*t1;

            println("Volume tabung adalah : $voltabung")
            val volumeBulatkan = ceil(voltabung)
            println( String.format("%.2f", voltabung ) + "\n volume tabung setelah dibulatkan $volumeBulatkan")

            print("kembali ke menu? [Y/N] : ")
            val next2 = readLine()
            if(next2=="Y" || next2=="y"){
                main()
            }
            else {
                print("Tekan enter untuk keluar")
            }
        }
        "3"-> {
            println("Volume balok")
            println("Masukkan panjang : ")
            val p : Double = input.nextDouble()
            println("Masukkan tinggi : ")
            val t : Double = input.nextDouble()
            println("Masukkan lebar : ")
            val l : Double = input.nextDouble()
            val volbalok : Double = p*l*t;

            println("Volume balok adalah : $volbalok")
            val volumeBulatkan = ceil(volbalok)
            println( String.format("%.2f", volbalok ) + "\n volume balok setelah dibulatkan $volumeBulatkan")

            print("kembali ke menu? [Y/N] : ")
            val next2 = readLine()
            if(next2=="Y" || next2=="y"){
                main()
            }
            else {
                print("Tekan enter untuk keluar")
            }
        }
        "4"-> {
            println("Volume kubus")
            println("Masukkan sisi : ")
            val s : Double = input.nextDouble()
            val volkubus : Double = s*s*s;

            println("Volume kubus adalah : $volkubus")
            val volumeBulatkan = ceil(volkubus)
            println( String.format("%.2f", volkubus ) + "\n volume kubus setelah dibulatkan $volumeBulatkan")

            print("kembali ke menu? [Y/N] : ")
            val next2 = readLine()
            if(next2=="Y" || next2=="y"){
                main()
            }
            else {
                print("Tekan enter untuk keluar")
            }
        }
        else -> {
            println("Pilihan tidak tersedia")
        }

    }
}