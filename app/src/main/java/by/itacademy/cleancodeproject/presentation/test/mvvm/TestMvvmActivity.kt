package by.itacademy.cleancodeproject.presentation.test.mvvm

import android.app.Activity
import android.os.Bundle
import by.itacademy.cleancodeproject.R
import kotlinx.android.synthetic.main.activity_test_mvp_mvvm.*

class TestMvvmActivity : Activity() {

    private lateinit var viewModel: TestMvvmViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvp_mvvm)
        viewModel = TestMvvmVewModelDefault()
        viewModel.setHelloTextListener(object : HelloTextListener {
            override fun onUpdate(value: String) {
                helloTextView.text = value
            }
        })

        helloTextView.setOnClickListener {
        }

    }

    override fun onRestart() {
        viewModel.reloadData()
        super.onRestart()
    }


}