package com.chaudhary.dev.viewpagerimagesliderwithchildrecycler;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SmallImageRecyclerAdapter extends RecyclerView.Adapter<SmallImageRecyclerAdapter.MyHolder> {

    ViewPager viewPager;
    RecyclerView smallImageRecyclerView;

    Context context;
    ArrayList<ViewPagerSliderModal> sliderModalArrayList;
    int backgroundNonSelected, backgroundSelected;
    boolean pos = true;
    int posvalue = 0;

    public SmallImageRecyclerAdapter (Context context, ArrayList<ViewPagerSliderModal> sliderModalArrayList, ViewPager viewPager, RecyclerView smallImageRecyclerView, int backgroundNonSelected, int backgroundSelected) {
        this.context = context;
        this.sliderModalArrayList = sliderModalArrayList;
        this.viewPager = viewPager;
        this.smallImageRecyclerView = smallImageRecyclerView;
        this.backgroundNonSelected = backgroundNonSelected;
        this.backgroundSelected = backgroundSelected;

    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (parent.getContext ()).inflate (R.layout.small_image, parent, false);
        return new MyHolder (view);
    }

    @Override
    public void onBindViewHolder (@NonNull MyHolder holder, @SuppressLint("RecyclerView") int position) {

        ViewPagerSliderModal viewPagerSliderModal = sliderModalArrayList.get (position);


        Picasso.get ().load (viewPagerSliderModal.getImgUrl ()).into (holder.smallImage);
        holder.linear.setBackgroundResource (backgroundNonSelected);

        viewPager.addOnPageChangeListener(viewListener);

        if( pos && posvalue == 0){

            holder.linear.setBackgroundResource (backgroundSelected);
            pos = false;
        }else if(!pos && posvalue == position){

            holder.linear.setBackgroundResource (backgroundSelected);

        }else {
            holder.linear.setBackgroundResource (backgroundNonSelected);
        }

        holder.itemView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {

                viewPager.setCurrentItem (position, true);

            }
        });


    }


    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener () {
        @Override
        public void onPageScrolled (int position, float positionOffset, int positionOffsetPixels) {

        }

        @SuppressLint("NotifyDataSetChanged")
        @Override
        public void onPageSelected (int position) {

            MyHolder holderCurrent = (MyHolder) smallImageRecyclerView.findViewHolderForAdapterPosition(position);

            posvalue = position;

            if(position == 0){
                pos = true;
            }else {
                pos = false;
            }

            if(holderCurrent != null) {
                holderCurrent.linear.setBackgroundResource (backgroundSelected);
            }

            notifyItemChanged (position);
            notifyDataSetChanged ();
            smallImageRecyclerView.smoothScrollToPosition (position);



        }

        @Override
        public void onPageScrollStateChanged (int state) {

        }
    };

    @Override
    public int getItemCount () {
        return sliderModalArrayList.size ();
    }


    public static class MyHolder extends RecyclerView.ViewHolder {

        ImageView smallImage;
        LinearLayout linear;
        public MyHolder (@NonNull View itemView) {
            super (itemView);
            smallImage = itemView.findViewById (R.id.imageView);
            linear = itemView.findViewById (R.id.linear);
        }
    }

}
