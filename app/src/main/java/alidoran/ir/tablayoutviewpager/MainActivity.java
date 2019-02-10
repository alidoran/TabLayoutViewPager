package alidoran.ir.tablayoutviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        tabLayout = findViewById ( R.id.tablayout );
        viewPager = findViewById ( R.id.viewpager );

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter ( getSupportFragmentManager ( ) );

        viewPagerAdapter.addFragment ( new FragmentActivity ( ) , "testfragmnet1" );
        viewPagerAdapter.addFragment ( new FragmentActivity2 ( ) , "testfragmnet2" );
        viewPagerAdapter.addFragment ( new FragmentActivity3 ( ) , "testfragmnet3" );

        viewPager.setAdapter ( viewPagerAdapter );
        tabLayout.setupWithViewPager ( viewPager );

        tabLayout.getTabAt ( 0 ).setIcon ( R.drawable.ic_launcher_background );
    }
}