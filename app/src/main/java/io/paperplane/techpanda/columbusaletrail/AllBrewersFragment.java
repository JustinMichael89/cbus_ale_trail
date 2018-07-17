package io.paperplane.techpanda.columbusaletrail;

import android.content.Context;
import android.drm.DrmStore;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AllBrewersFragment extends Fragment {

    public ArrayList<Item> BreweryDatabase = new ArrayList<>();
    RecyclerView recyclerView;

    private Context mcontext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public AllBrewersFragment() {

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


        // Info gathered from cbusaletrail.com and Google search
        BreweryDatabase.add(new Item(getString(R.string.actual_brewing), getString(R.string.actual_brewing_address),
                getString(R.string.actual_brewing_website), R.drawable.actual_brewing));
        BreweryDatabase.add(new Item(getString(R.string.barleys_brewing), getString(R.string.barleys_address),
                getString(R.string.barleys_website), R.drawable.barleys_brewing));
        BreweryDatabase.add(new Item(getString(R.string.brew_bros_name), getString(R.string.brew_bros_address),
                getString(R.string.brew_bros_website), R.drawable.brew_bros));
        BreweryDatabase.add(new Item(getString(R.string.brewdog_dogtap), getString(R.string.brewdog_address),
                getString(R.string.brewdog_website), R.drawable.brewdog));
        BreweryDatabase.add(new Item(getString(R.string.bucks_brewing), getString(R.string.bucks_address),
                getString(R.string.bucks_website), R.drawable.bucks_brewing));
        BreweryDatabase.add(new Item(getString(R.string.buckeye_brewing), getString(R.string.buckeye_address),
                getString(R.string.buckeye_website), R.drawable.buckeye_brewing));
        BreweryDatabase.add(new Item(getString(R.string.combustion_brewing), getString(R.string.combustion_address),
                getString(R.string.combustion_website), R.drawable.combustion));
        BreweryDatabase.add(new Item(getString(R.string.dalton_brewing), getString(R.string.dalton_address),
                getString(R.string.dalton_website), R.drawable.dalton));
        BreweryDatabase.add(new Item(getString(R.string.dankhouse_brewing), getString(R.string.dankhouse_address),
                getString(R.string.dankhouse_website), R.drawable.dankhouse));
        BreweryDatabase.add(new Item(getString(R.string.double_brewing), getString(R.string.double_address),
                getString(R.string.double_website), R.drawable.doubleedge));
        BreweryDatabase.add(new Item(getString(R.string.elevator_brewing), getString(R.string.elevator_address),
                getString(R.string.elevator_website), R.drawable.elevator));
        BreweryDatabase.add(new Item(getString(R.string.endeavor_brewing), getString(R.string.endeavor_address),
                getString(R.string.endeavor_website), R.drawable.endeavor));
        BreweryDatabase.add(new Item(getString(R.string.four_brewing), getString(R.string.four_address),
                getString(R.string.four_website), R.drawable.four_string));
        BreweryDatabase.add(new Item(getString(R.string.gordon_brewing), getString(R.string.gordon_address),
                getString(R.string.gordon_website), R.drawable.gordon_biersch));
        BreweryDatabase.add(new Item(getString(R.string.grove_brewing), getString(R.string.grove_address),
                getString(R.string.grove_website), R.drawable.grove_city));
        BreweryDatabase.add(new Item(getString(R.string.hof_brewing), getString(R.string.hof_address),
                getString(R.string.hof_website), R.drawable.hofbrauhaus));
        BreweryDatabase.add(new Item(getString(R.string.hoof_brewing), getString(R.string.hoof_address),
                getString(R.string.hoof_website), R.drawable.hoof_hearted));
        BreweryDatabase.add(new Item(getString(R.string.ill_brewing), getString(R.string.ill_address),
                getString(R.string.ill_website), R.drawable.ill_mannered));
        BreweryDatabase.add(new Item(getString(R.string.kindred_brewing), getString(R.string.kindred_address),
                getString(R.string.kindred_website), R.drawable.kindred));
        BreweryDatabase.add(new Item(getString(R.string.knotty_brewing), getString(R.string.knotty_address),
                getString(R.string.knotty_website), R.drawable.knotty_pine));
        BreweryDatabase.add(new Item(getString(R.string.land_brewing), getString(R.string.land_address),
                getString(R.string.land_website), R.drawable.land_grant));
        BreweryDatabase.add(new Item(getString(R.string.lineage_brewing), getString(R.string.lineage_address),
                getString(R.string.lineage_website), R.drawable.lineage));
        BreweryDatabase.add(new Item(getString(R.string.loose_brewing), getString(R.string.loose_address),
                getString(R.string.loose_website), R.drawable.loose_rail));
        BreweryDatabase.add(new Item(getString(R.string.north_brewing), getString(R.string.north_address),
                getString(R.string.north_website), R.drawable.north_high));
        BreweryDatabase.add(new Item(getString(R.string.pigskin_brewing), getString(R.string.pigskin_address),
                getString(R.string.pigskin_website), R.drawable.pigskin));
        BreweryDatabase.add(new Item(getString(R.string.platform_brewing), getString(R.string.platform_address),
                getString(R.string.platform_website), R.drawable.platform));
        BreweryDatabase.add(new Item(getString(R.string.pretentious_brewing), getString(R.string.pretentious_address),
                getString(R.string.pretentious_website), R.drawable.pretentious));
        BreweryDatabase.add(new Item(getString(R.string.random_brewing), getString(R.string.random_address),
                getString(R.string.random_website), R.drawable.random_precision));
        BreweryDatabase.add(new Item(getString(R.string.restoration_brewing), getString(R.string.restoration_address),
                getString(R.string.restoration_website), R.drawable.restoration_brew));
        BreweryDatabase.add(new Item(getString(R.string.rockmill_brewing), getString(R.string.rockmill_address),
                getString(R.string.rockmill_website), R.drawable.rockmill));
        BreweryDatabase.add(new Item(getString(R.string.seventh_brewing), getString(R.string.seventh_address),
                getString(R.string.seventh_website), R.drawable.seventh_son));
        BreweryDatabase.add(new Item(getString(R.string.sideswipe_brewing), getString(R.string.sideswipe_address),
                getString(R.string.sideswipe_website), R.drawable.sideswipe));
        BreweryDatabase.add(new Item(getString(R.string.smokehouse_brewing), getString(R.string.smokehouse_address),
                getString(R.string.smokehouse_website), R.drawable.smokehouse));
        BreweryDatabase.add(new Item(getString(R.string.staas_brewing), getString(R.string.stass_address),
                getString(R.string.stass_website), R.drawable.stass_brewing));
        BreweryDatabase.add(new Item(getString(R.string.ram_brewing), getString(R.string.ram_address),
                getString(R.string.ram_website), R.drawable.the_ram));
        BreweryDatabase.add(new Item(getString(R.string.three_brewing), getString(R.string.three_address),
                getString(R.string.three_website), R.drawable.three_tigers));
        BreweryDatabase.add(new Item(getString(R.string.trek_brewing), getString(R.string.trek_address),
                getString(R.string.trek_website), R.drawable.trek_brewing));
        BreweryDatabase.add(new Item(getString(R.string.wolfs_brewing), getString(R.string.wolfs_address),
                getString(R.string.wolfs_website), R.drawable.wolf_ridge));
        BreweryDatabase.add(new Item(getString(R.string.zaftig_brewing), getString(R.string.zaftig_address),
                getString(R.string.zaftig_website), R.drawable.zaftig));



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
