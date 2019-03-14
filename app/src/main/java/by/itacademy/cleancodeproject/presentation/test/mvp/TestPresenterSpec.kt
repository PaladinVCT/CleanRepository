package by.itacademy.cleancodeproject.presentation.test.mvp

class TestPresenterSpec(private val view: TestView) : TestPresenter {
    private val helloText: String

    init {
        helloText = "Another text"
    }

    override fun onHelloClick() {
    }

    override fun onReloadData() {
        view.showHellotext(helloText)
    }
}