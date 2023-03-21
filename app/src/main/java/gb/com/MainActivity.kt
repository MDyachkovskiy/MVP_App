package gb.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import gb.com.databinding.ActivityMainBinding
import gb.com.presenter.MainPresenterImpl
import gb.com.ui.MainView

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    private val presenter = MainPresenterImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        vb?.btnCounterOne?.setOnClickListener{
            presenter.onCounterClick(0)
        }
        vb?.btnCounterTwo?.setOnClickListener {
            presenter.onCounterClick(1)
        }
        vb?.btnCounterThree?.setOnClickListener {
            presenter.onCounterClick(2)
        }
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