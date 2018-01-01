package com.creative2.masterofcharades;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Praveen K on 12/27/2017.
 */

public class CharadeWordAdapter extends BaseAdapter {
    private Context mContext;

    public CharadeWordAdapter(Context c) {
        mContext = c;
    }
    @Override
    public int getCount() {
        return charadeWords.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.linearlayout_category, null);
        }
        final TextView charadeTextView = (TextView) convertView.findViewById(R.id.charade_text);
        charadeTextView.setText((String)getItem(i));
        return convertView;
    }

    private String[] charadeWords = {
            "Ek Tha Tiger", "Jab tak hai Jaan",
            "Lagan", "superman",
            "spiderman"

    };
}
