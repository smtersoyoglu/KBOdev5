package com.sametersoyoglu.kbodev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sametersoyoglu.kbodev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonTemizle.setOnClickListener {
            binding.textViewGirdi.text = ""
            binding.textViewSonuc.text = ""
        }

        binding.button0.setOnClickListener { girdiTextSayiEkle("0")
        }
        binding.button1.setOnClickListener { girdiTextSayiEkle("1")
        }
        binding.button2.setOnClickListener { girdiTextSayiEkle("2")
        }
        binding.button3.setOnClickListener { girdiTextSayiEkle("3")
        }
        binding.button4.setOnClickListener { girdiTextSayiEkle("4")
        }
        binding.button5.setOnClickListener { girdiTextSayiEkle("5")
        }
        binding.button6.setOnClickListener { girdiTextSayiEkle("6")
        }
        binding.button7.setOnClickListener { girdiTextSayiEkle("7")
        }
        binding.button8.setOnClickListener { girdiTextSayiEkle("8")
        }
        binding.button9.setOnClickListener { girdiTextSayiEkle("9")
        }
        binding.buttonTopla.setOnClickListener { girdiTextSayiEkle("+")
        }

        binding.buttonSonuc.setOnClickListener {
            val girdi = binding.textViewGirdi.text.toString()
            //Bu kod, "+" işaretiyle ayrılmış girdiyi böler (split) ve bu bölünmüş parçaları bir diziye dönüştürür. Daha sonra, her parçayı tüm boşlukları temizleyerek (trim) sayıya dönüştürür. Eğer dönüşüm başarısız olursa (toIntOrNull), o parçayı 0 olarak kabul eder. Sonuç olarak, sayıları içeren bir liste elde edilir.
            val sayilar = girdi.split("+").map{ it.trim().toIntOrNull() ?: 0 }
            val toplam = sayilar.sum()
            binding.textViewSonuc.text = "Sonuç: $toplam"
        }
    }

    private fun girdiTextSayiEkle(buttonDeger: String) {
        val deger = binding.textViewGirdi.text.toString()
        binding.textViewGirdi.text = "${deger}$buttonDeger"
    }


}