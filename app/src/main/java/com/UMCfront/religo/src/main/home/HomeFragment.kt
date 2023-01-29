package com.UMCfront.religo.src.main.home

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

import androidx.viewpager2.widget.ViewPager2
import com.UMCfront.religo.R
import com.UMCfront.religo.src.main.MainActivity
import com.UMCfront.religo.src.main.home.adapter.PagerFragmentStateAdapter


class HomeFragment : Fragment() {



    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val adapter = PagerFragmentStateAdapter(this)
        val fragments = listOf<Fragment>(HomeFirstFragment(),HomeSecondFragment())
        adapter.fragments.addAll(fragments)


        val view=inflater.inflate(R.layout.fragment_home, container, false)



        val churchviewPager2 = view.findViewById<ViewPager2>(R.id.home_churchrecommend_viewpager)
        val eventviewPager2 = view.findViewById<ViewPager2>(R.id.home_event_allRV)

        //
        //viewpager 오류 발생 -> 생명 주기 확인하기//
        //

        churchviewPager2.adapter = adapter
        churchviewPager2.setSaveEnabled(false);
        // Inflate the layout for this fragment
        return view

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }
}