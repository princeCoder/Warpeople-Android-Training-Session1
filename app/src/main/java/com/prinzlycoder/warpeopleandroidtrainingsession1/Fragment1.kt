package com.prinzlycoder.warpeopleandroidtrainingsession1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.my_fragment_1.*

class Fragment1 : Fragment() {

    companion object {
        fun getInstance(): Fragment1 {
            val fragment = Fragment1()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }

        const val TEXT1 = "Text1"
        const val TEXT2 = "Text2"
        const val TEXT3 = "Text3"
        const val TEXT4 = "Text4"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.my_fragment_1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        nextBtn.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(TEXT1, editText1.text.toString())
            bundle.putString(TEXT2, editText2.text.toString())
            bundle.putString(TEXT3, editText3.text.toString())
            bundle.putString(TEXT4, editText4.text.toString())

            val fragment2 = Fragment2.getInstance(bundle)
            activity?.let {
                (it as MyFragmentActivity).addSubView(fragment2)
            }
        }
    }
}