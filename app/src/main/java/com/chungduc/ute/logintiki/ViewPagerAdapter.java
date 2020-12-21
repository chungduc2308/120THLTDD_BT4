package com.chungduc.ute.logintiki;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new LoginFragment();
            case 1:
                return new  SignUpFragment();
            default:
                return new LoginFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
    public CharSequence getPageTitle(int position){
        String title="";
        switch (position){
            case 0:
                title = "ĐĂNG NHẬP";
                break;
            case 1:
                title = "ĐĂNG KÝ";
                break;
        }
        return  title;
    }
}
