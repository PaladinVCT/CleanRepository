package by.itacademy.cleancodeproject.presentation.test.mvp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import by.itacademy.cleancodeproject.R
import kotlinx.android.synthetic.main.activity_test_mvp_mvvm.*

class TestMvpActivity : Activity(), TestView {
    lateinit var presenter: TestPresenter

    private val abc: String? = null

    private var text: Int = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvp_mvvm)

        if (true) {
            presenter = TestPresenterDefault(this)
        } else
            presenter = TestPresenterSpec(this)

        val text = findViewById<TextView>(R.id.helloTextView)
        presenter = TestPresenterDefault(view = this)

        helloTextView.setOnClickListener {
            presenter.onHelloClick()
        }
    }

    override fun showHellotext(value: String) {
        helloTextView.text = value
    }
}