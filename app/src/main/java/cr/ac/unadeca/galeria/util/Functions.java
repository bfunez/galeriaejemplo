package cr.ac.unadeca.galeria.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.DrawableImageViewTarget;

import cr.ac.unadeca.galeria.R;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

/**
 * Created by Brian on 3/11/18.
 */

public class Functions {
    private static RequestOptions options = new RequestOptions()
            .placeholder(R.mipmap.ic_launcher_round)
            .error(R.mipmap.ic_launcher)
            .override(400,500)
            .diskCacheStrategy(DiskCacheStrategy.ALL);

    public static void loadImage(String image, ImageView imagePrev, Context context) {
        Glide.with(context)
                .load(image)
                .apply(options)
                .transition(withCrossFade())
                .into(imagePrev);
    }

    public static void loadImage( ImageView imagePrev, Context context) {
        Glide.with(context)
                .load(R.mipmap.ic_launcher_round)
                .apply(options)
                .transition(withCrossFade())
                .into(imagePrev);
    }


}
