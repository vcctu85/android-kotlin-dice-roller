package android.example.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val DICE_SIDE_NUMBER = 6
        const val DRAWABLE = "drawable"
        const val DICE_NAME = "ic_dice"
    }

    private val random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt = random.nextInt(DICE_SIDE_NUMBER) + 1
        val imgName = DICE_NAME + "$randomInt"

        val identifier = resources.getIdentifier(imgName, DRAWABLE, packageName)
        imageView.setImageResource(identifier)
    }
}
