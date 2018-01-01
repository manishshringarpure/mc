package com.creative2.masterofcharades;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Praveen on 12/26/2017.
 */

public class MainGridImageAdapter extends BaseAdapter {
    private Context mContext;

    public MainGridImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return categoriesImage.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        //ImageView imageView;

        //final Book book = books[position];


        // 2
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.linearlayout_category, null);
        }

        // 3
        final ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview_cover_art);
        final TextView nameTextView = (TextView) convertView.findViewById(R.id.textview_book_name);
       // final TextView authorTextView = (TextView) convertView.findViewById(R.id.textview_book_author);
        //final ImageView imageViewFavorite = (ImageView) convertView.findViewById(R.id.imageview_favorite);

        // 4
        imageView.setImageResource(R.drawable.sample_0);
        nameTextView.setText("Movies");
       // authorTextView.setText(mContext.getString(book.getAuthor()));

        return convertView;
    }

       /* if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
           // imageView.setLayoutParams(new GridView.LayoutParams(85, 125));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
           // imageView.setPadding(8, 105, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7

    };*/

        private Integer[] categoriesImage = {
                R.drawable.sample_0, R.drawable.sample_1,
                R.drawable.sample_2, R.drawable.sample_3,
                R.drawable.sample_4

        };
}
