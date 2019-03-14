package by.itacademy.cleancodeproject.presentation.test.mvvm

class TestMvvmVewModelDefault :TestMvvmViewModel {

    private var helloText:String = ""
private var listener:HelloTextListener?=null

    override fun setHelloTextListener(listener: HelloTextListener) {
this.listener = listener
    }

    override fun reloadData() {
        helloText = "Hello from mvvm"
        listener?.onUpdate(helloText)
    }

    override fun helloClick() {
    }
}