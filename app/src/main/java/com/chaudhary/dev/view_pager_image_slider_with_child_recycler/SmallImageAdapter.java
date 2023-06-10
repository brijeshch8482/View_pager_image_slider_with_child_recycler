package com.chaudhary.dev.view_pager_image_slider_with_child_recycler;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SmallImageAdapter extends RecyclerView.Adapter<SmallImageAdapter.MyHolder> {

    ViewPager viewPager;
    RecyclerView recyclerView;

    Context context;
    ArrayList<SliderModal> sliderModalArrayList;
    boolean pos = true;
    int posvalue = 0;

    public SmallImageAdapter (Context context, ArrayList<SliderModal> sliderModalArrayList, ViewPager viewPager, RecyclerView recyclerView) {
        this.context = context;
        this.sliderModalArrayList = sliderModalArrayList;
        this.viewPager = viewPager;
        this.recyclerView = recyclerView;

    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (parent.getContext ()).inflate (R.layout.small_image, parent, false);
        return new MyHolder (view);
    }

    @Override
    public void onBindViewHolder (@NonNull MyHolder holder, @SuppressLint("RecyclerView") int position) {

        SliderModal sliderModal = sliderModalArrayList.get (position);


        Picasso.get ().load (sliderModal.getImgUrl ()).into (holder.smallImage);
        holder.linear.setBackgroundTintList (ContextCompat.getColorStateList (context, R.color.red));

        viewPager.addOnPageChangeListener(viewListener);

        if( pos && posvalue == 0){

            holder.linear.setBackgroundTintList (ContextCompat.getColorStateList (context, R.color.teal_200));
            pos = false;
        }else if(!pos && posvalue == position){

            holder.linear.setBackgroundTintList (ContextCompat.getColorStateList (context, R.color.teal_200));

        }else {
            holder.linear.setBackgroundTintList (ContextCompat.getColorStateList (context, R.color.red));
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

            MyHolder holderCurrent = (MyHolder) recyclerView.findViewHolderForAdapterPosition(position);
//            int lastPosition = position - 1;
//            int nextPosition = position + 1;
//            MyHolder holderLast = (MyHolder) recyclerView.findViewHolderForAdapterPosition (lastPosition);
//            MyHolder holderNext = (MyHolder) recyclerView.findViewHolderForAdapterPosition (nextPosition);

//            Toast.makeText (context, "actual position "+sliderModalArrayList.size (), Toast.LENGTH_SHORT).show ();

            posvalue = position;

            if(position == 0){
                pos = true;
            }else {
                pos = false;
            }

            if(holderCurrent != null) {
                holderCurrent.linear.setBackgroundTintList (ContextCompat.getColorStateList (context, R.color.teal_200));
            }

//            if(lastPosition != -1 && holderLast != null) {
//
//                holderLast.linear.setBackgroundTintList (ContextCompat.getColorStateList (context, R.color.red));
//
//            }
//
//            if(nextPosition < sliderModalArrayList.size () && holderNext != null){
//
//                holderNext.linear.setBackgroundTintList (ContextCompat.getColorStateList (context, R.color.red));
//
//            }

//            Toast.makeText (context, "position "+position, Toast.LENGTH_SHORT).show ();
            notifyItemChanged (position);
            notifyDataSetChanged ();
            recyclerView.smoothScrollToPosition (position);



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
