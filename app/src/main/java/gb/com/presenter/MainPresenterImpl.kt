package gb.com.presenter

import gb.com.model.CountersModel
import gb.com.ui.MainView

class MainPresenterImpl(
    private val view: MainView
) : MainPresenter {
    private val model = CountersModel()

    override fun onCounterClick(id: Int) {
        val nextValue = model.next(id)
        view.setButtonText(id, nextValue.toString())
    }
}
