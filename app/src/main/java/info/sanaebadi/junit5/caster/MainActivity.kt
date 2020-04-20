package info.sanaebadi.junit5.caster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.sanaebadi.junit5.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
