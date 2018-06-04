package android.example.com

import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById(R.id.button) as Button
        button.setOnClickListener {
            //find imageView
            val image: ImageView = findViewById(R.id.imageView)
            randomGenerator(image)
        }
    }

    fun randomGenerator(image: ImageView) {
        val random = Random()
        val randomInt: Int = random.nextInt(6) + 1
        val img_name: String = "ic_dice" + randomInt

        val resources: Resources = getResources()
        val identifier: Int = resources.getIdentifier(img_name, "drawable", getPackageName())
        image.setImageResource(identifier)
    }
}
