package cr.ac.unadeca.galeria.subclases;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import cr.ac.unadeca.galeria.R;

/**
 * Created by Brian on 11/10/16.
 */

public class ImageViewHolder extends RecyclerView.ViewHolder {
    public LinearLayout box;
    public ImageView image;
    public ImageViewHolder(View itemView) {
        super(itemView);
        image =  itemView.findViewById(R.id.image);
        box =  itemView.findViewById(R.id.box);
    }
}

