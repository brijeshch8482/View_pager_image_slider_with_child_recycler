package com.chaudhary.dev.view_pager_image_slider_with_child_recycler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.chaudhary.dev.viewpagerimagesliderwithchildrecycler.ViewPagerImageSliderWithChildRecycler;
import com.chaudhary.dev.viewpagerimagesliderwithchildrecycler.ViewPagerSliderModal;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    RecyclerView recycler;
    private ArrayList<ViewPagerSliderModal> viewPagerSliderModalsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//       initializing all our views.
        viewPager = findViewById(R.id.idViewPager);
        recycler = findViewById(R.id.recycler);

//        // in below line we are creating a new array list.

        viewPagerSliderModalsArrayList = new ArrayList<> ();

        viewPagerSliderModalsArrayList.add(new ViewPagerSliderModal ("https://images.unsplash.com/photo-1610842546881-b282c580b51d?ixid=MXwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw5fHx8ZW58MHx8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60", R.drawable.gradient_one));
        viewPagerSliderModalsArrayList.add(new ViewPagerSliderModal("https://images.unsplash.com/photo-1610783131813-475d08664ef6?ixid=MXwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwxMnx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60", R.drawable.gradient_one));
        viewPagerSliderModalsArrayList.add(new ViewPagerSliderModal("https://images.unsplash.com/photo-1610832958506-aa56368176cf?ixid=MXwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwxN3x8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60", R.drawable.gradient_one));
        viewPagerSliderModalsArrayList.add(new ViewPagerSliderModal("https://images.unsplash.com/photo-1682685795463-0674c065f315?ixlib=rb-4.0.3&ixid=M3wxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHw1MXx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", R.drawable.gradient_one));
        viewPagerSliderModalsArrayList.add(new ViewPagerSliderModal("https://images.unsplash.com/photo-1682685796002-e05458d61f07?ixlib=rb-4.0.3&ixid=M3wxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHwyMXx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", R.drawable.gradient_one));
        viewPagerSliderModalsArrayList.add(new ViewPagerSliderModal("https://images.unsplash.com/photo-1684020273098-95959b732b42?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwzM3x8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", R.drawable.gradient_one));
        viewPagerSliderModalsArrayList.add(new ViewPagerSliderModal("https://images.unsplash.com/photo-1683009426501-028aabdd7b8a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHwzNnx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", R.drawable.gradient_one));
        viewPagerSliderModalsArrayList.add(new ViewPagerSliderModal("https://images.unsplash.com/photo-1682685795463-0674c065f315?ixlib=rb-4.0.3&ixid=M3wxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHw1MXx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", R.drawable.gradient_one));


        ViewPagerImageSliderWithChildRecycler.viewPagerSliderAdapter (MainActivity.this, viewPagerSliderModalsArrayList,viewPager);


        LinearLayoutManager linearLayoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        ViewPagerImageSliderWithChildRecycler.smallImageRecyclerAdapter (MainActivity.this,viewPagerSliderModalsArrayList,viewPager,recycler,linearLayoutManager, com.chaudhary.dev.viewpagerimagesliderwithchildrecycler.R.drawable.background_non_selected, com.chaudhary.dev.viewpagerimagesliderwithchildrecycler.R.drawable.background_selected);


    }


}