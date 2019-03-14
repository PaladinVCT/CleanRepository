package by.itacademy.cleancodeproject.presentation.test.mvp

class TestPresenterDefault(private val view: TestView) : TestPresenter {
    private val helloText: String

    init {
        helloText = "Hello"
    }

    override fun onHelloClick() {
    }

    override fun onReloadData() {
        view.showHellotext(helloText)
    }
}