package com.prinzlycoder.warpeopleandroidtrainingsession1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.prinzlycoder.warpeopleandroidtrainingsession1.Fragment1.Companion.TEXT1
import com.prinzlycoder.warpeopleandroidtrainingsession1.Fragment1.Companion.TEXT2
import com.prinzlycoder.warpeopleandroidtrainingsession1.Fragment1.Companion.TEXT3
import com.prinzlycoder.warpeopleandroidtrainingsession1.Fragment1.Companion.TEXT4
import kotlinx.android.synthetic.main.my_fragment_2.*

class Fragment2 : Fragment() {

    companion object {
        fun getInstance(args: Bundle): Fragment2 {
            val fragment = Fragment2()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.my_fragment_2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        arguments?.let {
            text1.text = it.getString(TEXT1)
            text2.text = it.getString(TEXT2)
            text3.text = it.getString(TEXT3)
            text4.text = it.getString(TEXT4)
        }

        closeBtn.setOnClickListener {
            activity?.finish()
        }
    }
}