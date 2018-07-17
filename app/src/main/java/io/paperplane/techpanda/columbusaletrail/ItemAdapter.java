package io.paperplane.techpanda.columbusaletrail;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.BreweryHolder> {
    private LayoutInflater layoutInflater;
    private ArrayList<Item> BreweryDatabase;


    // Create method of performing recycler
    public ItemAdapter(Context context, ArrayList<Item> BreweryDatabase) {
        this.layoutInflater = LayoutInflater.from(context);
        this.BreweryDatabase = BreweryDatabase;
    }

    @NonNull
    @Override
    public BreweryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new BreweryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BreweryHolder holder, int position) {
        final Item currentBrewery = BreweryDatabase.get(position);

        // Assigning the values of my Arraylist variables from Item class
        holder.mName.setText(currentBrewery.getName());
        holder.mAddress.setText(currentBrewery.getAddress());
        holder.mWebsite.setText(currentBrewery.getWebsite());
        holder.mLogoId.setImageResource(currentBrewery.getLogoId());

        //On Click Listener for active brewery details page
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent breweryDetailsIntent = new Intent(view.getContext(), BreweryDetailActivity.class);

                //Add details about the breweries here to be sent to BreweryDetailActivity
                breweryDetailsIntent.putExtra("brewery_name", currentBrewery.getName());
                breweryDetailsIntent.putExtra("brewery_address", currentBrewery.getAddress());
                breweryDetailsIntent.putExtra("brewery_website", currentBrewery.getWebsite());
                breweryDetailsIntent.putExtra("brewery_logo", currentBrewery.getLogoId());
                view.getContext().startActivity(breweryDetailsIntent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return BreweryDatabase.size();
    }

    class BreweryHolder extends RecyclerView.ViewHolder {
        private TextView mName;
        private TextView mAddress;
        private TextView mWebsite;
        private ImageView mLogoId;

        private BreweryHolder(View breweryView) {
            super(breweryView);

            mName = breweryView.findViewById(R.id.brewery_name);
            mAddress = breweryView.findViewById(R.id.brewery_address);
            mWebsite = breweryView.findViewById(R.id.brewery_website);
            mLogoId = breweryView.findViewById(R.id.brewery_logo);

        }
    }
}
