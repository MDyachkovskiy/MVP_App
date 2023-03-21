package gb.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import gb.com.databinding.ActivityMainBinding
import gb.com.presenter.MainPresenter
import gb.com.ui.MainView

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

       val listener = View.OnClickListener {
           presenter.counterClick(it.id)
       }

        vb?.btnCounterOne?.setOnClickListener(listener)
        vb?.btnCounterTwo?.setOnClickListener(listener)
        vb?.btnCounterThree?.setOnClickListener(listener)

    }

    override fun setButtonText(index: Int, text: String) {
        when(index){
            0 -> vb?.btnCounterOne?.text = text
            1 -> vb?.btnCounterTwo?.text = text
            2 -> vb?.btnCounterThree?.text = text
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        vb = null
    }

}