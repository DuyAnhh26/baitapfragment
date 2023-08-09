package duy.anh.fragmentex.frg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import duy.anh.fragmentex.R

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentContainer: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentContainer = findViewById(R.id.fragmentContainer)

        if (savedInstanceState == null) {
            val fragmentA = FragmentA()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, fragmentA)
                .commit()
        }
    }
}