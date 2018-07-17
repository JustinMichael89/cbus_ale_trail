package io.paperplane.techpanda.columbusaletrail;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BrewersRowFragment extends Fragment {

    public ArrayList<Item> BreweryDatabase = new ArrayList<>();
    RecyclerView recyclerView;

    private Context mcontext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public BrewersRowFragment() {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mcontext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.list, container, false);

        BreweryDatabase.add(new Item(getString(R.string.north_brewing), getString(R.string.north_address),
                getString(R.string.north_website), R.drawable.north_high));
        BreweryDatabase.add(new Item(getString(R.string.seventh_brewing), getString(R.string.seventh_address),
                getString(R.string.seventh_website), R.drawable.seventh_son));
        BreweryDatabase.add(new Item(getString(R.string.hoof_brewing), getString(R.string.hoof_address),
                getString(R.string.hoof_website), R.drawable.hoof_hearted));
        BreweryDatabase.add(new Item(getString(R.string.barleys_brewing), getString(R.string.barleys_address),
                getString(R.string.barleys_website), R.drawable.barleys_brewing));
        BreweryDatabase.add(new Item(getString(R.string.wolfs_brewing), getString(R.string.wolfs_address),
                getString(R.string.wolfs_website), R.drawable.wolf_ridge));
        BreweryDatabase.add(new Item(getString(R.string.elevator_brewing), getString(R.string.elevator_address),
                getString(R.string.elevator_website), R.drawable.elevator));

        // Standard LinearLayout Manager for Recycler
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        ItemAdapter itemAdapter = new ItemAdapter(mcontext, BreweryDatabase);

        // Setting layoutManager and adapter to Recycler
        recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(itemAdapter);

        return rootView;
    }
}
