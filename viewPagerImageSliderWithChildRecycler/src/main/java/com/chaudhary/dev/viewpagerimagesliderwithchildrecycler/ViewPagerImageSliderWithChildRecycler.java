package com.chaudhary.dev.viewpagerimagesliderwithchildrecycler;

import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class ViewPagerImageSliderWithChildRecycler {


    public static void viewPagerSliderAdapter(Context context, ArrayList<ViewPagerSliderModal> viewPagerSliderModalArrayList, ViewPager viewPager){
        ViewPagerSliderAdapter viewPagerSliderAdapter = new ViewPagerSliderAdapter (context, viewPagerSliderModalArrayList);
        viewPager.setAdapter (viewPagerSliderAdapter);
    }


    public static void smallImageRecyclerAdapter(Context context, ArrayList<ViewPagerSliderModal> viewPagerSliderModalArrayList, ViewPager viewPager, RecyclerView smallImageRecyclerView, LinearLayoutManager linearLayoutManager, int backgroundNonSelected, int backgroundSelected ){
      SmallImageRecyclerAdapter  smallImageRecyclerAdapter = new SmallImageRecyclerAdapter (context,viewPagerSliderModalArrayList, viewPager,smallImageRecyclerView, backgroundNonSelected, backgroundSelected);
      smallImageRecyclerView.setLayoutManager (linearLayoutManager);
      smallImageRecyclerView.setAdapter (smallImageRecyclerAdapter);
    }
}
