package android.example.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val DICE_SIDE_NUMBER = 6
        const val DICE_RESOURCE_TYPE = "drawable"
        const val ICON_PREFIX = "ic_dice"
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
        val imgName = "$ICON_PREFIX$randomInt"

        val identifier = resources.getIdentifier(imgName, DICE_RESOURCE_TYPE, packageName)
        imageView.setImageResource(identifier)
    }
}
