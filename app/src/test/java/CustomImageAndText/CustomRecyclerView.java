

package CustomImageAndText;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylistview.R;

import java.util.ArrayList;
import java.util.List;

public class CustomRecyclerView extends AppCompatActivity  {

    RecyclerView recyclerView;
    ItemAdapter itemAdapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_recycler_view);

        recyclerView=findViewById(R.id.recyclerview1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //create the item list
        itemList=new ArrayList<Item>();



        itemList.add(new Item(R.drawable.google,"Item 1","This is Item 1","$10"));
        itemList.add(new Item(R.drawable.icon ,"Item 2","This is Item 2","$15"));

        itemList.add(new Item(R.drawable.tictaclogo ,"Item 3","This is Item 3","$10"));

        itemList.add(new Item(R.drawable.bangladesh ,"Item 4","This is Item 4","$100"));

        itemList.add(new Item(R.drawable.cross ,"Item 1","This is Item 1","$10"));
        itemList.add(new Item(R.drawable.icon ,"Item 2","This is Item 2","$15"));

        itemList.add(new Item(R.drawable.bangladesh ,"Item 3","This is Item 3","$10"));

        itemList.add(new Item(R.drawable.dhakauniversity ,"Item 4","This is Item 4","$100"));
        itemList.add(new Item(R.drawable.tictaclogo,"Item 1","This is Item 1","$10"));
        itemList.add(new Item(R.drawable.kaaba ,"Item 2","This is Item 2","$15"));

        itemList.add(new Item(R.drawable.dhakauniversity ,"Item 3","This is Item 3","$10"));

        itemList.add(new Item(R.drawable.bangladesh ,"Item 4","This is Item 4","$100"));

        itemAdapter=new ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);






    }




}