package apps.everythingforward.com.choicesstory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BecomeCoachActivity extends AppCompatActivity {

    @BindView(R.id.imageView)ImageView banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become_coach);
        ButterKnife.bind(this);

        Picasso.with(getApplicationContext()).load(R.drawable.cricketcoach).fit().centerCrop().into(banner);

    }





}
