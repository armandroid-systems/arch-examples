package com.globant.earthmonitor.utils;

import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.globant.earthmonitor.R;
import com.globant.earthmonitor.interfaces.IOnClickElement;

/**
 * Created by zadtankus on 11/02/16.
 */
public class SummaryVh extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView date;
    public TextView place;
    public TextView magnitude;
    public TextView link;
    private IOnClickElement iOnClickElement;


    public SummaryVh(View itemView, IOnClickElement ioce) {
        super(itemView);
        this.iOnClickElement = ioce;
        date = (TextView) itemView.findViewById(R.id.textViewDate);
        place = (TextView) itemView.findViewById(R.id.textViewPlace);
        magnitude = (TextView) itemView.findViewById(R.id.textViewMagnitude);
        link = (TextView) itemView.findViewById(R.id.textViewMore);

        link.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        iOnClickElement.performActionClick(getAdapterPosition());
    }
}
