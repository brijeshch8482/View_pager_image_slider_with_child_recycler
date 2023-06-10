package com.chaudhary.dev.viewpagerimagesliderwithchildrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ViewPagerSliderAdapter extends PagerAdapter {

    // creating variables for layout
    // inflater, context and array list.
    LayoutInflater layoutInflater;
    Context context;
    ArrayList<ViewPagerSliderModal> sliderModalArrayList;

    // creating constructor.
    public ViewPagerSliderAdapter (Context context, ArrayList<ViewPagerSliderModal> sliderModalArrayList) {
        this.context = context;
        this.sliderModalArrayList = sliderModalArrayList;
    }

    @Override
    public int getCount() {
        // inside get count method returning
        // the size of our array list.
        return sliderModalArrayList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        // inside isViewFromobject method we are
        // returning our Relative layout object.
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        // in this method we will initialize all our layout
        // items and inflate our layout file as well.
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        // below line is use to inflate the
        // layout file which we created.
        View view = layoutInflater.inflate(R.layout.view_pager_image, container, false);

        // initializing our views.
        ViewPagerZoomImageView imageView = view.findViewById(R.id.idIV);
        RelativeLayout sliderRL = view.findViewById(R.id.idRLSlider);

        // setting data to our views.
        ViewPagerSliderModal modal = sliderModalArrayList.get(position);

        Picasso.get().load(modal.getImgUrl()).into(imageView);

        // below line is to set background
        // drawable to our each item
        sliderRL.setBackground(context.getResources().getDrawable(modal.getBackgroundDrawable()));

        // after setting the data to our views we
        // are adding the view to our container.
        container.addView(view);

        // at last we are
        // returning the view.
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        // this is a destroy view method
        // which is use to remove a view.
        container.removeView((RelativeLayout) object);
    }


}
