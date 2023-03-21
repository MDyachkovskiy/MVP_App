package gb.com.presenter

import gb.com.R
import gb.com.model.CountersModel
import gb.com.ui.MainView

class MainPresenter(
    val view: MainView
) {
    val model = CountersModel()

    fun counterClick(id: Int){
        when(id){
            R.id.btn_counter_one -> {
                val nextValue = model.next(0)
                view.setButtonText(0, nextValue.toString())
            }
            R.id.btn_counter_two -> {
                val nextValue = model.next(1)
                view.setButtonText(1, nextValue.toString())
            }
            R.id.btn_counter_three -> {
                val nextValue = model.next(2)
                view.setButtonText(2, nextValue.toString())
            }
        }
    }
}