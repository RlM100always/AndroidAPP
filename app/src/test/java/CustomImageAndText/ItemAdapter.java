package CustomImageAndText;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylistview.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {


    private List <Item> itemList;

    ItemAdapter(List<Item> itemList){
        this.itemList=itemList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item =itemList.get(position);
        holder.image.setImageResource(item.getImage());
        holder.title.setText(item.getTitle());
        holder.description.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView image ;
        private TextView title ;
        private TextView description ;
        private TextView price ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.item_image);
            title=itemView.findViewById(R.id.titleId);
            description=itemView.findViewById(R.id.descriptionId);
            price=itemView.findViewById(R.id.priceId);


        }
    }
}
