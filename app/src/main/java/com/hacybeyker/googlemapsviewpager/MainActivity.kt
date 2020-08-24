package com.hacybeyker.googlemapsviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hacybeyker.googlemapsviewpager.entity.Clinic

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    private fun fetchClinics(): List<Clinic> {
        return arrayListOf(
            Clinic(1, "Clinic A", "Description A", -12.086734, -77.034187),
            Clinic(2, "Clinic B", "Description B", -12.085842, -77.035862),
            Clinic(3, "Clinic C", "Description C", -12.086572, -77.033334),
            Clinic(4, "Clinic D", "Description D", -12.087602, -77.038226),
            Clinic(5, "Clinic E", "Description E", -12.096315, -77.033757),
        )
    }
}