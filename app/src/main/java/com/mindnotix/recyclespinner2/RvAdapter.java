package com.mindnotix.recyclespinner2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.List;

/**
 * Created by Thanvandh on 1/25/2017.
 */
public class RvAdapter extends RecyclerView.Adapter<RvAdapter.SpinnerViewHolder> {
    List<spinnerData> spinnerDataList;

    public RvAdapter(List<spinnerData> spinnerDataList) {
        this.spinnerDataList = spinnerDataList;
    }

    @Override
    public SpinnerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SpinnerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_spinner, parent, false));
    }

    @Override
    public void onBindViewHolder(SpinnerViewHolder holder, int position) {

        holder.spinner.setSelection(spinnerDataList.get(position).getSelectedPosition());

    }

    @Override
    public int getItemCount() {
        return spinnerDataList.size();
    }

    public class SpinnerViewHolder extends RecyclerView.ViewHolder {
        Spinner spinner;

        public SpinnerViewHolder(View itemView) {
            super(itemView);
            spinner = (Spinner) itemView.findViewById(R.id.spinner);
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    spinnerDataList.get(getAdapterPosition()).setSelectedPosition(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {

                }

            });
        }
    }
}
