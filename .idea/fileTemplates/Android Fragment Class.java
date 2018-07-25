package ${PACKAGE_NAME};

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

#parse("File Header.java")
public class ${NAME} extends Fragment {
    public ${NAME}(){
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_layout_id, container, false);
        return rootView;
    }
}