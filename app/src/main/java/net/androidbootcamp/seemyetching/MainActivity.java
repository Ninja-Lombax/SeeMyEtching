package net.androidbootcamp.seemyetching;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends Activity
{
    String[] champions = new String[] {"Androxus", "Barik", "Bomb King", "Buck", "Cassie", "Drogoz", "Evie", "Fernando", "Grokh", "Grover", "Kinessa", "Maeve", "Makoa", "Mal'Damba", "Pip", "Ruckus", "Sha Lin", "Skye", "Torvald", "Tyra", "Viktor", "Ying"};
    int[] chamImage = new int[] {R.drawable.championandroxusicon, R.drawable.championbarikicon, R.drawable.championbombkingicon, R.drawable.championbuckicon, R.drawable.championcassieicon, R.drawable.championdrogozicon, R.drawable.championevieicon, R.drawable.championfernandoicon, R.drawable.championgrohkicon, R.drawable.championgrovericon, R.drawable.championkinessaicon, R.drawable.championmaeveicon, R.drawable.championmakoaicon, R.drawable.championmaldambaicon, R.drawable.championpipicon, R.drawable.championruckusicon, R.drawable.championshalinicon, R.drawable.championskyeicon, R.drawable.championtorvaldicon, R.drawable.championtyraicon, R.drawable.championviktoricon, R.drawable.championyingicon};
    String[] description = new String[] {"The Godslayer","The Ruins Raider","His Majesty","Buck","The Hunter's Daughter","The Greedy","The Winter Witch","The Self-Appointed Knight","The Lightning Orc","The Wild","The Bounty Hunter","of the Blades","The Ancient","Wekono's Chosen","The Fire Thief","The Worst of Friends","The Desert Wind","The Twilight Assassin","The Ruin Sage","The Untamed","The Lone Wolf","The Illusionist"};



    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<HashMap<String,String>> aList = new ArrayList<HashMap<String, String>>();

        for(int i=0;i<22;i++)
        {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("Champion",champions[i]);
            hm.put("Description",description[i]);

            hm.put("Image",Integer.toString(chamImage[i]));


            aList.add(hm);

        }
        String[] from = {"Image","Champion","Description"};
        int[] to = {R.id.flag, R.id.txt, R.id.cur};
        //setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.layout.activity_list_view_layout, from, to));

        SimpleAdapter adapter = new SimpleAdapter(this, aList, R.layout.activity_list_view_layout, from, to);

        ListView elistView = (ListView)findViewById(R.id.listview);

        elistView.setAdapter(adapter);

        elistView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id)
            {
                    switch(position)
                    {
                        case 0:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Androxus")));
                            break;
                        case 1:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Barik")));
                            break;
                        case 2:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Bomb_King")));
                            break;
                        case 3:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Buck")));
                            break;
                        case 4:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Cassie")));
                            break;
                        case 5:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Drogoz")));
                            break;
                        case 6:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Evie")));
                            break;
                        case 7:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Fernando")));
                            break;
                        case 8:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Grohk")));
                            break;
                        case 9:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Grover")));
                            break;
                        case 10:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Kinessa")));
                            break;
                        case 11:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Maeve")));
                            break;
                        case 12:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Makoa")));
                            break;
                        case 13:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Mal%27Damba")));
                            break;
                        case 14:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Pip")));
                            break;
                        case 15:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Ruckus")));
                            break;
                        case 16:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Sha_Lin")));
                            break;
                        case 17:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Skye")));
                            break;
                        case 18:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Torvald")));
                            break;
                        case 19:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Tyra")));
                            break;
                        case 20:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Viktor")));
                            break;
                        case 21:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://paladins.gamepedia.com/Ying")));
                            break;



                    }



            }
        });
        }



    /*protected void onListItemClick(ListView l, View v, int position, long id)
    {
        switch (position)
        {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://artic.edu")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://themagnificentmile.com")));
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;

        }
    }*/


}
